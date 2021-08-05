package typings.downshift.mod

import typings.react.mod.HTMLProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetItemPropsOptions[Item]
  extends StObject
     with HTMLProps[HTMLElement] {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var isSelected: js.UndefOr[Boolean] = js.undefined
  
  var item: Item
}
object GetItemPropsOptions {
  
  inline def apply[Item](item: Item): GetItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetItemPropsOptions[Item]]
  }
  
  extension [Self <: GetItemPropsOptions[?], Item](x: Self & GetItemPropsOptions[Item]) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    
    inline def setItem(value: Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
