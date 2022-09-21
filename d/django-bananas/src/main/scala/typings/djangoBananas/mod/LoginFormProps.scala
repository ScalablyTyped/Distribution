package typings.djangoBananas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginFormProps extends StObject {
  
  var logger: Any
}
object LoginFormProps {
  
  inline def apply(logger: Any): LoginFormProps = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginFormProps]
  }
  
  extension [Self <: LoginFormProps](x: Self) {
    
    inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
  }
}
