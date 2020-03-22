package typings.firebaseFunctions.mod

import typings.firebaseFunctions.AnonCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var functions: js.UndefOr[AnonCall] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(functions: AnonCall = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

