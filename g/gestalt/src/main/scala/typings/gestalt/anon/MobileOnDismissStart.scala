package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileOnDismissStart extends StObject {
  
  def dangerouslyDisableOnNavigation(): Unit
  
  def mobileOnDismissStart(): Unit
}
object MobileOnDismissStart {
  
  inline def apply(dangerouslyDisableOnNavigation: () => Unit, mobileOnDismissStart: () => Unit): MobileOnDismissStart = {
    val __obj = js.Dynamic.literal(dangerouslyDisableOnNavigation = js.Any.fromFunction0(dangerouslyDisableOnNavigation), mobileOnDismissStart = js.Any.fromFunction0(mobileOnDismissStart))
    __obj.asInstanceOf[MobileOnDismissStart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileOnDismissStart] (val x: Self) extends AnyVal {
    
    inline def setDangerouslyDisableOnNavigation(value: () => Unit): Self = StObject.set(x, "dangerouslyDisableOnNavigation", js.Any.fromFunction0(value))
    
    inline def setMobileOnDismissStart(value: () => Unit): Self = StObject.set(x, "mobileOnDismissStart", js.Any.fromFunction0(value))
  }
}
