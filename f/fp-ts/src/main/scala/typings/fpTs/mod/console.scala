package typings.fpTs.mod

import typings.fpTs.iOMod.IO_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object console {
  
  @JSImport("fp-ts", "console")
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(s: js.Any): IO_[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(s.asInstanceOf[js.Any]).asInstanceOf[IO_[Unit]]
  
  inline def info(s: js.Any): IO_[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(s.asInstanceOf[js.Any]).asInstanceOf[IO_[Unit]]
  
  inline def log(s: js.Any): IO_[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(s.asInstanceOf[js.Any]).asInstanceOf[IO_[Unit]]
  
  inline def warn(s: js.Any): IO_[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(s.asInstanceOf[js.Any]).asInstanceOf[IO_[Unit]]
}
