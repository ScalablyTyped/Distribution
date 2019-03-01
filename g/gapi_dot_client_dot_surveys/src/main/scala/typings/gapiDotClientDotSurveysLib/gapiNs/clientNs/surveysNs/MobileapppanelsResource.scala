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
    get: js.Function1[
      gapiDotClientDotSurveysLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanel]
    ],
    list: js.Function1[
      gapiDotClientDotSurveysLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanelsListResponse]
    ],
    update: js.Function1[
      gapiDotClientDotSurveysLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[MobileAppPanel]
    ]
  ): MobileapppanelsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[MobileapppanelsResource]
  }
}

