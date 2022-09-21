package typings.formatjsEcma402Abstract

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @JSImport("@formatjs/ecma402-abstract/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMissingLocaleDataError(e: js.Error): /* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/data.MissingLocaleDataError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMissingLocaleDataError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/data.MissingLocaleDataError */ Boolean]
  
  trait MissingLocaleDataError
    extends StObject
       with Error {
    
    var `type`: String
  }
  object MissingLocaleDataError {
    
    inline def apply(message: String, name: String, `type`: String): MissingLocaleDataError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MissingLocaleDataError]
    }
    
    extension [Self <: MissingLocaleDataError](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
