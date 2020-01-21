package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a variable or an argument possibly of a compound object type.
  * Note how the following variables are represented:  1) A simple variable:
  * int x = 5      { name: &quot;x&quot;, value: &quot;5&quot;, type:
  * &quot;int&quot; }  // Captured variable  2) A compound object:      struct
  * T {         int m1;         int m2;     };     T x = { 3, 7 };      {  //
  * Captured variable         name: &quot;x&quot;,         type: &quot;T&quot;,
  * members { name: &quot;m1&quot;, value: &quot;3&quot;, type: &quot;int&quot;
  * },         members { name: &quot;m2&quot;, value: &quot;7&quot;, type:
  * &quot;int&quot; }     }  3) A pointer where the pointee was captured: T x =
  * { 3, 7 };     T* p = &amp;x;      {   // Captured variable         name:
  * &quot;p&quot;,         type: &quot;T*&quot;,         value:
  * &quot;0x00500500&quot;,         members { name: &quot;m1&quot;, value:
  * &quot;3&quot;, type: &quot;int&quot; },         members { name:
  * &quot;m2&quot;, value: &quot;7&quot;, type: &quot;int&quot; }     }  4) A
  * pointer where the pointee was not captured:      T* p = new T;      {   //
  * Captured variable         name: &quot;p&quot;,         type:
  * &quot;T*&quot;,         value: &quot;0x00400400&quot;         status {
  * is_error: true, description { format: &quot;unavailable&quot; } }     } The
  * status should describe the reason for the missing value, such as
  * `&lt;optimized out&gt;`, `&lt;inaccessible&gt;`, `&lt;pointers limit
  * reached&gt;`.  Note that a null pointer should not have members.  5) An
  * unnamed value:      int* p = new int(7);      {   // Captured variable
  * name: &quot;p&quot;,         value: &quot;0x00500500&quot;,         type:
  * &quot;int*&quot;,         members { value: &quot;7&quot;, type:
  * &quot;int&quot; } }  6) An unnamed pointer where the pointee was not
  * captured:      int* p = new int(7);     int** pp = &amp;p;      {  //
  * Captured variable         name: &quot;pp&quot;,         value:
  * &quot;0x00500500&quot;,         type: &quot;int**&quot;,         members {
  * value: &quot;0x00400400&quot;,             type: &quot;int*&quot; status {
  * is_error: true,                 description: { format:
  * &quot;unavailable&quot; } }             }         }     }  To optimize
  * computation, memory and network traffic, variables that repeat in the
  * output multiple times can be stored once in a shared variable table and be
  * referenced using the `var_table_index` field.  The variables stored in the
  * shared table are nameless and are essentially a partition of the complete
  * variable. To reconstruct the complete variable, merge the referencing
  * variable with the referenced variable.  When using the shared variable
  * table, the following variables:      T x = { 3, 7 };     T* p = &amp;x;
  * T&amp; r = x;      { name: &quot;x&quot;, var_table_index: 3, type:
  * &quot;T&quot; }  // Captured variables     { name: &quot;p&quot;, value
  * &quot;0x00500500&quot;, type=&quot;T*&quot;, var_table_index: 3 }     {
  * name: &quot;r&quot;, type=&quot;T&amp;&quot;, var_table_index: 3 }      {
  * // Shared variable table entry #3:         members { name: &quot;m1&quot;,
  * value: &quot;3&quot;, type: &quot;int&quot; },         members { name:
  * &quot;m2&quot;, value: &quot;7&quot;, type: &quot;int&quot; }     }  Note
  * that the pointer address is stored with the referencing variable and not
  * with the referenced variable. This allows the referenced variable to be
  * shared between pointers and references.  The type field is optional. The
  * debugger agent may or may not support it.
  */
@js.native
trait SchemaVariable extends js.Object {
  /**
    * Members contained or pointed to by the variable.
    */
  var members: js.UndefOr[js.Array[SchemaVariable]] = js.native
  /**
    * Name of the variable, if any.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Status associated with the variable. This field will usually stay unset.
    * A status of a single variable only applies to that variable or
    * expression. The rest of breakpoint data still remains valid. Variables
    * might be reported in error state even when breakpoint is not in final
    * state.  The message may refer to variable name with `refers_to` set to
    * `VARIABLE_NAME`. Alternatively `refers_to` will be set to
    * `VARIABLE_VALUE`. In either case variable value and members will be
    * unset.  Example of error message applied to name: `Invalid expression
    * syntax`.  Example of information message applied to value: `Not
    * captured`.  Examples of error message applied to value:  *   `Malformed
    * string`, *   `Field f not found in class C` *   `Null pointer
    * dereference`
    */
  var status: js.UndefOr[SchemaStatusMessage] = js.native
  /**
    * Variable type (e.g. `MyClass`). If the variable is split with
    * `var_table_index`, `type` goes next to `value`. The interpretation of a
    * type is agent specific. It is recommended to include the dynamic type
    * rather than a static type of an object.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Simple value of the variable.
    */
  var value: js.UndefOr[String] = js.native
  /**
    * Reference to a variable in the shared variable table. More than one
    * variable can reference the same variable in the table. The
    * `var_table_index` field is an index into `variable_table` in Breakpoint.
    */
  var varTableIndex: js.UndefOr[Double] = js.native
}

object SchemaVariable {
  @scala.inline
  def apply(
    members: js.Array[SchemaVariable] = null,
    name: String = null,
    status: SchemaStatusMessage = null,
    `type`: String = null,
    value: String = null,
    varTableIndex: Int | Double = null
  ): SchemaVariable = {
    val __obj = js.Dynamic.literal()
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (varTableIndex != null) __obj.updateDynamic("varTableIndex")(varTableIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVariable]
  }
}

