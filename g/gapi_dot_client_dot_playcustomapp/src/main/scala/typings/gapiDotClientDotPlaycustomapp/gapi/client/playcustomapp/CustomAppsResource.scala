package typings.gapiDotClientDotPlaycustomapp.gapi.client.playcustomapp

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPlaycustomapp.Anon_Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAppsResource extends js.Object {
  /** Create and publish a new custom app. */
  def create(request: Anon_Account): Request[CustomApp]
}

object CustomAppsResource {
  @scala.inline
  def apply(create: Anon_Account => Request[CustomApp]): CustomAppsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[CustomAppsResource]
  }
}

