package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonProps extends StObject {
  
  var buttonProps: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var inputProps: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelProps: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
}
object ButtonProps {
  
  inline def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
    
    inline def setButtonProps(value: StringDictionary[Any]): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
    
    inline def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
    
    inline def setInputProps(value: StringDictionary[Any]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
    
    inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelProps(value: StringDictionary[Any]): Self = StObject.set(x, "labelProps", value.asInstanceOf[js.Any])
    
    inline def setLabelPropsUndefined: Self = StObject.set(x, "labelProps", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
