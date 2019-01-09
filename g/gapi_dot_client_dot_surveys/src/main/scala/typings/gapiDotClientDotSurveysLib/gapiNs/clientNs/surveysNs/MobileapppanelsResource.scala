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

