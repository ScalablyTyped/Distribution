package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeywordBuilder[Keyword]
  extends AdWordsBuilder[Keyword]
     with hasBiddingStrategyBuilder[KeywordBuilder[Keyword]]
     with hasTrackingTemplateBuilder[KeywordBuilder[Keyword]]
     with hasFinalUrlBuilder[KeywordBuilder[Keyword]] {
  
  def withCpc(cpc: Double): KeywordBuilder[Keyword] = js.native
  
  def withCpm(cpm: Double): KeywordBuilder[Keyword] = js.native
  
  def withText(text: String): KeywordBuilder[Keyword] = js.native
}
