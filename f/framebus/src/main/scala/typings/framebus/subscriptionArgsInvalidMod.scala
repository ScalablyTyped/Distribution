package typings.framebus

import typings.framebus.typesMod.FramebusOnHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionArgsInvalidMod {
  
  @JSImport("framebus/dist/lib/subscription-args-invalid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def subscriptionArgsInvalid(event: String, fn: FramebusOnHandler, origin: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subscriptionArgsInvalid")(event.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
