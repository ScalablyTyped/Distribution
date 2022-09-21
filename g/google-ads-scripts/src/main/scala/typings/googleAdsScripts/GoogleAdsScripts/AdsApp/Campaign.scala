package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import typings.googleAdsScripts.anon.BidModifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Campaign
  extends StObject
     with StatsFor {
  
  /** Returns the selector of all ad groups in the campaign. */
  def adGroups(): AdGroupSelector = js.native
  
  /**
    * Creates an ad schedule criterion from an ad schedule object. Once created, the campaign will start showing ads during the specified time.
    *
    * When called with one argument, addAdSchedule supports two kinds of input:
    *
    * Existing AdSchedule objects, perhaps from another campaign:
    *
    *      var campaigns = AdsApp.campaigns().get();
    *      var campaign1 = campaigns.next();
    *      var campaign2 = campaigns.next();
    *      var schedule = campaign1.targeting().adSchedules().get().next();
    *      campaign2.addAdSchedule(schedule);
    *
    * Plain JavaScript objects describing an ad schedule. For instance, this will create an ad schedule covering Saturday mornings:
    *
    *      var campaign = AdsApp.campaigns().get().next();
    *      campaign.addAdSchedule({
    *        dayOfWeek: "SATURDAY",
    *        startHour: 7,
    *        startMinute: 0,
    *        endHour: 11,
    *        endMinute: 0,
    *        bidModifier: 1.1
    *      });
    *
    * This will look at the following properties of the given object:
    *
    * - `dayOfWeek`: **Required**. Must be one of `"MONDAY"`, `"TUESDAY"`, `"WEDNESDAY"`, `"THURSDAY"`, `"FRIDAY"`, `"SATURDAY"`, or `"SUNDAY"`.
    * - `startHour` and `startMinute`: **Required**. The starting time of this segment of the ad schedule. `startHour` must be an integer between 0 and 23,
    * and `startMinute` must be either 0, 15, 30, or 45. For instance, a `startHour` of 18 and a `startMinute` of 30 would result in an ad schedule starting at 6:30PM.
    * Acceptable starting times range from 00:00 to 23:45.
    * - `endHour` and `endMinute`: **Required**. The ending time of this segment of the ad schedule. `endHour` must be an integer between 0 and 24, and `endMinute` must
    * be either 0, 15, 30, or 45. For instance, a `endHour` of 18 and a `endMinute` of 30 would result in an ad schedule ending at 6:30PM. Acceptable ending times rang
    * from 00:15 to 24:00.
    * - `bidModifier`: **Optional**. The bid modifier for this segment of the ad schedule.
    *
    * One thing to keep in mind is that, by default, campaigns have no ad schedule criteria and hence serve ads at all times.
    * Adding the first ad schedule to a campaign will cause ads to be shown during that time only.
    *
    * There is a limit of 6 ad schedules for each day of the week — for instance, splitting up each day into 6 4-hour-long periods is supported,
    * but splitting up each day into 24 1-hour-long periods is not.
    */
  def addAdSchedule(adSchedule: AdScheduleObject): AdScheduleOperation = js.native
  /**
    * Creates an ad schedule criterion. Once created, the campaign will start showing ads during the specified time.
    *
    * For instance, this will create an ad schedule covering Saturday mornings:
    *
    *      var campaign = AdsApp.campaigns().get().next();
    *      campaign.addAdSchedule("SATURDAY", 7, 0, 11, 0);
    *
    * This will create the same schedule, but with a bid modifier of 1.1:
    *
    *      var campaign = AdsApp.campaigns().get().next();
    *      campaign.addAdSchedule("SATURDAY", 7, 0, 11, 0, 1.1);
    *
    * One thing to keep in mind is that, by default, campaigns have no ad schedule criteria and hence serve ads at all times.
    * Adding the first ad schedule to a campaign will cause ads to be shown during that time only.
    *
    * There is a limit of 6 ad schedules for each day of the week — for instance, splitting up each day into 6 4-hour-long periods is supported,
    * but splitting up each day into 24 1-hour-long periods is not.
    *
    * @param dayOfWeek The day of week. Must be one of `"MONDAY"`, `"TUESDAY"`, `"WEDNESDAY"`, `"THURSDAY"`, `"FRIDAY"`, `"SATURDAY"`, or `"SUNDAY"`.
    * @param startHour The start hour. Must be an integer between `0` and `23`. Acceptable starting times range from `00:00` to `23:45`.
    * @param startMinute The start minute. Must be either `0`, `15`, `30`, or `45`. Acceptable starting times range from `00:00` to `23:45`.
    * @param endHour The end hour. Must be an integer between `0` and `24`. Acceptable ending times range from `00:15` to `24:00`.
    * @param endMinute The end minute. Must be either `0`, `15`, `30`, or `45`. Acceptable ending times range from `00:15` to `24:00`.
    * @param bidModifier **Optional**. The bid modifier to use for the newly created ad schedule.
    */
  def addAdSchedule(dayOfWeek: String, startHour: Double, startMinute: Double, endHour: Double, endMinute: Double): AdScheduleOperation = js.native
  def addAdSchedule(
    dayOfWeek: String,
    startHour: Double,
    startMinute: Double,
    endHour: Double,
    endMinute: Double,
    bidModifier: Double
  ): AdScheduleOperation = js.native
  
  /** Adds a callout extension to this campaign. */
  def addCallout(calloutExtension: Callout): CalloutOperation = js.native
  
  /** Adds a excluded placement list to this campaign. */
  def addExcludedPlacementList(excludedPlacementList: ExcludedPlacementList): Unit = js.native
  
  /** Creates a location target in this campaign from a location ID. */
  def addLocation(locationId: Double): TargetedLocationOperation = js.native
  /** Creates a location target in this campaign from a location ID and bid modifier. */
  def addLocation(locationId: Double, bidModifier: Double): TargetedLocationOperation = js.native
  /** Creates a location target in this campaign from a location. */
  def addLocation(location: TargetedLocation): TargetedLocationOperation = js.native
  /** Creates a location target in this campaign from a location JSON. */
  def addLocation(location: BidModifier): TargetedLocationOperation = js.native
  
  /** Adds a message extension to this campaign. */
  def addMessage(messageExtension: Message): MessageOperation = js.native
  
  /** Adds a mobile app extension to this campaign. */
  def addMobileApp(mobileAppExtension: MobileApp): MobileAppOperation = js.native
  
  /** Adds a negative keyword list to this campaign. */
  def addNegativeKeywordList(negativeKeywordList: NegativeKeywordList): Unit = js.native
  
  /** Adds a phone number extension to this campaign. */
  def addPhoneNumber(phoneNumberExtension: PhoneNumber): PhoneNumberOperation = js.native
  
  /** Adds a price extension to this campaign. */
  def addPrice(priceExtension: Price): PriceOperation = js.native
  
  /** Creates a proximity target in this campaign. */
  def addProximity(latitude: Double, longitude: Double, radius: Double, radiusUnits: String): TargetedProximityOperation = js.native
  def addProximity(
    latitude: Double,
    longitude: Double,
    radius: Double,
    radiusUnits: String,
    optArgs: typings.googleAdsScripts.anon.Address
  ): TargetedProximityOperation = js.native
  /** Creates a proximity target in this campaign from a proximity object. */
  def addProximity(proximity: TargetedProximityObject): TargetedProximityOperation = js.native
  
  /** Adds a sitelink extension to this campaign. */
  def addSitelink(sitelinkExtension: Sitelink): SitelinkOperation = js.native
  
  /** Adds a snippet extension to this campaign. */
  def addSnippet(snippetExtension: Snippet): SnippetOperation = js.native
  
  /** Returns the selector of all ads in the campaign. */
  def ads(): AdSelector = js.native
  
  /** Applies a label to the campaign. */
  def applyLabel(name: String): Unit = js.native
  
  /** Provides access to this campaign's bidding fields. */
  def bidding(): CampaignBidding = js.native
  
  /** Creates a new campaign-level negative keyword with the specified text. */
  def createNegativeKeyword(keywordText: String): Unit = js.native
  
  /** Provides access to this campaign's display criteria: Audience, ExcludedAudience, DisplayKeyword, ExcludedDisplayKeyword, Placement, ExcludedPlacement, Topic, and ExcludedTopic. */
  def display(): CampaignDisplay = js.native
  
  /** Returns a selector of draft campaigns that have this campaign as their base campaign. */
  def draftCampaigns(): CampaignSelector = js.native
  
  /** Returns a selector of drafts that have this campaign as their base campaign. */
  def drafts(): DraftSelector = js.native
  
  /** Enables the campaign. */
  def enable(): Unit = js.native
  
  /** Creates a location exclusion in this campaign. */
  def excludeLocation(locationId: Double): ExcludedLocationOperation = js.native
  /** Creates a location exclusion in this campaign. */
  def excludeLocation(location: ExcludedLocation): ExcludedLocationOperation = js.native
  /** Creates a location exclusion in this campaign for the specified JSON. */
  def excludeLocation(location: TargetedLocationObject): ExcludedLocationOperation = js.native
  
  /** Returns a selector of excluded placement lists associated with this campaign. */
  def excludedPlacementLists(): ExcludedPlacementListSelector = js.native
  
  /** Returns a selector of experiment campaigns that have this campaign as their base campaign. */
  def experimentCampaigns(): CampaignSelector = js.native
  
  /** Returns a selector of experiments that have this campaign as their base campaign. */
  def experiments(): ExperimentSelector = js.native
  
  /** Provides access to this campaign's extensions: CampaignCallout, CampaignMessage, CampaignMobileApp, CampaignPhoneNumber, CampaignSitelink and CampaignSnippet. */
  def extensions(): CampaignExtensions = js.native
  
  /** Returns the ad rotation type of the campaign. */
  def getAdRotationType(): String = js.native
  
  /** Returns the base campaign to which this campaign belongs. */
  def getBaseCampaign(): Campaign = js.native
  
  /** Returns the bidding strategy type of the campaign. */
  def getBiddingStrategyType(): String = js.native
  
  /** Returns the budget of the campaign. */
  def getBudget(): Budget = js.native
  
  /** Returns the campaign's end date, or null if there is no end date. */
  def getEndDate(): GoogleAdsDate = js.native
  
  /** Returns the type of this entity as a String, in this case, "Campaign". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the campaign. */
  def getId(): Double = js.native
  
  /** Returns the name of the campaign. */
  def getName(): String = js.native
  
  /** Returns the campaign's start date. */
  def getStartDate(): GoogleAdsDate = js.native
  
  /** Returns `true` if the campaign is a base (i.e. regular) campaign. */
  def isBaseCampaign(): Boolean = js.native
  
  /** Returns true if the campaign is a draft campaign. */
  def isDraftCampaign(): Boolean = js.native
  
  /** Returns true if the campaign is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the campaign is an experiment campaign. */
  def isExperimentCampaign(): Boolean = js.native
  
  /** Returns true if the campaign is paused. */
  def isPaused(): Boolean = js.native
  
  /** Returns true if the campaign is removed. */
  def isRemoved(): Boolean = js.native
  
  /** Returns the selector of all keywords in the campaign. */
  def keywords(): KeywordSelector = js.native
  
  /** Creates a selector of all labels applied to the campaign. */
  def labels(): LabelSelector = js.native
  
  /** Returns a selector of negative keyword lists associated with this campaign. */
  def negativeKeywordLists(): NegativeKeywordListSelector = js.native
  
  /** Returns a selector of the campaign-level negative keywords belonging to this campaign. */
  def negativeKeywords(): NegativeKeywordSelector = js.native
  
  /** Returns a new ad group builder for this campaign. */
  def newAdGroupBuilder(): AdGroupBuilder = js.native
  
  /** Returns a new draft builder with this campaign as the base campaign. */
  def newDraftBuilder(): DraftBuilder = js.native
  
  /** Pauses the campaign. */
  def pause(): Unit = js.native
  
  /** Removes a callout extension from this campaign. */
  def removeCallout(calloutExtension: Callout): Unit = js.native
  
  /** Removes a excluded placement list from this campaign. */
  def removeExcludedPlacementList(excludedPlacementList: ExcludedPlacementList): Unit = js.native
  
  /** Removes a label from the campaign. */
  def removeLabel(name: String): Unit = js.native
  
  /** Removes a message extension from this campaign. */
  def removeMessage(messageExtension: Message): Unit = js.native
  
  /** Removes a mobile app extension from this campaign. */
  def removeMobileApp(mobileAppExtension: MobileApp): Unit = js.native
  
  /** Removes a negative keyword list from this campaign. */
  def removeNegativeKeywordList(negativeKeywordList: NegativeKeywordList): Unit = js.native
  
  /** Removes a phone number extension from this campaign. */
  def removePhoneNumber(phoneNumberExtension: PhoneNumber): Unit = js.native
  
  /** Removes a price extension from this campaign. */
  def removePrice(priceExtension: Price): Unit = js.native
  
  /** Removes a sitelink extension from this campaign. */
  def removeSitelink(sitelinkExtension: Sitelink): Unit = js.native
  
  /** Removes a snippet extension from this campaign. */
  def removeSnippet(snippetExtension: Snippet): Unit = js.native
  
  /** Sets the ad rotation type of the campaign. */
  def setAdRotationType(adRotationType: String): Unit = js.native
  
  /** Sets the campaign's end date from either an object containing year, month, and day fields, or an 8-digit string in YYYYMMDD format. */
  def setEndDate(date: String): Unit = js.native
  def setEndDate(date: GoogleAdsDate): Unit = js.native
  
  /** Sets the name of the campaign. */
  def setName(name: String): Unit = js.native
  
  /** Sets the campaign's start date from either an object containing year, month, and day fields, or an 8-digit string in YYYYMMDD format. */
  def setStartDate(date: String): Unit = js.native
  def setStartDate(date: GoogleAdsDate): Unit = js.native
  
  /** Provides access to campaign-level targeting criteria: device targeting, ad scheduling, location targeting, and audiences. */
  def targeting(): CampaignTargeting = js.native
  
  /** Provides access to this campaign's URL fields. */
  def urls(): CampaignUrls = js.native
}
