package typings.firebaseDatabaseTypes.mod

import typings.firebaseAppTypes.mod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database-types", "FirebaseDatabase")
@js.native
class FirebaseDatabase protected () extends js.Object {
  var app: FirebaseApp = js.native
  def goOffline(): Unit = js.native
  def goOnline(): Unit = js.native
  def ref(): Reference = js.native
  def ref(path: String): Reference = js.native
  def ref(path: Reference): Reference = js.native
  def refFromURL(url: String): Reference = js.native
}

