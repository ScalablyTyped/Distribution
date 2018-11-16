package typings
package atFirebaseUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/jwt", JSImport.Namespace)
@js.native
object distSrcJwtMod extends js.Object {
  val decode: js.Function1[/* token */ js.Any, atFirebaseUtilLib.Anon_Data] = js.native
  val isAdmin: js.Function1[/* token */ js.Any, scala.Boolean] = js.native
  val isValidFormat: js.Function1[/* token */ js.Any, scala.Boolean] = js.native
  val isValidTimestamp: js.Function1[/* token */ js.Any, scala.Boolean] = js.native
  val issuedAtTime: js.Function1[/* token */ js.Any, js.Any] = js.native
}

