package typings.atFirebaseDatabase.atFirebaseDatabaseMod

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def enableLogging(): Unit = js.native
  def enableLogging(logger_ : js.Function1[/* a */ String, Unit]): Unit = js.native
  def enableLogging(logger_ : js.Function1[/* a */ String, Unit], persistent: Boolean): Unit = js.native
  def enableLogging(logger_ : Boolean): Unit = js.native
  def enableLogging(logger_ : Boolean, persistent: Boolean): Unit = js.native
  def registerDatabase(instance: FirebaseNamespace): Unit = js.native
}

