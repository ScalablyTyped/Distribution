package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a stack frame context.
  */
@js.native
trait SchemaStackFrame extends js.Object {
  /**
    * Set of arguments passed to this function. Note that this might not be
    * populated for all stack frames.
    */
  var arguments: js.UndefOr[js.Array[SchemaVariable]] = js.native
  /**
    * Demangled function name at the call site.
    */
  var function: js.UndefOr[String] = js.native
  /**
    * Set of local variables at the stack frame location. Note that this might
    * not be populated for all stack frames.
    */
  var locals: js.UndefOr[js.Array[SchemaVariable]] = js.native
  /**
    * Source location of the call site.
    */
  var location: js.UndefOr[SchemaSourceLocation] = js.native
}

object SchemaStackFrame {
  @scala.inline
  def apply(): SchemaStackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStackFrame]
  }
  @scala.inline
  implicit class SchemaStackFrameOps[Self <: SchemaStackFrame] (val x: Self) extends AnyVal {
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
    def setArgumentsVarargs(value: SchemaVariable*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[SchemaVariable]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    @scala.inline
    def setFunction(value: String): Self = this.set("function", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    @scala.inline
    def setLocalsVarargs(value: SchemaVariable*): Self = this.set("locals", js.Array(value :_*))
    @scala.inline
    def setLocals(value: js.Array[SchemaVariable]): Self = this.set("locals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocals: Self = this.set("locals", js.undefined)
    @scala.inline
    def setLocation(value: SchemaSourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

