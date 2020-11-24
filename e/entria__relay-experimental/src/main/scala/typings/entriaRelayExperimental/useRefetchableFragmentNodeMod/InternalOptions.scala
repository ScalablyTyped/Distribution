package typings.entriaRelayExperimental.useRefetchableFragmentNodeMod

import typings.entriaRelayExperimental.queryResourceMod.RenderPolicy
import typings.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalOptions extends Options {
  
  var __environment: js.UndefOr[Environment] = js.native
  
  var renderPolicy: js.UndefOr[RenderPolicy] = js.native
}
object InternalOptions {
  
  @scala.inline
  def apply(): InternalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalOptions]
  }
  
  @scala.inline
  implicit class InternalOptionsOps[Self <: InternalOptions] (val x: Self) extends AnyVal {
    
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
    def set__environment(value: Environment): Self = this.set("__environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__environment: Self = this.set("__environment", js.undefined)
    
    @scala.inline
    def setRenderPolicy(value: RenderPolicy): Self = this.set("renderPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderPolicy: Self = this.set("renderPolicy", js.undefined)
  }
}
