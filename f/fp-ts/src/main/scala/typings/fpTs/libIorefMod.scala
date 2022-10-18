package typings.fpTs

import typings.fpTs.libIOMod.IO_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIorefMod {
  
  @JSImport("fp-ts/lib/IORef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/IORef", "IORef")
  @js.native
  open class IORef[A] protected () extends StObject {
    def this(value: A) = this()
    
    /**
      * @since 2.0.0
      */
    def modify(f: js.Function1[/* a */ A, A]): IO_[Unit] = js.native
    
    /* private */ def read(): A = js.native
    
    /**
      * @since 2.0.0
      */
    def write(a: A): IO_[Unit] = js.native
  }
  
  inline def newIORef[A](a: A): IO_[IORef[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("newIORef")(a.asInstanceOf[js.Any]).asInstanceOf[IO_[IORef[A]]]
}
