package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Ad Group
@js.native
trait AdGroup
  extends AdWordsEntity
     with canBeEnabled
     with hasExtensions
     with hasLabels
     with hasStats
     with isCampaignChild {
  def adParams(): AdWordsSelector[AdParam] = js.native
  def ads(): AdWordsSelector[Ad] = js.native
  def bidding(): AdGroupBidding = js.native
  def clearNegativeKeyword(keywordText: java.lang.String): scala.Unit = js.native
  def devices(): AdGroupDevices = js.native
  def display(): AdGroupDisplay = js.native
  def extensions(): AdGroupExtensions = js.native
  def getId(): scala.Double = js.native
  def getName(): java.lang.String = js.native
  def isRemoved(): scala.Boolean = js.native
  def keywords(): AdWordsSelector[Keyword] = js.native
  def negativeKeywords(): AdWordsSelector[NegativeKeyword] = js.native
  def newAd(): AdBuilderSpace = js.native
  def newKeywordBuilder(): KeywordBuilder[Keyword] = js.native
  def setName(name: java.lang.String): scala.Unit = js.native
  def targeting(): AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = js.native
  def urls(): AdGroupUrls = js.native
}

