package typings.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait initializeFailureArgs
  extends StObject
     with baseArgs {
  
  /**
    * The error generated while initializing.
    */
  var error: String
}
object initializeFailureArgs {
  
  inline def apply(error: String): initializeFailureArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[initializeFailureArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: initializeFailureArgs] (val x: Self) extends AnyVal {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
