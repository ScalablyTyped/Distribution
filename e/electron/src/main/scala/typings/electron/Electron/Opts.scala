package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opts extends StObject {
  
  /**
    *  Keep the system awake instead of allowing it to sleep. Default is `false`.
    */
  var stayAwake: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Keep the page hidden instead of visible. Default is `false`.
    */
  var stayHidden: js.UndefOr[Boolean] = js.undefined
}
object Opts {
  
  inline def apply(): Opts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
    
    inline def setStayAwake(value: Boolean): Self = StObject.set(x, "stayAwake", value.asInstanceOf[js.Any])
    
    inline def setStayAwakeUndefined: Self = StObject.set(x, "stayAwake", js.undefined)
    
    inline def setStayHidden(value: Boolean): Self = StObject.set(x, "stayHidden", value.asInstanceOf[js.Any])
    
    inline def setStayHiddenUndefined: Self = StObject.set(x, "stayHidden", js.undefined)
  }
}
