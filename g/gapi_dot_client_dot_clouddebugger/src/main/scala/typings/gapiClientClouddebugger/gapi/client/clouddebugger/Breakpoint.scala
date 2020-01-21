package typings.gapiClientClouddebugger.gapi.client.clouddebugger

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breakpoint extends js.Object {
  /**
    * Action that the agent should perform when the code at the
    * breakpoint location is hit.
    */
  var action: js.UndefOr[String] = js.undefined
  /**
    * Condition that triggers the breakpoint.
    * The condition is a compound boolean expression composed using expressions
    * in a programming language at the source location.
    */
  var condition: js.UndefOr[String] = js.undefined
  /** Time this breakpoint was created by the server in seconds resolution. */
  var createTime: js.UndefOr[String] = js.undefined
  /**
    * Values of evaluated expressions at breakpoint time.
    * The evaluated expressions appear in exactly the same order they
    * are listed in the `expressions` field.
    * The `name` field holds the original expression text, the `value` or
    * `members` field holds the result of the evaluated expression.
    * If the expression cannot be evaluated, the `status` inside the `Variable`
    * will indicate an error and contain the error text.
    */
  var evaluatedExpressions: js.UndefOr[js.Array[Variable]] = js.undefined
  /**
    * List of read-only expressions to evaluate at the breakpoint location.
    * The expressions are composed using expressions in the programming language
    * at the source location. If the breakpoint action is `LOG`, the evaluated
    * expressions are included in log statements.
    */
  var expressions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Time this breakpoint was finalized as seen by the server in seconds
    * resolution.
    */
  var finalTime: js.UndefOr[String] = js.undefined
  /** Breakpoint identifier, unique in the scope of the debuggee. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * When true, indicates that this is a final result and the
    * breakpoint state will not change from here on.
    */
  var isFinalState: js.UndefOr[Boolean] = js.undefined
  /**
    * A set of custom breakpoint properties, populated by the agent, to be
    * displayed to the user.
    */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /** Breakpoint source location. */
  var location: js.UndefOr[SourceLocation] = js.undefined
  /** Indicates the severity of the log. Only relevant when action is `LOG`. */
  var logLevel: js.UndefOr[String] = js.undefined
  /**
    * Only relevant when action is `LOG`. Defines the message to log when
    * the breakpoint hits. The message may include parameter placeholders `$0`,
    * `$1`, etc. These placeholders are replaced with the evaluated value
    * of the appropriate expression. Expressions not referenced in
    * `log_message_format` are not logged.
    *
    * Example: `Message received, id = $0, count = $1` with
    * `expressions` = `[ message.id, message.count ]`.
    */
  var logMessageFormat: js.UndefOr[String] = js.undefined
  /** The stack at breakpoint time. */
  var stackFrames: js.UndefOr[js.Array[StackFrame]] = js.undefined
  /**
    * Breakpoint status.
    *
    * The status includes an error flag and a human readable message.
    * This field is usually unset. The message can be either
    * informational or an error message. Regardless, clients should always
    * display the text message back to the user.
    *
    * Error status indicates complete failure of the breakpoint.
    *
    * Example (non-final state): `Still loading symbols...`
    *
    * Examples (final state):
    *
    * &#42;   `Invalid line number` referring to location
    * &#42;   `Field f not found in class C` referring to condition
    */
  var status: js.UndefOr[StatusMessage] = js.undefined
  /** E-mail address of the user that created this breakpoint */
  var userEmail: js.UndefOr[String] = js.undefined
  /**
    * The `variable_table` exists to aid with computation, memory and network
    * traffic optimization.  It enables storing a variable once and reference
    * it from multiple variables, including variables stored in the
    * `variable_table` itself.
    * For example, the same `this` object, which may appear at many levels of
    * the stack, can have all of its data stored once in this table.  The
    * stack frame variables then would hold only a reference to it.
    *
    * The variable `var_table_index` field is an index into this repeated field.
    * The stored objects are nameless and get their name from the referencing
    * variable. The effective variable is a merge of the referencing variable
    * and the referenced variable.
    */
  var variableTable: js.UndefOr[js.Array[Variable]] = js.undefined
}

object Breakpoint {
  @scala.inline
  def apply(
    action: String = null,
    condition: String = null,
    createTime: String = null,
    evaluatedExpressions: js.Array[Variable] = null,
    expressions: js.Array[String] = null,
    finalTime: String = null,
    id: String = null,
    isFinalState: js.UndefOr[Boolean] = js.undefined,
    labels: Record[String, String] = null,
    location: SourceLocation = null,
    logLevel: String = null,
    logMessageFormat: String = null,
    stackFrames: js.Array[StackFrame] = null,
    status: StatusMessage = null,
    userEmail: String = null,
    variableTable: js.Array[Variable] = null
  ): Breakpoint = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (evaluatedExpressions != null) __obj.updateDynamic("evaluatedExpressions")(evaluatedExpressions.asInstanceOf[js.Any])
    if (expressions != null) __obj.updateDynamic("expressions")(expressions.asInstanceOf[js.Any])
    if (finalTime != null) __obj.updateDynamic("finalTime")(finalTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isFinalState)) __obj.updateDynamic("isFinalState")(isFinalState.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logMessageFormat != null) __obj.updateDynamic("logMessageFormat")(logMessageFormat.asInstanceOf[js.Any])
    if (stackFrames != null) __obj.updateDynamic("stackFrames")(stackFrames.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (userEmail != null) __obj.updateDynamic("userEmail")(userEmail.asInstanceOf[js.Any])
    if (variableTable != null) __obj.updateDynamic("variableTable")(variableTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoint]
  }
}

