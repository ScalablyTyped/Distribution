package typings.formatjsEcma402Abstract

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/data", "isMissingLocaleDataError")
  @js.native
  def isMissingLocaleDataError(e: Error): /* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/data.MissingLocaleDataError */ Boolean = js.native
  
  @js.native
  trait MissingLocaleDataError extends Error {
    
    var `type`: String = js.native
  }
  object MissingLocaleDataError {
    
    @scala.inline
    def apply(message: String, name: String, `type`: String): MissingLocaleDataError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MissingLocaleDataError]
    }
    
    @scala.inline
    implicit class MissingLocaleDataErrorMutableBuilder[Self <: MissingLocaleDataError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
