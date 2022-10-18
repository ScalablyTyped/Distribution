package typings.egjsAxes

import org.scalablytyped.runtime.StringDictionary
import typings.egjsAxes.declarationTypesMod.ObjectInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationAxisManagerMod {
  
  @JSImport("@egjs/axes/declaration/AxisManager", "AxisManager")
  @js.native
  open class AxisManager protected () extends StObject {
    def this(_axis: ObjectInterface[AxisOption]) = this()
    
    /* private */ var _axis: Any = js.native
    
    /* private */ var _complementOptions: Any = js.native
    
    /* private */ var _pos: Any = js.native
    
    def every(
      pos: Axis,
      callback: js.Function3[/* value */ Double, /* options */ AxisOption, /* key */ String, Boolean]
    ): Boolean = js.native
    
    def filter(
      pos: Axis,
      callback: js.Function3[/* value */ Double, /* options */ AxisOption, /* key */ String, Boolean]
    ): Axis = js.native
    
    def get(): Axis = js.native
    def get(axes: js.Array[String]): Axis = js.native
    def get(axes: Axis): Axis = js.native
    
    def getAxisOptions(key: String): AxisOption = js.native
    
    def getDelta(depaPos: Axis, destPos: Axis): Axis = js.native
    
    def isOutside(): Boolean = js.native
    def isOutside(axes: js.Array[String]): Boolean = js.native
    
    def map[U](
      pos: Axis,
      callback: js.Function3[/* value */ Double, /* options */ AxisOption, /* key */ String, U]
    ): ObjectInterface[U] = js.native
    
    def moveTo(pos: Axis): StringDictionary[Axis] = js.native
    def moveTo(pos: Axis, depaPos: Axis): StringDictionary[Axis] = js.native
    
    def set(pos: Axis): Unit = js.native
    
    def setAxis(axis: ObjectInterface[AxisOption]): Unit = js.native
  }
  
  type Axis = StringDictionary[Double]
  
  trait AxisOption extends StObject {
    
    var bounce: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var circular: js.UndefOr[Boolean | js.Array[Boolean]] = js.undefined
    
    var range: js.UndefOr[js.Array[Double]] = js.undefined
    
    var startPos: js.UndefOr[Double] = js.undefined
  }
  object AxisOption {
    
    inline def apply(): AxisOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisOption]
    }
    
    extension [Self <: AxisOption](x: Self) {
      
      inline def setBounce(value: Double | js.Array[Double]): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      inline def setBounceVarargs(value: Double*): Self = StObject.set(x, "bounce", js.Array(value*))
      
      inline def setCircular(value: Boolean | js.Array[Boolean]): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      inline def setCircularVarargs(value: Boolean*): Self = StObject.set(x, "circular", js.Array(value*))
      
      inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
      
      inline def setStartPos(value: Double): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
      
      inline def setStartPosUndefined: Self = StObject.set(x, "startPos", js.undefined)
    }
  }
}
