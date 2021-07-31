package typings.ejWebAll.anon

import typings.ejWebAll.ej.ProgressBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofProgressBar extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: ProgressBar
}
object TypeofProgressBar {
  
  @scala.inline
  def apply(Locale: js.Any, fn: ProgressBar): TypeofProgressBar = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofProgressBar]
  }
  
  @scala.inline
  implicit class TypeofProgressBarMutableBuilder[Self <: TypeofProgressBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: ProgressBar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
