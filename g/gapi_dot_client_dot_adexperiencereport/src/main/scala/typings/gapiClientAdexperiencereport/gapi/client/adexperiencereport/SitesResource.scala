package typings.gapiClientAdexperiencereport.gapi.client.adexperiencereport

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexperiencereport.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SitesResource extends js.Object {
  /** Gets a summary of the ad experience rating of a site. */
  def get(request: Accesstoken): Request[SiteSummaryResponse] = js.native
}

object SitesResource {
  @scala.inline
  def apply(get: Accesstoken => Request[SiteSummaryResponse]): SitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[SitesResource]
  }
  @scala.inline
  implicit class SitesResourceOps[Self <: SitesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Accesstoken => Request[SiteSummaryResponse]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

