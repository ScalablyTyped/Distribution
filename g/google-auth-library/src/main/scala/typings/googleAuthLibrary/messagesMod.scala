package typings.googleAuthLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMod {
  
  @js.native
  sealed trait WarningTypes extends StObject
  @JSImport("google-auth-library/build/src/messages", "WarningTypes")
  @js.native
  object WarningTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WarningTypes with String] = js.native
    
    @js.native
    sealed trait DEPRECATION extends WarningTypes
    /* "DeprecationWarning" */ val DEPRECATION: typings.googleAuthLibrary.messagesMod.WarningTypes.DEPRECATION with String = js.native
    
    @js.native
    sealed trait WARNING extends WarningTypes
    /* "Warning" */ val WARNING: typings.googleAuthLibrary.messagesMod.WarningTypes.WARNING with String = js.native
  }
  
  @JSImport("google-auth-library/build/src/messages", "warn")
  @js.native
  def warn(warning: Warning): Unit = js.native
  
  @js.native
  trait Warning extends StObject {
    
    var code: String = js.native
    
    var message: String = js.native
    
    var `type`: WarningTypes = js.native
    
    var warned: js.UndefOr[Boolean] = js.native
  }
  object Warning {
    
    @scala.inline
    def apply(code: String, message: String, `type`: WarningTypes): Warning = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Warning]
    }
    
    @scala.inline
    implicit class WarningMutableBuilder[Self <: Warning] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: WarningTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarned(value: Boolean): Self = StObject.set(x, "warned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnedUndefined: Self = StObject.set(x, "warned", js.undefined)
    }
  }
}
