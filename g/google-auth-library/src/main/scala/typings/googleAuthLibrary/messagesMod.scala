package typings.googleAuthLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMod {
  
  @JSImport("google-auth-library/build/src/messages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait WarningTypes extends StObject
  @JSImport("google-auth-library/build/src/messages", "WarningTypes")
  @js.native
  object WarningTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WarningTypes & String] = js.native
    
    @js.native
    sealed trait DEPRECATION
      extends StObject
         with WarningTypes
    /* "DeprecationWarning" */ val DEPRECATION: typings.googleAuthLibrary.messagesMod.WarningTypes.DEPRECATION & String = js.native
    
    @js.native
    sealed trait WARNING
      extends StObject
         with WarningTypes
    /* "Warning" */ val WARNING: typings.googleAuthLibrary.messagesMod.WarningTypes.WARNING & String = js.native
  }
  
  inline def warn(warning: Warning): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(warning.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Warning extends StObject {
    
    var code: String
    
    var message: String
    
    var `type`: WarningTypes
    
    var warned: js.UndefOr[Boolean] = js.undefined
  }
  object Warning {
    
    inline def apply(code: String, message: String, `type`: WarningTypes): Warning = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Warning]
    }
    
    extension [Self <: Warning](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: WarningTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWarned(value: Boolean): Self = StObject.set(x, "warned", value.asInstanceOf[js.Any])
      
      inline def setWarnedUndefined: Self = StObject.set(x, "warned", js.undefined)
    }
  }
}
