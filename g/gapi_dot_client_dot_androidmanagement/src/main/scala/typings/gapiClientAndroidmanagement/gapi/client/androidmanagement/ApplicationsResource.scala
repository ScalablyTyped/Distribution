package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidmanagement.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResource extends js.Object {
  /** Gets info about an application. */
  def get(request: Accesstoken): Request[Application]
}

object ApplicationsResource {
  @scala.inline
  def apply(get: Accesstoken => Request[Application]): ApplicationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ApplicationsResource]
  }
}

