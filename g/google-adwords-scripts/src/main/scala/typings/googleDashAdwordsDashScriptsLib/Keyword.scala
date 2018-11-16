package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Keywords
@js.native
trait Keyword
  extends isAdGroupChild
     with AdWordsEntity
     with canBeEnabled
     with hasLabels
     with hasStats {
  def adParams(): AdWordsSelector[AdParam] = js.native
  def bidding(): KeywordBidding = js.native
  def clearDesinationUrl(): scala.Unit = js.native
  def getApprovalStatus(): ApprovalStatus = js.native
  def getFirstPageCpc(): scala.Double = js.native
  def getId(): scala.Double = js.native
  def getMatchType(): MatchType = js.native
  def getQualityScore(): scala.Double = js.native
  def getText(): java.lang.String = js.native
  def getTopOfPageCpc(): scala.Double = js.native
  def remove(): scala.Unit = js.native
  def setAdParam(index: scala.Double, insertionText: java.lang.String): scala.Unit = js.native
  def urls(): KeywordUrls = js.native
}

