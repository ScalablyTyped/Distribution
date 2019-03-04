package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsResource extends js.Object {
  /**
    * Lists analytics data for a user's associated company.
    * Should only be called within the context of an authorized logged in user.
    */
  def list(request: gapiDotClientDotPartnersLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListAnalyticsResponse]
}

object AnalyticsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotPartnersLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListAnalyticsResponse]
    ]
  ): AnalyticsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[AnalyticsResource]
  }
}

