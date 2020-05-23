package typings.gapiClientPlaycustomapp.gapi.client.playcustomapp

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlaycustomapp.anon.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAppsResource extends js.Object {
  /** Create and publish a new custom app. */
  def create(request: Account): Request[CustomApp]
}

object CustomAppsResource {
  @scala.inline
  def apply(create: Account => Request[CustomApp]): CustomAppsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[CustomAppsResource]
  }
}

