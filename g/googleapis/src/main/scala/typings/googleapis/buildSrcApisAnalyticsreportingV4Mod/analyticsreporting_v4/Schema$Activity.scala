package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Activity represents data for an activity of a user. Note that an
  * Activity is different from a hit. A hit might result in multiple
  * Activity&#39;s. For example, if a hit includes a transaction and a goal
  * completion, there will be two Activity protos for this hit, one for
  * ECOMMERCE and one for GOAL. Conversely, multiple hits can also construct
  * one Activity. In classic e-commerce, data for one transaction might be sent
  * through multiple hits. These hits will be merged into one ECOMMERCE
  * Activity.
  */
@js.native
trait Schema$Activity extends js.Object {
  /**
    * Timestamp of the activity.
    */
  var activityTime: js.UndefOr[String] = js.native
  /**
    * Type of this activity.
    */
  var activityType: js.UndefOr[String] = js.native
  /**
    * This will be set if `activity_type` equals `SCREEN_VIEW`.
    */
  var appview: js.UndefOr[Schema$ScreenviewData] = js.native
  /**
    * For manual campaign tracking, it is the value of the utm_campaign
    * campaign tracking parameter. For AdWords autotagging, it is the name(s)
    * of the online ad campaign(s) you use for the property. If you use
    * neither, its value is (not set).
    */
  var campaign: js.UndefOr[String] = js.native
  /**
    * The Channel Group associated with an end user&#39;s session for this View
    * (defined by the View&#39;s Channel Groupings).
    */
  var channelGrouping: js.UndefOr[String] = js.native
  /**
    * A list of all custom dimensions associated with this activity.
    */
  var customDimension: js.UndefOr[js.Array[Schema$CustomDimension]] = js.native
  /**
    * This will be set if `activity_type` equals `ECOMMERCE`.
    */
  var ecommerce: js.UndefOr[Schema$EcommerceData] = js.native
  /**
    * This field contains all the details pertaining to an event and will be
    * set if `activity_type` equals `EVENT`.
    */
  var event: js.UndefOr[Schema$EventData] = js.native
  /**
    * This field contains a list of all the goals that were reached in this
    * activity when `activity_type` equals `GOAL`.
    */
  var goals: js.UndefOr[Schema$GoalSetData] = js.native
  /**
    * The hostname from which the tracking request was made.
    */
  var hostname: js.UndefOr[String] = js.native
  /**
    * For manual campaign tracking, it is the value of the utm_term campaign
    * tracking parameter. For AdWords traffic, it contains the best matching
    * targeting criteria. For the display network, where multiple targeting
    * criteria could have caused the ad to show up, it returns the best
    * matching targeting criteria as selected by Ads. This could be
    * display_keyword, site placement, boomuserlist, user_interest, age, or
    * gender. Otherwise its value is (not set).
    */
  var keyword: js.UndefOr[String] = js.native
  /**
    * The first page in users&#39; sessions, or the landing page.
    */
  var landingPagePath: js.UndefOr[String] = js.native
  /**
    * The type of referrals. For manual campaign tracking, it is the value of
    * the utm_medium campaign tracking parameter. For AdWords autotagging, it
    * is cpc. If users came from a search engine detected by Google Analytics,
    * it is organic. If the referrer is not a search engine, it is referral. If
    * users came directly to the property and document.referrer is empty, its
    * value is (none).
    */
  var medium: js.UndefOr[String] = js.native
  /**
    * This will be set if `activity_type` equals `PAGEVIEW`. This field
    * contains all the details about the visitor and the page that was visited.
    */
  var pageview: js.UndefOr[Schema$PageviewData] = js.native
  /**
    * The source of referrals. For manual campaign tracking, it is the value of
    * the utm_source campaign tracking parameter. For AdWords autotagging, it
    * is google. If you use neither, it is the domain of the source (e.g.,
    * document.referrer) referring the users. It may also contain a port
    * address. If users arrived without a referrer, its value is (direct).
    */
  var source: js.UndefOr[String] = js.native
}

object Schema$Activity {
  @scala.inline
  def apply(
    activityTime: String = null,
    activityType: String = null,
    appview: Schema$ScreenviewData = null,
    campaign: String = null,
    channelGrouping: String = null,
    customDimension: js.Array[Schema$CustomDimension] = null,
    ecommerce: Schema$EcommerceData = null,
    event: Schema$EventData = null,
    goals: Schema$GoalSetData = null,
    hostname: String = null,
    keyword: String = null,
    landingPagePath: String = null,
    medium: String = null,
    pageview: Schema$PageviewData = null,
    source: String = null
  ): Schema$Activity = {
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
    __obj.asInstanceOf[Schema$Activity]
  }
}

