package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLowercaseNormalizer
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCustomNormalizer
*/
trait AnalysisNormalizer extends StObject
object AnalysisNormalizer {
  
  inline def AnalysisCustomNormalizer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCustomNormalizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisCustomNormalizer]
  }
  
  inline def AnalysisLowercaseNormalizer(): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLowercaseNormalizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("lowercase")
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AnalysisLowercaseNormalizer]
  }
}
