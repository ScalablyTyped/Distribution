package typings.gapiDotClientDotSurveys.gapi.client.surveys

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotSurveys.Anon_Alt
import typings.gapiDotClientDotSurveys.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileapppanelsResource extends js.Object {
  /** Retrieves a MobileAppPanel that is available to the authenticated user. */
  def get(request: Anon_Alt): Request[MobileAppPanel]
  /** Lists the MobileAppPanels available to the authenticated user. */
  def list(request: Anon_AltFields): Request[MobileAppPanelsListResponse]
  /** Updates a MobileAppPanel. Currently the only property that can be updated is the owners property. */
  def update(request: Anon_Alt): Request[MobileAppPanel]
}

object MobileapppanelsResource {
  @scala.inline
  def apply(
    get: Anon_Alt => Request[MobileAppPanel],
    list: Anon_AltFields => Request[MobileAppPanelsListResponse],
    update: Anon_Alt => Request[MobileAppPanel]
  ): MobileapppanelsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[MobileapppanelsResource]
  }
}

