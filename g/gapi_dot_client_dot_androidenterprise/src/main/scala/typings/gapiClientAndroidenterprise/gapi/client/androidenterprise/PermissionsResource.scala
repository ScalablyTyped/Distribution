package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidenterprise.anon.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionsResource extends js.Object {
  /** Retrieves details of an Android app permission for display to an enterprise admin. */
  def get(request: Language): Request[Permission] = js.native
}

object PermissionsResource {
  @scala.inline
  def apply(get: Language => Request[Permission]): PermissionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[PermissionsResource]
  }
  @scala.inline
  implicit class PermissionsResourceOps[Self <: PermissionsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Language => Request[Permission]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

