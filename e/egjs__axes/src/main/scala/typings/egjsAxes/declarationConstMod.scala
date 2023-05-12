package typings.egjsAxes

import typings.egjsAxes.egjsAxesStrings.animationEnd
import typings.egjsAxes.egjsAxesStrings.animationStart
import typings.egjsAxes.egjsAxesStrings.change
import typings.egjsAxes.egjsAxesStrings.connect
import typings.egjsAxes.egjsAxesStrings.disconnect
import typings.egjsAxes.egjsAxesStrings.finish
import typings.egjsAxes.egjsAxesStrings.get
import typings.egjsAxes.egjsAxesStrings.hold
import typings.egjsAxes.egjsAxesStrings.isBounceArea
import typings.egjsAxes.egjsAxesStrings.release
import typings.egjsAxes.egjsAxesStrings.setAxis
import typings.egjsAxes.egjsAxesStrings.setBy
import typings.egjsAxes.egjsAxesStrings.setOptions
import typings.egjsAxes.egjsAxesStrings.setTo
import typings.egjsAxes.egjsAxesStrings.stopAnimation
import typings.egjsAxes.egjsAxesStrings.updateAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationConstMod {
  
  @JSImport("@egjs/axes/declaration/const", "ALT")
  @js.native
  val ALT: /* "alt" */ String = js.native
  
  @JSImport("@egjs/axes/declaration/const", "ANY")
  @js.native
  val ANY: /* "any" */ String = js.native
  
  @JSImport("@egjs/axes/declaration/const", "AXES_EVENTS")
  @js.native
  val AXES_EVENTS: js.Tuple6[hold, release, change, animationStart, animationEnd, finish] = js.native
  
  @JSImport("@egjs/axes/declaration/const", "AXES_METHODS")
  @js.native
  val AXES_METHODS: js.Tuple10[
    connect, 
    disconnect, 
    get, 
    setTo, 
    setBy, 
    setOptions, 
    setAxis, 
    stopAnimation, 
    updateAnimation, 
    isBounceArea
  ] = js.native
  
  @JSImport("@egjs/axes/declaration/const", "CTRL")
  @js.native
  val CTRL: /* "ctrl" */ String = js.native
  
  @JSImport("@egjs/axes/declaration/const", "DIRECTION_ALL")
  @js.native
  val DIRECTION_ALL: Double = js.native
  
  @JSImport("@egjs/axes/declaration/const", "DIRECTION_DOWN")
  @js.native
  val DIRECTION_DOWN: /* 16 */ Double = js.native
  
  @JSImport("@egjs/axes/declaration/const", "DIRECTION_HORIZONTAL")
  @js.native
  val DIRECTION_HORIZONTAL: Double = js.native
  
  @JSImport("@egjs/axes/declaration/const", "DIRECTION_LEFT")
  @js.native
  val DIRECTION_LEFT: /* 2 */ Double = js.native
  
  @JSImport("@egjs/axes/declaration/const", "DIRECTION_NONE")
  @js.native
  val DIRECTION_NONE: /* 1 */ Double = js.native
  
  @JSImport("@egjs/axes/declaration/const", "DIRECTION_RIGHT")
  @js.native
  val DIRECTION_RIGHT: /* 4 */ Double = js.native
  
  @JSImport("@egjs/axes/declaration/const", "DIRECTION_UP")
  @js.native
  val DIRECTION_UP: /* 8 */ Double = js.native
  
  @JSImport("@egjs/axes/declaration/const", "DIRECTION_VERTICAL")
  @js.native
  val DIRECTION_VERTICAL: Double = js.native
  
  @JSImport("@egjs/axes/declaration/const", "IOS_EDGE_THRESHOLD")
  @js.native
  val IOS_EDGE_THRESHOLD: /* 30 */ Double = js.native
  
  @JSImport("@egjs/axes/declaration/const", "IS_IOS_SAFARI")
  @js.native
  val IS_IOS_SAFARI: Boolean = js.native
  
  @JSImport("@egjs/axes/declaration/const", "META")
  @js.native
  val META: /* "meta" */ String = js.native
  
  @JSImport("@egjs/axes/declaration/const", "MOUSE_LEFT")
  @js.native
  val MOUSE_LEFT: /* "left" */ String = js.native
  
  @JSImport("@egjs/axes/declaration/const", "MOUSE_MIDDLE")
  @js.native
  val MOUSE_MIDDLE: /* "middle" */ String = js.native
  
  @JSImport("@egjs/axes/declaration/const", "MOUSE_RIGHT")
  @js.native
  val MOUSE_RIGHT: /* "right" */ String = js.native
  
  @JSImport("@egjs/axes/declaration/const", "NONE")
  @js.native
  val NONE: /* "none" */ String = js.native
  
  object PREVENT_DRAG_CSSPROPS {
    
    @JSImport("@egjs/axes/declaration/const", "PREVENT_DRAG_CSSPROPS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@egjs/axes/declaration/const", "PREVENT_DRAG_CSSPROPS.-moz-user-select")
    @js.native
    def mozUserSelect: String = js.native
    
    inline def mozUserSelect_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("-moz-user-select")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/declaration/const", "PREVENT_DRAG_CSSPROPS.-ms-user-select")
    @js.native
    def msUserSelect: String = js.native
    
    inline def msUserSelect_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("-ms-user-select")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/declaration/const", "PREVENT_DRAG_CSSPROPS.user-select")
    @js.native
    def userSelect: String = js.native
    
    inline def userSelect_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("user-select")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/declaration/const", "PREVENT_DRAG_CSSPROPS.-webkit-user-drag")
    @js.native
    def webkitUserDrag: String = js.native
    
    inline def webkitUserDrag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("-webkit-user-drag")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/declaration/const", "PREVENT_DRAG_CSSPROPS.-webkit-user-select")
    @js.native
    def webkitUserSelect: String = js.native
    
    inline def webkitUserSelect_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("-webkit-user-select")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@egjs/axes/declaration/const", "SHIFT")
  @js.native
  val SHIFT: /* "shift" */ String = js.native
  
  @JSImport("@egjs/axes/declaration/const", "TRANSFORM")
  @js.native
  val TRANSFORM: String = js.native
  
  @JSImport("@egjs/axes/declaration/const", "VELOCITY_INTERVAL")
  @js.native
  val VELOCITY_INTERVAL: /* 16 */ Double = js.native
}
