package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductNameNamePart
  extends StObject
     with BackboneElement {
  
  var _part: js.UndefOr[Element] = js.undefined
  
  /**
    * A fragment of a product name.
    */
  var part: String
  
  /**
    * Idenifying type for this part of the name (e.g. strength part).
    */
  var `type`: Coding
}
object MedicinalProductNameNamePart {
  
  inline def apply(part: String, `type`: Coding): MedicinalProductNameNamePart = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductNameNamePart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductNameNamePart] (val x: Self) extends AnyVal {
    
    inline def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_part(value: Element): Self = StObject.set(x, "_part", value.asInstanceOf[js.Any])
    
    inline def set_partUndefined: Self = StObject.set(x, "_part", js.undefined)
  }
}
