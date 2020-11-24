package typings.googleapis.adexperiencereportV1Mod.adexperiencereportV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for GetSiteSummary.
  */
@js.native
trait SchemaSiteSummaryResponse extends js.Object {
  
  /**
    * Summary for the desktop review of the site.
    */
  var desktopSummary: js.UndefOr[SchemaPlatformSummary] = js.native
  
  /**
    * Summary for the mobile review of the site.
    */
  var mobileSummary: js.UndefOr[SchemaPlatformSummary] = js.native
  
  /**
    * The name of the site reviewed.
    */
  var reviewedSite: js.UndefOr[String] = js.native
}
object SchemaSiteSummaryResponse {
  
  @scala.inline
  def apply(): SchemaSiteSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteSummaryResponse]
  }
  
  @scala.inline
  implicit class SchemaSiteSummaryResponseOps[Self <: SchemaSiteSummaryResponse] (val x: Self) extends AnyVal {
    
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
    def setDesktopSummary(value: SchemaPlatformSummary): Self = this.set("desktopSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesktopSummary: Self = this.set("desktopSummary", js.undefined)
    
    @scala.inline
    def setMobileSummary(value: SchemaPlatformSummary): Self = this.set("mobileSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileSummary: Self = this.set("mobileSummary", js.undefined)
    
    @scala.inline
    def setReviewedSite(value: String): Self = this.set("reviewedSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReviewedSite: Self = this.set("reviewedSite", js.undefined)
  }
}
