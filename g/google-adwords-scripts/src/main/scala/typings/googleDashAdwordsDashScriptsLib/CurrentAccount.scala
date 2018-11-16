package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def getCurrencyCode(): java.lang.String = js.native
  def getCustomerId(): java.lang.String = js.native
  def getName(): java.lang.String = js.native
  def getTimeZone(): java.lang.String = js.native
  def removeCallout(calloutExtension: Callout): scala.Unit = js.native
  def removeMobileApp(mobileAppExtension: MobileApp): scala.Unit = js.native
  def removeReview(reviewExtension: Review): scala.Unit = js.native
  def removeSnippet(snippetExtension: Snippet): scala.Unit = js.native
}

