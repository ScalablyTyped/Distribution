package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MgetOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Docs extends StObject {
  
  var docs: js.UndefOr[js.Array[MgetOperation]] = js.undefined
  
  var ids: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Ids] = js.undefined
}
object Docs {
  
  inline def apply(): Docs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Docs]
  }
  
  extension [Self <: Docs](x: Self) {
    
    inline def setDocs(value: js.Array[MgetOperation]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setDocsVarargs(value: MgetOperation*): Self = StObject.set(x, "docs", js.Array(value*))
    
    inline def setIds(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Ids): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id*): Self = StObject.set(x, "ids", js.Array(value*))
  }
}
