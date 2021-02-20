package typings.glaze

import typings.glaze.styleInjectorMod.StyleInjector
import typings.std.Map
import typings.treat.typesMod.ClassRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ruleManagerMod {
  
  @JSImport("glaze/dist-types/RuleManager", "NullRuleManager")
  @js.native
  class NullRuleManager () extends RuleManager {
    
    def decreaseUsage(): Unit = js.native
    
    def increaseUsage(): Unit = js.native
  }
  
  @JSImport("glaze/dist-types/RuleManager", "OptimizedRuleManager")
  @js.native
  class OptimizedRuleManager protected () extends RuleManager {
    def this(injector: StyleInjector, initialRuleIndexesByClassName: Map[ClassRef, Double]) = this()
    
    var injector: js.Any = js.native
    
    var ruleIndexesByClassName: js.Any = js.native
    
    var usageCountsByClassName: js.Any = js.native
  }
  
  @js.native
  trait RuleManager extends StObject {
    
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
    implicit class RuleManagerMutableBuilder[Self <: RuleManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecreaseUsage(value: (ClassRef, Double) => Unit): Self = StObject.set(x, "decreaseUsage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIncreaseUsage(value: (ClassRef, js.Function0[String]) => Unit): Self = StObject.set(x, "increaseUsage", js.Any.fromFunction2(value))
    }
  }
}
