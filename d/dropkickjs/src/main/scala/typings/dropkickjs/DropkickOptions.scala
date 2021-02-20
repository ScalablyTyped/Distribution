package typings.dropkickjs

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropkickOptions extends StObject {
  
  var change: js.UndefOr[js.Function0[Unit]] = js.native
  
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var form: js.UndefOr[Node] = js.native
  
  var initialize: js.UndefOr[js.Function0[Unit]] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var mobile: js.UndefOr[Boolean] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var open: js.UndefOr[js.Function0[Unit]] = js.native
  
  var options: js.UndefOr[js.Array[String]] = js.native
  
  var selectedIndex: js.UndefOr[Double] = js.native
  
  var selectedOptions: js.UndefOr[js.Array[String]] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object DropkickOptions {
  
  @scala.inline
  def apply(): DropkickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropkickOptions]
  }
  
  @scala.inline
  implicit class DropkickOptionsMutableBuilder[Self <: DropkickOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: () => Unit): Self = StObject.set(x, "change", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setForm(value: Node): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    @scala.inline
    def setSelectedOptions(value: js.Array[String]): Self = StObject.set(x, "selectedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedOptionsUndefined: Self = StObject.set(x, "selectedOptions", js.undefined)
    
    @scala.inline
    def setSelectedOptionsVarargs(value: String*): Self = StObject.set(x, "selectedOptions", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
