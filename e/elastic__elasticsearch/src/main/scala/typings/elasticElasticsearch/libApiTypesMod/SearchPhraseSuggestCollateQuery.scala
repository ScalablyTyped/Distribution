package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPhraseSuggestCollateQuery extends StObject {
  
  var id: js.UndefOr[Id] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
}
object SearchPhraseSuggestCollateQuery {
  
  inline def apply(): SearchPhraseSuggestCollateQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchPhraseSuggestCollateQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchPhraseSuggestCollateQuery] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
