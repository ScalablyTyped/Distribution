package typings.firebaseAuthTypes.mod.firebaseAppTypesAugmentingMod

import typings.firebaseAuthTypes.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseNamespace extends js.Object {
  var auth: js.UndefOr[Call] = js.undefined
}

object FirebaseNamespace {
  @scala.inline
  def apply(auth: Call = null): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseNamespace]
  }
}

