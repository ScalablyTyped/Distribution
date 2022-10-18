package typings.framebus

import typings.framebus.distLibTypesMod.FramebusSubscribeHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSubscribeReplierMod {
  
  @JSImport("framebus/dist/lib/subscribe-replier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subscribeReplier(fn: FramebusSubscribeHandler, origin: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeReplier")(fn.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[String]
}
