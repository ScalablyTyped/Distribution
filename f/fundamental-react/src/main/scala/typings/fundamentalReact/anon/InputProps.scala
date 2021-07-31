package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputProps extends StObject {
  
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
}
object InputProps {
  
  @scala.inline
  def apply(): InputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProps]
  }
  
  @scala.inline
  implicit class InputPropsMutableBuilder[Self <: InputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
    
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
