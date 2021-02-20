package typings.ejWebAll.anon

import typings.ejWebAll.ej.PivotGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPivotGauge extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: PivotGauge = js.native
}
object TypeofPivotGauge {
  
  @scala.inline
  def apply(Locale: js.Any, fn: PivotGauge): TypeofPivotGauge = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPivotGauge]
  }
  
  @scala.inline
  implicit class TypeofPivotGaugeMutableBuilder[Self <: TypeofPivotGauge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: PivotGauge): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
