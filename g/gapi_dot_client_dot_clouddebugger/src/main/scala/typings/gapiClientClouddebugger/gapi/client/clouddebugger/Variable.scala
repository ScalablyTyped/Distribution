package typings.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variable extends js.Object {
  /** Members contained or pointed to by the variable. */
  var members: js.UndefOr[js.Array[Variable]] = js.native
  /** Name of the variable, if any. */
  var name: js.UndefOr[String] = js.native
  /**
    * Status associated with the variable. This field will usually stay
    * unset. A status of a single variable only applies to that variable or
    * expression. The rest of breakpoint data still remains valid. Variables
    * might be reported in error state even when breakpoint is not in final
    * state.
    *
    * The message may refer to variable name with `refers_to` set to
    * `VARIABLE_NAME`. Alternatively `refers_to` will be set to `VARIABLE_VALUE`.
    * In either case variable value and members will be unset.
    *
    * Example of error message applied to name: `Invalid expression syntax`.
    *
    * Example of information message applied to value: `Not captured`.
    *
    * Examples of error message applied to value:
    *
    * &#42;   `Malformed string`,
    * &#42;   `Field f not found in class C`
    * &#42;   `Null pointer dereference`
    */
  var status: js.UndefOr[StatusMessage] = js.native
  /**
    * Variable type (e.g. `MyClass`). If the variable is split with
    * `var_table_index`, `type` goes next to `value`. The interpretation of
    * a type is agent specific. It is recommended to include the dynamic type
    * rather than a static type of an object.
    */
  var `type`: js.UndefOr[String] = js.native
  /** Simple value of the variable. */
  var value: js.UndefOr[String] = js.native
  /**
    * Reference to a variable in the shared variable table. More than
    * one variable can reference the same variable in the table. The
    * `var_table_index` field is an index into `variable_table` in Breakpoint.
    */
  var varTableIndex: js.UndefOr[Double] = js.native
}

object Variable {
  @scala.inline
  def apply(): Variable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variable]
  }
  @scala.inline
  implicit class VariableOps[Self <: Variable] (val x: Self) extends AnyVal {
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
    def setMembersVarargs(value: Variable*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[Variable]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: StatusMessage): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVarTableIndex(value: Double): Self = this.set("varTableIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVarTableIndex: Self = this.set("varTableIndex", js.undefined)
  }
  
}

