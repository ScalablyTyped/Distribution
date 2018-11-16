package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", JSImport.Namespace)
@js.native
object firebaseModMembers extends js.Object {
  var SDK_VERSION: java.lang.String = js.native
  var apps: coreDashJsLib.Array[firebaseLib.firebaseMod.firebaseNs.appNs.App] = js.native
  def app(): firebaseLib.firebaseMod.firebaseNs.appNs.App = js.native
  def app(name: java.lang.String): firebaseLib.firebaseMod.firebaseNs.appNs.App = js.native
  def auth(): firebaseLib.firebaseMod.firebaseNs.authNs.Auth = js.native
  def auth(app: firebaseLib.firebaseMod.firebaseNs.appNs.App): firebaseLib.firebaseMod.firebaseNs.authNs.Auth = js.native
  def database(): firebaseLib.firebaseMod.firebaseNs.databaseNs.Database = js.native
  def database(app: firebaseLib.firebaseMod.firebaseNs.appNs.App): firebaseLib.firebaseMod.firebaseNs.databaseNs.Database = js.native
  def firestore(): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Firestore = js.native
  def firestore(app: firebaseLib.firebaseMod.firebaseNs.appNs.App): firebaseLib.firebaseMod.firebaseNs.firestoreNs.Firestore = js.native
  def functions(): firebaseLib.firebaseMod.firebaseNs.functionsNs.Functions = js.native
  def functions(app: firebaseLib.firebaseMod.firebaseNs.appNs.App): firebaseLib.firebaseMod.firebaseNs.functionsNs.Functions = js.native
  def initializeApp(options: js.Object): firebaseLib.firebaseMod.firebaseNs.appNs.App = js.native
  def initializeApp(options: js.Object, name: java.lang.String): firebaseLib.firebaseMod.firebaseNs.appNs.App = js.native
  def messaging(): firebaseLib.firebaseMod.firebaseNs.messagingNs.Messaging = js.native
  def messaging(app: firebaseLib.firebaseMod.firebaseNs.appNs.App): firebaseLib.firebaseMod.firebaseNs.messagingNs.Messaging = js.native
  def storage(): firebaseLib.firebaseMod.firebaseNs.storageNs.Storage = js.native
  def storage(app: firebaseLib.firebaseMod.firebaseNs.appNs.App): firebaseLib.firebaseMod.firebaseNs.storageNs.Storage = js.native
}

