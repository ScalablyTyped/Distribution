package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Autocomplete
@JSGlobal("AdWordsApp")
@js.native
object AdWordsAppNs extends js.Object {
  def adCustomizerSources(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.AdCustomizerSource] = js.native
  def adGroupTargeting(): googleDashAdwordsDashScriptsLib.AdWordsTargeting[
    googleDashAdwordsDashScriptsLib.SearchAdGroupAudience, 
    googleDashAdwordsDashScriptsLib.SearchAdGroupExcludedAudience
  ] = js.native
  def adGroups(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.AdGroup] = js.native
  def adMedia(): googleDashAdwordsDashScriptsLib.AdMedia = js.native
  def adParams(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.AdParam] = js.native
  def ads(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.Ad] = js.native
  def biddingStrategies(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.BiddingStrategy] = js.native
  def budgetOrders(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.BudgetOrder] = js.native
  def budgets(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.Budget] = js.native
  def bulkUploads(): googleDashAdwordsDashScriptsLib.BulkUploads = js.native
  def campaigns(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.Campaign] = js.native
  def createLabel(name: java.lang.String): scala.Unit = js.native
  def createLabel(name: java.lang.String, description: java.lang.String): scala.Unit = js.native
  def createLabel(name: java.lang.String, description: java.lang.String, backgroundColor: java.lang.String): scala.Unit = js.native
  def currentAccount(): googleDashAdwordsDashScriptsLib.CurrentAccount = js.native
  def display(): googleDashAdwordsDashScriptsLib.Display = js.native
  def excludedPlacementLists(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.ExcludedPlacementList] = js.native
  def extensions(): googleDashAdwordsDashScriptsLib.AdWordsAdExtensions = js.native
  def getExecutionInfo(): googleDashAdwordsDashScriptsLib.ExecutionInfo = js.native
  def keywords(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.Keyword] = js.native
  def labels(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.Label] = js.native
  def negativeKeywordLists(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.NegativeKeywordList] = js.native
  def newAdCustomizerSourceBuilder(): googleDashAdwordsDashScriptsLib.AdCustomizerSourceBuilder[googleDashAdwordsDashScriptsLib.AdCustomizerSource] = js.native
  def newExcludedPlacementListBuilder(): googleDashAdwordsDashScriptsLib.ExcludedPlacementListBuilder[googleDashAdwordsDashScriptsLib.ExcludedPlacementList] = js.native
  def newNegativeKeywordListBuilder(): googleDashAdwordsDashScriptsLib.NegativeKeywordListBuilder[googleDashAdwordsDashScriptsLib.NegativeKeywordList] = js.native
  def productAds(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.AdWordsEntity] = js.native
  def productGroups(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.AdWordsEntity] = js.native
  def report(query: java.lang.String): googleDashAdwordsDashScriptsLib.AdWordsReport = js.native
  def report(query: java.lang.String, options: googleDashAdwordsDashScriptsLib.ReportOptionArguments): googleDashAdwordsDashScriptsLib.AdWordsReport = js.native
  def shoppingAdGroupTargeting(): js.Any = js.native
  def shoppingAdGroups(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.AdWordsEntity] = js.native
  def shoppingCampaignTargeting(): js.Any = js.native
  def shoppingCampaigns(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.AdWordsEntity] = js.native
  def targeting(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.Targeting] = js.native
  def userlists(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.UserList] = js.native
  def videoAdGroups(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.AdWordsEntity] = js.native
  def videoAds(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.AdWordsEntity] = js.native
  def videoCampaigns(): googleDashAdwordsDashScriptsLib.AdWordsSelector[googleDashAdwordsDashScriptsLib.AdWordsEntity] = js.native
  def videoTargeting(): js.Any = js.native
}

