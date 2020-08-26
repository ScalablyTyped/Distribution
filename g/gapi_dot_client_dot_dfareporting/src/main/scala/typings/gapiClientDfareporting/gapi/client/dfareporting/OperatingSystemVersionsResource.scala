package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystemVersionsResource extends js.Object {
  /** Gets one operating system version by ID. */
  def get(request: Fields): Request[OperatingSystemVersion] = js.native
  /** Retrieves a list of operating system versions. */
  def list(request: Key): Request[OperatingSystemVersionsListResponse] = js.native
}

object OperatingSystemVersionsResource {
  @scala.inline
  def apply(
    get: Fields => Request[OperatingSystemVersion],
    list: Key => Request[OperatingSystemVersionsListResponse]
  ): OperatingSystemVersionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperatingSystemVersionsResource]
  }
  @scala.inline
  implicit class OperatingSystemVersionsResourceOps[Self <: OperatingSystemVersionsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[OperatingSystemVersion]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[OperatingSystemVersionsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

