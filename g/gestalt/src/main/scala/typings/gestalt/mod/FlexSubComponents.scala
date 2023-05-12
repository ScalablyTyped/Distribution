package typings.gestalt.mod

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexSubComponents extends StObject {
  
  var Item: FunctionComponent[FlexItemProps]
}
object FlexSubComponents {
  
  inline def apply(Item: FunctionComponent[FlexItemProps]): FlexSubComponents = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexSubComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexSubComponents] (val x: Self) extends AnyVal {
    
    inline def setItem(value: FunctionComponent[FlexItemProps]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
