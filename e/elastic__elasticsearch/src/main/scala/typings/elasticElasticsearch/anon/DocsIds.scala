package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MtermvectorsOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocsIds extends StObject {
  
  var docs: js.UndefOr[js.Array[MtermvectorsOperation]] = js.undefined
  
  var ids: js.UndefOr[js.Array[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id]] = js.undefined
}
object DocsIds {
  
  inline def apply(): DocsIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocsIds]
  }
  
  extension [Self <: DocsIds](x: Self) {
    
    inline def setDocs(value: js.Array[MtermvectorsOperation]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setDocsVarargs(value: MtermvectorsOperation*): Self = StObject.set(x, "docs", js.Array(value*))
    
    inline def setIds(value: js.Array[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id*): Self = StObject.set(x, "ids", js.Array(value*))
  }
}
