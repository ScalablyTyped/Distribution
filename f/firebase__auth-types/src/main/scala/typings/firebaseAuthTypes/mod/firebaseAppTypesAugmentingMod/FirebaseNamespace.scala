package typings.firebaseAuthTypes.mod.firebaseAppTypesAugmentingMod

import typings.firebaseAuthTypes.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseNamespace extends js.Object {
  var auth: js.UndefOr[Call] = js.native
}

object FirebaseNamespace {
  @scala.inline
  def apply(): FirebaseNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirebaseNamespace]
  }
  @scala.inline
  implicit class FirebaseNamespaceOps[Self <: FirebaseNamespace] (val x: Self) extends AnyVal {
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
    def setAuth(value: Call): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
  }
  
}

