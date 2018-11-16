package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Campaign
@js.native
trait Campaign
  extends AdWordsEntity
     with canBeEnabled
     with hasLabels
     with hasStartAndEndDate
     with hasStats {
  def adGroups(): AdWordsSelector[AdGroup] = js.native
  def addAdSchedule(adSchedule: AdSchedule): AdWordsOperation[AdSchedule] = js.native
  def addAdSchedule(
    dayOfWeek: DayOfWeekString,
    startHour: scala.Double,
    startMinute: scala.Double,
    endHour: scala.Double,
    endMinute: scala.Double,
    bidModifier: scala.Double
  ): AdWordsOperation[AdSchedule] = js.native
  def addCallout(calloutExtension: Callout): AdWordsOperation[Callout] = js.native
  def addExcludedPlacementList(excludedPlacementList: ExcludedPlacementList): scala.Unit = js.native
  def addLocation(locationId: LocationObject): AdWordsOperation[TargetedLocation] = js.native
  def addLocation(locationId: TargetedLocation): AdWordsOperation[TargetedLocation] = js.native
  def addLocation(locationId: scala.Double): AdWordsOperation[TargetedLocation] = js.native
  def addLocation(locationId: scala.Double, bidModifier: scala.Double): AdWordsOperation[TargetedLocation] = js.native
  def addMessage(messageExtension: Message): AdWordsOperation[Message] = js.native
  def addMobileApp(mobileAppExtension: MobileApp): AdWordsOperation[MobileApp] = js.native
  def addNegativeKeywordLIst(negativeKeywordList: NegativeKeywordList): scala.Unit = js.native
  def addPhoneNumber(phoneNumberExtension: PhoneNumber): AdWordsOperation[PhoneNumber] = js.native
  def addProximity(
    latitude: scala.Double,
    longitude: scala.Double,
    radius: scala.Double,
    radiusUnits: RadiusUnits,
    optArgs: Anon_Address
  ): AdWordsOperation[TargetedProximity] = js.native
  def addProximity(proximity: ProximityObject): AdWordsOperation[TargetedProximity] = js.native
  def addProximity(proximity: TargetedProximity): AdWordsOperation[TargetedProximity] = js.native
  def addReview(reviewExtension: Review): AdWordsOperation[Review] = js.native
  def addSiteLink(sitelinkExtension: Sitelink): AdWordsOperation[Sitelink] = js.native
  def addSnippet(snippetExtension: Snippet): AdWordsOperation[Snippet] = js.native
  def ads(): AdWordsSelector[Ad] = js.native
  def bidding(): CampaignBidding = js.native
  def createNegativeKeyword(keywordText: java.lang.String): scala.Unit = js.native
  def display(): CampaignDisplay = js.native
  def excludeLocation(location: Anon_Id): AdWordsOperation[ExcludedLocation] = js.native
  def excludeLocation(location: ExcludedLocation): AdWordsOperation[ExcludedLocation] = js.native
  def excludeLocation(location: scala.Double): AdWordsOperation[ExcludedLocation] = js.native
  def excludedPlacementLists(): AdWordsSelector[ExcludedPlacementList] = js.native
  def extensions(): CampaignExtensions = js.native
  def getAdRotationType(): AdRotationType = js.native
  def getBiddingStrategyType(): BiddingStrategyString = js.native
  def getBudget(): Budget = js.native
  def getId(): scala.Double = js.native
  def getName(): java.lang.String = js.native
  def isRemoved(): scala.Boolean = js.native
  def keywords(): AdWordsSelector[Keyword] = js.native
  def negativeKeywordLists(): AdWordsSelector[NegativeKeywordList] = js.native
  def negativeKeywords(): AdWordsSelector[NegativeKeyword] = js.native
  def newAdGroupBuilder(): AdGroupBuilder[AdGroup] = js.native
  def removeCallout(calloutExtension: Callout): scala.Unit = js.native
  def removeExcludedPlacementList(excludedPlacementList: ExcludedPlacementList): scala.Unit = js.native
  def removeMessage(message: Message): scala.Unit = js.native
  def removeMobileApp(mobileApp: MobileApp): scala.Unit = js.native
  def removeNegativeKeywordList(negativeKeywordList: NegativeKeywordList): scala.Unit = js.native
  def removePhoneNumber(phoneNumber: PhoneNumber): scala.Unit = js.native
  def removeReview(review: Review): scala.Unit = js.native
  def removeSitelink(sitelkin: Sitelink): scala.Unit = js.native
  def removeSnippet(snippet: Snippet): scala.Unit = js.native
  def setAdRotationType(adRotationType: AdRotationType): scala.Unit = js.native
  def setName(name: java.lang.String): scala.Unit = js.native
  def targeting(): CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience] = js.native
  def urls(): CampaignUrls = js.native
}

