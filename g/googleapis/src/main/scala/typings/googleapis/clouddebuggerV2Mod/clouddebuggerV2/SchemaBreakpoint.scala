package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the breakpoint specification, status and results.
  */
trait SchemaBreakpoint extends StObject {
  
  /**
    * Action that the agent should perform when the code at the breakpoint
    * location is hit.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * Condition that triggers the breakpoint. The condition is a compound
    * boolean expression composed using expressions in a programming language
    * at the source location.
    */
  var condition: js.UndefOr[String] = js.undefined
  
  /**
    * Time this breakpoint was created by the server in seconds resolution.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Values of evaluated expressions at breakpoint time. The evaluated
    * expressions appear in exactly the same order they are listed in the
    * `expressions` field. The `name` field holds the original expression text,
    * the `value` or `members` field holds the result of the evaluated
    * expression. If the expression cannot be evaluated, the `status` inside
    * the `Variable` will indicate an error and contain the error text.
    */
  var evaluatedExpressions: js.UndefOr[js.Array[SchemaVariable]] = js.undefined
  
  /**
    * List of read-only expressions to evaluate at the breakpoint location. The
    * expressions are composed using expressions in the programming language at
    * the source location. If the breakpoint action is `LOG`, the evaluated
    * expressions are included in log statements.
    */
  var expressions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Time this breakpoint was finalized as seen by the server in seconds
    * resolution.
    */
  var finalTime: js.UndefOr[String] = js.undefined
  
  /**
    * Breakpoint identifier, unique in the scope of the debuggee.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * When true, indicates that this is a final result and the breakpoint state
    * will not change from here on.
    */
  var isFinalState: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A set of custom breakpoint properties, populated by the agent, to be
    * displayed to the user.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Breakpoint source location.
    */
  var location: js.UndefOr[SchemaSourceLocation] = js.undefined
  
  /**
    * Indicates the severity of the log. Only relevant when action is `LOG`.
    */
  var logLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Only relevant when action is `LOG`. Defines the message to log when the
    * breakpoint hits. The message may include parameter placeholders `$0`,
    * `$1`, etc. These placeholders are replaced with the evaluated value of
    * the appropriate expression. Expressions not referenced in
    * `log_message_format` are not logged.  Example: `Message received, id =
    * $0, count = $1` with `expressions` = `[ message.id, message.count ]`.
    */
  var logMessageFormat: js.UndefOr[String] = js.undefined
  
  /**
    * The stack at breakpoint time, where stack_frames[0] represents the most
    * recently entered function.
    */
  var stackFrames: js.UndefOr[js.Array[SchemaStackFrame]] = js.undefined
  
  /**
    * Breakpoint status.  The status includes an error flag and a human
    * readable message. This field is usually unset. The message can be either
    * informational or an error message. Regardless, clients should always
    * display the text message back to the user.  Error status indicates
    * complete failure of the breakpoint.  Example (non-final state): `Still
    * loading symbols...`  Examples (final state):  *   `Invalid line number`
    * referring to location *   `Field f not found in class C` referring to
    * condition
    */
  var status: js.UndefOr[SchemaStatusMessage] = js.undefined
  
  /**
    * E-mail address of the user that created this breakpoint
    */
  var userEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The `variable_table` exists to aid with computation, memory and network
    * traffic optimization.  It enables storing a variable once and reference
    * it from multiple variables, including variables stored in the
    * `variable_table` itself. For example, the same `this` object, which may
    * appear at many levels of the stack, can have all of its data stored once
    * in this table.  The stack frame variables then would hold only a
    * reference to it.  The variable `var_table_index` field is an index into
    * this repeated field. The stored objects are nameless and get their name
    * from the referencing variable. The effective variable is a merge of the
    * referencing variable and the referenced variable.
    */
  var variableTable: js.UndefOr[js.Array[SchemaVariable]] = js.undefined
}
object SchemaBreakpoint {
  
  @scala.inline
  def apply(): SchemaBreakpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBreakpoint]
  }
  
  @scala.inline
  implicit class SchemaBreakpointMutableBuilder[Self <: SchemaBreakpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEvaluatedExpressions(value: js.Array[SchemaVariable]): Self = StObject.set(x, "evaluatedExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluatedExpressionsUndefined: Self = StObject.set(x, "evaluatedExpressions", js.undefined)
    
    @scala.inline
    def setEvaluatedExpressionsVarargs(value: SchemaVariable*): Self = StObject.set(x, "evaluatedExpressions", js.Array(value :_*))
    
    @scala.inline
    def setExpressions(value: js.Array[String]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    @scala.inline
    def setExpressionsVarargs(value: String*): Self = StObject.set(x, "expressions", js.Array(value :_*))
    
    @scala.inline
    def setFinalTime(value: String): Self = StObject.set(x, "finalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalTimeUndefined: Self = StObject.set(x, "finalTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsFinalState(value: Boolean): Self = StObject.set(x, "isFinalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFinalStateUndefined: Self = StObject.set(x, "isFinalState", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLocation(value: SchemaSourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setLogMessageFormat(value: String): Self = StObject.set(x, "logMessageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogMessageFormatUndefined: Self = StObject.set(x, "logMessageFormat", js.undefined)
    
    @scala.inline
    def setStackFrames(value: js.Array[SchemaStackFrame]): Self = StObject.set(x, "stackFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackFramesUndefined: Self = StObject.set(x, "stackFrames", js.undefined)
    
    @scala.inline
    def setStackFramesVarargs(value: SchemaStackFrame*): Self = StObject.set(x, "stackFrames", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: SchemaStatusMessage): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
    
    @scala.inline
    def setVariableTable(value: js.Array[SchemaVariable]): Self = StObject.set(x, "variableTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableTableUndefined: Self = StObject.set(x, "variableTable", js.undefined)
    
    @scala.inline
    def setVariableTableVarargs(value: SchemaVariable*): Self = StObject.set(x, "variableTable", js.Array(value :_*))
  }
}
