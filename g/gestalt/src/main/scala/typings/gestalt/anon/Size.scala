package typings.gestalt.anon

import typings.gestalt.gestaltStrings.brandPrimary
import typings.gestalt.gestaltStrings.dark
import typings.gestalt.gestaltStrings.default
import typings.gestalt.gestaltStrings.error
import typings.gestalt.gestaltStrings.info
import typings.gestalt.gestaltStrings.inverse
import typings.gestalt.gestaltStrings.light
import typings.gestalt.gestaltStrings.recommendation
import typings.gestalt.gestaltStrings.shopping
import typings.gestalt.gestaltStrings.subtle
import typings.gestalt.gestaltStrings.success
import typings.gestalt.gestaltStrings.warning
import typings.gestalt.mod.TextSizeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var color: js.UndefOr[
    default | subtle | success | error | warning | info | recommendation | inverse | shopping | brandPrimary | light | dark
  ] = js.undefined
  
  var size: js.UndefOr[TextSizeType] = js.undefined
}
object Size {
  
  inline def apply(): Size = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    inline def setColor(
      value: default | subtle | success | error | warning | info | recommendation | inverse | shopping | brandPrimary | light | dark
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setSize(value: TextSizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
