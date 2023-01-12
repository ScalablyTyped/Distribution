package typings.gestalt.mod

import typings.gestalt.gestaltStrings.`100`
import typings.gestalt.gestaltStrings.`200`
import typings.gestalt.gestaltStrings.`300`
import typings.gestalt.gestaltStrings.`400`
import typings.gestalt.gestaltStrings.`500`
import typings.gestalt.gestaltStrings.`600`
import typings.gestalt.gestaltStrings.bold
import typings.gestalt.gestaltStrings.breakWord
import typings.gestalt.gestaltStrings.center
import typings.gestalt.gestaltStrings.dark
import typings.gestalt.gestaltStrings.default
import typings.gestalt.gestaltStrings.end
import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.forceLeft
import typings.gestalt.gestaltStrings.forceRight
import typings.gestalt.gestaltStrings.inverse
import typings.gestalt.gestaltStrings.justify
import typings.gestalt.gestaltStrings.light
import typings.gestalt.gestaltStrings.link
import typings.gestalt.gestaltStrings.noWrap
import typings.gestalt.gestaltStrings.normal
import typings.gestalt.gestaltStrings.shopping
import typings.gestalt.gestaltStrings.start
import typings.gestalt.gestaltStrings.subtle
import typings.gestalt.gestaltStrings.success
import typings.gestalt.gestaltStrings.warning
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextProps extends StObject {
  
  var align: js.UndefOr[start | end | center | justify | forceLeft | forceRight] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var color: js.UndefOr[
    default | subtle | success | error | warning | shopping | link | inverse | light | dark
  ] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var italic: js.UndefOr[Boolean] = js.undefined
  
  var lineClamp: js.UndefOr[Double] = js.undefined
  
  var overflow: js.UndefOr[normal | breakWord | noWrap] = js.undefined
  
  var size: js.UndefOr[`100` | `200` | `300` | `400` | `500` | `600`] = js.undefined
  
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
    
    inline def setAlign(value: start | end | center | justify | forceLeft | forceRight): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: default | subtle | success | error | warning | shopping | link | inverse | light | dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setLineClamp(value: Double): Self = StObject.set(x, "lineClamp", value.asInstanceOf[js.Any])
    
    inline def setLineClampUndefined: Self = StObject.set(x, "lineClamp", js.undefined)
    
    inline def setOverflow(value: normal | breakWord | noWrap): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setSize(value: `100` | `200` | `300` | `400` | `500` | `600`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    inline def setWeight(value: bold | normal): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
