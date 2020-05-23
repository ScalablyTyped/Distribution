package typings.gapiClientSurveys.gapi.client.surveys

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSurveys.anon.Alt
import typings.gapiClientSurveys.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileapppanelsResource extends js.Object {
  /** Retrieves a MobileAppPanel that is available to the authenticated user. */
  def get(request: Alt): Request[MobileAppPanel]
  /** Lists the MobileAppPanels available to the authenticated user. */
  def list(request: Fields): Request[MobileAppPanelsListResponse]
  /** Updates a MobileAppPanel. Currently the only property that can be updated is the owners property. */
  def update(request: Alt): Request[MobileAppPanel]
}

object MobileapppanelsResource {
  @scala.inline
  def apply(
    get: Alt => Request[MobileAppPanel],
    list: Fields => Request[MobileAppPanelsListResponse],
    update: Alt => Request[MobileAppPanel]
  ): MobileapppanelsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[MobileapppanelsResource]
  }
}

