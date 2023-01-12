package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.whitespace_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisWhitespaceAnalyzer
  extends StObject
     with AnalysisAnalyzer {
  
  var `type`: whitespace_
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object AnalysisWhitespaceAnalyzer {
  
  inline def apply(): AnalysisWhitespaceAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("whitespace")
    __obj.asInstanceOf[AnalysisWhitespaceAnalyzer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisWhitespaceAnalyzer] (val x: Self) extends AnyVal {
    
    inline def setType(value: whitespace_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
