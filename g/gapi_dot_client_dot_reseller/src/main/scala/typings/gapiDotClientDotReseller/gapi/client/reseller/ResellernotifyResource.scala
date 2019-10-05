package typings.gapiDotClientDotReseller.gapi.client.reseller

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotReseller.Anon_Alt
import typings.gapiDotClientDotReseller.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResellernotifyResource extends js.Object {
  /** Topic name of the PubSub */
  var topicName: js.UndefOr[String] = js.undefined
  /** Returns all the details of the watch corresponding to the reseller. */
  def getwatchdetails(request: Anon_Alt): Request[ResellernotifyGetwatchdetailsResponse]
  /** Registers a Reseller for receiving notifications. */
  def register(request: Anon_AltFields): Request[ResellernotifyResource]
  /** Unregisters a Reseller for receiving notifications. */
  def unregister(request: Anon_AltFields): Request[ResellernotifyResource]
}

object ResellernotifyResource {
  @scala.inline
  def apply(
    getwatchdetails: Anon_Alt => Request[ResellernotifyGetwatchdetailsResponse],
    register: Anon_AltFields => Request[ResellernotifyResource],
    unregister: Anon_AltFields => Request[ResellernotifyResource],
    topicName: String = null
  ): ResellernotifyResource = {
    val __obj = js.Dynamic.literal(getwatchdetails = js.Any.fromFunction1(getwatchdetails), register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
    if (topicName != null) __obj.updateDynamic("topicName")(topicName)
    __obj.asInstanceOf[ResellernotifyResource]
  }
}

