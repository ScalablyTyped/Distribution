package typings.googleapis.adexperiencereportV1Mod.adexperiencereportV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Summary of the ad experience rating of a site for a specific platform.
  */
@js.native
trait SchemaPlatformSummary extends js.Object {
  
  /**
    * The status of the site reviewed for the Better Ads Standards.
    */
  var betterAdsStatus: js.UndefOr[String] = js.native
  
  /**
    * The date on which ad filtering begins.
    */
  var enforcementTime: js.UndefOr[String] = js.native
  
  /**
    * The ad filtering status of the site.
    */
  var filterStatus: js.UndefOr[String] = js.native
  
  /**
    * The last time that the site changed status.
    */
  var lastChangeTime: js.UndefOr[String] = js.native
  
  /**
    * The assigned regions for the site and platform.
    */
  var region: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A link that leads to a full ad experience report.
    */
  var reportUrl: js.UndefOr[String] = js.native
  
  /**
    * Whether the site is currently under review.
    */
  var underReview: js.UndefOr[Boolean] = js.native
}
object SchemaPlatformSummary {
  
  @scala.inline
  def apply(): SchemaPlatformSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlatformSummary]
  }
  
  @scala.inline
  implicit class SchemaPlatformSummaryOps[Self <: SchemaPlatformSummary] (val x: Self) extends AnyVal {
    
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
    def setBetterAdsStatus(value: String): Self = this.set("betterAdsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBetterAdsStatus: Self = this.set("betterAdsStatus", js.undefined)
    
    @scala.inline
    def setEnforcementTime(value: String): Self = this.set("enforcementTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforcementTime: Self = this.set("enforcementTime", js.undefined)
    
    @scala.inline
    def setFilterStatus(value: String): Self = this.set("filterStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterStatus: Self = this.set("filterStatus", js.undefined)
    
    @scala.inline
    def setLastChangeTime(value: String): Self = this.set("lastChangeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastChangeTime: Self = this.set("lastChangeTime", js.undefined)
    
    @scala.inline
    def setRegionVarargs(value: String*): Self = this.set("region", js.Array(value :_*))
    
    @scala.inline
    def setRegion(value: js.Array[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setReportUrl(value: String): Self = this.set("reportUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportUrl: Self = this.set("reportUrl", js.undefined)
    
    @scala.inline
    def setUnderReview(value: Boolean): Self = this.set("underReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderReview: Self = this.set("underReview", js.undefined)
  }
}
