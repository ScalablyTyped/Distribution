package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslShapeFieldQuery extends StObject {
  
  var indexed_shape: js.UndefOr[QueryDslFieldLookup] = js.undefined
  
  var relation: js.UndefOr[GeoShapeRelation] = js.undefined
  
  var shape: js.UndefOr[GeoShape] = js.undefined
}
object QueryDslShapeFieldQuery {
  
  inline def apply(): QueryDslShapeFieldQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslShapeFieldQuery]
  }
  
  extension [Self <: QueryDslShapeFieldQuery](x: Self) {
    
    inline def setIndexed_shape(value: QueryDslFieldLookup): Self = StObject.set(x, "indexed_shape", value.asInstanceOf[js.Any])
    
    inline def setIndexed_shapeUndefined: Self = StObject.set(x, "indexed_shape", js.undefined)
    
    inline def setRelation(value: GeoShapeRelation): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
    
    inline def setShape(value: GeoShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
