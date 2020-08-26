package typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDoubleclicksearch.anon.Alt
import typings.gapiClientDoubleclicksearch.anon.Fields
import typings.gapiClientDoubleclicksearch.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportsResource extends js.Object {
  /** Generates and returns a report immediately. */
  def generate(request: Alt): Request[Report] = js.native
  /** Polls for the status of a report request. */
  def get(request: Fields): Request[Report] = js.native
  /** Downloads a report file encoded in UTF-8. */
  def getFile(request: Key): Request[Unit] = js.native
  /** Inserts a report request into the reporting system. */
  def request(request: Alt): Request[Report] = js.native
}

object ReportsResource {
  @scala.inline
  def apply(
    generate: Alt => Request[Report],
    get: Fields => Request[Report],
    getFile: Key => Request[Unit],
    request: Alt => Request[Report]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), get = js.Any.fromFunction1(get), getFile = js.Any.fromFunction1(getFile), request = js.Any.fromFunction1(request))
    __obj.asInstanceOf[ReportsResource]
  }
  @scala.inline
  implicit class ReportsResourceOps[Self <: ReportsResource] (val x: Self) extends AnyVal {
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
    def setGenerate(value: Alt => Request[Report]): Self = this.set("generate", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[Report]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFile(value: Key => Request[Unit]): Self = this.set("getFile", js.Any.fromFunction1(value))
    @scala.inline
    def setRequest(value: Alt => Request[Report]): Self = this.set("request", js.Any.fromFunction1(value))
  }
  
}

