package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebTokensResource extends js.Object {
  /** Creates a web token to access an embeddable managed Google Play web UI for a given enterprise. */
  def create(request: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[WebToken]
}

object WebTokensResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[WebToken]
    ]
  ): WebTokensResource = {
    val __obj = js.Dynamic.literal(create = create)
  
    __obj.asInstanceOf[WebTokensResource]
  }
}

