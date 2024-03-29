package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ordering on a field, in some Direction. Direction defaults to ASCENDING.
  */
trait OrderBy_ extends StObject {
  
  val dir: Direction
  
  val field: FieldPath2
}
object OrderBy_ {
  
  inline def apply(dir: Direction, field: FieldPath2): OrderBy_ = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderBy_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderBy_] (val x: Self) extends AnyVal {
    
    inline def setDir(value: Direction): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setField(value: FieldPath2): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
