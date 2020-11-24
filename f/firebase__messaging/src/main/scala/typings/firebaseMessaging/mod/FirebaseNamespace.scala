package typings.firebaseMessaging.mod

import typings.firebaseMessaging.anon.Call
import typings.firebaseMessagingTypes.mod.FirebaseMessaging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseNamespace extends js.Object {
  
  def messaging(): FirebaseMessaging = js.native
  def messaging(app: FirebaseApp): FirebaseMessaging = js.native
  @JSName("messaging")
  var messaging_Original: Call = js.native
}
