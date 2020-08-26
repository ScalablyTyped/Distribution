package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visibility extends js.Object {
  /**
    * A list of visibility rules that apply to individual API elements.
    *
    * &#42;&#42;NOTE:&#42;&#42; All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[VisibilityRule]] = js.native
}

object Visibility {
  @scala.inline
  def apply(): Visibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visibility]
  }
  @scala.inline
  implicit class VisibilityOps[Self <: Visibility] (val x: Self) extends AnyVal {
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
    def setRulesVarargs(value: VisibilityRule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[VisibilityRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

