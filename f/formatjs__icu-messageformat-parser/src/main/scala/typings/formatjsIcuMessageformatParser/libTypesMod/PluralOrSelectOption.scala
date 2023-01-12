package typings.formatjsIcuMessageformatParser.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluralOrSelectOption extends StObject {
  
  var location: js.UndefOr[Location] = js.undefined
  
  var value: js.Array[MessageFormatElement]
}
object PluralOrSelectOption {
  
  inline def apply(value: js.Array[MessageFormatElement]): PluralOrSelectOption = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralOrSelectOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluralOrSelectOption] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setValue(value: js.Array[MessageFormatElement]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: MessageFormatElement*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
