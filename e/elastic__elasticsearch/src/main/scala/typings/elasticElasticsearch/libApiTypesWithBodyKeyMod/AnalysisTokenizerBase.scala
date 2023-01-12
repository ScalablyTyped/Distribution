package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisTokenizerBase extends StObject {
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object AnalysisTokenizerBase {
  
  inline def apply(): AnalysisTokenizerBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisTokenizerBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisTokenizerBase] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
