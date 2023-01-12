package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A search filter that applies to a specific field. */
trait FieldFilter extends StObject {
  
  /** The field the filter applies to. */
  var field: String
  
  /** Value to search for in the field. */
  var value: Any
}
object FieldFilter {
  
  inline def apply(field: String, value: Any): FieldFilter = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldFilter] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
