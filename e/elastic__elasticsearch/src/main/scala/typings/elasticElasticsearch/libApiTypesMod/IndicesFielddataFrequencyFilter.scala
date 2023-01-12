package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesFielddataFrequencyFilter extends StObject {
  
  var max: double
  
  var min: double
  
  var min_segment_size: integer
}
object IndicesFielddataFrequencyFilter {
  
  inline def apply(max: double, min: double, min_segment_size: integer): IndicesFielddataFrequencyFilter = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], min_segment_size = min_segment_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesFielddataFrequencyFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesFielddataFrequencyFilter] (val x: Self) extends AnyVal {
    
    inline def setMax(value: double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMin_segment_size(value: integer): Self = StObject.set(x, "min_segment_size", value.asInstanceOf[js.Any])
  }
}
