package typings.dropkickjs

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropkickOptions extends StObject {
  
  var change: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var form: js.UndefOr[Node] = js.undefined
  
  var initialize: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var mobile: js.UndefOr[Boolean] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var open: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var options: js.UndefOr[js.Array[String]] = js.undefined
  
  var selectedIndex: js.UndefOr[Double] = js.undefined
  
  var selectedOptions: js.UndefOr[js.Array[String]] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object DropkickOptions {
  
  inline def apply(): DropkickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropkickOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropkickOptions] (val x: Self) extends AnyVal {
    
    inline def setChange(value: () => Unit): Self = StObject.set(x, "change", js.Any.fromFunction0(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: Node): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
    
    inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    inline def setSelectedOptions(value: js.Array[String]): Self = StObject.set(x, "selectedOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectedOptionsUndefined: Self = StObject.set(x, "selectedOptions", js.undefined)
    
    inline def setSelectedOptionsVarargs(value: String*): Self = StObject.set(x, "selectedOptions", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
