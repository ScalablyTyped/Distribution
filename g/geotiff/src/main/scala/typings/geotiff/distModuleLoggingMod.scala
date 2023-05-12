package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleLoggingMod {
  
  @JSImport("geotiff/dist-module/logging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debug(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def error(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def info(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def log(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def setLogger(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")().asInstanceOf[Unit]
  inline def setLogger(logger: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def time(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def timeEnd(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeEnd")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def warn(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
}
