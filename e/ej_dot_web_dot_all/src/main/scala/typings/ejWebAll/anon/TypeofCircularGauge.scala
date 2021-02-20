package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.CircularGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCircularGauge extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: CircularGauge = js.native
}
object TypeofCircularGauge {
  
  @scala.inline
  def apply(Locale: js.Any, fn: CircularGauge): TypeofCircularGauge = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCircularGauge]
  }
  
  @scala.inline
  implicit class TypeofCircularGaugeMutableBuilder[Self <: TypeofCircularGauge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: CircularGauge): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
