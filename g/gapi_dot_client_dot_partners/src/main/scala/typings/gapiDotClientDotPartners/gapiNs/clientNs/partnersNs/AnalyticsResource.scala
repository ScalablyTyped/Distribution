package typings.gapiDotClientDotPartners.gapiNs.clientNs.partnersNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPartners.Anon_Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsResource extends js.Object {
  /**
    * Lists analytics data for a user's associated company.
    * Should only be called within the context of an authorized logged in user.
    */
  def list(request: Anon_Accesstoken): Request[ListAnalyticsResponse]
}

object AnalyticsResource {
  @scala.inline
  def apply(list: Anon_Accesstoken => Request[ListAnalyticsResponse]): AnalyticsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AnalyticsResource]
  }
}

