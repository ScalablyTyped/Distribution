package typings.gestalt.mod

import typings.gestalt.anon.SyntheticEvent
import typings.gestalt.anon.`0`
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.name
import typings.gestalt.gestaltStrings.off
import typings.gestalt.gestaltStrings.on
import typings.gestalt.gestaltStrings.username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFieldProps extends js.Object {
  
  var accessibilityLabel: String = js.native
  
  var autoComplete: js.UndefOr[on | off | username | name] = js.native
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* args */ `0`, Unit]] = js.native
  
  def onChange(args: SyntheticEvent): Unit = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* args */ SyntheticEvent, Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[md | lg] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object SearchFieldProps {
  
  @scala.inline
  def apply(accessibilityLabel: String, id: String, onChange: SyntheticEvent => Unit): SearchFieldProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[SearchFieldProps]
  }
  
  @scala.inline
  implicit class SearchFieldPropsOps[Self <: SearchFieldProps] (val x: Self) extends AnyVal {
    
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
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: SyntheticEvent => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutoComplete(value: on | off | username | name): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* args */ `0` => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* args */ SyntheticEvent => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
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
