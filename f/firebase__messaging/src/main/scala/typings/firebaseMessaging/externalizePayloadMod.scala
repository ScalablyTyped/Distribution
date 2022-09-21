package typings.firebaseMessaging

import typings.firebaseMessaging.internalMessagePayloadMod.MessagePayloadInternal
import typings.firebaseMessaging.publicTypesMod.MessagePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalizePayloadMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/helpers/externalizePayload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def externalizePayload(internalPayload: MessagePayloadInternal): MessagePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("externalizePayload")(internalPayload.asInstanceOf[js.Any]).asInstanceOf[MessagePayload]
}
