package typings.firebaseAuthInteropTypes.mod.firebaseComponentAugmentingMod

import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var `auth-internal`: FirebaseAuthInternal
}

object NameServiceMapping {
  @scala.inline
  def apply(`auth-internal`: FirebaseAuthInternal): NameServiceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth-internal")(`auth-internal`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
}

