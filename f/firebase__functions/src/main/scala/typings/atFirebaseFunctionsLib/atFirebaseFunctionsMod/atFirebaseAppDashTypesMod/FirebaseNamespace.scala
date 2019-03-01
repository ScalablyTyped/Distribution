package typings
package atFirebaseFunctionsLib.atFirebaseFunctionsMod.atFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var functions: js.UndefOr[atFirebaseFunctionsLib.Anon_App] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(functions: atFirebaseFunctionsLib.Anon_App = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions)
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

