package typings.fundamentalReact.anon

import typings.react.mod.ReactNode
import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListBylineProps> */
trait WeakValidationMapListByli extends StObject {
  
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var cssNamespace: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var twoColumns: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}
object WeakValidationMapListByli {
  
  inline def apply(): WeakValidationMapListByli = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapListByli]
  }
  
  extension [Self <: WeakValidationMapListByli](x: Self) {
    
    inline def setChildren(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCssNamespace(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "cssNamespace", value.asInstanceOf[js.Any])
    
    inline def setCssNamespaceUndefined: Self = StObject.set(x, "cssNamespace", js.undefined)
    
    inline def setTwoColumns(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "twoColumns", value.asInstanceOf[js.Any])
    
    inline def setTwoColumnsUndefined: Self = StObject.set(x, "twoColumns", js.undefined)
  }
}
