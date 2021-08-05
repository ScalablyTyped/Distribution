package typings.fundamentalReact.anon

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListTextProps> */
trait WeakValidationMapListText extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var noWrap: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var secondary: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}
object WeakValidationMapListText {
  
  inline def apply(): WeakValidationMapListText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapListText]
  }
  
  extension [Self <: WeakValidationMapListText](x: Self) {
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setNoWrap(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
    inline def setSecondary(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
