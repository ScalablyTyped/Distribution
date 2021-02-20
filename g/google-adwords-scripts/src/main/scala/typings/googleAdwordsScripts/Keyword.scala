package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def clearDesinationUrl(): Unit = js.native
  
  def getApprovalStatus(): ApprovalStatus = js.native
  
  def getFirstPageCpc(): Double = js.native
  
  def getId(): Double = js.native
  
  def getMatchType(): MatchType = js.native
  
  def getQualityScore(): Double = js.native
  
  def getText(): String = js.native
  
  def getTopOfPageCpc(): Double = js.native
  
  def remove(): Unit = js.native
  
  def setAdParam(index: Double, insertionText: String): Unit = js.native
  
  def urls(): KeywordUrls = js.native
}
