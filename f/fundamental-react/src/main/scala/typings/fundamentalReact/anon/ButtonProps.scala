package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonProps extends StObject {
  
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
  implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
    
    @scala.inline
    def setInputProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "labelProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPropsUndefined: Self = StObject.set(x, "labelProps", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
