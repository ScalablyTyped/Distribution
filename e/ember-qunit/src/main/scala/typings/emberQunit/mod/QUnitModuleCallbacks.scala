package typings.emberQunit.mod

import typings.emberTestHelpers.mod.ModuleCallbacks
import typings.qunit.mod.global.Assert
import typings.qunit.mod.global.Hooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QUnitModuleCallbacks
  extends ModuleCallbacks
     with Hooks {
  
  @JSName("afterTeardown")
  var afterTeardown_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.native
  
  @JSName("beforeSetup")
  var beforeSetup_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.native
  
  @JSName("setup")
  var setup_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.native
  
  @JSName("teardown")
  var teardown_QUnitModuleCallbacks: js.UndefOr[js.Function1[/* assert */ Assert, Unit]] = js.native
}
object QUnitModuleCallbacks {
  
  @scala.inline
  def apply(): QUnitModuleCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QUnitModuleCallbacks]
  }
  
  @scala.inline
  implicit class QUnitModuleCallbacksOps[Self <: QUnitModuleCallbacks] (val x: Self) extends AnyVal {
    
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
    def setAfterTeardown(value: /* assert */ Assert => Unit): Self = this.set("afterTeardown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterTeardown: Self = this.set("afterTeardown", js.undefined)
    
    @scala.inline
    def setBeforeSetup(value: /* assert */ Assert => Unit): Self = this.set("beforeSetup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeSetup: Self = this.set("beforeSetup", js.undefined)
    
    @scala.inline
    def setSetup(value: /* assert */ Assert => Unit): Self = this.set("setup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    
    @scala.inline
    def setTeardown(value: /* assert */ Assert => Unit): Self = this.set("teardown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTeardown: Self = this.set("teardown", js.undefined)
  }
}
