package typings.ejWebAll.anon

import typings.ejWebAll.ej.Sparkline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSparkline extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: Sparkline
}
object TypeofSparkline {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Sparkline): TypeofSparkline = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSparkline]
  }
  
  @scala.inline
  implicit class TypeofSparklineMutableBuilder[Self <: TypeofSparkline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Sparkline): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
