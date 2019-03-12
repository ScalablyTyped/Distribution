package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResource extends js.Object {
  /** Gets info about an application. */
  def get(request: gapiDotClientDotAndroidmanagementLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Application]
}

object ApplicationsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAndroidmanagementLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Application]
  ): ApplicationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ApplicationsResource]
  }
}

