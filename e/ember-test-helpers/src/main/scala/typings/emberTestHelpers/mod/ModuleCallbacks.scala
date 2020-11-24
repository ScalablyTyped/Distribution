package typings.emberTestHelpers.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleCallbacks
  extends /* key */ StringDictionary[js.Any] {
  
  var afterTeardown: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.native
  
  var beforeSetup: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.native
  
  var integration: js.UndefOr[Boolean] = js.native
  
  var needs: js.UndefOr[js.Array[String]] = js.native
  
  var setup: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.native
  
  var teardown: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.native
  
  var unit: js.UndefOr[Boolean] = js.native
}
object ModuleCallbacks {
  
  @scala.inline
  def apply(): ModuleCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleCallbacks]
  }
  
  @scala.inline
  implicit class ModuleCallbacksOps[Self <: ModuleCallbacks] (val x: Self) extends AnyVal {
    
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
    def setAfterTeardown(value: /* assert */ js.UndefOr[js.Any] => Unit): Self = this.set("afterTeardown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterTeardown: Self = this.set("afterTeardown", js.undefined)
    
    @scala.inline
    def setBeforeSetup(value: /* assert */ js.UndefOr[js.Any] => Unit): Self = this.set("beforeSetup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeSetup: Self = this.set("beforeSetup", js.undefined)
    
    @scala.inline
    def setIntegration(value: Boolean): Self = this.set("integration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegration: Self = this.set("integration", js.undefined)
    
    @scala.inline
    def setNeedsVarargs(value: String*): Self = this.set("needs", js.Array(value :_*))
    
    @scala.inline
    def setNeeds(value: js.Array[String]): Self = this.set("needs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeeds: Self = this.set("needs", js.undefined)
    
    @scala.inline
    def setSetup(value: /* assert */ js.UndefOr[js.Any] => Unit): Self = this.set("setup", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    
    @scala.inline
    def setTeardown(value: /* assert */ js.UndefOr[js.Any] => Unit): Self = this.set("teardown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTeardown: Self = this.set("teardown", js.undefined)
    
    @scala.inline
    def setUnit(value: Boolean): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
