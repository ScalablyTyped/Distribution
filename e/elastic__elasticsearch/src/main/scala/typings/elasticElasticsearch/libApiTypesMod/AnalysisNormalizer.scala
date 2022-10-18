package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseNormalizer
  - typings.elasticElasticsearch.libApiTypesMod.AnalysisCustomNormalizer
*/
trait AnalysisNormalizer extends StObject
object AnalysisNormalizer {
  
  inline def AnalysisCustomNormalizer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisCustomNormalizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisCustomNormalizer]
  }
  
  inline def AnalysisLowercaseNormalizer(): typings.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseNormalizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("lowercase")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesMod.AnalysisLowercaseNormalizer]
  }
}
