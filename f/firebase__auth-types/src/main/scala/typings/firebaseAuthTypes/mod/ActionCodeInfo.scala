package typings.firebaseAuthTypes.mod

import typings.firebaseAuthTypes.anon.EMAILSIGNIN
import typings.firebaseAuthTypes.anon.Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "ActionCodeInfo")
@js.native
class ActionCodeInfo protected () extends js.Object {
  var data: Email = js.native
  var operation: String = js.native
}

/* static members */
@JSImport("@firebase/auth-types", "ActionCodeInfo")
@js.native
object ActionCodeInfo extends js.Object {
  var Operation: EMAILSIGNIN = js.native
}

