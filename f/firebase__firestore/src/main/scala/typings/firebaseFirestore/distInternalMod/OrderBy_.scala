package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ordering on a field, in some Direction. Direction defaults to ASCENDING.
  */
trait OrderBy_ extends StObject {
  
  val dir: Direction
  
  val field: _FieldPath
}
object OrderBy_ {
  
  inline def apply(dir: Direction, field: _FieldPath): OrderBy_ = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderBy_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderBy_] (val x: Self) extends AnyVal {
    
    inline def setDir(value: Direction): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setField(value: _FieldPath): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
