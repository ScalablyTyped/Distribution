package typings.gapiClientPlaycustomapp.gapi.client.playcustomapp

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlaycustomapp.anon.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAppsResource extends js.Object {
  /** Create and publish a new custom app. */
  def create(request: Account): Request[CustomApp] = js.native
}

object CustomAppsResource {
  @scala.inline
  def apply(create: Account => Request[CustomApp]): CustomAppsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[CustomAppsResource]
  }
  @scala.inline
  implicit class CustomAppsResourceOps[Self <: CustomAppsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Account => Request[CustomApp]): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

