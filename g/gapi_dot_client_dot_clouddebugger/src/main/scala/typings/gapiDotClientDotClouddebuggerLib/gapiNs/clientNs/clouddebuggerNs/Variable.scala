package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  /** Members contained or pointed to by the variable. */
  var members: js.UndefOr[js.Array[Variable]] = js.undefined
  /** Name of the variable, if any. */
  var name: js.UndefOr[java.lang.String] = js.undefined
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
  var status: js.UndefOr[StatusMessage] = js.undefined
  /**
    * Variable type (e.g. `MyClass`). If the variable is split with
    * `var_table_index`, `type` goes next to `value`. The interpretation of
    * a type is agent specific. It is recommended to include the dynamic type
    * rather than a static type of an object.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Simple value of the variable. */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Reference to a variable in the shared variable table. More than
    * one variable can reference the same variable in the table. The
    * `var_table_index` field is an index into `variable_table` in Breakpoint.
    */
  var varTableIndex: js.UndefOr[scala.Double] = js.undefined
}

