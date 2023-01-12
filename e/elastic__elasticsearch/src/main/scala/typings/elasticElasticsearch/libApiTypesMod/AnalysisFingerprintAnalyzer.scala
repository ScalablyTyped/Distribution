package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.fingerprint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisFingerprintAnalyzer
  extends StObject
     with AnalysisAnalyzer {
  
  var max_output_size: integer
  
  var preserve_original: Boolean
  
  var separator: String
  
  var stopwords: js.UndefOr[AnalysisStopWords] = js.undefined
  
  var stopwords_path: js.UndefOr[String] = js.undefined
  
  var `type`: fingerprint
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object AnalysisFingerprintAnalyzer {
  
  inline def apply(max_output_size: integer, preserve_original: Boolean, separator: String): AnalysisFingerprintAnalyzer = {
    val __obj = js.Dynamic.literal(max_output_size = max_output_size.asInstanceOf[js.Any], preserve_original = preserve_original.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fingerprint")
    __obj.asInstanceOf[AnalysisFingerprintAnalyzer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisFingerprintAnalyzer] (val x: Self) extends AnyVal {
    
    inline def setMax_output_size(value: integer): Self = StObject.set(x, "max_output_size", value.asInstanceOf[js.Any])
    
    inline def setPreserve_original(value: Boolean): Self = StObject.set(x, "preserve_original", value.asInstanceOf[js.Any])
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setStopwords(value: AnalysisStopWords): Self = StObject.set(x, "stopwords", value.asInstanceOf[js.Any])
    
    inline def setStopwordsUndefined: Self = StObject.set(x, "stopwords", js.undefined)
    
    inline def setStopwordsVarargs(value: String*): Self = StObject.set(x, "stopwords", js.Array(value*))
    
    inline def setStopwords_path(value: String): Self = StObject.set(x, "stopwords_path", value.asInstanceOf[js.Any])
    
    inline def setStopwords_pathUndefined: Self = StObject.set(x, "stopwords_path", js.undefined)
    
    inline def setType(value: fingerprint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
