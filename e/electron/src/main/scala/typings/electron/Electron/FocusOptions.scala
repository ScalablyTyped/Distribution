package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusOptions extends StObject {
  
  /**
    * Make the receiver the active app even if another app is currently active.
    *
    * @platform darwin
    */
  var steal: Boolean
}
object FocusOptions {
  
  inline def apply(steal: Boolean): FocusOptions = {
    val __obj = js.Dynamic.literal(steal = steal.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusOptions] (val x: Self) extends AnyVal {
    
    inline def setSteal(value: Boolean): Self = StObject.set(x, "steal", value.asInstanceOf[js.Any])
  }
}
