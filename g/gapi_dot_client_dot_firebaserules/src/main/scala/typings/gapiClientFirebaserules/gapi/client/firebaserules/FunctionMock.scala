package typings.gapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionMock extends js.Object {
  /**
    * The list of `Arg` values to match. The order in which the arguments are
    * provided is the order in which they must appear in the function
    * invocation.
    */
  var args: js.UndefOr[js.Array[Arg]] = js.native
  /**
    * The name of the function.
    *
    * The function name must match one provided by a service declaration.
    */
  var function: js.UndefOr[String] = js.native
  /** The mock result of the function call. */
  var result: js.UndefOr[Result] = js.native
}

object FunctionMock {
  @scala.inline
  def apply(): FunctionMock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionMock]
  }
  @scala.inline
  implicit class FunctionMockOps[Self <: FunctionMock] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: Arg*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[Arg]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setFunction(value: String): Self = this.set("function", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    @scala.inline
    def setResult(value: Result): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

