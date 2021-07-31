package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // Autocomplete
  object AdWordsApp {
    
    @JSGlobal("AdWordsApp")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def adCustomizerSources(): AdWordsSelector[AdCustomizerSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("adCustomizerSources")().asInstanceOf[AdWordsSelector[AdCustomizerSource]]
    
    @scala.inline
    def adGroupTargeting(): AdWordsTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = ^.asInstanceOf[js.Dynamic].applyDynamic("adGroupTargeting")().asInstanceOf[AdWordsTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience]]
    
    @scala.inline
    def adGroups(): AdWordsSelector[AdGroup] = ^.asInstanceOf[js.Dynamic].applyDynamic("adGroups")().asInstanceOf[AdWordsSelector[AdGroup]]
    
    @scala.inline
    def adMedia(): AdMedia = ^.asInstanceOf[js.Dynamic].applyDynamic("adMedia")().asInstanceOf[AdMedia]
    
    @scala.inline
    def adParams(): AdWordsSelector[AdParam] = ^.asInstanceOf[js.Dynamic].applyDynamic("adParams")().asInstanceOf[AdWordsSelector[AdParam]]
    
    @scala.inline
    def ads(): AdWordsSelector[Ad] = ^.asInstanceOf[js.Dynamic].applyDynamic("ads")().asInstanceOf[AdWordsSelector[Ad]]
    
    @scala.inline
    def biddingStrategies(): AdWordsSelector[BiddingStrategy] = ^.asInstanceOf[js.Dynamic].applyDynamic("biddingStrategies")().asInstanceOf[AdWordsSelector[BiddingStrategy]]
    
    @scala.inline
    def budgetOrders(): AdWordsSelector[BudgetOrder] = ^.asInstanceOf[js.Dynamic].applyDynamic("budgetOrders")().asInstanceOf[AdWordsSelector[BudgetOrder]]
    
    @scala.inline
    def budgets(): AdWordsSelector[Budget] = ^.asInstanceOf[js.Dynamic].applyDynamic("budgets")().asInstanceOf[AdWordsSelector[Budget]]
    
    @scala.inline
    def bulkUploads(): BulkUploads = ^.asInstanceOf[js.Dynamic].applyDynamic("bulkUploads")().asInstanceOf[BulkUploads]
    
    @scala.inline
    def campaigns(): AdWordsSelector[Campaign] = ^.asInstanceOf[js.Dynamic].applyDynamic("campaigns")().asInstanceOf[AdWordsSelector[Campaign]]
    
    @scala.inline
    def createLabel(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createLabel")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def createLabel(name: String, description: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLabel")(name.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def createLabel(name: String, description: String, backgroundColor: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLabel")(name.asInstanceOf[js.Any], description.asInstanceOf[js.Any], backgroundColor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def createLabel(name: String, description: Unit, backgroundColor: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLabel")(name.asInstanceOf[js.Any], description.asInstanceOf[js.Any], backgroundColor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def currentAccount(): CurrentAccount = ^.asInstanceOf[js.Dynamic].applyDynamic("currentAccount")().asInstanceOf[CurrentAccount]
    
    @scala.inline
    def display(): Display = ^.asInstanceOf[js.Dynamic].applyDynamic("display")().asInstanceOf[Display]
    
    @scala.inline
    def excludedPlacementLists(): AdWordsSelector[ExcludedPlacementList] = ^.asInstanceOf[js.Dynamic].applyDynamic("excludedPlacementLists")().asInstanceOf[AdWordsSelector[ExcludedPlacementList]]
    
    @scala.inline
    def extensions(): AdWordsAdExtensions = ^.asInstanceOf[js.Dynamic].applyDynamic("extensions")().asInstanceOf[AdWordsAdExtensions]
    
    @scala.inline
    def getExecutionInfo(): ExecutionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getExecutionInfo")().asInstanceOf[ExecutionInfo]
    
    @scala.inline
    def keywords(): AdWordsSelector[Keyword] = ^.asInstanceOf[js.Dynamic].applyDynamic("keywords")().asInstanceOf[AdWordsSelector[Keyword]]
    
    @scala.inline
    def labels(): AdWordsSelector[Label] = ^.asInstanceOf[js.Dynamic].applyDynamic("labels")().asInstanceOf[AdWordsSelector[Label]]
    
    @scala.inline
    def negativeKeywordLists(): AdWordsSelector[NegativeKeywordList] = ^.asInstanceOf[js.Dynamic].applyDynamic("negativeKeywordLists")().asInstanceOf[AdWordsSelector[NegativeKeywordList]]
    
    @scala.inline
    def newAdCustomizerSourceBuilder(): AdCustomizerSourceBuilder[AdCustomizerSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("newAdCustomizerSourceBuilder")().asInstanceOf[AdCustomizerSourceBuilder[AdCustomizerSource]]
    
    @scala.inline
    def newExcludedPlacementListBuilder(): ExcludedPlacementListBuilder[ExcludedPlacementList] = ^.asInstanceOf[js.Dynamic].applyDynamic("newExcludedPlacementListBuilder")().asInstanceOf[ExcludedPlacementListBuilder[ExcludedPlacementList]]
    
    @scala.inline
    def newNegativeKeywordListBuilder(): NegativeKeywordListBuilder[NegativeKeywordList] = ^.asInstanceOf[js.Dynamic].applyDynamic("newNegativeKeywordListBuilder")().asInstanceOf[NegativeKeywordListBuilder[NegativeKeywordList]]
    
    @scala.inline
    def productAds(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("productAds")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: ProductAd
    @scala.inline
    def productGroups(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("productGroups")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: ProductGroup
    @scala.inline
    def report(query: String): AdWordsReport = ^.asInstanceOf[js.Dynamic].applyDynamic("report")(query.asInstanceOf[js.Any]).asInstanceOf[AdWordsReport]
    @scala.inline
    def report(query: String, options: ReportOptionArguments): AdWordsReport = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AdWordsReport]
    
    @scala.inline
    def shoppingAdGroupTargeting(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shoppingAdGroupTargeting")().asInstanceOf[js.Any]
    
    // TODO: AccountShoppingAdGroupTargeting
    @scala.inline
    def shoppingAdGroups(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("shoppingAdGroups")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: ShoppingAdGroup
    @scala.inline
    def shoppingCampaignTargeting(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shoppingCampaignTargeting")().asInstanceOf[js.Any]
    
    // TODO: AccountShoppingCampaignTargeting
    @scala.inline
    def shoppingCampaigns(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("shoppingCampaigns")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: ShoppingCampaign
    @scala.inline
    def targeting(): AdWordsSelector[Targeting] = ^.asInstanceOf[js.Dynamic].applyDynamic("targeting")().asInstanceOf[AdWordsSelector[Targeting]]
    
    @scala.inline
    def userlists(): AdWordsSelector[UserList] = ^.asInstanceOf[js.Dynamic].applyDynamic("userlists")().asInstanceOf[AdWordsSelector[UserList]]
    
    @scala.inline
    def videoAdGroups(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("videoAdGroups")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: VideoAdGroup
    @scala.inline
    def videoAds(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("videoAds")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: VideoAd
    @scala.inline
    def videoCampaigns(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("videoCampaigns")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: VideoCampaign
    @scala.inline
    def videoTargeting(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("videoTargeting")().asInstanceOf[js.Any]
  }
  
  object MccApp {
    
    @JSGlobal("MccApp")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def accountLabels(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("accountLabels")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: AccountLabel
    @scala.inline
    def accounts(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("accounts")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: ManagedAccount
    @scala.inline
    def createAccountLabel(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAccountLabel")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def select(account: AdWordsEntity): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(account.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
