package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextRule extends js.Object {
  /** A list of full type names of provided contexts. */
  var provided: js.UndefOr[js.Array[String]] = js.native
  /** A list of full type names of requested contexts. */
  var requested: js.UndefOr[js.Array[String]] = js.native
  /**
    * Selects the methods to which this rule applies.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object ContextRule {
  @scala.inline
  def apply(): ContextRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextRule]
  }
  @scala.inline
  implicit class ContextRuleOps[Self <: ContextRule] (val x: Self) extends AnyVal {
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
    def setProvidedVarargs(value: String*): Self = this.set("provided", js.Array(value :_*))
    @scala.inline
    def setProvided(value: js.Array[String]): Self = this.set("provided", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvided: Self = this.set("provided", js.undefined)
    @scala.inline
    def setRequestedVarargs(value: String*): Self = this.set("requested", js.Array(value :_*))
    @scala.inline
    def setRequested(value: js.Array[String]): Self = this.set("requested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequested: Self = this.set("requested", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

