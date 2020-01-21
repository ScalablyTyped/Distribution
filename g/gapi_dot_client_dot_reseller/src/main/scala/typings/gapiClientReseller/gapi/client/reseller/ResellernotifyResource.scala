package typings.gapiClientReseller.gapi.client.reseller

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientReseller.AnonAlt
import typings.gapiClientReseller.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResellernotifyResource extends js.Object {
  /** Topic name of the PubSub */
  var topicName: js.UndefOr[String] = js.undefined
  /** Returns all the details of the watch corresponding to the reseller. */
  def getwatchdetails(request: AnonAlt): Request_[ResellernotifyGetwatchdetailsResponse]
  /** Registers a Reseller for receiving notifications. */
  def register(request: AnonAltFields): Request_[ResellernotifyResource]
  /** Unregisters a Reseller for receiving notifications. */
  def unregister(request: AnonAltFields): Request_[ResellernotifyResource]
}

object ResellernotifyResource {
  @scala.inline
  def apply(
    getwatchdetails: AnonAlt => Request_[ResellernotifyGetwatchdetailsResponse],
    register: AnonAltFields => Request_[ResellernotifyResource],
    unregister: AnonAltFields => Request_[ResellernotifyResource],
    topicName: String = null
  ): ResellernotifyResource = {
    val __obj = js.Dynamic.literal(getwatchdetails = js.Any.fromFunction1(getwatchdetails), register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
    if (topicName != null) __obj.updateDynamic("topicName")(topicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResellernotifyResource]
  }
}

