package typings.googleVisualization.global.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Events
object events {
  
  @JSGlobal("google.visualization.events")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addListener(visualization: js.Any, eventName: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(visualization.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def addListener(visualization: js.Any, eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(visualization.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def addOneTimeListener(visualization: js.Any, eventName: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addOneTimeListener")(visualization.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def addOneTimeListener(visualization: js.Any, eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addOneTimeListener")(visualization.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def removeAllListeners(visualization: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(visualization.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def removeListener(listener: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def trigger(visualization: js.Any, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(visualization.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trigger(visualization: js.Any, eventName: String, args: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(visualization.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
