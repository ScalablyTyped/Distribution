package typings
package atFirebaseDatabaseLib.databaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database", JSImport.Namespace)
@js.native
object databaseModMembers extends js.Object {
  val ServerValue: atFirebaseDatabaseLib.Anon_TIMESTAMP = js.native
  val enableLogging: js.Function2[
    /* logger_ */ js.UndefOr[scala.Boolean | (js.Function1[/* a */ java.lang.String, scala.Unit])], 
    /* persistent */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ] = js.native
  def registerDatabase(instance: atFirebaseAppDashTypesLib.appDashTypesMod.FirebaseNamespace): scala.Unit = js.native
}

