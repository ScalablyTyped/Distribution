package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalysisAnalyzedFields extends StObject {
  
  var excludes: js.Array[String]
  
  var includes: js.Array[String]
}
object MlDataframeAnalysisAnalyzedFields {
  
  inline def apply(excludes: js.Array[String], includes: js.Array[String]): MlDataframeAnalysisAnalyzedFields = {
    val __obj = js.Dynamic.literal(excludes = excludes.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalysisAnalyzedFields]
  }
  
  extension [Self <: MlDataframeAnalysisAnalyzedFields](x: Self) {
    
    inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
    
    inline def setIncludes(value: js.Array[String]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesVarargs(value: String*): Self = StObject.set(x, "includes", js.Array(value*))
  }
}
