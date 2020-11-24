package typings.glaze.styleInjectorMod

import typings.glaze.ruleManagerMod.RuleManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleInjector extends js.Object {
  
  def addRule(cssText: String): Double = js.native
  
  def nullifyRule(index: Double): Unit = js.native
  
  var ruleManager: RuleManager = js.native
}
object StyleInjector {
  
  @scala.inline
  def apply(addRule: String => Double, nullifyRule: Double => Unit, ruleManager: RuleManager): StyleInjector = {
    val __obj = js.Dynamic.literal(addRule = js.Any.fromFunction1(addRule), nullifyRule = js.Any.fromFunction1(nullifyRule), ruleManager = ruleManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleInjector]
  }
  
  @scala.inline
  implicit class StyleInjectorOps[Self <: StyleInjector] (val x: Self) extends AnyVal {
    
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
    def setAddRule(value: String => Double): Self = this.set("addRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNullifyRule(value: Double => Unit): Self = this.set("nullifyRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRuleManager(value: RuleManager): Self = this.set("ruleManager", value.asInstanceOf[js.Any])
  }
}
