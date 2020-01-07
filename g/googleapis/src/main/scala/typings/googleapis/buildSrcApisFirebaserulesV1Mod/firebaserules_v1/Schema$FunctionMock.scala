package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mock function definition.  Mocks must refer to a function declared by the
  * target service. The type of the function args and result will be inferred
  * at test time. If either the arg or result values are not compatible with
  * function type declaration, the request will be considered invalid.  More
  * than one `FunctionMock` may be provided for a given function name so long
  * as the `Arg` matchers are distinct. There may be only one function for a
  * given overload where all `Arg` values are `Arg.any_value`.
  */
@js.native
trait Schema$FunctionMock extends js.Object {
  /**
    * The list of `Arg` values to match. The order in which the arguments are
    * provided is the order in which they must appear in the function
    * invocation.
    */
  var args: js.UndefOr[js.Array[Schema$Arg]] = js.native
  /**
    * The name of the function.  The function name must match one provided by a
    * service declaration.
    */
  var function: js.UndefOr[String] = js.native
  /**
    * The mock result of the function call.
    */
  var result: js.UndefOr[Schema$Result] = js.native
}

object Schema$FunctionMock {
  @scala.inline
  def apply(args: js.Array[Schema$Arg] = null, function: String = null, result: Schema$Result = null): Schema$FunctionMock = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FunctionMock]
  }
}

