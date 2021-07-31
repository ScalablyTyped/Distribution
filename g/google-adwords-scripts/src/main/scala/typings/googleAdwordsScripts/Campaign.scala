package typings.googleAdwordsScripts

import typings.googleAdwordsScripts.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Campaign
@js.native
trait Campaign
  extends StObject
     with AdWordsEntity
     with canBeEnabled
     with hasLabels
     with hasStartAndEndDate
     with hasStats {
  
  def adGroups(): AdWordsSelector[AdGroup] = js.native
  
  def addAdSchedule(adSchedule: AdSchedule): AdWordsOperation[AdSchedule] = js.native
  def addAdSchedule(
    dayOfWeek: DayOfWeekString,
    startHour: Double,
    startMinute: Double,
    endHour: Double,
    endMinute: Double,
    bidModifier: Double
  ): AdWordsOperation[AdSchedule] = js.native
  
  def addCallout(calloutExtension: Callout): AdWordsOperation[Callout] = js.native
  
  def addExcludedPlacementList(excludedPlacementList: ExcludedPlacementList): Unit = js.native
  
  def addLocation(locationId: Double): AdWordsOperation[TargetedLocation] = js.native
  def addLocation(locationId: Double, bidModifier: Double): AdWordsOperation[TargetedLocation] = js.native
  def addLocation(locationId: LocationObject): AdWordsOperation[TargetedLocation] = js.native
  def addLocation(locationId: TargetedLocation): AdWordsOperation[TargetedLocation] = js.native
  
  def addMessage(messageExtension: Message): AdWordsOperation[Message] = js.native
  
  def addMobileApp(mobileAppExtension: MobileApp): AdWordsOperation[MobileApp] = js.native
  
  def addNegativeKeywordLIst(negativeKeywordList: NegativeKeywordList): Unit = js.native
  
  def addPhoneNumber(phoneNumberExtension: PhoneNumber): AdWordsOperation[PhoneNumber] = js.native
  
  def addProximity(
    latitude: Double,
    longitude: Double,
    radius: Double,
    radiusUnits: RadiusUnits,
    optArgs: typings.googleAdwordsScripts.anon.Address
  ): AdWordsOperation[TargetedProximity] = js.native
  def addProximity(proximity: ProximityObject): AdWordsOperation[TargetedProximity] = js.native
  def addProximity(proximity: TargetedProximity): AdWordsOperation[TargetedProximity] = js.native
  
  def addReview(reviewExtension: Review): AdWordsOperation[Review] = js.native
  
  def addSiteLink(sitelinkExtension: Sitelink): AdWordsOperation[Sitelink] = js.native
  
  def addSnippet(snippetExtension: Snippet): AdWordsOperation[Snippet] = js.native
  
  def ads(): AdWordsSelector[Ad] = js.native
  
  def bidding(): CampaignBidding = js.native
  
  def createNegativeKeyword(keywordText: String): Unit = js.native
  
  def display(): CampaignDisplay = js.native
  
  def excludeLocation(location: Double): AdWordsOperation[ExcludedLocation] = js.native
  def excludeLocation(location: ExcludedLocation): AdWordsOperation[ExcludedLocation] = js.native
  def excludeLocation(location: Id): AdWordsOperation[ExcludedLocation] = js.native
  
  def excludedPlacementLists(): AdWordsSelector[ExcludedPlacementList] = js.native
  
  def extensions(): CampaignExtensions = js.native
  
  def getAdRotationType(): AdRotationType = js.native
  
  def getBiddingStrategyType(): BiddingStrategyString = js.native
  
  def getBudget(): Budget = js.native
  
  def getId(): Double = js.native
  
  def getName(): String = js.native
  
  def isRemoved(): Boolean = js.native
  
  def keywords(): AdWordsSelector[Keyword] = js.native
  
  def negativeKeywordLists(): AdWordsSelector[NegativeKeywordList] = js.native
  
  def negativeKeywords(): AdWordsSelector[NegativeKeyword] = js.native
  
  def newAdGroupBuilder(): AdGroupBuilder[AdGroup] = js.native
  
  def removeCallout(calloutExtension: Callout): Unit = js.native
  
  def removeExcludedPlacementList(excludedPlacementList: ExcludedPlacementList): Unit = js.native
  
  def removeMessage(message: Message): Unit = js.native
  
  def removeMobileApp(mobileApp: MobileApp): Unit = js.native
  
  def removeNegativeKeywordList(negativeKeywordList: NegativeKeywordList): Unit = js.native
  
  def removePhoneNumber(phoneNumber: PhoneNumber): Unit = js.native
  
  def removeReview(review: Review): Unit = js.native
  
  def removeSitelink(sitelkin: Sitelink): Unit = js.native
  
  def removeSnippet(snippet: Snippet): Unit = js.native
  
  def setAdRotationType(adRotationType: AdRotationType): Unit = js.native
  
  def setName(name: String): Unit = js.native
  
  def targeting(): CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience] = js.native
  
  def urls(): CampaignUrls = js.native
}
