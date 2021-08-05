package typings.fundamentalReact.anon

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListItemProps> */
trait WeakValidationMapListItem extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var onClick: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ js.Any, js.Any]) | Null]]] = js.undefined
  
  var selected: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}
object WeakValidationMapListItem {
  
  inline def apply(): WeakValidationMapListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapListItem]
  }
  
  extension [Self <: WeakValidationMapListItem](x: Self) {
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setOnClick(value: Validator[js.UndefOr[(js.Function1[/* repeated */ js.Any, js.Any]) | Null]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setSelected(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
