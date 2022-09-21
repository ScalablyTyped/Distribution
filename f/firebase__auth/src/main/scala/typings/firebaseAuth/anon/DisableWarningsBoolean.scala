package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableWarningsBoolean extends StObject {
  
  /**
    * Whether the warning banner attached to the DOM was disabled.
    */
  val disableWarnings: Boolean
}
object DisableWarningsBoolean {
  
  inline def apply(disableWarnings: Boolean): DisableWarningsBoolean = {
    val __obj = js.Dynamic.literal(disableWarnings = disableWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableWarningsBoolean]
  }
  
  extension [Self <: DisableWarningsBoolean](x: Self) {
    
    inline def setDisableWarnings(value: Boolean): Self = StObject.set(x, "disableWarnings", value.asInstanceOf[js.Any])
  }
}
