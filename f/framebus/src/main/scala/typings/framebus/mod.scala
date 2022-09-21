package typings.framebus

import typings.framebus.framebusMod.Framebus
import typings.framebus.framebusMod.FramebusOptions
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object mod {
  
  @JSImport("framebus/dist", JSImport.Namespace)
  @js.native
  open class ^ () extends Framebus {
    def this(options: FramebusOptions) = this()
  }
  @JSImport("framebus/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("framebus/dist", "Promise")
  @js.native
  def Promise: PromiseConstructor = js.native
  inline def Promise_=(x: PromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
  
  inline def setPromise(PromiseGlobal: PromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPromise")(PromiseGlobal.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def target(): Framebus = ^.asInstanceOf[js.Dynamic].applyDynamic("target")().asInstanceOf[Framebus]
  inline def target(options: FramebusOptions): Framebus = ^.asInstanceOf[js.Dynamic].applyDynamic("target")(options.asInstanceOf[js.Any]).asInstanceOf[Framebus]
}
