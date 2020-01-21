package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Autocomplete
@JSGlobal("AdWordsApp")
@js.native
object AdWordsApp extends js.Object {
  def adCustomizerSources(): AdWordsSelector[AdCustomizerSource] = js.native
  def adGroupTargeting(): AdWordsTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = js.native
  def adGroups(): AdWordsSelector[AdGroup] = js.native
  def adMedia(): AdMedia = js.native
  def adParams(): AdWordsSelector[AdParam] = js.native
  def ads(): AdWordsSelector[Ad] = js.native
  def biddingStrategies(): AdWordsSelector[BiddingStrategy] = js.native
  def budgetOrders(): AdWordsSelector[BudgetOrder] = js.native
  def budgets(): AdWordsSelector[Budget] = js.native
  def bulkUploads(): BulkUploads = js.native
  def campaigns(): AdWordsSelector[Campaign] = js.native
  def createLabel(name: String): Unit = js.native
  def createLabel(name: String, description: String): Unit = js.native
  def createLabel(name: String, description: String, backgroundColor: String): Unit = js.native
  def currentAccount(): CurrentAccount = js.native
  def display(): Display = js.native
  def excludedPlacementLists(): AdWordsSelector[ExcludedPlacementList] = js.native
  def extensions(): AdWordsAdExtensions = js.native
  def getExecutionInfo(): ExecutionInfo = js.native
  def keywords(): AdWordsSelector[Keyword] = js.native
  def labels(): AdWordsSelector[Label] = js.native
  def negativeKeywordLists(): AdWordsSelector[NegativeKeywordList] = js.native
  def newAdCustomizerSourceBuilder(): AdCustomizerSourceBuilder[AdCustomizerSource] = js.native
  def newExcludedPlacementListBuilder(): ExcludedPlacementListBuilder[ExcludedPlacementList] = js.native
  def newNegativeKeywordListBuilder(): NegativeKeywordListBuilder[NegativeKeywordList] = js.native
  def productAds(): AdWordsSelector[AdWordsEntity] = js.native
  def productGroups(): AdWordsSelector[AdWordsEntity] = js.native
  def report(query: String): AdWordsReport = js.native
  def report(query: String, options: ReportOptionArguments): AdWordsReport = js.native
  def shoppingAdGroupTargeting(): js.Any = js.native
  def shoppingAdGroups(): AdWordsSelector[AdWordsEntity] = js.native
  def shoppingCampaignTargeting(): js.Any = js.native
  def shoppingCampaigns(): AdWordsSelector[AdWordsEntity] = js.native
  def targeting(): AdWordsSelector[Targeting] = js.native
  def userlists(): AdWordsSelector[UserList] = js.native
  def videoAdGroups(): AdWordsSelector[AdWordsEntity] = js.native
  def videoAds(): AdWordsSelector[AdWordsEntity] = js.native
  def videoCampaigns(): AdWordsSelector[AdWordsEntity] = js.native
  def videoTargeting(): js.Any = js.native
}

