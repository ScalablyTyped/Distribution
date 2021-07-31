package typings.egjsAxes

import org.scalablytyped.runtime.StringDictionary
import typings.egjsAxes.axesMod.AxesOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axisManagerMod {
  
  @JSImport("@egjs/axes/AxisManager", "AxisManager")
  @js.native
  class AxisManager protected () extends StObject {
    def this(axis: js.Any, options: AxesOption) = this()
    
    var _pos: js.Any = js.native
    
    var axis: js.Any = js.native
    
    def every(
      pos: Axis,
      callback: js.Function3[/* value */ Double, /* key */ String, /* options */ AxisOption, Boolean]
    ): Boolean = js.native
    
    def filter(
      pos: Axis,
      callback: js.Function3[/* value */ Double, /* key */ String, /* options */ AxisOption, Boolean]
    ): Axis = js.native
    
    def get(): Axis = js.native
    def get(axes: js.Array[String]): Axis = js.native
    def get(axes: Axis): Axis = js.native
    
    def getDelta(depaPos: Axis, destPos: Axis): Axis = js.native
    
    def isOutside(): Boolean = js.native
    def isOutside(axes: js.Array[String]): Boolean = js.native
    
    def map(
      pos: Axis,
      callback: js.Function3[/* value */ Double, /* key */ String, /* options */ AxisOption, js.Any]
    ): js.Any = js.native
    
    def moveTo(pos: Axis): StringDictionary[Axis] = js.native
    
    var options: js.Any = js.native
    
    def set(pos: Axis): Unit = js.native
  }
  /* static members */
  object AxisManager {
    
    @JSImport("@egjs/axes/AxisManager", "AxisManager")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def equal(target: Axis, base: Axis): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(target.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  type Axis = StringDictionary[Double]
  
  trait AxisOption extends StObject {
    
    var bounce: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var circular: js.UndefOr[Boolean | js.Array[Boolean]] = js.undefined
    
    var range: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object AxisOption {
    
    @scala.inline
    def apply(): AxisOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisOption]
    }
    
    @scala.inline
    implicit class AxisOptionMutableBuilder[Self <: AxisOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounce(value: Double | js.Array[Double]): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      @scala.inline
      def setBounceVarargs(value: Double*): Self = StObject.set(x, "bounce", js.Array(value :_*))
      
      @scala.inline
      def setCircular(value: Boolean | js.Array[Boolean]): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      @scala.inline
      def setCircularVarargs(value: Boolean*): Self = StObject.set(x, "circular", js.Array(value :_*))
      
      @scala.inline
      def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value :_*))
    }
  }
}
