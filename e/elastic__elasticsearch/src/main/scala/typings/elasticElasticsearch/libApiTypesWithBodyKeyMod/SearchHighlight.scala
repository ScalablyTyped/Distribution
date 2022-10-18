package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchHighlight
  extends StObject
     with SearchHighlightBase {
  
  var encoder: js.UndefOr[SearchHighlighterEncoder] = js.undefined
  
  var fields: Record[Field, SearchHighlightField]
}
object SearchHighlight {
  
  inline def apply(fields: Record[Field, SearchHighlightField]): SearchHighlight = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchHighlight]
  }
  
  extension [Self <: SearchHighlight](x: Self) {
    
    inline def setEncoder(value: SearchHighlighterEncoder): Self = StObject.set(x, "encoder", value.asInstanceOf[js.Any])
    
    inline def setEncoderUndefined: Self = StObject.set(x, "encoder", js.undefined)
    
    inline def setFields(value: Record[Field, SearchHighlightField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
