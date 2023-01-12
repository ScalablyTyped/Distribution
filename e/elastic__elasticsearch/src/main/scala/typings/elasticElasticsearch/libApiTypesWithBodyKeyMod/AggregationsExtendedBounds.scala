package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsExtendedBounds[T] extends StObject {
  
  var max: T
  
  var min: T
}
object AggregationsExtendedBounds {
  
  inline def apply[T](max: T, min: T): AggregationsExtendedBounds[T] = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsExtendedBounds[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsExtendedBounds[?], T] (val x: Self & AggregationsExtendedBounds[T]) extends AnyVal {
    
    inline def setMax(value: T): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: T): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
