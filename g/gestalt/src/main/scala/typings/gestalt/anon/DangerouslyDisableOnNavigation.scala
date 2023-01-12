package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DangerouslyDisableOnNavigation extends StObject {
  
  var dangerouslyDisableOnNavigation: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object DangerouslyDisableOnNavigation {
  
  inline def apply(): DangerouslyDisableOnNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DangerouslyDisableOnNavigation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DangerouslyDisableOnNavigation] (val x: Self) extends AnyVal {
    
    inline def setDangerouslyDisableOnNavigation(value: () => Unit): Self = StObject.set(x, "dangerouslyDisableOnNavigation", js.Any.fromFunction0(value))
    
    inline def setDangerouslyDisableOnNavigationUndefined: Self = StObject.set(x, "dangerouslyDisableOnNavigation", js.undefined)
  }
}
