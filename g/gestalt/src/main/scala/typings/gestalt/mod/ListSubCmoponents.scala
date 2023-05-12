package typings.gestalt.mod

import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubCmoponents extends StObject {
  
  var Item: FunctionComponent[PropsWithChildren[ListItemProps]]
}
object ListSubCmoponents {
  
  inline def apply(Item: FunctionComponent[PropsWithChildren[ListItemProps]]): ListSubCmoponents = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubCmoponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSubCmoponents] (val x: Self) extends AnyVal {
    
    inline def setItem(value: FunctionComponent[PropsWithChildren[ListItemProps]]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
