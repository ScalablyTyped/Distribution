package typings.glaze.ruleManagerMod

import typings.treat.typesMod.ClassRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleManager extends js.Object {
  
  def decreaseUsage(className: ClassRef, byAmount: Double): Unit = js.native
  
  def increaseUsage(className: ClassRef, cssText: js.Function0[String]): Unit = js.native
}
object RuleManager {
  
  @scala.inline
  def apply(decreaseUsage: (ClassRef, Double) => Unit, increaseUsage: (ClassRef, js.Function0[String]) => Unit): RuleManager = {
    val __obj = js.Dynamic.literal(decreaseUsage = js.Any.fromFunction2(decreaseUsage), increaseUsage = js.Any.fromFunction2(increaseUsage))
    __obj.asInstanceOf[RuleManager]
  }
  
  @scala.inline
  implicit class RuleManagerOps[Self <: RuleManager] (val x: Self) extends AnyVal {
    
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
    def setDecreaseUsage(value: (ClassRef, Double) => Unit): Self = this.set("decreaseUsage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIncreaseUsage(value: (ClassRef, js.Function0[String]) => Unit): Self = this.set("increaseUsage", js.Any.fromFunction2(value))
  }
}
