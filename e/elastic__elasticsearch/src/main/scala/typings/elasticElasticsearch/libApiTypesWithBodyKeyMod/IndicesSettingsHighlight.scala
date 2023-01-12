package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSettingsHighlight extends StObject {
  
  var max_analyzed_offset: js.UndefOr[integer] = js.undefined
}
object IndicesSettingsHighlight {
  
  inline def apply(): IndicesSettingsHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesSettingsHighlight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesSettingsHighlight] (val x: Self) extends AnyVal {
    
    inline def setMax_analyzed_offset(value: integer): Self = StObject.set(x, "max_analyzed_offset", value.asInstanceOf[js.Any])
    
    inline def setMax_analyzed_offsetUndefined: Self = StObject.set(x, "max_analyzed_offset", js.undefined)
  }
}
