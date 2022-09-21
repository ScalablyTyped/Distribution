package typings.dialogNode

import typings.dialogNode.dialogNodeStrings.CANCEL
import typings.dialogNode.dialogNodeStrings.OK
import typings.dialogNode.dialogNodeStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dialog-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calendar(msg: String, title: String, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calendar")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def calendar(msg: String, title: String, timeout: Double, callback: DialogCallback[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("calendar")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def entry(msg: String, title: String, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("entry")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def entry(msg: String, title: String, timeout: Double, callback: DialogCallback[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("entry")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def error(msg: String, title: String, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def error(msg: String, title: String, timeout: Double, callback: DialogCallback[OK | CANCEL]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fileselect(msg: String, title: String, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileselect")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fileselect(msg: String, title: String, timeout: Double, callback: DialogCallback[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileselect")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def info(msg: String, title: String, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def info(msg: String, title: String, timeout: Double, callback: DialogCallback[OK | CANCEL]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def question(msg: String, title: String, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("question")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def question(msg: String, title: String, timeout: Double, callback: DialogCallback[OK | CANCEL | _empty]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("question")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setCwd(directory: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCwd")(directory.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warn(msg: String, title: String, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warn(msg: String, title: String, timeout: Double, callback: DialogCallback[OK | CANCEL]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], title.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type DialogCallback[TRetVal] = js.Function3[/* code */ Double, /* retVal */ TRetVal, /* stderr */ String, Unit]
}
