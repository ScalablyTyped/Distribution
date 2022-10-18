package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Field
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermvectorsFilter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Doc[TDocument] extends StObject {
  
  var doc: js.UndefOr[TDocument] = js.undefined
  
  var filter: js.UndefOr[TermvectorsFilter] = js.undefined
  
  var per_field_analyzer: js.UndefOr[Record[Field, String]] = js.undefined
}
object Doc {
  
  inline def apply[TDocument](): Doc[TDocument] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Doc[TDocument]]
  }
  
  extension [Self <: Doc[?], TDocument](x: Self & Doc[TDocument]) {
    
    inline def setDoc(value: TDocument): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
    
    inline def setFilter(value: TermvectorsFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPer_field_analyzer(value: Record[Field, String]): Self = StObject.set(x, "per_field_analyzer", value.asInstanceOf[js.Any])
    
    inline def setPer_field_analyzerUndefined: Self = StObject.set(x, "per_field_analyzer", js.undefined)
  }
}
