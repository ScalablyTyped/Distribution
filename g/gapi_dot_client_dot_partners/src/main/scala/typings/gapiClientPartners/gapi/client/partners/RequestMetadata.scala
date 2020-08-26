package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestMetadata extends js.Object {
  /** Experiment IDs the current request belongs to. */
  var experimentIds: js.UndefOr[js.Array[String]] = js.native
  /** Locale to use for the current request. */
  var locale: js.UndefOr[String] = js.native
  /** Google Partners session ID. */
  var partnersSessionId: js.UndefOr[String] = js.native
  /** Source of traffic for the current request. */
  var trafficSource: js.UndefOr[TrafficSource] = js.native
  /**
    * Values to use instead of the user's respective defaults for the current
    * request. These are only honored by whitelisted products.
    */
  var userOverrides: js.UndefOr[UserOverrides] = js.native
}

object RequestMetadata {
  @scala.inline
  def apply(): RequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMetadata]
  }
  @scala.inline
  implicit class RequestMetadataOps[Self <: RequestMetadata] (val x: Self) extends AnyVal {
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
    def setExperimentIdsVarargs(value: String*): Self = this.set("experimentIds", js.Array(value :_*))
    @scala.inline
    def setExperimentIds(value: js.Array[String]): Self = this.set("experimentIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentIds: Self = this.set("experimentIds", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setPartnersSessionId(value: String): Self = this.set("partnersSessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnersSessionId: Self = this.set("partnersSessionId", js.undefined)
    @scala.inline
    def setTrafficSource(value: TrafficSource): Self = this.set("trafficSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficSource: Self = this.set("trafficSource", js.undefined)
    @scala.inline
    def setUserOverrides(value: UserOverrides): Self = this.set("userOverrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserOverrides: Self = this.set("userOverrides", js.undefined)
  }
  
}

