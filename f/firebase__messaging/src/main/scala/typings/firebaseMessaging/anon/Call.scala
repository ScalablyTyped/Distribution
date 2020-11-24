package typings.firebaseMessaging.anon

import typings.firebaseMessaging.mod.FirebaseApp
import typings.firebaseMessagingTypes.mod.FirebaseMessaging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(): FirebaseMessaging = js.native
  def apply(app: FirebaseApp): FirebaseMessaging = js.native
  
  def isSupported(): Boolean = js.native
}
