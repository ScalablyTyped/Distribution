package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  var activityTime: js.UndefOr[String] = js.undefined
  var activityType: js.UndefOr[String] = js.undefined
  var appview: js.UndefOr[ScreenviewData] = js.undefined
  var campaign: js.UndefOr[String] = js.undefined
  var channelGrouping: js.UndefOr[String] = js.undefined
  var customDimension: js.UndefOr[js.Array[CustomDimension]] = js.undefined
  var ecommerce: js.UndefOr[EcommerceData] = js.undefined
  var event: js.UndefOr[EventData] = js.undefined
  var goals: js.UndefOr[GoalSetData] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var keyword: js.UndefOr[String] = js.undefined
  var landingPagePath: js.UndefOr[String] = js.undefined
  var medium: js.UndefOr[String] = js.undefined
  var pageview: js.UndefOr[PageviewData] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object Activity {
  @scala.inline
  def apply(
    activityTime: String = null,
    activityType: String = null,
    appview: ScreenviewData = null,
    campaign: String = null,
    channelGrouping: String = null,
    customDimension: js.Array[CustomDimension] = null,
    ecommerce: EcommerceData = null,
    event: EventData = null,
    goals: GoalSetData = null,
    hostname: String = null,
    keyword: String = null,
    landingPagePath: String = null,
    medium: String = null,
    pageview: PageviewData = null,
    source: String = null
  ): Activity = {
    val __obj = js.Dynamic.literal()
    if (activityTime != null) __obj.updateDynamic("activityTime")(activityTime.asInstanceOf[js.Any])
    if (activityType != null) __obj.updateDynamic("activityType")(activityType.asInstanceOf[js.Any])
    if (appview != null) __obj.updateDynamic("appview")(appview.asInstanceOf[js.Any])
    if (campaign != null) __obj.updateDynamic("campaign")(campaign.asInstanceOf[js.Any])
    if (channelGrouping != null) __obj.updateDynamic("channelGrouping")(channelGrouping.asInstanceOf[js.Any])
    if (customDimension != null) __obj.updateDynamic("customDimension")(customDimension.asInstanceOf[js.Any])
    if (ecommerce != null) __obj.updateDynamic("ecommerce")(ecommerce.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (goals != null) __obj.updateDynamic("goals")(goals.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (keyword != null) __obj.updateDynamic("keyword")(keyword.asInstanceOf[js.Any])
    if (landingPagePath != null) __obj.updateDynamic("landingPagePath")(landingPagePath.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (pageview != null) __obj.updateDynamic("pageview")(pageview.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
}

