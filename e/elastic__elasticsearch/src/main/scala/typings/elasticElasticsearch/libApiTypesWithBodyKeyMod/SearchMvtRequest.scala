package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Aggs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchMvtRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Aggs] = js.undefined
  
  var field: Field
  
  var index: Indices
  
  var x: SearchMvtCoordinate
  
  var y: SearchMvtCoordinate
  
  var zoom: SearchMvtZoomLevel
}
object SearchMvtRequest {
  
  inline def apply(
    field: Field,
    index: Indices,
    x: SearchMvtCoordinate,
    y: SearchMvtCoordinate,
    zoom: SearchMvtZoomLevel
  ): SearchMvtRequest = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchMvtRequest]
  }
  
  extension [Self <: SearchMvtRequest](x: Self) {
    
    inline def setBody(value: Aggs): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setX(value: SearchMvtCoordinate): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: SearchMvtCoordinate): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: SearchMvtZoomLevel): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
