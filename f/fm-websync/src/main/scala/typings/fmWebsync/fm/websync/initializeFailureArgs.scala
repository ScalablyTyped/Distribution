package typings.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait initializeFailureArgs extends baseArgs {
  
  /**
    * The error generated while initializing.
    */
  var error: String = js.native
}
object initializeFailureArgs {
  
  @scala.inline
  def apply(error: String): initializeFailureArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[initializeFailureArgs]
  }
  
  @scala.inline
  implicit class initializeFailureArgsMutableBuilder[Self <: initializeFailureArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
