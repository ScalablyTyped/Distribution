package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Log functions to properly pass messages to the Logs Page.
  */
object log {
  
  @JSImport("flashpoint-launcher", "log")
  @js.native
  val ^ : js.Any = js.native
  
  inline def debug(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def info(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("flashpoint-launcher", "log.onLog")
  @js.native
  val onLog: Event[ILogEntry] = js.native
  
  inline def trace(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
