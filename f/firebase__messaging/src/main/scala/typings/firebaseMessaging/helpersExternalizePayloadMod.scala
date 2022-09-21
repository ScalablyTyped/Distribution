package typings.firebaseMessaging

import typings.firebaseMessaging.interfacesInternalMessagePayloadMod.MessagePayloadInternal
import typings.firebaseMessaging.interfacesPublicTypesMod.MessagePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersExternalizePayloadMod {
  
  @JSImport("@firebase/messaging/dist/src/helpers/externalizePayload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def externalizePayload(internalPayload: MessagePayloadInternal): MessagePayload = ^.asInstanceOf[js.Dynamic].applyDynamic("externalizePayload")(internalPayload.asInstanceOf[js.Any]).asInstanceOf[MessagePayload]
}
