package typings.firebaseFunctions.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var authToken: js.UndefOr[String] = js.native
  var instanceIdToken: js.UndefOr[String] = js.native
}

object Context {
  @scala.inline
  def apply(): Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
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
    def setAuthToken(value: String): Self = this.set("authToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthToken: Self = this.set("authToken", js.undefined)
    @scala.inline
    def setInstanceIdToken(value: String): Self = this.set("instanceIdToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceIdToken: Self = this.set("instanceIdToken", js.undefined)
  }
  
}

