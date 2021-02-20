package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.DigitalGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDigitalGauge extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: DigitalGauge = js.native
}
object TypeofDigitalGauge {
  
  @scala.inline
  def apply(Locale: js.Any, fn: DigitalGauge): TypeofDigitalGauge = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDigitalGauge]
  }
  
  @scala.inline
  implicit class TypeofDigitalGaugeMutableBuilder[Self <: TypeofDigitalGauge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: DigitalGauge): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
