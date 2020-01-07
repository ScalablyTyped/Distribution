package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a stack frame context.
  */
@js.native
trait Schema$StackFrame extends js.Object {
  /**
    * Set of arguments passed to this function. Note that this might not be
    * populated for all stack frames.
    */
  var arguments: js.UndefOr[js.Array[Schema$Variable]] = js.native
  /**
    * Demangled function name at the call site.
    */
  var function: js.UndefOr[String] = js.native
  /**
    * Set of local variables at the stack frame location. Note that this might
    * not be populated for all stack frames.
    */
  var locals: js.UndefOr[js.Array[Schema$Variable]] = js.native
  /**
    * Source location of the call site.
    */
  var location: js.UndefOr[Schema$SourceLocation] = js.native
}

object Schema$StackFrame {
  @scala.inline
  def apply(
    arguments: js.Array[Schema$Variable] = null,
    function: String = null,
    locals: js.Array[Schema$Variable] = null,
    location: Schema$SourceLocation = null
  ): Schema$StackFrame = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StackFrame]
  }
}

