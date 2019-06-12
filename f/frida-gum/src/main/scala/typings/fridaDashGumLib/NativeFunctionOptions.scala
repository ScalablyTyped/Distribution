package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeFunctionOptions extends js.Object {
  var abi: js.UndefOr[NativeABI] = js.undefined
  var exceptions: js.UndefOr[ExceptionsBehavior] = js.undefined
  var scheduling: js.UndefOr[SchedulingBehavior] = js.undefined
}

object NativeFunctionOptions {
  @scala.inline
  def apply(
    abi: NativeABI = null,
    exceptions: ExceptionsBehavior = null,
    scheduling: SchedulingBehavior = null
  ): NativeFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (abi != null) __obj.updateDynamic("abi")(abi)
    if (exceptions != null) __obj.updateDynamic("exceptions")(exceptions)
    if (scheduling != null) __obj.updateDynamic("scheduling")(scheduling)
    __obj.asInstanceOf[NativeFunctionOptions]
  }
}

