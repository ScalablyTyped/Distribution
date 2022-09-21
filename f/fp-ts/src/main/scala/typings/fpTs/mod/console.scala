package typings.fpTs.mod

import typings.fpTs.iOMod.IO_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object console {
  
  @JSImport("fp-ts", "console")
  @js.native
  val ^ : js.Any = js.native
  
  inline def error[A](a: A): IO_[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(a.asInstanceOf[js.Any]).asInstanceOf[IO_[Unit]]
  
  inline def info[A](a: A): IO_[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(a.asInstanceOf[js.Any]).asInstanceOf[IO_[Unit]]
  
  inline def log[A](a: A): IO_[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(a.asInstanceOf[js.Any]).asInstanceOf[IO_[Unit]]
  
  inline def warn[A](a: A): IO_[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(a.asInstanceOf[js.Any]).asInstanceOf[IO_[Unit]]
}
