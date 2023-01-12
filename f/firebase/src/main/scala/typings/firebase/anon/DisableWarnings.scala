package typings.firebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableWarnings extends StObject {
  
  /**
    * Whether the warning banner attached to the DOM was disabled.
    */
  val disableWarnings: Boolean
}
object DisableWarnings {
  
  inline def apply(disableWarnings: Boolean): DisableWarnings = {
    val __obj = js.Dynamic.literal(disableWarnings = disableWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableWarnings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableWarnings] (val x: Self) extends AnyVal {
    
    inline def setDisableWarnings(value: Boolean): Self = StObject.set(x, "disableWarnings", value.asInstanceOf[js.Any])
  }
}
