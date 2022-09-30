package typings.glaze

import typings.glaze.styleInjectorMod.StyleInjector
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ruleManagerMod {
  
  @JSImport("glaze/dist-types/RuleManager", "NullRuleManager")
  @js.native
  open class NullRuleManager ()
    extends StObject
       with RuleManager {
    
    def decreaseUsage(): Unit = js.native
    /* CompleteClass */
    override def decreaseUsage(
      className: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassRef */ Any,
      byAmount: Double
    ): Unit = js.native
    
    def increaseUsage(): Unit = js.native
    /* CompleteClass */
    override def increaseUsage(
      className: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassRef */ Any,
      cssText: js.Function0[String]
    ): Unit = js.native
  }
  
  @JSImport("glaze/dist-types/RuleManager", "OptimizedRuleManager")
  @js.native
  open class OptimizedRuleManager protected ()
    extends StObject
       with RuleManager {
    def this(
      injector: StyleInjector,
      initialRuleIndexesByClassName: Map[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassRef */ Any, 
            Double
          ]
    ) = this()
    
    /* CompleteClass */
    override def decreaseUsage(
      className: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassRef */ Any,
      byAmount: Double
    ): Unit = js.native
    
    /* CompleteClass */
    override def increaseUsage(
      className: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassRef */ Any,
      cssText: js.Function0[String]
    ): Unit = js.native
    
    /* private */ var injector: Any = js.native
    
    /* private */ var ruleIndexesByClassName: Any = js.native
    
    /* private */ var usageCountsByClassName: Any = js.native
  }
  
  trait RuleManager extends StObject {
    
    def decreaseUsage(
      className: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassRef */ Any,
      byAmount: Double
    ): Unit
    
    def increaseUsage(
      className: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassRef */ Any,
      cssText: js.Function0[String]
    ): Unit
  }
  object RuleManager {
    
    inline def apply(
      decreaseUsage: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassRef */ Any, Double) => Unit,
      increaseUsage: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassRef */ Any, js.Function0[String]) => Unit
    ): RuleManager = {
      val __obj = js.Dynamic.literal(decreaseUsage = js.Any.fromFunction2(decreaseUsage), increaseUsage = js.Any.fromFunction2(increaseUsage))
      __obj.asInstanceOf[RuleManager]
    }
    
    extension [Self <: RuleManager](x: Self) {
      
      inline def setDecreaseUsage(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassRef */ Any, Double) => Unit
      ): Self = StObject.set(x, "decreaseUsage", js.Any.fromFunction2(value))
      
      inline def setIncreaseUsage(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassRef */ Any, js.Function0[String]) => Unit
      ): Self = StObject.set(x, "increaseUsage", js.Any.fromFunction2(value))
    }
  }
}
