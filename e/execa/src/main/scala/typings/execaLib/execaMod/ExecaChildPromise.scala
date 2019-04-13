package typings
package execaLib.execaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecaChildPromise extends js.Object {
  def `catch`[TResult](): js.Promise[ExecaReturns | TResult] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ ExecaError, TResult | js.Thenable[TResult]]): js.Promise[ExecaReturns | TResult] = js.native
}

