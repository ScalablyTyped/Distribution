package typings
package gapiDotClientDotConsumersurveysLib.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileapppanelsResource extends js.Object {
  /** Retrieves a MobileAppPanel that is available to the authenticated user. */
  def get(request: gapiDotClientDotConsumersurveysLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanel]
  /** Lists the MobileAppPanels available to the authenticated user. */
  def list(request: gapiDotClientDotConsumersurveysLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanelsListResponse]
  /** Updates a MobileAppPanel. Currently the only property that can be updated is the owners property. */
  def update(request: gapiDotClientDotConsumersurveysLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanel]
}

object MobileapppanelsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotConsumersurveysLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanel]
    ],
    list: js.Function1[
      gapiDotClientDotConsumersurveysLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanelsListResponse]
    ],
    update: js.Function1[
      gapiDotClientDotConsumersurveysLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanel]
    ]
  ): MobileapppanelsResource = {
    val __obj = js.Dynamic.literal(get = get, list = list, update = update)
  
    __obj.asInstanceOf[MobileapppanelsResource]
  }
}

