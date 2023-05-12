package typings.domNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationReloadOptions
  extends StObject
     with NavigationOptions {
  
  var state: js.UndefOr[Any] = js.undefined
}
object NavigationReloadOptions {
  
  inline def apply(): NavigationReloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationReloadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationReloadOptions] (val x: Self) extends AnyVal {
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
