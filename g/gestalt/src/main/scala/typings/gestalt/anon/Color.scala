package typings.gestalt.anon

import typings.gestalt.gestaltStrings.`100`
import typings.gestalt.gestaltStrings.`200`
import typings.gestalt.gestaltStrings.`300`
import typings.gestalt.gestaltStrings.`400`
import typings.gestalt.gestaltStrings.`500`
import typings.gestalt.gestaltStrings.`600`
import typings.gestalt.gestaltStrings.brandPrimary
import typings.gestalt.gestaltStrings.dark
import typings.gestalt.gestaltStrings.default
import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.info
import typings.gestalt.gestaltStrings.inverse
import typings.gestalt.gestaltStrings.light
import typings.gestalt.gestaltStrings.shopping
import typings.gestalt.gestaltStrings.subtle
import typings.gestalt.gestaltStrings.success
import typings.gestalt.gestaltStrings.warning
import typings.gestalt.mod.ExternalLinkIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color
  extends StObject
     with ExternalLinkIcon {
  
  var color: js.UndefOr[
    default | subtle | success | error | warning | info | inverse | shopping | brandPrimary | light | dark
  ] = js.undefined
  
  var size: js.UndefOr[`100` | `200` | `300` | `400` | `500` | `600`] = js.undefined
}
object Color {
  
  inline def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    inline def setColor(
      value: default | subtle | success | error | warning | info | inverse | shopping | brandPrimary | light | dark
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: `100` | `200` | `300` | `400` | `500` | `600`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
