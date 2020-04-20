package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPartners.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsResource extends js.Object {
  /**
    * Lists analytics data for a user's associated company.
    * Should only be called within the context of an authorized logged in user.
    */
  def list(request: AnonAccesstoken): Request_[ListAnalyticsResponse]
}

object AnalyticsResource {
  @scala.inline
  def apply(list: AnonAccesstoken => Request_[ListAnalyticsResponse]): AnalyticsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AnalyticsResource]
  }
}

