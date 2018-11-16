package typings
package gapiDotClientDotConsumersurveysLib.gapiNs.clientNs.consumersurveysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MobileapppanelsResource extends js.Object {
  /** Retrieves a MobileAppPanel that is available to the authenticated user. */
  def get(request: gapiDotClientDotConsumersurveysLib.Anon_PanelId): gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanel]
  /** Lists the MobileAppPanels available to the authenticated user. */
  def list(request: gapiDotClientDotConsumersurveysLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanelsListResponse]
  /** Updates a MobileAppPanel. Currently the only property that can be updated is the owners property. */
  def update(request: gapiDotClientDotConsumersurveysLib.Anon_PanelId): gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanel]
}

