package typings.forgeViewer.Autodesk.Viewing

import typings.std.Event
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolInterface extends StObject {
  
  def activate(name: String): Unit = js.native
  def activate(name: String, viewerApi: GuiViewer3D): Unit = js.native
  
  def deactivate(name: String): Unit = js.native
  
  def deregister(): Unit = js.native
  
  var getCursor: js.UndefOr[js.Function0[String]] = js.native
  
  def getName(): String = js.native
  
  def getNames(): js.Array[String] = js.native
  
  var handleBlur: js.UndefOr[js.Function1[/* event */ Event, Boolean]] = js.native
  
  var handleButtonDown: js.UndefOr[js.Function2[/* event */ MouseEvent, /* button */ Double, Boolean]] = js.native
  
  var handleButtonUp: js.UndefOr[js.Function2[/* event */ MouseEvent, /* button */ Double, Boolean]] = js.native
  
  var handleDoubleClick: js.UndefOr[js.Function2[/* event */ MouseEvent, /* button */ Double, Boolean]] = js.native
  
  var handleDoubleTap: js.UndefOr[js.Function1[/* event */ Event, Boolean]] = js.native
  
  var handleGesture: js.UndefOr[js.Function1[/* event */ Event, Boolean]] = js.native
  
  var handleKeyDown: js.UndefOr[js.Function2[/* event */ KeyboardEvent, /* keyCode */ Double, Boolean]] = js.native
  
  var handleKeyUp: js.UndefOr[js.Function2[/* event */ KeyboardEvent, /* keyCode */ Double, Boolean]] = js.native
  
  var handleMouseMove: js.UndefOr[js.Function1[/* event */ MouseEvent, Boolean]] = js.native
  
  var handleResize: js.UndefOr[js.Function0[Unit]] = js.native
  
  var handleSingleClick: js.UndefOr[js.Function2[/* event */ MouseEvent, /* button */ Double, Boolean]] = js.native
  
  var handleSingleTap: js.UndefOr[js.Function1[/* event */ Event, Boolean]] = js.native
  
  var handleWheelInput: js.UndefOr[js.Function1[/* delta */ Double, Boolean]] = js.native
  
  def register(): Unit = js.native
  
  def update(): Boolean = js.native
  def update(highResTimestamp: Double): Boolean = js.native
}
