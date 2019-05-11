package typings
package googleDashGaxLib.buildSrcApiCallableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/apiCallable", "NormalApiCaller")
@js.native
class NormalApiCaller () extends js.Object {
  def call(apiCall: APICall, argument: js.Object, settings: js.Object, canceller: PromiseCanceller[_]): scala.Unit = js.native
  def fail(canceller: PromiseCanceller[_], err: googleDashGaxLib.buildSrcGoogleErrorMod.GoogleError): scala.Unit = js.native
  def init(settings: NormalApiCallerSettings, callback: APICallback): PromiseCanceller[_] | Canceller = js.native
  def result(canceller: PromiseCanceller[_]): js.UndefOr[CancellablePromise[_]] = js.native
  def wrap(func: js.Function): js.Function = js.native
}

