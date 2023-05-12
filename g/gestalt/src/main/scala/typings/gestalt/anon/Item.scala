package typings.gestalt.anon

import typings.gestalt.mod.ComboBoxItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var item: ComboBoxItemType
}
object Item {
  
  inline def apply(item: ComboBoxItemType): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    inline def setItem(value: ComboBoxItemType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
