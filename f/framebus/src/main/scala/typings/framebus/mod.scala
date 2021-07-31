package typings.framebus

import typings.framebus.framebusMod.Framebus
import typings.framebus.framebusMod.FramebusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object mod {
  
  @JSImport("framebus/dist", JSImport.Namespace)
  @js.native
  class ^ () extends Framebus {
    def this(options: FramebusOptions) = this()
  }
  @JSImport("framebus/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def target(): Framebus = ^.asInstanceOf[js.Dynamic].applyDynamic("target")().asInstanceOf[Framebus]
  @scala.inline
  def target(options: FramebusOptions): Framebus = ^.asInstanceOf[js.Dynamic].applyDynamic("target")(options.asInstanceOf[js.Any]).asInstanceOf[Framebus]
}
