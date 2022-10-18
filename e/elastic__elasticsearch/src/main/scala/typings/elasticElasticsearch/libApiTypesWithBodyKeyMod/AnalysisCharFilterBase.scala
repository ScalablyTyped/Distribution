package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisCharFilterBase extends StObject {
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object AnalysisCharFilterBase {
  
  inline def apply(): AnalysisCharFilterBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisCharFilterBase]
  }
  
  extension [Self <: AnalysisCharFilterBase](x: Self) {
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
