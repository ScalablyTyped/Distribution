package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowsersResource extends js.Object {
  /** Retrieves a list of browsers. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[BrowsersListResponse]
}

object BrowsersResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[BrowsersListResponse]
    ]
  ): BrowsersResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[BrowsersResource]
  }
}

