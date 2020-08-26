package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPartners.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsResource extends js.Object {
  /**
    * Lists analytics data for a user's associated company.
    * Should only be called within the context of an authorized logged in user.
    */
  def list(request: Accesstoken): Request[ListAnalyticsResponse] = js.native
}

object AnalyticsResource {
  @scala.inline
  def apply(list: Accesstoken => Request[ListAnalyticsResponse]): AnalyticsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AnalyticsResource]
  }
  @scala.inline
  implicit class AnalyticsResourceOps[Self <: AnalyticsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setList(value: Accesstoken => Request[ListAnalyticsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

