package typings.gestalt.mod

import typings.gestalt.gestaltStrings.bare
import typings.gestalt.gestaltStrings.condensed
import typings.gestalt.gestaltStrings.hidden
import typings.gestalt.gestaltStrings.ordered
import typings.gestalt.gestaltStrings.regular
import typings.gestalt.gestaltStrings.unordered
import typings.gestalt.gestaltStrings.visible
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProps extends StObject {
  
  var children: Node
  
  var label: js.UndefOr[String | ReactElement] = js.undefined
  
  var labelDisplay: js.UndefOr[visible | hidden] = js.undefined
  
  var spacing: js.UndefOr[regular | condensed] = js.undefined
  
  var `type`: js.UndefOr[bare | ordered | unordered] = js.undefined
}
object ListProps {
  
  inline def apply(): ListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setLabel(value: String | ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplay(value: visible | hidden): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplayUndefined: Self = StObject.set(x, "labelDisplay", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSpacing(value: regular | condensed): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setType(value: bare | ordered | unordered): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
