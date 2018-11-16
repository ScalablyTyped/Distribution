package typings
package atFirebaseDatabaseDashTypesLib.databaseDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database-types", "FirebaseDatabase")
@js.native
class FirebaseDatabase protected () extends js.Object {
  var app: atFirebaseAppDashTypesLib.appDashTypesMod.FirebaseApp = js.native
  def goOffline(): scala.Unit = js.native
  def goOnline(): scala.Unit = js.native
  def ref(): Reference = js.native
  def ref(path: Reference): Reference = js.native
  def ref(path: java.lang.String): Reference = js.native
  def refFromURL(url: java.lang.String): Reference = js.native
}

