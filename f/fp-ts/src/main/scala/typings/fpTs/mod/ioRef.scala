package typings.fpTs.mod

import typings.fpTs.iOMod.IO_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioRef {
  
  @JSImport("fp-ts", "ioRef")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "ioRef.IORef")
  @js.native
  open class IORef[A] protected ()
    extends typings.fpTs.iorefMod.IORef[A] {
    def this(value: A) = this()
  }
  
  inline def newIORef[A](a: A): IO_[typings.fpTs.iorefMod.IORef[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("newIORef")(a.asInstanceOf[js.Any]).asInstanceOf[IO_[typings.fpTs.iorefMod.IORef[A]]]
}
