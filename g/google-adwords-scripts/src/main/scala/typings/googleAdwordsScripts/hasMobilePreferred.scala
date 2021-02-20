package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hasMobilePreferred extends StObject {
  
  def isMobilePreferred(): Boolean = js.native
  
  def setMobilePreferred(isMobilePreferred: Boolean): Unit = js.native
}
object hasMobilePreferred {
  
  @scala.inline
  def apply(isMobilePreferred: () => Boolean, setMobilePreferred: Boolean => Unit): hasMobilePreferred = {
    val __obj = js.Dynamic.literal(isMobilePreferred = js.Any.fromFunction0(isMobilePreferred), setMobilePreferred = js.Any.fromFunction1(setMobilePreferred))
    __obj.asInstanceOf[hasMobilePreferred]
  }
  
  @scala.inline
  implicit class hasMobilePreferredMutableBuilder[Self <: hasMobilePreferred] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMobilePreferred(value: () => Boolean): Self = StObject.set(x, "isMobilePreferred", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetMobilePreferred(value: Boolean => Unit): Self = StObject.set(x, "setMobilePreferred", js.Any.fromFunction1(value))
  }
}
