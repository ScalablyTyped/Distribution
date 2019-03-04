package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertsResource extends js.Object {
  /** List the alerts for this Ad Exchange account. */
  def list(request: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[Alerts]
}

object AlertsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Alerts]
    ]
  ): AlertsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[AlertsResource]
  }
}

