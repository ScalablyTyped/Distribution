package typings.gestalt.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemProps extends StObject {
  
  var children: js.UndefOr[String | ReactElement] = js.undefined
  
  var text: String | ReactElement
}
object ListItemProps {
  
  inline def apply(text: String | ReactElement): ListItemProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListItemProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: String | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setText(value: String | ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
