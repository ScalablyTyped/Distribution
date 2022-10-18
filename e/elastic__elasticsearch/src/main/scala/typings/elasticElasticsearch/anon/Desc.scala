package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DateTime
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Field
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Desc extends StObject {
  
  var desc: js.UndefOr[Boolean] = js.undefined
  
  var end: js.UndefOr[DateTime] = js.undefined
  
  var page: js.UndefOr[MlPage] = js.undefined
  
  var sort: js.UndefOr[Field] = js.undefined
  
  var start: js.UndefOr[DateTime] = js.undefined
}
object Desc {
  
  inline def apply(): Desc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Desc]
  }
  
  extension [Self <: Desc](x: Self) {
    
    inline def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setEnd(value: DateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setPage(value: MlPage): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setSort(value: Field): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setStart(value: DateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
