package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Common
@js.native
trait CurrentAccount
  extends AdWordsEntity
     with hasStats {
  
  def addCallout(calloutExtension: Callout): AdWordsOperation[Callout] = js.native
  
  def addMobileApp(mobileAppExtension: MobileApp): AdWordsOperation[MobileApp] = js.native
  
  def addReview(reviewExtension: Review): AdWordsOperation[Review] = js.native
  
  def addSnippet(snippetExtension: Snippet): AdWordsOperation[Snippet] = js.native
  
  def extensions(): AccountExtensions = js.native
  
  def getCurrencyCode(): String = js.native
  
  def getCustomerId(): String = js.native
  
  def getName(): String = js.native
  
  def getTimeZone(): String = js.native
  
  def removeCallout(calloutExtension: Callout): Unit = js.native
  
  def removeMobileApp(mobileAppExtension: MobileApp): Unit = js.native
  
  def removeReview(reviewExtension: Review): Unit = js.native
  
  def removeSnippet(snippetExtension: Snippet): Unit = js.native
}
