package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.LinearGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLinearGauge extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: LinearGauge = js.native
}
object TypeofLinearGauge {
  
  @scala.inline
  def apply(Locale: js.Any, fn: LinearGauge): TypeofLinearGauge = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofLinearGauge]
  }
  
  @scala.inline
  implicit class TypeofLinearGaugeMutableBuilder[Self <: TypeofLinearGauge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: LinearGauge): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
