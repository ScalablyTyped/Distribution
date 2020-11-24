package typings.gestalt.mod

import typings.gestalt.anon.EventFocusEvent
import typings.gestalt.anon.EventSyntheticEventValueString
import typings.gestalt.anon.EventValueString
import typings.gestalt.anon.Item
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeaheadProps extends js.Object {
  
  var id: String = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var noResultText: String = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* args */ EventValueString, Unit]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* args */ EventSyntheticEventValueString, Unit]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* args */ EventFocusEvent, Unit]] = js.native
  
  var onSelect: js.UndefOr[js.Function1[/* args */ Item, Unit]] = js.native
  
  var options: js.Array[typings.gestalt.anon.Label] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[md | lg] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object TypeaheadProps {
  
  @scala.inline
  def apply(id: String, noResultText: String, options: js.Array[typings.gestalt.anon.Label]): TypeaheadProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], noResultText = noResultText.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadProps]
  }
  
  @scala.inline
  implicit class TypeaheadPropsOps[Self <: TypeaheadProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoResultText(value: String): Self = this.set("noResultText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: typings.gestalt.anon.Label*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[typings.gestalt.anon.Label]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* args */ EventValueString => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* args */ EventSyntheticEventValueString => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* args */ EventFocusEvent => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* args */ Item => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setSize(value: md | lg): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
