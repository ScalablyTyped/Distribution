package typings.framebus

import typings.framebus.distLibTypesMod.FramebusPayload
import typings.framebus.framebusBooleans.`false`
import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUnpackPayloadMod {
  
  @JSImport("framebus/dist/lib/unpack-payload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unpackPayload(e: MessageEvent[Any]): FramebusPayload | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackPayload")(e.asInstanceOf[js.Any]).asInstanceOf[FramebusPayload | `false`]
}
