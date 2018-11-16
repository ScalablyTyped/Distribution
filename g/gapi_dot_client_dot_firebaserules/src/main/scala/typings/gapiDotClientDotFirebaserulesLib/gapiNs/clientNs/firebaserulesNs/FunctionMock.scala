package typings
package gapiDotClientDotFirebaserulesLib.gapiNs.clientNs.firebaserulesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FunctionMock extends js.Object {
  /**
               * The list of `Arg` values to match. The order in which the arguments are
               * provided is the order in which they must appear in the function
               * invocation.
               */
  var args: js.UndefOr[js.Array[Arg]] = js.undefined
  /**
               * The name of the function.
               *
               * The function name must match one provided by a service declaration.
               */
  var function: js.UndefOr[java.lang.String] = js.undefined
  /** The mock result of the function call. */
  var result: js.UndefOr[Result] = js.undefined
}

