package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Options */
trait AuthenticateOptions extends StObject {
  
  var interactive: Boolean
}
object AuthenticateOptions {
  
  inline def apply(interactive: Boolean): AuthenticateOptions = {
    val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticateOptions] (val x: Self) extends AnyVal {
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
  }
}
