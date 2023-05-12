package typings.domViewTransitions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSStyleDeclaration extends StObject {
  
  var viewTransitionName: String
}
object CSSStyleDeclaration {
  
  inline def apply(viewTransitionName: String): CSSStyleDeclaration = {
    val __obj = js.Dynamic.literal(viewTransitionName = viewTransitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSStyleDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSStyleDeclaration] (val x: Self) extends AnyVal {
    
    inline def setViewTransitionName(value: String): Self = StObject.set(x, "viewTransitionName", value.asInstanceOf[js.Any])
  }
}
