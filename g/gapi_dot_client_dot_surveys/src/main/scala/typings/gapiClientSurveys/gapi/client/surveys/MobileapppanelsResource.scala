package typings.gapiClientSurveys.gapi.client.surveys

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSurveys.AnonAlt
import typings.gapiClientSurveys.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileapppanelsResource extends js.Object {
  /** Retrieves a MobileAppPanel that is available to the authenticated user. */
  def get(request: AnonAlt): Request_[MobileAppPanel]
  /** Lists the MobileAppPanels available to the authenticated user. */
  def list(request: AnonAltFields): Request_[MobileAppPanelsListResponse]
  /** Updates a MobileAppPanel. Currently the only property that can be updated is the owners property. */
  def update(request: AnonAlt): Request_[MobileAppPanel]
}

object MobileapppanelsResource {
  @scala.inline
  def apply(
    get: AnonAlt => Request_[MobileAppPanel],
    list: AnonAltFields => Request_[MobileAppPanelsListResponse],
    update: AnonAlt => Request_[MobileAppPanel]
  ): MobileapppanelsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[MobileapppanelsResource]
  }
}

