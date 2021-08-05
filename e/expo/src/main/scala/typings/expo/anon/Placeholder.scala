package typings.expo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placeholder extends StObject {
  
  var placeholder: String
  
  var submitButtonTitle: String
}
object Placeholder {
  
  inline def apply(placeholder: String, submitButtonTitle: String): Placeholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], submitButtonTitle = submitButtonTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
  
  extension [Self <: Placeholder](x: Self) {
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setSubmitButtonTitle(value: String): Self = StObject.set(x, "submitButtonTitle", value.asInstanceOf[js.Any])
  }
}
