package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.HeatMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHeatMap extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: HeatMap = js.native
}
object TypeofHeatMap {
  
  @scala.inline
  def apply(Locale: js.Any, fn: HeatMap): TypeofHeatMap = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofHeatMap]
  }
  
  @scala.inline
  implicit class TypeofHeatMapMutableBuilder[Self <: TypeofHeatMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: HeatMap): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
