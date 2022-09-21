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
    
    inline def adCustomizerSources(): AdWordsSelector[AdCustomizerSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("adCustomizerSources")().asInstanceOf[AdWordsSelector[AdCustomizerSource]]
    
    inline def adGroupTargeting(): AdWordsTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = ^.asInstanceOf[js.Dynamic].applyDynamic("adGroupTargeting")().asInstanceOf[AdWordsTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience]]
    
    inline def adGroups(): AdWordsSelector[AdGroup] = ^.asInstanceOf[js.Dynamic].applyDynamic("adGroups")().asInstanceOf[AdWordsSelector[AdGroup]]
    
    inline def adMedia(): AdMedia = ^.asInstanceOf[js.Dynamic].applyDynamic("adMedia")().asInstanceOf[AdMedia]
    
    inline def adParams(): AdWordsSelector[AdParam] = ^.asInstanceOf[js.Dynamic].applyDynamic("adParams")().asInstanceOf[AdWordsSelector[AdParam]]
    
    inline def ads(): AdWordsSelector[Ad] = ^.asInstanceOf[js.Dynamic].applyDynamic("ads")().asInstanceOf[AdWordsSelector[Ad]]
    
    inline def biddingStrategies(): AdWordsSelector[BiddingStrategy] = ^.asInstanceOf[js.Dynamic].applyDynamic("biddingStrategies")().asInstanceOf[AdWordsSelector[BiddingStrategy]]
    
    inline def budgetOrders(): AdWordsSelector[BudgetOrder] = ^.asInstanceOf[js.Dynamic].applyDynamic("budgetOrders")().asInstanceOf[AdWordsSelector[BudgetOrder]]
    
    inline def budgets(): AdWordsSelector[Budget] = ^.asInstanceOf[js.Dynamic].applyDynamic("budgets")().asInstanceOf[AdWordsSelector[Budget]]
    
    inline def bulkUploads(): BulkUploads = ^.asInstanceOf[js.Dynamic].applyDynamic("bulkUploads")().asInstanceOf[BulkUploads]
    
    inline def campaigns(): AdWordsSelector[Campaign] = ^.asInstanceOf[js.Dynamic].applyDynamic("campaigns")().asInstanceOf[AdWordsSelector[Campaign]]
    
    inline def createLabel(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createLabel")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createLabel(name: String, description: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLabel")(name.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createLabel(name: String, description: String, backgroundColor: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLabel")(name.asInstanceOf[js.Any], description.asInstanceOf[js.Any], backgroundColor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createLabel(name: String, description: Unit, backgroundColor: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLabel")(name.asInstanceOf[js.Any], description.asInstanceOf[js.Any], backgroundColor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def currentAccount(): CurrentAccount = ^.asInstanceOf[js.Dynamic].applyDynamic("currentAccount")().asInstanceOf[CurrentAccount]
    
    inline def display(): Display = ^.asInstanceOf[js.Dynamic].applyDynamic("display")().asInstanceOf[Display]
    
    inline def excludedPlacementLists(): AdWordsSelector[ExcludedPlacementList] = ^.asInstanceOf[js.Dynamic].applyDynamic("excludedPlacementLists")().asInstanceOf[AdWordsSelector[ExcludedPlacementList]]
    
    inline def extensions(): AdWordsAdExtensions = ^.asInstanceOf[js.Dynamic].applyDynamic("extensions")().asInstanceOf[AdWordsAdExtensions]
    
    inline def getExecutionInfo(): ExecutionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getExecutionInfo")().asInstanceOf[ExecutionInfo]
    
    inline def keywords(): AdWordsSelector[Keyword] = ^.asInstanceOf[js.Dynamic].applyDynamic("keywords")().asInstanceOf[AdWordsSelector[Keyword]]
    
    inline def labels(): AdWordsSelector[Label] = ^.asInstanceOf[js.Dynamic].applyDynamic("labels")().asInstanceOf[AdWordsSelector[Label]]
    
    inline def negativeKeywordLists(): AdWordsSelector[NegativeKeywordList] = ^.asInstanceOf[js.Dynamic].applyDynamic("negativeKeywordLists")().asInstanceOf[AdWordsSelector[NegativeKeywordList]]
    
    inline def newAdCustomizerSourceBuilder(): AdCustomizerSourceBuilder[AdCustomizerSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("newAdCustomizerSourceBuilder")().asInstanceOf[AdCustomizerSourceBuilder[AdCustomizerSource]]
    
    inline def newExcludedPlacementListBuilder(): ExcludedPlacementListBuilder[ExcludedPlacementList] = ^.asInstanceOf[js.Dynamic].applyDynamic("newExcludedPlacementListBuilder")().asInstanceOf[ExcludedPlacementListBuilder[ExcludedPlacementList]]
    
    inline def newNegativeKeywordListBuilder(): NegativeKeywordListBuilder[NegativeKeywordList] = ^.asInstanceOf[js.Dynamic].applyDynamic("newNegativeKeywordListBuilder")().asInstanceOf[NegativeKeywordListBuilder[NegativeKeywordList]]
    
    inline def productAds(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("productAds")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: ProductAd
    inline def productGroups(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("productGroups")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: ProductGroup
    inline def report(query: String): AdWordsReport = ^.asInstanceOf[js.Dynamic].applyDynamic("report")(query.asInstanceOf[js.Any]).asInstanceOf[AdWordsReport]
    inline def report(query: String, options: ReportOptionArguments): AdWordsReport = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AdWordsReport]
    
    inline def shoppingAdGroupTargeting(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shoppingAdGroupTargeting")().asInstanceOf[Any]
    
    // TODO: AccountShoppingAdGroupTargeting
    inline def shoppingAdGroups(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("shoppingAdGroups")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: ShoppingAdGroup
    inline def shoppingCampaignTargeting(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shoppingCampaignTargeting")().asInstanceOf[Any]
    
    // TODO: AccountShoppingCampaignTargeting
    inline def shoppingCampaigns(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("shoppingCampaigns")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: ShoppingCampaign
    inline def targeting(): AdWordsSelector[Targeting] = ^.asInstanceOf[js.Dynamic].applyDynamic("targeting")().asInstanceOf[AdWordsSelector[Targeting]]
    
    inline def userlists(): AdWordsSelector[UserList] = ^.asInstanceOf[js.Dynamic].applyDynamic("userlists")().asInstanceOf[AdWordsSelector[UserList]]
    
    inline def videoAdGroups(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("videoAdGroups")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: VideoAdGroup
    inline def videoAds(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("videoAds")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: VideoAd
    inline def videoCampaigns(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("videoCampaigns")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: VideoCampaign
    inline def videoTargeting(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("videoTargeting")().asInstanceOf[Any]
  }
  
  object MccApp {
    
    @JSGlobal("MccApp")
    @js.native
    val ^ : js.Any = js.native
    
    inline def accountLabels(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("accountLabels")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: AccountLabel
    inline def accounts(): AdWordsSelector[AdWordsEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("accounts")().asInstanceOf[AdWordsSelector[AdWordsEntity]]
    
    // TODO: ManagedAccount
    inline def createAccountLabel(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAccountLabel")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def select(account: AdWordsEntity): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(account.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
