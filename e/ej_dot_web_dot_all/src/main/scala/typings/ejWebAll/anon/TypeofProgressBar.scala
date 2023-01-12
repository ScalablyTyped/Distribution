package typings.ejWebAll.anon

import typings.ejWebAll.ej.ProgressBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofProgressBar extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: ProgressBar
}
object TypeofProgressBar {
  
  inline def apply(Locale: Any, fn: ProgressBar): TypeofProgressBar = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofProgressBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofProgressBar] (val x: Self) extends AnyVal {
    
    inline def setFn(value: ProgressBar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
