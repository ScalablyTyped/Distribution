package typings.gapiDotClientDotAndroidmanagement.gapi.client.androidmanagement

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidmanagement.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResource extends js.Object {
  /** Gets info about an application. */
  def get(request: Anon_Accesstoken): Request[Application]
}

object ApplicationsResource {
  @scala.inline
  def apply(get: Anon_Accesstoken => Request[Application]): ApplicationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ApplicationsResource]
  }
}

