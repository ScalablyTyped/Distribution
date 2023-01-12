package typings.flexsearch

import typings.flexsearch.flexsearchStrings.and
import typings.flexsearch.flexsearchStrings.or
import typings.flexsearch.mod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Field extends StObject {
    
    var field: String
  }
  object Field {
    
    inline def apply(field: String): Field = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<flexsearch.flexsearch.DocumentSearchOptions<boolean>> */
  trait PartialDocumentSearchOpti extends StObject {
    
    var bool: js.UndefOr[and | or] = js.undefined
    
    var enrich: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[String | (js.Array[SearchOptions | String])] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var suggest: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object PartialDocumentSearchOpti {
    
    inline def apply(): PartialDocumentSearchOpti = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDocumentSearchOpti]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialDocumentSearchOpti] (val x: Self) extends AnyVal {
      
      inline def setBool(value: and | or): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setBoolUndefined: Self = StObject.set(x, "bool", js.undefined)
      
      inline def setEnrich(value: Boolean): Self = StObject.set(x, "enrich", value.asInstanceOf[js.Any])
      
      inline def setEnrichUndefined: Self = StObject.set(x, "enrich", js.undefined)
      
      inline def setIndex(value: String | (js.Array[SearchOptions | String])): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIndexVarargs(value: (SearchOptions | String)*): Self = StObject.set(x, "index", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setSuggest(value: Boolean): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
      
      inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
      
      inline def setTag(value: String | js.Array[String]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTagVarargs(value: String*): Self = StObject.set(x, "tag", js.Array(value*))
    }
  }
}
