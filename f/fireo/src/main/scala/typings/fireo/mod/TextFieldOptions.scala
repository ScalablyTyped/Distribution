package typings.fireo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFieldOptions
  extends StObject
     with BaseFieldOptions {
  
  var toLowercase: js.UndefOr[Boolean] = js.undefined
}
object TextFieldOptions {
  
  inline def apply(): TextFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFieldOptions]
  }
  
  extension [Self <: TextFieldOptions](x: Self) {
    
    inline def setToLowercase(value: Boolean): Self = StObject.set(x, "toLowercase", value.asInstanceOf[js.Any])
    
    inline def setToLowercaseUndefined: Self = StObject.set(x, "toLowercase", js.undefined)
  }
}
