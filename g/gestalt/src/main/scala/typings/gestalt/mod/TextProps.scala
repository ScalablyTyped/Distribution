package typings.gestalt.mod

import typings.gestalt.gestaltStrings.blue
import typings.gestalt.gestaltStrings.bold
import typings.gestalt.gestaltStrings.breakWord
import typings.gestalt.gestaltStrings.center
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.eggplant
import typings.gestalt.gestaltStrings.gray
import typings.gestalt.gestaltStrings.green
import typings.gestalt.gestaltStrings.justify
import typings.gestalt.gestaltStrings.left
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.lightGray
import typings.gestalt.gestaltStrings.maroon
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.midnight
import typings.gestalt.gestaltStrings.navy
import typings.gestalt.gestaltStrings.normal
import typings.gestalt.gestaltStrings.olive
import typings.gestalt.gestaltStrings.orange
import typings.gestalt.gestaltStrings.orchid
import typings.gestalt.gestaltStrings.pine
import typings.gestalt.gestaltStrings.purple
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.right
import typings.gestalt.gestaltStrings.sm
import typings.gestalt.gestaltStrings.watermelon
import typings.gestalt.gestaltStrings.white
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextProps extends StObject {
  
  var align: js.UndefOr[left | right | center | justify] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var color: js.UndefOr[
    blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white
  ] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var italic: js.UndefOr[Boolean] = js.undefined
  
  var overflow: js.UndefOr[normal | breakWord] = js.undefined
  
  var size: js.UndefOr[sm | md | lg] = js.undefined
  
  var truncate: js.UndefOr[Boolean] = js.undefined
  
  var weight: js.UndefOr[bold | normal] = js.undefined
}
object TextProps {
  
  inline def apply(): TextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProps]
  }
  
  extension [Self <: TextProps](x: Self) {
    
    inline def setAlign(value: left | right | center | justify): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(
      value: blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setOverflow(value: normal | breakWord): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
    
    inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    
    inline def setWeight(value: bold | normal): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
