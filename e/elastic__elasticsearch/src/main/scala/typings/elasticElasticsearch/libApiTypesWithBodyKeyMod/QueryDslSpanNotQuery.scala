package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslSpanNotQuery
  extends StObject
     with QueryDslQueryBase {
  
  var dist: js.UndefOr[integer] = js.undefined
  
  var exclude: QueryDslSpanQuery
  
  var include: QueryDslSpanQuery
  
  var post: js.UndefOr[integer] = js.undefined
  
  var pre: js.UndefOr[integer] = js.undefined
}
object QueryDslSpanNotQuery {
  
  inline def apply(exclude: QueryDslSpanQuery, include: QueryDslSpanQuery): QueryDslSpanNotQuery = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslSpanNotQuery]
  }
  
  extension [Self <: QueryDslSpanNotQuery](x: Self) {
    
    inline def setDist(value: integer): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
    
    inline def setDistUndefined: Self = StObject.set(x, "dist", js.undefined)
    
    inline def setExclude(value: QueryDslSpanQuery): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setInclude(value: QueryDslSpanQuery): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setPost(value: integer): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setPre(value: integer): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
  }
}
