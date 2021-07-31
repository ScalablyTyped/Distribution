package typings.framebus

import typings.framebus.typesMod.FramebusSubscriber
import typings.framebus.typesMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("framebus/dist/lib/constants", "childWindows")
  @js.native
  val childWindows: js.Array[Window] = js.native
  
  @JSImport("framebus/dist/lib/constants", "prefix")
  @js.native
  val prefix: /* "/ *framebus* /" */ String = js.native
  
  @JSImport("framebus/dist/lib/constants", "subscribers")
  @js.native
  val subscribers: FramebusSubscriber = js.native
}
