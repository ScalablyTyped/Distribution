package typings.fabric.anon

import typings.fabric.fabricImplMod.Control
import typings.fabric.fabricImplMod.ControlMouseEventHandler
import typings.fabric.fabricImplMod.Object
import typings.fabric.fabricImplMod.Point
import typings.fabric.fabricImplMod.Transform
import typings.std.CanvasRenderingContext2D
import typings.std.MouseEvent
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fabric.fabric/fabric-impl.Control> */
trait PartialControl extends StObject {
  
  var actionHandler: js.UndefOr[
    js.Function4[
      /* eventData */ MouseEvent, 
      /* transformData */ Transform, 
      /* x */ Double, 
      /* y */ Double, 
      Boolean
    ]
  ] = js.undefined
  
  var actionName: js.UndefOr[String] = js.undefined
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var calcCornerCoords: js.UndefOr[
    js.Function5[
      /* objectAngle */ Double, 
      /* objectCornerSize */ Double, 
      /* centerX */ Double, 
      /* centerY */ Double, 
      /* isTouch */ Boolean, 
      Unit
    ]
  ] = js.undefined
  
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[Partial[Control]], Any]] = js.undefined
  
  var cursorStyle: js.UndefOr[String] = js.undefined
  
  var cursorStyleHandler: js.UndefOr[
    js.Function3[/* eventData */ MouseEvent, /* control */ Control, /* fabricObject */ Object, String]
  ] = js.undefined
  
  var getActionHandler: js.UndefOr[
    js.Function3[
      /* eventData */ MouseEvent, 
      /* fabricObject */ Object, 
      /* control */ Control, 
      ControlMouseEventHandler
    ]
  ] = js.undefined
  
  var getActionName: js.UndefOr[
    js.Function3[/* eventData */ MouseEvent, /* control */ Control, /* fabricObject */ Object, String]
  ] = js.undefined
  
  var getMouseDownHandler: js.UndefOr[
    js.Function3[
      /* eventData */ MouseEvent, 
      /* fabricObject */ Object, 
      /* control */ Control, 
      ControlMouseEventHandler
    ]
  ] = js.undefined
  
  var getMouseUpHandler: js.UndefOr[
    js.Function3[
      /* eventData */ MouseEvent, 
      /* fabricObject */ Object, 
      /* control */ Control, 
      ControlMouseEventHandler
    ]
  ] = js.undefined
  
  var getVisibility: js.UndefOr[js.Function2[/* fabricObject */ Object, /* controlKey */ String, Boolean]] = js.undefined
  
  var mouseDownHandler: js.UndefOr[
    js.Function4[
      /* eventData */ MouseEvent, 
      /* transformData */ Transform, 
      /* x */ Double, 
      /* y */ Double, 
      Boolean
    ]
  ] = js.undefined
  
  var mouseUpHandler: js.UndefOr[
    js.Function4[
      /* eventData */ MouseEvent, 
      /* transformData */ Transform, 
      /* x */ Double, 
      /* y */ Double, 
      Boolean
    ]
  ] = js.undefined
  
  var offsetX: js.UndefOr[Double] = js.undefined
  
  var offsetY: js.UndefOr[Double] = js.undefined
  
  var positionHandler: js.UndefOr[
    js.Function4[
      /* dim */ X, 
      /* finalMatrix */ Any, 
      /* fabricObject */ Object, 
      /* currentControl */ Control, 
      Point
    ]
  ] = js.undefined
  
  var render: js.UndefOr[
    js.Function5[
      /* ctx */ CanvasRenderingContext2D, 
      /* left */ Double, 
      /* top */ Double, 
      /* styleOverride */ Any, 
      /* fabricObject */ Object, 
      Unit
    ]
  ] = js.undefined
  
  var setVisibility: js.UndefOr[js.Function1[/* visibility */ Boolean, Unit]] = js.undefined
  
  var sizeX: js.UndefOr[Double] = js.undefined
  
  var sizeY: js.UndefOr[Double] = js.undefined
  
  var touchSizeX: js.UndefOr[Double] = js.undefined
  
  var touchSizeY: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var withConnection: js.UndefOr[Boolean] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object PartialControl {
  
  inline def apply(): PartialControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialControl]
  }
  
  extension [Self <: PartialControl](x: Self) {
    
    inline def setActionHandler(
      value: (/* eventData */ MouseEvent, /* transformData */ Transform, /* x */ Double, /* y */ Double) => Boolean
    ): Self = StObject.set(x, "actionHandler", js.Any.fromFunction4(value))
    
    inline def setActionHandlerUndefined: Self = StObject.set(x, "actionHandler", js.undefined)
    
    inline def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setCalcCornerCoords(
      value: (/* objectAngle */ Double, /* objectCornerSize */ Double, /* centerX */ Double, /* centerY */ Double, /* isTouch */ Boolean) => Unit
    ): Self = StObject.set(x, "calcCornerCoords", js.Any.fromFunction5(value))
    
    inline def setCalcCornerCoordsUndefined: Self = StObject.set(x, "calcCornerCoords", js.undefined)
    
    inline def setConstructor(value: /* options */ js.UndefOr[Partial[Control]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setCursorStyle(value: String): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
    
    inline def setCursorStyleHandler(value: (/* eventData */ MouseEvent, /* control */ Control, /* fabricObject */ Object) => String): Self = StObject.set(x, "cursorStyleHandler", js.Any.fromFunction3(value))
    
    inline def setCursorStyleHandlerUndefined: Self = StObject.set(x, "cursorStyleHandler", js.undefined)
    
    inline def setCursorStyleUndefined: Self = StObject.set(x, "cursorStyle", js.undefined)
    
    inline def setGetActionHandler(
      value: (/* eventData */ MouseEvent, /* fabricObject */ Object, /* control */ Control) => ControlMouseEventHandler
    ): Self = StObject.set(x, "getActionHandler", js.Any.fromFunction3(value))
    
    inline def setGetActionHandlerUndefined: Self = StObject.set(x, "getActionHandler", js.undefined)
    
    inline def setGetActionName(value: (/* eventData */ MouseEvent, /* control */ Control, /* fabricObject */ Object) => String): Self = StObject.set(x, "getActionName", js.Any.fromFunction3(value))
    
    inline def setGetActionNameUndefined: Self = StObject.set(x, "getActionName", js.undefined)
    
    inline def setGetMouseDownHandler(
      value: (/* eventData */ MouseEvent, /* fabricObject */ Object, /* control */ Control) => ControlMouseEventHandler
    ): Self = StObject.set(x, "getMouseDownHandler", js.Any.fromFunction3(value))
    
    inline def setGetMouseDownHandlerUndefined: Self = StObject.set(x, "getMouseDownHandler", js.undefined)
    
    inline def setGetMouseUpHandler(
      value: (/* eventData */ MouseEvent, /* fabricObject */ Object, /* control */ Control) => ControlMouseEventHandler
    ): Self = StObject.set(x, "getMouseUpHandler", js.Any.fromFunction3(value))
    
    inline def setGetMouseUpHandlerUndefined: Self = StObject.set(x, "getMouseUpHandler", js.undefined)
    
    inline def setGetVisibility(value: (/* fabricObject */ Object, /* controlKey */ String) => Boolean): Self = StObject.set(x, "getVisibility", js.Any.fromFunction2(value))
    
    inline def setGetVisibilityUndefined: Self = StObject.set(x, "getVisibility", js.undefined)
    
    inline def setMouseDownHandler(
      value: (/* eventData */ MouseEvent, /* transformData */ Transform, /* x */ Double, /* y */ Double) => Boolean
    ): Self = StObject.set(x, "mouseDownHandler", js.Any.fromFunction4(value))
    
    inline def setMouseDownHandlerUndefined: Self = StObject.set(x, "mouseDownHandler", js.undefined)
    
    inline def setMouseUpHandler(
      value: (/* eventData */ MouseEvent, /* transformData */ Transform, /* x */ Double, /* y */ Double) => Boolean
    ): Self = StObject.set(x, "mouseUpHandler", js.Any.fromFunction4(value))
    
    inline def setMouseUpHandlerUndefined: Self = StObject.set(x, "mouseUpHandler", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPositionHandler(
      value: (/* dim */ X, /* finalMatrix */ Any, /* fabricObject */ Object, /* currentControl */ Control) => Point
    ): Self = StObject.set(x, "positionHandler", js.Any.fromFunction4(value))
    
    inline def setPositionHandlerUndefined: Self = StObject.set(x, "positionHandler", js.undefined)
    
    inline def setRender(
      value: (/* ctx */ CanvasRenderingContext2D, /* left */ Double, /* top */ Double, /* styleOverride */ Any, /* fabricObject */ Object) => Unit
    ): Self = StObject.set(x, "render", js.Any.fromFunction5(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setSetVisibility(value: /* visibility */ Boolean => Unit): Self = StObject.set(x, "setVisibility", js.Any.fromFunction1(value))
    
    inline def setSetVisibilityUndefined: Self = StObject.set(x, "setVisibility", js.undefined)
    
    inline def setSizeX(value: Double): Self = StObject.set(x, "sizeX", value.asInstanceOf[js.Any])
    
    inline def setSizeXUndefined: Self = StObject.set(x, "sizeX", js.undefined)
    
    inline def setSizeY(value: Double): Self = StObject.set(x, "sizeY", value.asInstanceOf[js.Any])
    
    inline def setSizeYUndefined: Self = StObject.set(x, "sizeY", js.undefined)
    
    inline def setTouchSizeX(value: Double): Self = StObject.set(x, "touchSizeX", value.asInstanceOf[js.Any])
    
    inline def setTouchSizeXUndefined: Self = StObject.set(x, "touchSizeX", js.undefined)
    
    inline def setTouchSizeY(value: Double): Self = StObject.set(x, "touchSizeY", value.asInstanceOf[js.Any])
    
    inline def setTouchSizeYUndefined: Self = StObject.set(x, "touchSizeY", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWithConnection(value: Boolean): Self = StObject.set(x, "withConnection", value.asInstanceOf[js.Any])
    
    inline def setWithConnectionUndefined: Self = StObject.set(x, "withConnection", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
