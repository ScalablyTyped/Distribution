package typings.gestalt.mod

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexSubCompnents extends StObject {
  
  var Item: FC[FlexItemProps]
}
object FlexSubCompnents {
  
  inline def apply(Item: FC[FlexItemProps]): FlexSubCompnents = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexSubCompnents]
  }
  
  extension [Self <: FlexSubCompnents](x: Self) {
    
    inline def setItem(value: FC[FlexItemProps]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
