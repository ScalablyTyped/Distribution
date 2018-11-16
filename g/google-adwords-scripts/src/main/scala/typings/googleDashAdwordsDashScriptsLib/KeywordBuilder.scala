package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeywordBuilder[Keyword]
  extends AdWordsBuilder[Keyword]
     with hasBiddingStrategyBuilder[KeywordBuilder[Keyword]]
     with hasTrackingTemplateBuilder[KeywordBuilder[Keyword]]
     with hasFinalUrlBuilder[KeywordBuilder[Keyword]] {
  def withCpc(cpc: scala.Double): KeywordBuilder[Keyword] = js.native
  def withCpm(cpm: scala.Double): KeywordBuilder[Keyword] = js.native
  def withText(text: java.lang.String): KeywordBuilder[Keyword] = js.native
}

