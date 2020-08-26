package typings.firebaseAuthInteropTypes.mod.firebaseComponentAugmentingMod

import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameServiceMapping extends js.Object {
  var `auth-internal`: FirebaseAuthInternal = js.native
}

object NameServiceMapping {
  @scala.inline
  def apply(`auth-internal`: FirebaseAuthInternal): NameServiceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth-internal")(`auth-internal`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
  @scala.inline
  implicit class NameServiceMappingOps[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAuth-internal`(value: FirebaseAuthInternal): Self = this.set("auth-internal", value.asInstanceOf[js.Any])
  }
  
}

