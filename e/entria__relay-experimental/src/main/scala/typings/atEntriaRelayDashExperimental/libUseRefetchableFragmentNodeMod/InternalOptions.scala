package typings.atEntriaRelayDashExperimental.libUseRefetchableFragmentNodeMod

import typings.atEntriaRelayDashExperimental.libQueryResourceMod.FetchPolicy
import typings.atEntriaRelayDashExperimental.libQueryResourceMod.RenderPolicy
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalOptions extends Options {
  var __environment: js.UndefOr[Environment] = js.undefined
  var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
}

object InternalOptions {
  @scala.inline
  def apply(
    __environment: Environment = null,
    fetchPolicy: FetchPolicy = null,
    onComplete: /* arg */ Error | Null => Unit = null,
    renderPolicy: RenderPolicy = null
  ): InternalOptions = {
    val __obj = js.Dynamic.literal()
    if (__environment != null) __obj.updateDynamic("__environment")(__environment)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (renderPolicy != null) __obj.updateDynamic("renderPolicy")(renderPolicy)
    __obj.asInstanceOf[InternalOptions]
  }
}

