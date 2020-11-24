package typings.entriaRelayExperimental.useRefetchableFragmentNodeMod

import typings.entriaRelayExperimental.queryResourceMod.FetchPolicy
import typings.entriaRelayExperimental.queryResourceMod.RenderPolicy
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefetchState extends js.Object {
  
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.native
  
  var mirroredEnvironment: Environment = js.native
  
  var mirroredFragmentIdentifier: String = js.native
  
  var onComplete: js.UndefOr[js.Function1[/* arg */ Error | Null, Unit]] = js.native
  
  var refetchEnvironment: js.UndefOr[Environment | Null] = js.native
  
  var refetchVariables: js.UndefOr[Variables | Null] = js.native
  
  var renderPolicy: js.UndefOr[RenderPolicy] = js.native
}
object RefetchState {
  
  @scala.inline
  def apply(mirroredEnvironment: Environment, mirroredFragmentIdentifier: String): RefetchState = {
    val __obj = js.Dynamic.literal(mirroredEnvironment = mirroredEnvironment.asInstanceOf[js.Any], mirroredFragmentIdentifier = mirroredFragmentIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefetchState]
  }
  
  @scala.inline
  implicit class RefetchStateOps[Self <: RefetchState] (val x: Self) extends AnyVal {
    
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
    def setMirroredEnvironment(value: Environment): Self = this.set("mirroredEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirroredFragmentIdentifier(value: String): Self = this.set("mirroredFragmentIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchPolicy(value: FetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchPolicy: Self = this.set("fetchPolicy", js.undefined)
    
    @scala.inline
    def setOnComplete(value: /* arg */ Error | Null => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setRefetchEnvironment(value: Environment): Self = this.set("refetchEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefetchEnvironment: Self = this.set("refetchEnvironment", js.undefined)
    
    @scala.inline
    def setRefetchEnvironmentNull: Self = this.set("refetchEnvironment", null)
    
    @scala.inline
    def setRefetchVariables(value: Variables): Self = this.set("refetchVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefetchVariables: Self = this.set("refetchVariables", js.undefined)
    
    @scala.inline
    def setRefetchVariablesNull: Self = this.set("refetchVariables", null)
    
    @scala.inline
    def setRenderPolicy(value: RenderPolicy): Self = this.set("renderPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderPolicy: Self = this.set("renderPolicy", js.undefined)
  }
}
