package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  var activityTime: js.UndefOr[java.lang.String] = js.undefined
  var activityType: js.UndefOr[java.lang.String] = js.undefined
  var appview: js.UndefOr[ScreenviewData] = js.undefined
  var campaign: js.UndefOr[java.lang.String] = js.undefined
  var channelGrouping: js.UndefOr[java.lang.String] = js.undefined
  var customDimension: js.UndefOr[js.Array[CustomDimension]] = js.undefined
  var ecommerce: js.UndefOr[EcommerceData] = js.undefined
  var event: js.UndefOr[EventData] = js.undefined
  var goals: js.UndefOr[GoalSetData] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var keyword: js.UndefOr[java.lang.String] = js.undefined
  var landingPagePath: js.UndefOr[java.lang.String] = js.undefined
  var medium: js.UndefOr[java.lang.String] = js.undefined
  var pageview: js.UndefOr[PageviewData] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object Activity {
  @scala.inline
  def apply(
    activityTime: java.lang.String = null,
    activityType: java.lang.String = null,
    appview: ScreenviewData = null,
    campaign: java.lang.String = null,
    channelGrouping: java.lang.String = null,
    customDimension: js.Array[CustomDimension] = null,
    ecommerce: EcommerceData = null,
    event: EventData = null,
    goals: GoalSetData = null,
    hostname: java.lang.String = null,
    keyword: java.lang.String = null,
    landingPagePath: java.lang.String = null,
    medium: java.lang.String = null,
    pageview: PageviewData = null,
    source: java.lang.String = null
  ): Activity = {
    val __obj = js.Dynamic.literal()
    if (activityTime != null) __obj.updateDynamic("activityTime")(activityTime)
    if (activityType != null) __obj.updateDynamic("activityType")(activityType)
    if (appview != null) __obj.updateDynamic("appview")(appview)
    if (campaign != null) __obj.updateDynamic("campaign")(campaign)
    if (channelGrouping != null) __obj.updateDynamic("channelGrouping")(channelGrouping)
    if (customDimension != null) __obj.updateDynamic("customDimension")(customDimension)
    if (ecommerce != null) __obj.updateDynamic("ecommerce")(ecommerce)
    if (event != null) __obj.updateDynamic("event")(event)
    if (goals != null) __obj.updateDynamic("goals")(goals)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (keyword != null) __obj.updateDynamic("keyword")(keyword)
    if (landingPagePath != null) __obj.updateDynamic("landingPagePath")(landingPagePath)
    if (medium != null) __obj.updateDynamic("medium")(medium)
    if (pageview != null) __obj.updateDynamic("pageview")(pageview)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Activity]
  }
}

