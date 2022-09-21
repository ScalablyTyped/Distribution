package typings.gestalt.mod

import typings.gestalt.gestaltNumbers.`1`
import typings.gestalt.gestaltNumbers.`2`
import typings.gestalt.gestaltNumbers.`3`
import typings.gestalt.gestaltNumbers.`4`
import typings.gestalt.gestaltNumbers.`5`
import typings.gestalt.gestaltNumbers.`6`
import typings.gestalt.gestaltStrings.`100`
import typings.gestalt.gestaltStrings.`200`
import typings.gestalt.gestaltStrings.`300`
import typings.gestalt.gestaltStrings.`400`
import typings.gestalt.gestaltStrings.`500`
import typings.gestalt.gestaltStrings.`600`
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
import typings.gestalt.gestaltStrings.none
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

trait HeaderProps extends StObject {
  
  var accessibilityLevel: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | none] = js.undefined
  
  var align: js.UndefOr[start | end | center | justify | forceLeft | forceRight] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var color: js.UndefOr[default | subtle | success | error | warning | shopping | inverse | light | dark] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var lineClamp: js.UndefOr[Double] = js.undefined
  
  var overflow: js.UndefOr[normal | breakWord] = js.undefined
  
  var size: js.UndefOr[`100` | `200` | `300` | `400` | `500` | `600`] = js.undefined
  
  var truncate: js.UndefOr[Boolean] = js.undefined
}
object HeaderProps {
  
  inline def apply(): HeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderProps]
  }
  
  extension [Self <: HeaderProps](x: Self) {
    
    inline def setAccessibilityLevel(value: `1` | `2` | `3` | `4` | `5` | `6` | none): Self = StObject.set(x, "accessibilityLevel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLevelUndefined: Self = StObject.set(x, "accessibilityLevel", js.undefined)
    
    inline def setAlign(value: start | end | center | justify | forceLeft | forceRight): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: default | subtle | success | error | warning | shopping | inverse | light | dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLineClamp(value: Double): Self = StObject.set(x, "lineClamp", value.asInstanceOf[js.Any])
    
    inline def setLineClampUndefined: Self = StObject.set(x, "lineClamp", js.undefined)
    
    inline def setOverflow(value: normal | breakWord): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setSize(value: `100` | `200` | `300` | `400` | `500` | `600`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
    
    inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
  }
}
