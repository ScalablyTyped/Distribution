package typings.firebaseMessaging

import typings.firebaseMessaging.internalMessagePayloadMod.MessagePayloadInternal
import typings.firebaseMessagingTypes.mod.MessagePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalizePayloadMod {
  
  @JSImport("@firebase/messaging/dist/helpers/externalizePayload", "externalizePayload")
  @js.native
  def externalizePayload(internalPayload: MessagePayloadInternal): MessagePayload = js.native
}
