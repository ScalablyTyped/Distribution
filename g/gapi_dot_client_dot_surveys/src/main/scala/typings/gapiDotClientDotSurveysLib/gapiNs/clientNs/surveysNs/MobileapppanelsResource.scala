package typings
package gapiDotClientDotSurveysLib.gapiNs.clientNs.surveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileapppanelsResource extends js.Object {
  /** Retrieves a MobileAppPanel that is available to the authenticated user. */
  def get(request: gapiDotClientDotSurveysLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanel]
  /** Lists the MobileAppPanels available to the authenticated user. */
  def list(request: gapiDotClientDotSurveysLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanelsListResponse]
  /** Updates a MobileAppPanel. Currently the only property that can be updated is the owners property. */
  def update(request: gapiDotClientDotSurveysLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanel]
}

object MobileapppanelsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotSurveysLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanel],
    list: gapiDotClientDotSurveysLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanelsListResponse],
    update: gapiDotClientDotSurveysLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanel]
  ): MobileapppanelsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[MobileapppanelsResource]
  }
}

