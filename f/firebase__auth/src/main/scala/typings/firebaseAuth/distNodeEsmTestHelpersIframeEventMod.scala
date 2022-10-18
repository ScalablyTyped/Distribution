package typings.firebaseAuth

import typings.firebaseAuth.anon.PartialAuthEventPostBody
import typings.firebaseAuth.distNodeEsmSrcModelPopupRedirectMod.AuthEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmTestHelpersIframeEventMod {
  
  @JSImport("@firebase/auth/dist/node-esm/test/helpers/iframe_event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/node-esm/test/helpers/iframe_event", "BASE_AUTH_EVENT")
  @js.native
  val BASE_AUTH_EVENT: AuthEvent = js.native
  
  inline def authEvent(): AuthEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("authEvent")().asInstanceOf[AuthEvent]
  inline def authEvent(event: PartialAuthEventPostBody): AuthEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("authEvent")(event.asInstanceOf[js.Any]).asInstanceOf[AuthEvent]
}
