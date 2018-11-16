package typings
package execaLib.execaMod.execaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecaChildPromise extends js.Object {
  def `catch`[TResult](): stdLib.Promise[ExecaReturns | TResult] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ ExecaError, TResult | stdLib.PromiseLike[TResult]]): stdLib.Promise[ExecaReturns | TResult] = js.native
}

