package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSqladmin.anon.DatabaseVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagsResource extends js.Object {
  /** List all available database flags for Google Cloud SQL instances. */
  def list(request: DatabaseVersion): Request[FlagsListResponse] = js.native
}

object FlagsResource {
  @scala.inline
  def apply(list: DatabaseVersion => Request[FlagsListResponse]): FlagsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[FlagsResource]
  }
  @scala.inline
  implicit class FlagsResourceOps[Self <: FlagsResource] (val x: Self) extends AnyVal {
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
    def setList(value: DatabaseVersion => Request[FlagsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

