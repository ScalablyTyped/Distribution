package typings.framesync.typesMod

import typings.framesync.anon.keyinStepIdStep
import typings.framesync.anon.keyinStepIdprocessProcess
import typings.framesync.anon.keyinStepIdprocessProcessPostRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncApi extends js.Object {
  
  var cancelSync: keyinStepIdprocessProcessPostRender = js.native
  
  var steps: keyinStepIdStep = js.native
  
  var sync: keyinStepIdprocessProcess = js.native
}
object SyncApi {
  
  @scala.inline
  def apply(
    cancelSync: keyinStepIdprocessProcessPostRender,
    steps: keyinStepIdStep,
    sync: keyinStepIdprocessProcess
  ): SyncApi = {
    val __obj = js.Dynamic.literal(cancelSync = cancelSync.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncApi]
  }
  
  @scala.inline
  implicit class SyncApiOps[Self <: SyncApi] (val x: Self) extends AnyVal {
    
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
    def setCancelSync(value: keyinStepIdprocessProcessPostRender): Self = this.set("cancelSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: keyinStepIdStep): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSync(value: keyinStepIdprocessProcess): Self = this.set("sync", value.asInstanceOf[js.Any])
  }
}
