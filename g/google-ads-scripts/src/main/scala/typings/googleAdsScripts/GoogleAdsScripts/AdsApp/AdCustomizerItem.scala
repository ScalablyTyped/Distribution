package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an ad customizer data item.
  * Each ad customizer item can be seen as one row in an ad customizer source in the Business Data section of the Shared Library.
  * Ad customizer items have attribute values, which are values that correspond to the attributes of the item's source (see `AdCustomizerSource`).
  * These values can be substituted into an ad with placeholders of the form `{=SourceName.AttributeName}`.
  * Refer to the feature guide for more information.
  */
@js.native
trait AdCustomizerItem extends StObject {
  
  /** Clears the ad customizer item's end date. */
  def clearEndDate(): Unit = js.native
  
  /** Clears the ad customizer item's start date. */
  def clearStartDate(): Unit = js.native
  
  /** Clears the set target ad group and campaign. */
  def clearTargetAdGroup(): Unit = js.native
  
  /** Clears the set target campaign. */
  def clearTargetCampaign(): Unit = js.native
  
  /** Clears the set target keyword. */
  def clearTargetKeyword(): Unit = js.native
  
  /** Returns the value of the named attribute. */
  def getAttributeValue(name: String): Any = js.native
  
  /** Returns a map from attribute name to attribute value. */
  def getAttributeValues(): Record[String, String | Double] = js.native
  
  /** Returns the end date of the ad customizer item, or null if no end date is set. */
  def getEndDate(): GoogleAdsDate = js.native
  
  /** Clears the ad customizer item's end date. */
  def getEntityType(): String = js.native
  
  /** Clears the ad customizer item's end date. */
  def getId(): Double = js.native
  
  /** Clears the ad customizer item's end date. */
  def getSchedules(): js.Array[ExtensionSchedule] = js.native
  
  /** Clears the ad customizer item's end date. */
  def getStartDate(): GoogleAdsDate = js.native
  
  /** Clears the ad customizer item's end date. */
  def getTargetAdGroupName(): String = js.native
  
  /** Clears the ad customizer item's end date. */
  def getTargetCampaignName(): String = js.native
  
  /** Clears the ad customizer item's end date. */
  def getTargetKeywordText(): String = js.native
  
  /** Clears the ad customizer item's end date. */
  def isMobilePreferred(): Boolean = js.native
  
  /** Clears the ad customizer item's end date. */
  def remove(): Unit = js.native
  
  /** Clears the ad customizer item's end date. */
  def setAttributeValue(name: String, value: Any): Unit = js.native
  
  /** Clears the ad customizer item's end date. */
  def setAttributeValues(attributes: Any): Unit = js.native
  
  /** Clears the ad customizer item's end date. */
  def setEndDate(date: String): Unit = js.native
  def setEndDate(date: GoogleAdsDate): Unit = js.native
  
  /** Clears the ad customizer item's end date. */
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
  
  /** Clears the ad customizer item's end date. */
  def setSchedules(schedules: js.Array[Any]): Unit = js.native
  
  /** Clears the ad customizer item's end date. */
  def setStartDate(date: String): Unit = js.native
  def setStartDate(date: GoogleAdsDate): Unit = js.native
  
  /** Clears the ad customizer item's end date. */
  def setTargetAdGroup(campaignName: String, adGroupName: String): Unit = js.native
  
  /** Clears the ad customizer item's end date. */
  def setTargetCampaign(campaignName: String): Unit = js.native
  
  /** Clears the ad customizer item's end date. */
  def setTargetKeyword(keywordText: String): Unit = js.native
}
