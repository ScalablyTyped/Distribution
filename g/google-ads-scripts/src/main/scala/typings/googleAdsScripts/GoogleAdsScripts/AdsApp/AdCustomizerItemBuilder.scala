package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for AdCustomizerItem objects. Example usage:
  *
  *      adCustomizerSource.adCustomizerItemBuilder()
  *        .withAttributeValues({numLeft: 5, lowCost: "$0.99"}) // at least one value is required
  *        .withTargetCampaign("Campaign name")                 //
  *        .withTargetKeyword("[keyword]")                      // optional
  *        .withMobilePreferred(true)                           // optional
  *        .build();                                            // create the ad customizer item
  */
@js.native
trait AdCustomizerItemBuilder
  extends StObject
     with Builder[AdCustomizerItemOperation] {
  
  /** Sets the value of the named attribute of the ad customizer item. */
  def withAttributeValue(name: String): this.type = js.native
  def withAttributeValue(name: String, value: String): this.type = js.native
  def withAttributeValue(name: String, value: Double): this.type = js.native
  
  /**
    * Sets the values of the ad customizer item's attributes.
    * Expects an object containing the name-value pairs of the attribute values to set. For instance,
    * `adCustomizerItemBuilder.withAttributeValues({numLeft: 5, lowCost: "$0.99"})` sets the attribute `numLeft` to have the value `5`,
    * and `lowCost` to have value `"$0.99"`.
    */
  def withAttributeValues(attributeValues: Record[String, String | Double | Null]): this.type = js.native
  
  /**
    * Sets the ad customizer item's end date from either an object containing year, month, and day fields, or an 8-digit string in YYYYMMDD format.
    * This field is optional.
    */
  def withEndDate(date: String): this.type = js.native
  def withEndDate(date: GoogleAdsDate): this.type = js.native
  
  /**
    * Sets the ad customizer item's end date from either an object containing year, month, and day fields, or an 8-digit string in YYYYMMDD format.
    * This field is optional.
    * @param isMobilePreferred Whether or not this ad customizer item should be mobile preferred. If true is passed in, device preference will be set to mobile.
    * If false is passed in, device preference will be set to none.
    */
  def withMobilePreferred(isMobilePreferred: Boolean): this.type = js.native
  
  /**
    * Sets the ad customizer item scheduling. Scheduling of a ad customizer item allows you to control the days of week and times of day during which
    * the ad customizer item will show alongside your ads.
    * Passing in an empty array clears the scheduling field, causing the ad customizer item to run at all times.
    *
    * The following example sets the ad customizer item to run on Mondays and Tuesday from 8:00 to 11:00.
    *
    *
    *      var mondayMorning = {
    *        dayOfWeek: "MONDAY",
    *        startHour: 8,
    *        startMinute: 0,
    *        endHour: 11,
    *        endMinute: 0
    *      };
    *      var tuesdayMorning = {
    *        dayOfWeek: "TUESDAY",
    *        startHour: 8,
    *        startMinute: 0,
    *        endHour: 11,
    *        endMinute: 0
    *      };
    *
    *      adCustomizerItemBuilder.withSchedules([mondayMorning, tuesdayMorning]);
    */
  def withSchedules(schedules: js.Array[ExtensionSchedule]): this.type = js.native
  
  /** Sets the ad customizer item's start date from either an object containing year, month, and day fields, or an 8-digit string in YYYYMMDD format. This field is optional. */
  def withStartDate(date: String): this.type = js.native
  def withStartDate(date: GoogleAdsDate): this.type = js.native
  
  /** Sets the target ad group and campaign of the new ad customizer item. This will fail if there were any previous calls to `withTargetCampaign("previous campaign")`. */
  def withTargetAdGroup(campaignName: String, adGroupName: String): this.type = js.native
  
  /** Sets the target campaign of the new ad customizer item. This will fail if there were any previous calls to `withTargetAdGroup("previous ad group", "campaign")`. */
  def withTargetCampaign(campaignName: String): this.type = js.native
  
  /**
    * Sets the target keyword of the new ad customizer item.
    * The keyword includes its match type.
    * For instance, `adCustomizerItemBuilder.withTargetKeyword("[shoes]");` will target exact matches to "shoes".
    * Setting the target keyword to one that does not yet exist in your account will not cause an error, but will prevent the ad customizer item from being used to populate ads
    * (until you create the keyword in your account).
    */
  def withTargetKeyword(keyword: String): this.type = js.native
}
