package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // Autocomplete
  object AdWordsApp {
    
    @JSGlobal("AdWordsApp.adCustomizerSources")
    @js.native
    def adCustomizerSources(): AdWordsSelector[AdCustomizerSource] = js.native
    
    @JSGlobal("AdWordsApp.adGroupTargeting")
    @js.native
    def adGroupTargeting(): AdWordsTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = js.native
    
    @JSGlobal("AdWordsApp.adGroups")
    @js.native
    def adGroups(): AdWordsSelector[AdGroup] = js.native
    
    @JSGlobal("AdWordsApp.adMedia")
    @js.native
    def adMedia(): AdMedia = js.native
    
    @JSGlobal("AdWordsApp.adParams")
    @js.native
    def adParams(): AdWordsSelector[AdParam] = js.native
    
    @JSGlobal("AdWordsApp.ads")
    @js.native
    def ads(): AdWordsSelector[Ad] = js.native
    
    @JSGlobal("AdWordsApp.biddingStrategies")
    @js.native
    def biddingStrategies(): AdWordsSelector[BiddingStrategy] = js.native
    
    @JSGlobal("AdWordsApp.budgetOrders")
    @js.native
    def budgetOrders(): AdWordsSelector[BudgetOrder] = js.native
    
    @JSGlobal("AdWordsApp.budgets")
    @js.native
    def budgets(): AdWordsSelector[Budget] = js.native
    
    @JSGlobal("AdWordsApp.bulkUploads")
    @js.native
    def bulkUploads(): BulkUploads = js.native
    
    @JSGlobal("AdWordsApp.campaigns")
    @js.native
    def campaigns(): AdWordsSelector[Campaign] = js.native
    
    @JSGlobal("AdWordsApp.createLabel")
    @js.native
    def createLabel(name: String): Unit = js.native
    @JSGlobal("AdWordsApp.createLabel")
    @js.native
    def createLabel(name: String, description: js.UndefOr[scala.Nothing], backgroundColor: String): Unit = js.native
    @JSGlobal("AdWordsApp.createLabel")
    @js.native
    def createLabel(name: String, description: String): Unit = js.native
    @JSGlobal("AdWordsApp.createLabel")
    @js.native
    def createLabel(name: String, description: String, backgroundColor: String): Unit = js.native
    
    @JSGlobal("AdWordsApp.currentAccount")
    @js.native
    def currentAccount(): CurrentAccount = js.native
    
    @JSGlobal("AdWordsApp.display")
    @js.native
    def display(): Display = js.native
    
    @JSGlobal("AdWordsApp.excludedPlacementLists")
    @js.native
    def excludedPlacementLists(): AdWordsSelector[ExcludedPlacementList] = js.native
    
    @JSGlobal("AdWordsApp.extensions")
    @js.native
    def extensions(): AdWordsAdExtensions = js.native
    
    @JSGlobal("AdWordsApp.getExecutionInfo")
    @js.native
    def getExecutionInfo(): ExecutionInfo = js.native
    
    @JSGlobal("AdWordsApp.keywords")
    @js.native
    def keywords(): AdWordsSelector[Keyword] = js.native
    
    @JSGlobal("AdWordsApp.labels")
    @js.native
    def labels(): AdWordsSelector[Label] = js.native
    
    @JSGlobal("AdWordsApp.negativeKeywordLists")
    @js.native
    def negativeKeywordLists(): AdWordsSelector[NegativeKeywordList] = js.native
    
    @JSGlobal("AdWordsApp.newAdCustomizerSourceBuilder")
    @js.native
    def newAdCustomizerSourceBuilder(): AdCustomizerSourceBuilder[AdCustomizerSource] = js.native
    
    @JSGlobal("AdWordsApp.newExcludedPlacementListBuilder")
    @js.native
    def newExcludedPlacementListBuilder(): ExcludedPlacementListBuilder[ExcludedPlacementList] = js.native
    
    @JSGlobal("AdWordsApp.newNegativeKeywordListBuilder")
    @js.native
    def newNegativeKeywordListBuilder(): NegativeKeywordListBuilder[NegativeKeywordList] = js.native
    
    @JSGlobal("AdWordsApp.productAds")
    @js.native
    def productAds(): AdWordsSelector[AdWordsEntity] = js.native
    
    // TODO: ProductAd
    @JSGlobal("AdWordsApp.productGroups")
    @js.native
    def productGroups(): AdWordsSelector[AdWordsEntity] = js.native
    
    // TODO: ProductGroup
    @JSGlobal("AdWordsApp.report")
    @js.native
    def report(query: String): AdWordsReport = js.native
    @JSGlobal("AdWordsApp.report")
    @js.native
    def report(query: String, options: ReportOptionArguments): AdWordsReport = js.native
    
    @JSGlobal("AdWordsApp.shoppingAdGroupTargeting")
    @js.native
    def shoppingAdGroupTargeting(): js.Any = js.native
    
    // TODO: AccountShoppingAdGroupTargeting
    @JSGlobal("AdWordsApp.shoppingAdGroups")
    @js.native
    def shoppingAdGroups(): AdWordsSelector[AdWordsEntity] = js.native
    
    // TODO: ShoppingAdGroup
    @JSGlobal("AdWordsApp.shoppingCampaignTargeting")
    @js.native
    def shoppingCampaignTargeting(): js.Any = js.native
    
    // TODO: AccountShoppingCampaignTargeting
    @JSGlobal("AdWordsApp.shoppingCampaigns")
    @js.native
    def shoppingCampaigns(): AdWordsSelector[AdWordsEntity] = js.native
    
    // TODO: ShoppingCampaign
    @JSGlobal("AdWordsApp.targeting")
    @js.native
    def targeting(): AdWordsSelector[Targeting] = js.native
    
    @JSGlobal("AdWordsApp.userlists")
    @js.native
    def userlists(): AdWordsSelector[UserList] = js.native
    
    @JSGlobal("AdWordsApp.videoAdGroups")
    @js.native
    def videoAdGroups(): AdWordsSelector[AdWordsEntity] = js.native
    
    // TODO: VideoAdGroup
    @JSGlobal("AdWordsApp.videoAds")
    @js.native
    def videoAds(): AdWordsSelector[AdWordsEntity] = js.native
    
    // TODO: VideoAd
    @JSGlobal("AdWordsApp.videoCampaigns")
    @js.native
    def videoCampaigns(): AdWordsSelector[AdWordsEntity] = js.native
    
    // TODO: VideoCampaign
    @JSGlobal("AdWordsApp.videoTargeting")
    @js.native
    def videoTargeting(): js.Any = js.native
  }
  
  object MccApp {
    
    @JSGlobal("MccApp.accountLabels")
    @js.native
    def accountLabels(): AdWordsSelector[AdWordsEntity] = js.native
    
    // TODO: AccountLabel
    @JSGlobal("MccApp.accounts")
    @js.native
    def accounts(): AdWordsSelector[AdWordsEntity] = js.native
    
    // TODO: ManagedAccount
    @JSGlobal("MccApp.createAccountLabel")
    @js.native
    def createAccountLabel(name: String): Unit = js.native
    
    @JSGlobal("MccApp.select")
    @js.native
    def select(account: AdWordsEntity): Unit = js.native
  }
}
