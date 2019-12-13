package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeFunctionOptions extends js.Object {
  var abi: js.UndefOr[NativeABI] = js.undefined
  var exceptions: js.UndefOr[ExceptionsBehavior] = js.undefined
  var scheduling: js.UndefOr[SchedulingBehavior] = js.undefined
  var traps: js.UndefOr[CodeTraps] = js.undefined
}

object NativeFunctionOptions {
  @scala.inline
  def apply(
    abi: NativeABI = null,
    exceptions: ExceptionsBehavior = null,
    scheduling: SchedulingBehavior = null,
    traps: CodeTraps = null
  ): NativeFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (abi != null) __obj.updateDynamic("abi")(abi.asInstanceOf[js.Any])
    if (exceptions != null) __obj.updateDynamic("exceptions")(exceptions.asInstanceOf[js.Any])
    if (scheduling != null) __obj.updateDynamic("scheduling")(scheduling.asInstanceOf[js.Any])
    if (traps != null) __obj.updateDynamic("traps")(traps.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeFunctionOptions]
  }
}

