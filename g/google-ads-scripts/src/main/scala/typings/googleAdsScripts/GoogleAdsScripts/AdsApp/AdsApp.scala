package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Root object of Google Ads scripts API. Exposes methods for
  *
  * * Fetching Google Ads entities
  * * Querying Google Ads reports
  * * Accessing information about the state of the current execution
  */
@js.native
trait AdsApp extends StObject {
  
  /** Returns the Google Ads asset interface. */
  def adAssets(): AdAssets = js.native
  
  /** Returns the selector of all ad customizer data sources in the account. */
  def adCustomizerSources(): AdCustomizerSourceSelector = js.native
  
  /** Provides access to ad group-level targeting criteria, currently just audiences. */
  def adGroupTargeting(): AccountAdGroupTargeting = js.native
  
  /** Returns the selector of all ad groups in the account. */
  def adGroups(): AdGroupSelector = js.native
  
  /** Returns the Google Ads media interface. */
  def adMedia(): AdMedia = js.native
  
  /** Returns the selector of all ad params in the account. */
  def adParams(): AdParamSelector = js.native
  
  /** Returns the selector of all ads in the account. */
  def ads(): AdSelector = js.native
  
  /** Returns the selector of all flexible bidding strategies in the account. */
  def biddingStrategies(): BiddingStrategySelector = js.native
  
  /** Returns the selector of all budget orders in the account. */
  def budgetOrders(): BudgetOrderSelector = js.native
  
  /** Returns the selector of all budgets in the account. */
  def budgets(): BudgetSelector = js.native
  
  /** Provides access to bulk uploads: FileUpload, CsvUpload. */
  def bulkUploads(): BulkUploads = js.native
  
  /** Returns the selector of all campaigns in the account. */
  def campaigns(): CampaignSelector = js.native
  
  /**
    * Creates a new Label. You must always specify a name, but description and color are optional.
    *
    * Note that you cannot create more than 100,000 labels per account.
    *
    * @param name The name of the new Label. Label names are case sensitive and must be unique. Max length is 100 characters.
    * Any leading or trailing white spaces will be trimmed.
    * @param description Optional. The description of the new label. If not specified, the description will be empty. Max length is 200 characters.
    * @param backgroundColor Optional. The background color of the new label. The color must be specified in either RGB form (`#RRGGBB` or `#RGB`),
    * or one of the [16 basic CSS color names](https://www.w3.org/TR/css-color-3/#html4). If not specified, the new label will assume an arbitrary background color.
    */
  def createLabel(name: String): Unit = js.native
  def createLabel(name: String, description: String): Unit = js.native
  def createLabel(name: String, description: String, backgroundColor: String): Unit = js.native
  def createLabel(name: String, description: Unit, backgroundColor: String): Unit = js.native
  
  /** Returns miscellaneous information about the Google Ads account in which the script is currently running. */
  def currentAccount(): Account = js.native
  
  /** Provides access to display criteria that have been added to this account: Audience, DisplayKeyword, Placement, Topic. */
  def display(): Display = js.native
  
  /** Returns the selector of all drafts in the account. */
  def drafts(): DraftSelector = js.native
  
  /** Returns a selector of all excluded placement lists in this account. */
  def excludedPlacementLists(): ExcludedPlacementListSelector = js.native
  
  /** Returns the selector of all experiments in the account. */
  def experiments(): ExperimentSelector = js.native
  
  /** Provides access to ad extensions that have been added to this account: Callout, Message, MobileApp, PhoneNumber, Sitelink, and Snippet. */
  def extensions(): Extensions = js.native
  
  /** Returns miscellaneous information about the current script execution. */
  def getExecutionInfo(): ExecutionInfo = js.native
  
  /** Returns the selector of all keywords in the account. */
  def keywords(): KeywordSelector = js.native
  
  /** Returns the selector of all labels in the account. */
  def labels(): LabelSelector = js.native
  
  /** Returns a selector of all negative keyword lists in this account. */
  def negativeKeywordLists(): NegativeKeywordListSelector = js.native
  
  /** Returns a new ad customizer source builder for this account. */
  def newAdCustomizerSourceBuilder(): AdCustomizerSourceBuilder = js.native
  
  /** Returns a new excluded placement list builder for this account. */
  def newExcludedPlacementListBuilder(): ExcludedPlacementListBuilder = js.native
  
  /** Returns a new negative keyword list builder for this account. */
  def newNegativeKeywordListBuilder(): NegativeKeywordListBuilder = js.native
  
  /** Returns the selector of all product ads in the account. */
  def productAds(): ProductAdSelector = js.native
  
  /** Returns the selector of all product groups in the account. */
  def productGroups(): ProductGroupSelector = js.native
  
  /**
    * Fetches a Google Ads report.
    *
    * @param query AWQL or GAQL query specifying the report.
    * @param optArgs Optional arguments
    */
  def report(query: String): Report = js.native
  def report(query: String, optArgs: ReportOptionalArguments): Report = js.native
  
  /**
    * Executes a Google Ads Search.
    *
    * @param query GAQL search query.
    * @param optArgs Optional arguments
    */
  def search(query: String): SearchRowIterator = js.native
  def search(query: String, optArgs: SearchOptionalArguments): SearchRowIterator = js.native
  
  /** Provides access to shopping ad group-level targeting criteria, currently just audiences. */
  def shoppingAdGroupTargeting(): AccountShoppingAdGroupTargeting = js.native
  
  /** Returns the selector of all shopping ad groups in the account. */
  def shoppingAdGroups(): ShoppingAdGroupSelector = js.native
  
  /** Provides access to shopping campaign-level targeting criteria, currently just audiences. */
  def shoppingCampaignTargeting(): AccountShoppingCampaignTargeting = js.native
  
  /** Returns the selector of all shopping campaigns in the account. */
  def shoppingCampaigns(): ShoppingCampaignSelector = js.native
  
  /** Provides access to campaign-level targeting criteria: device targeting, ad scheduling, location targeting, and audiences. */
  def targeting(): Targeting = js.native
  
  /** Returns the selector of all user lists in the account. */
  def userlists(): UserListSelector = js.native
  
  /** Returns the selector of all video ad groups in the account. */
  def videoAdGroups(): VideoAdGroupSelector = js.native
  
  /** Returns the selector of all video ads in the account. */
  def videoAds(): VideoAdSelector = js.native
  
  /** Returns the selector of all video campaigns in the account. */
  def videoCampaigns(): VideoCampaignSelector = js.native
  
  /**
    * Provides access to video criteria that have been added to this account: VideoAge, VideoAudience,VideoGender, VideoKeyword,
    * VideoMobileAppCategory VideoMobileApplication, VideoParentalStatus, VideoPlacement, VideoTopic, VideoYouTubeChannel, VideoYouTubeVideo.
    */
  def videoTargeting(): VideoTargeting = js.native
}
