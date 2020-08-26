package typings.entriaRelayExperimental.anon

import typings.entriaRelayExperimental.queryResourceMod.RenderPolicy
import typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.Action
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchPolicy extends Action {
  var environment: typings.relayRuntime.relayStoreTypesMod.Environment = js.native
  var fetchPolicy: js.UndefOr[typings.entriaRelayExperimental.queryResourceMod.FetchPolicy] = js.native
  var onComplete: js.UndefOr[js.Function1[/* args */ Error | Null, Unit]] = js.native
  var refetchVariables: Variables = js.native
  var renderPolicy: js.UndefOr[RenderPolicy] = js.native
  var `type`: String = js.native
}

object FetchPolicy {
  @scala.inline
  def apply(
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    refetchVariables: Variables,
    `type`: String
  ): FetchPolicy = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchPolicy]
  }
  @scala.inline
  implicit class FetchPolicyOps[Self <: FetchPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnvironment(value: typings.relayRuntime.relayStoreTypesMod.Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefetchVariables(value: Variables): Self = this.set("refetchVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchPolicy(value: typings.entriaRelayExperimental.queryResourceMod.FetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchPolicy: Self = this.set("fetchPolicy", js.undefined)
    @scala.inline
    def setOnComplete(value: /* args */ Error | Null => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setRenderPolicy(value: RenderPolicy): Self = this.set("renderPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderPolicy: Self = this.set("renderPolicy", js.undefined)
  }
  
}

