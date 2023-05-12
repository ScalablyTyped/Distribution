package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnButtonBase extends StObject {
  
  /**
    * Specifies a CSS class to be applied to the button.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text for the hint that appears when the button is hovered over or long-pressed.
    */
  var hint: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the button&apos;s icon.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the button&apos;s text. Applies only if the button&apos;s icon is not specified.
    */
  var text: js.UndefOr[String] = js.undefined
}
object ColumnButtonBase {
  
  inline def apply(): ColumnButtonBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnButtonBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnButtonBase] (val x: Self) extends AnyVal {
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
