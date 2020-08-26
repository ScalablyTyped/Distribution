package typings.gapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.gapiClientLogging.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntriesResource extends js.Object {
  /** Lists log entries. Use this method to retrieve log entries from Stackdriver Logging. For ways to export log entries, see Exporting Logs. */
  def list(request: PrettyPrint): Request[ListLogEntriesResponse] = js.native
  /**
    * Log entry resourcesWrites log entries to Stackdriver Logging. This API method is the only way to send log entries to Stackdriver Logging. This method
    * is used, directly or indirectly, by the Stackdriver Logging agent (fluentd) and all logging libraries configured to use Stackdriver Logging.
    */
  def write(request: PrettyPrint): Request[js.Object] = js.native
}

object EntriesResource {
  @scala.inline
  def apply(list: PrettyPrint => Request[ListLogEntriesResponse], write: PrettyPrint => Request[js.Object]): EntriesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[EntriesResource]
  }
  @scala.inline
  implicit class EntriesResourceOps[Self <: EntriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setList(value: PrettyPrint => Request[ListLogEntriesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: PrettyPrint => Request[js.Object]): Self = this.set("write", js.Any.fromFunction1(value))
  }
  
}

