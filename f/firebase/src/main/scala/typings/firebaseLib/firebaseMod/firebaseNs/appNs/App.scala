package typings
package firebaseLib.firebaseMod.firebaseNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  var name: java.lang.String = js.native
  var options: coreDashJsLib.Object = js.native
  def auth(): firebaseLib.firebaseMod.firebaseNs.authNs.Auth = js.native
  def database(): firebaseLib.firebaseMod.firebaseNs.databaseNs.Database = js.native
  def database(url: java.lang.String): firebaseLib.firebaseMod.firebaseNs.databaseNs.Database = js.native
  def delete(): js.Promise[_] = js.native
  def firestore(): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Firestore = js.native
  def functions(): firebaseLib.firebaseMod.firebaseNs.functionsNs.Functions = js.native
  def functions(region: java.lang.String): firebaseLib.firebaseMod.firebaseNs.functionsNs.Functions = js.native
  def messaging(): firebaseLib.firebaseMod.firebaseNs.messagingNs.Messaging = js.native
  def storage(): firebaseLib.firebaseMod.firebaseNs.storageNs.Storage = js.native
  def storage(url: java.lang.String): firebaseLib.firebaseMod.firebaseNs.storageNs.Storage = js.native
}

