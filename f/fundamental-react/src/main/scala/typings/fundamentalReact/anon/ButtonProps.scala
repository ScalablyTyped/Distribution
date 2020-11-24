package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonProps extends js.Object {
  
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var labelProps: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
}
object ButtonProps {
  
  @scala.inline
  def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  
  @scala.inline
  implicit class ButtonPropsOps[Self <: ButtonProps] (val x: Self) extends AnyVal {
    
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
    def setButtonProps(value: StringDictionary[js.Any]): Self = this.set("buttonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonProps: Self = this.set("buttonProps", js.undefined)
    
    @scala.inline
    def setInputProps(value: StringDictionary[js.Any]): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelProps(value: StringDictionary[js.Any]): Self = this.set("labelProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelProps: Self = this.set("labelProps", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
  }
}
