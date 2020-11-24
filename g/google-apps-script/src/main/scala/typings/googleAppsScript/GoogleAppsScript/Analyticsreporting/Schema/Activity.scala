package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Activity extends js.Object {
  
  var activityTime: js.UndefOr[String] = js.native
  
  var activityType: js.UndefOr[String] = js.native
  
  var appview: js.UndefOr[ScreenviewData] = js.native
  
  var campaign: js.UndefOr[String] = js.native
  
  var channelGrouping: js.UndefOr[String] = js.native
  
  var customDimension: js.UndefOr[js.Array[CustomDimension]] = js.native
  
  var ecommerce: js.UndefOr[EcommerceData] = js.native
  
  var event: js.UndefOr[EventData] = js.native
  
  var goals: js.UndefOr[GoalSetData] = js.native
  
  var hostname: js.UndefOr[String] = js.native
  
  var keyword: js.UndefOr[String] = js.native
  
  var landingPagePath: js.UndefOr[String] = js.native
  
  var medium: js.UndefOr[String] = js.native
  
  var pageview: js.UndefOr[PageviewData] = js.native
  
  var source: js.UndefOr[String] = js.native
}
object Activity {
  
  @scala.inline
  def apply(): Activity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activity]
  }
  
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
    
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
    def setActivityTime(value: String): Self = this.set("activityTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityTime: Self = this.set("activityTime", js.undefined)
    
    @scala.inline
    def setActivityType(value: String): Self = this.set("activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityType: Self = this.set("activityType", js.undefined)
    
    @scala.inline
    def setAppview(value: ScreenviewData): Self = this.set("appview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppview: Self = this.set("appview", js.undefined)
    
    @scala.inline
    def setCampaign(value: String): Self = this.set("campaign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaign: Self = this.set("campaign", js.undefined)
    
    @scala.inline
    def setChannelGrouping(value: String): Self = this.set("channelGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelGrouping: Self = this.set("channelGrouping", js.undefined)
    
    @scala.inline
    def setCustomDimensionVarargs(value: CustomDimension*): Self = this.set("customDimension", js.Array(value :_*))
    
    @scala.inline
    def setCustomDimension(value: js.Array[CustomDimension]): Self = this.set("customDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDimension: Self = this.set("customDimension", js.undefined)
    
    @scala.inline
    def setEcommerce(value: EcommerceData): Self = this.set("ecommerce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcommerce: Self = this.set("ecommerce", js.undefined)
    
    @scala.inline
    def setEvent(value: EventData): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setGoals(value: GoalSetData): Self = this.set("goals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoals: Self = this.set("goals", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyword: Self = this.set("keyword", js.undefined)
    
    @scala.inline
    def setLandingPagePath(value: String): Self = this.set("landingPagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandingPagePath: Self = this.set("landingPagePath", js.undefined)
    
    @scala.inline
    def setMedium(value: String): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    
    @scala.inline
    def setPageview(value: PageviewData): Self = this.set("pageview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageview: Self = this.set("pageview", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
