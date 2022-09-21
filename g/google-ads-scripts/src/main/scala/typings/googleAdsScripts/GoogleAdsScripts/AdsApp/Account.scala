package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Miscellaneous information about Google Ads Accounts. When accessed by `AdsApp.currentAccount()`, it will provide information about the account in which the script is currently running. */
@js.native
trait Account
  extends StObject
     with StatsFor {
  
  /** Adds a callout extension to this account. */
  def addCallout(calloutExtension: Callout): CalloutOperation = js.native
  
  /** Adds a mobile app extension to this account. */
  def addMobileApp(mobileAppExtension: MobileApp): MobileAppOperation = js.native
  
  /** Adds a price extension to this account. */
  def addPrice(priceExtension: Price): PriceOperation = js.native
  
  /** Adds a sitelink extension to this account. */
  def addSitelink(sitelinkExtension: Sitelink): SitelinkOperation = js.native
  
  /** Adds a snippet extension to this account. */
  def addSnippet(snippetExtension: Snippet): SnippetOperation = js.native
  
  /** Provides access to account - level extensions: AccountCallout, AccountMessage, AccountMobileApp, AccountPhoneNumber, AccountSitelink, and AccountSnippet. */
  def extensions(): AccountExtensions = js.native
  
  /** Returns the currency code of the account. */
  def getCurrencyCode(): String = js.native
  
  // TODO: Add Currency Code Enum
  /** Returns the customer ID of the account. */
  def getCustomerId(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "Account". */
  def getEntityType(): String = js.native
  
  /** Returns the name of the account. */
  def getName(): String = js.native
  
  /** Returns the POSIX time zone of the account. */
  def getTimeZone(): String = js.native
  
  // TODO: Add Timezone Enum
  /** Removes a callout extension from this account. */
  def removeCallout(calloutExtension: Callout): Unit = js.native
  
  /** Removes a mobile app extension from this account. */
  def removeMobileApp(mobileAppExtension: MobileApp): Unit = js.native
  
  /** Removes a price extension from this account. */
  def removePrice(priceExtension: Price): Unit = js.native
  
  /** Removes a sitelink extension from this account. */
  def removeSitelink(sitelinkExtension: Sitelink): Unit = js.native
  
  /** Removes a snippet extension from this account. */
  def removeSnippet(snippetExtension: Snippet): Unit = js.native
}
