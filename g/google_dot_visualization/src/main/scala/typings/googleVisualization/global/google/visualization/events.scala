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
  
  inline def addListener(visualization: Any, eventName: String, callback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(visualization.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(visualization: Any, eventName: String, callback: js.Function1[/* repeated */ Any, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(visualization.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def addOneTimeListener(visualization: Any, eventName: String, callback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addOneTimeListener")(visualization.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addOneTimeListener(visualization: Any, eventName: String, callback: js.Function1[/* repeated */ Any, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addOneTimeListener")(visualization.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def removeAllListeners(visualization: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(visualization.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeListener(listener: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def trigger(visualization: Any, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(visualization.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trigger(visualization: Any, eventName: String, args: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(visualization.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
