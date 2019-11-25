package typings.atEntriaRelayDashExperimental

import typings.atEntriaRelayDashExperimental.libQueryResourceMod.FetchPolicy
import typings.atEntriaRelayDashExperimental.libQueryResourceMod.RenderPolicy
import typings.atEntriaRelayDashExperimental.libUseRefetchableFragmentNodeMod.Action
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends Action {
  var environment: Environment
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* args */ Error | Null, Unit]] = js.undefined
  var refetchVariables: Variables
  var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
  var `type`: String
}

object Anon_Args {
  @scala.inline
  def apply(
    environment: Environment,
    refetchVariables: Variables,
    `type`: String,
    fetchPolicy: FetchPolicy = null,
    onComplete: /* args */ Error | Null => Unit = null,
    renderPolicy: RenderPolicy = null
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (renderPolicy != null) __obj.updateDynamic("renderPolicy")(renderPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Args]
  }
}

