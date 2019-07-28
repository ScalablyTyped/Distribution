package typings.gapiDotClientDotAdexchangeseller.gapiNs.clientNs.adexchangesellerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdexchangeseller.Anon_AccountIdAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertsResource extends js.Object {
  /** List the alerts for this Ad Exchange account. */
  def list(request: Anon_AccountIdAlt): Request[Alerts]
}

object AlertsResource {
  @scala.inline
  def apply(list: Anon_AccountIdAlt => Request[Alerts]): AlertsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AlertsResource]
  }
}

