package typings.firebaseFunctions.mod

import typings.firebaseFunctions.AnonApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var functions: js.UndefOr[AnonApp] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(functions: AnonApp = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

