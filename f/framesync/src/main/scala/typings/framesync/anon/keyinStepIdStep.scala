package typings.framesync.anon

import typings.framesync.typesMod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Step} */
@js.native
trait keyinStepIdStep extends js.Object {
  
  var postRender: Step = js.native
  
  var preRender: Step = js.native
  
  var read: Step = js.native
  
  var render: Step = js.native
  
  var update: Step = js.native
}
object keyinStepIdStep {
  
  @scala.inline
  def apply(postRender: Step, preRender: Step, read: Step, render: Step, update: Step): keyinStepIdStep = {
    val __obj = js.Dynamic.literal(postRender = postRender.asInstanceOf[js.Any], preRender = preRender.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinStepIdStep]
  }
  
  @scala.inline
  implicit class keyinStepIdStepOps[Self <: keyinStepIdStep] (val x: Self) extends AnyVal {
    
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
    def setPostRender(value: Step): Self = this.set("postRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreRender(value: Step): Self = this.set("preRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: Step): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: Step): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: Step): Self = this.set("update", value.asInstanceOf[js.Any])
  }
}
