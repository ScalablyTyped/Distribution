package typings.egjsAxes

import typings.cfcsCore.reactiveAdapterMod.ReactiveAdapter
import typings.egjsAxes.axesMod.AxesOption
import typings.egjsAxes.axesMod.default
import typings.egjsAxes.axisManagerMod.AxisOption
import typings.egjsAxes.typesMod.AxesEvents
import typings.egjsAxes.typesMod.AxesReactiveState
import typings.egjsAxes.typesMod.ObjectInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactiveMod {
  
  @JSImport("@egjs/axes/declaration/reactive", "REACTIVE_AXES")
  @js.native
  val REACTIVE_AXES: ReactiveAdapter[
    default, 
    AxesReactiveState, 
    /* keyof @egjs/axes.@egjs/axes/declaration/types.AxesMethods */ String, 
    AxesData, 
    AxesEvents
  ] = js.native
  
  trait AxesData extends StObject {
    
    var axis: ObjectInterface[AxisOption]
    
    var options: AxesOption
  }
  object AxesData {
    
    inline def apply(axis: ObjectInterface[AxisOption], options: AxesOption): AxesData = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxesData]
    }
    
    extension [Self <: AxesData](x: Self) {
      
      inline def setAxis(value: ObjectInterface[AxisOption]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: AxesOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
