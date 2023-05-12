package typings.gestalt.mod

import typings.gestalt.gestaltStrings.bold
import typings.gestalt.gestaltStrings.breakWord
import typings.gestalt.gestaltStrings.link
import typings.gestalt.gestaltStrings.noWrap
import typings.gestalt.gestaltStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextProps extends StObject {
  
  var align: js.UndefOr[TextAlignType] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var color: js.UndefOr[BaseTextColorType | link] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var italic: js.UndefOr[Boolean] = js.undefined
  
  var lineClamp: js.UndefOr[Double] = js.undefined
  
  var overflow: js.UndefOr[normal | breakWord | noWrap] = js.undefined
  
  var size: js.UndefOr[TextSizeType] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var underline: js.UndefOr[Boolean] = js.undefined
  
  var weight: js.UndefOr[bold | normal] = js.undefined
}
object TextProps {
  
  inline def apply(): TextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextProps] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: TextAlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: BaseTextColorType | link): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setLineClamp(value: Double): Self = StObject.set(x, "lineClamp", value.asInstanceOf[js.Any])
    
    inline def setLineClampUndefined: Self = StObject.set(x, "lineClamp", js.undefined)
    
    inline def setOverflow(value: normal | breakWord | noWrap): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setSize(value: TextSizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    inline def setWeight(value: bold | normal): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
