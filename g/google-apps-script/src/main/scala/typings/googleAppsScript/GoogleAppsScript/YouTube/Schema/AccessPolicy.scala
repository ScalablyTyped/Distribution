package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPolicy extends js.Object {
  var allowed: js.UndefOr[Boolean] = js.native
  var exception: js.UndefOr[js.Array[String]] = js.native
}

object AccessPolicy {
  @scala.inline
  def apply(): AccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPolicy]
  }
  @scala.inline
  implicit class AccessPolicyOps[Self <: AccessPolicy] (val x: Self) extends AnyVal {
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
    def setAllowed(value: Boolean): Self = this.set("allowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowed: Self = this.set("allowed", js.undefined)
    @scala.inline
    def setExceptionVarargs(value: String*): Self = this.set("exception", js.Array(value :_*))
    @scala.inline
    def setException(value: js.Array[String]): Self = this.set("exception", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteException: Self = this.set("exception", js.undefined)
  }
  
}

