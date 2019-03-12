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
    get: gapiDotClientDotConsumersurveysLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanel],
    list: gapiDotClientDotConsumersurveysLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanelsListResponse],
    update: gapiDotClientDotConsumersurveysLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanel]
  ): MobileapppanelsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[MobileapppanelsResource]
  }
}

