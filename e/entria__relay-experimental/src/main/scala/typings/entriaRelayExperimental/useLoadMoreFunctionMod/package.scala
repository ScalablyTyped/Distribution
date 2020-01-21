package typings.entriaRelayExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useLoadMoreFunctionMod {
  type LoadMoreFn = js.Function2[
    /* count */ scala.Double, 
    /* options */ js.UndefOr[typings.entriaRelayExperimental.AnonArg], 
    typings.relayRuntime.relayRuntimeTypesMod.Disposable
  ]
}
