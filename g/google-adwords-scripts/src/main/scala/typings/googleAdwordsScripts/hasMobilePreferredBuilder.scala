package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasMobilePreferredBuilder[B] extends StObject {
  
  def withMobilePreferred(): B
}
object hasMobilePreferredBuilder {
  
  inline def apply[B](withMobilePreferred: () => B): hasMobilePreferredBuilder[B] = {
    val __obj = js.Dynamic.literal(withMobilePreferred = js.Any.fromFunction0(withMobilePreferred))
    __obj.asInstanceOf[hasMobilePreferredBuilder[B]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: hasMobilePreferredBuilder[?], B] (val x: Self & hasMobilePreferredBuilder[B]) extends AnyVal {
    
    inline def setWithMobilePreferred(value: () => B): Self = StObject.set(x, "withMobilePreferred", js.Any.fromFunction0(value))
  }
}
