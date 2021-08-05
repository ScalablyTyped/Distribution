package typings.egjsAxes

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.egjsAxes.anon.TypeofPanInput
import typings.egjsAxes.axesMod.AxesOption
import typings.egjsAxes.axisManagerMod.Axis
import typings.egjsAxes.axisManagerMod.AxisOption
import typings.egjsAxes.constMod.DIRECTION
import typings.egjsAxes.pinchInputMod.PinchInput
import typings.egjsAxes.pinchInputMod.PinchInputOption
import typings.egjsAxes.wheelInputMod.WheelInput
import typings.egjsAxes.wheelInputMod.WheelInputOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@egjs/axes", "default")
  @js.native
  class default protected ()
    extends typings.egjsAxes.axesMod.default {
    def this(axis: StringDictionary[AxisOption], options: AxesOption) = this()
    def this(axis: StringDictionary[AxisOption], options: AxesOption, startPos: Axis) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@egjs/axes", "default")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@egjs/axes", "default.DIRECTION_ALL")
    @js.native
    def DIRECTION_ALL: DIRECTION = js.native
    inline def DIRECTION_ALL_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes", "default.DIRECTION_DOWN")
    @js.native
    def DIRECTION_DOWN: DIRECTION = js.native
    inline def DIRECTION_DOWN_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_DOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes", "default.DIRECTION_HORIZONTAL")
    @js.native
    def DIRECTION_HORIZONTAL: DIRECTION = js.native
    inline def DIRECTION_HORIZONTAL_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_HORIZONTAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes", "default.DIRECTION_LEFT")
    @js.native
    def DIRECTION_LEFT: DIRECTION = js.native
    inline def DIRECTION_LEFT_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes", "default.DIRECTION_NONE")
    @js.native
    def DIRECTION_NONE: DIRECTION = js.native
    inline def DIRECTION_NONE_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_NONE")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes", "default.DIRECTION_RIGHT")
    @js.native
    def DIRECTION_RIGHT: DIRECTION = js.native
    inline def DIRECTION_RIGHT_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes", "default.DIRECTION_UP")
    @js.native
    def DIRECTION_UP: DIRECTION = js.native
    inline def DIRECTION_UP_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_UP")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes", "default.DIRECTION_VERTICAL")
    @js.native
    def DIRECTION_VERTICAL: DIRECTION = js.native
    inline def DIRECTION_VERTICAL_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_VERTICAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes", "default.PanInput")
    @js.native
    def PanInput: TypeofPanInput = js.native
    inline def PanInput_=(x: TypeofPanInput): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PanInput")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes", "default.PinchInput")
    @js.native
    def PinchInput: Instantiable2[
        /* el */ js.Any, 
        /* options */ js.UndefOr[PinchInputOption], 
        typings.egjsAxes.pinchInputMod.PinchInput
      ] = js.native
    inline def PinchInput_=(x: Instantiable2[/* el */ js.Any, /* options */ js.UndefOr[PinchInputOption], PinchInput]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PinchInput")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes", "default.TRANSFORM")
    @js.native
    def TRANSFORM: String = js.native
    inline def TRANSFORM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSFORM")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes", "default.WheelInput")
    @js.native
    def WheelInput: Instantiable2[
        /* el */ js.Any, 
        /* options */ js.UndefOr[WheelInputOption], 
        typings.egjsAxes.wheelInputMod.WheelInput
      ] = js.native
    inline def WheelInput_=(x: Instantiable2[/* el */ js.Any, /* options */ js.UndefOr[WheelInputOption], WheelInput]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelInput")(x.asInstanceOf[js.Any])
  }
}
