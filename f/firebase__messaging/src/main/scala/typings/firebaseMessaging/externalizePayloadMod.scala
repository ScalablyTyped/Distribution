package typings.firebaseMessaging

import typings.firebaseMessaging.internalMessagePayloadMod.MessagePayloadInternal
import typings.firebaseMessagingTypes.mod.MessagePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/messaging/dist/helpers/externalizePayload", JSImport.Namespace)
@js.native
object externalizePayloadMod extends js.Object {
  
  def externalizePayload(internalPayload: MessagePayloadInternal): MessagePayload = js.native
}
