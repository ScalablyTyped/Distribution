package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.failure
import typings.ecmarkup.libHeaderParserMod.ParseError
import typings.ecmarkup.libHeaderParserMod.ParsedHeaderOrFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors
  extends StObject
     with ParsedHeaderOrFailure {
  
  var errors: js.Array[ParseError]
  
  var `type`: failure
}
object Errors {
  
  inline def apply(errors: js.Array[ParseError]): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("failure")
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setErrors(value: js.Array[ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: ParseError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setType(value: failure): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
