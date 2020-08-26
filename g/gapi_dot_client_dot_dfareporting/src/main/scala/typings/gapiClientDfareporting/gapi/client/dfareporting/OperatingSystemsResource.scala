package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.DartId
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystemsResource extends js.Object {
  /** Gets one operating system by DART ID. */
  def get(request: DartId): Request[OperatingSystem] = js.native
  /** Retrieves a list of operating systems. */
  def list(request: Key): Request[OperatingSystemsListResponse] = js.native
}

object OperatingSystemsResource {
  @scala.inline
  def apply(get: DartId => Request[OperatingSystem], list: Key => Request[OperatingSystemsListResponse]): OperatingSystemsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperatingSystemsResource]
  }
  @scala.inline
  implicit class OperatingSystemsResourceOps[Self <: OperatingSystemsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: DartId => Request[OperatingSystem]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[OperatingSystemsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

