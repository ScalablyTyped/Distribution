package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for listing debuggees.
  */
@js.native
trait SchemaListDebuggeesResponse extends js.Object {
  /**
    * List of debuggees accessible to the calling user. The fields
    * `debuggee.id` and `description` are guaranteed to be set. The
    * `description` field is a human readable field provided by agents and can
    * be displayed to users.
    */
  var debuggees: js.UndefOr[js.Array[SchemaDebuggee]] = js.native
}

object SchemaListDebuggeesResponse {
  @scala.inline
  def apply(): SchemaListDebuggeesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDebuggeesResponse]
  }
  @scala.inline
  implicit class SchemaListDebuggeesResponseOps[Self <: SchemaListDebuggeesResponse] (val x: Self) extends AnyVal {
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
    def setDebuggeesVarargs(value: SchemaDebuggee*): Self = this.set("debuggees", js.Array(value :_*))
    @scala.inline
    def setDebuggees(value: js.Array[SchemaDebuggee]): Self = this.set("debuggees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebuggees: Self = this.set("debuggees", js.undefined)
  }
  
}

