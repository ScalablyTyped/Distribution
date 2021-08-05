package typings.fundamentalReact.anon

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/InputGroup/InputGroup.InputGroupAddonProps> */
trait WeakValidationMapInputGro extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var compact: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var isButton: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}
object WeakValidationMapInputGro {
  
  inline def apply(): WeakValidationMapInputGro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapInputGro]
  }
  
  extension [Self <: WeakValidationMapInputGro](x: Self) {
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCompact(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setIsButton(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "isButton", value.asInstanceOf[js.Any])
    
    inline def setIsButtonUndefined: Self = StObject.set(x, "isButton", js.undefined)
  }
}
