package typings.googleVisualization.global.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Events
object events {
  
  @JSGlobal("google.visualization.events.addListener")
  @js.native
  def addListener(visualization: js.Any, eventName: String, callback: js.Function): js.Any = js.native
  @JSGlobal("google.visualization.events.addListener")
  @js.native
  def addListener(visualization: js.Any, eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  
  @JSGlobal("google.visualization.events.addOneTimeListener")
  @js.native
  def addOneTimeListener(visualization: js.Any, eventName: String, callback: js.Function): js.Any = js.native
  @JSGlobal("google.visualization.events.addOneTimeListener")
  @js.native
  def addOneTimeListener(visualization: js.Any, eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  
  @JSGlobal("google.visualization.events.removeAllListeners")
  @js.native
  def removeAllListeners(visualization: js.Any): Unit = js.native
  
  @JSGlobal("google.visualization.events.removeListener")
  @js.native
  def removeListener(listener: js.Any): Unit = js.native
  
  @JSGlobal("google.visualization.events.trigger")
  @js.native
  def trigger(visualization: js.Any, eventName: String): Unit = js.native
  @JSGlobal("google.visualization.events.trigger")
  @js.native
  def trigger(visualization: js.Any, eventName: String, args: js.Any): Unit = js.native
}
