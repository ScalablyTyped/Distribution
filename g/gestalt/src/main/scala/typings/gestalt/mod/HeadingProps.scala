package typings.gestalt.mod

import typings.gestalt.gestaltInts.`1`
import typings.gestalt.gestaltInts.`2`
import typings.gestalt.gestaltInts.`3`
import typings.gestalt.gestaltInts.`4`
import typings.gestalt.gestaltInts.`5`
import typings.gestalt.gestaltInts.`6`
import typings.gestalt.gestaltStrings.breakWord
import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadingProps extends StObject {
  
  var accessibilityLevel: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | none] = js.undefined
  
  var align: js.UndefOr[TextAlignType] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var color: js.UndefOr[BaseTextColorType] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var lineClamp: js.UndefOr[Double] = js.undefined
  
  var overflow: js.UndefOr[normal | breakWord] = js.undefined
  
  var size: js.UndefOr[TextSizeType] = js.undefined
}
object HeadingProps {
  
  inline def apply(): HeadingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadingProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeadingProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLevel(value: `1` | `2` | `3` | `4` | `5` | `6` | none): Self = StObject.set(x, "accessibilityLevel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLevelUndefined: Self = StObject.set(x, "accessibilityLevel", js.undefined)
    
    inline def setAlign(value: TextAlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: BaseTextColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLineClamp(value: Double): Self = StObject.set(x, "lineClamp", value.asInstanceOf[js.Any])
    
    inline def setLineClampUndefined: Self = StObject.set(x, "lineClamp", js.undefined)
    
    inline def setOverflow(value: normal | breakWord): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setSize(value: TextSizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
