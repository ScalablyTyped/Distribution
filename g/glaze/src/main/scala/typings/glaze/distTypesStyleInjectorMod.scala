package typings.glaze

import typings.glaze.distTypesRuleManagerMod.RuleManager
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStyleInjectorMod {
  
  @JSImport("glaze/dist-types/StyleInjector", "DebuggableStyleInjector")
  @js.native
  open class DebuggableStyleInjector ()
    extends StObject
       with StyleInjector {
    
    /* CompleteClass */
    override def addRule(cssText: String): Double = js.native
    
    /* private */ var freeIndexes: Any = js.native
    
    /* private */ var nodes: Any = js.native
    
    /* CompleteClass */
    override def nullifyRule(index: Double): Unit = js.native
    
    def replaceRule(index: Double, cssText: String): Double = js.native
    
    /* CompleteClass */
    var ruleManager: RuleManager = js.native
    
    /* private */ var styleEl: Any = js.native
  }
  
  @JSImport("glaze/dist-types/StyleInjector", "NullStyleInjector")
  @js.native
  open class NullStyleInjector ()
    extends StObject
       with StyleInjector {
    
    def addRule(): Double = js.native
    /* CompleteClass */
    override def addRule(cssText: String): Double = js.native
    
    def nullifyRule(): Unit = js.native
    /* CompleteClass */
    override def nullifyRule(index: Double): Unit = js.native
    
    /* CompleteClass */
    var ruleManager: RuleManager = js.native
  }
  
  @JSImport("glaze/dist-types/StyleInjector", "OptimizedStyleInjector")
  @js.native
  open class OptimizedStyleInjector ()
    extends StObject
       with StyleInjector {
    
    /* CompleteClass */
    override def addRule(cssText: String): Double = js.native
    
    /* private */ var freeIndexes: Any = js.native
    
    /* CompleteClass */
    override def nullifyRule(index: Double): Unit = js.native
    
    def replaceRule(index: Double, cssText: String): Double = js.native
    
    /* private */ var ruleCount: Any = js.native
    
    /* CompleteClass */
    var ruleManager: RuleManager = js.native
    
    /* private */ var sheet: Any = js.native
  }
  
  @JSImport("glaze/dist-types/StyleInjector", "VirtualStyleInjector")
  @js.native
  open class VirtualStyleInjector ()
    extends StObject
       with StyleInjector {
    
    /* CompleteClass */
    override def addRule(cssText: String): Double = js.native
    
    /* private */ var cssTexts: Any = js.native
    
    def getStyleElement(): Element = js.native
    
    def nullifyRule(): Unit = js.native
    /* CompleteClass */
    override def nullifyRule(index: Double): Unit = js.native
    
    /* CompleteClass */
    var ruleManager: RuleManager = js.native
  }
  
  trait StyleInjector extends StObject {
    
    def addRule(cssText: String): Double
    
    def nullifyRule(index: Double): Unit
    
    var ruleManager: RuleManager
  }
  object StyleInjector {
    
    inline def apply(addRule: String => Double, nullifyRule: Double => Unit, ruleManager: RuleManager): StyleInjector = {
      val __obj = js.Dynamic.literal(addRule = js.Any.fromFunction1(addRule), nullifyRule = js.Any.fromFunction1(nullifyRule), ruleManager = ruleManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleInjector]
    }
    
    extension [Self <: StyleInjector](x: Self) {
      
      inline def setAddRule(value: String => Double): Self = StObject.set(x, "addRule", js.Any.fromFunction1(value))
      
      inline def setNullifyRule(value: Double => Unit): Self = StObject.set(x, "nullifyRule", js.Any.fromFunction1(value))
      
      inline def setRuleManager(value: RuleManager): Self = StObject.set(x, "ruleManager", value.asInstanceOf[js.Any])
    }
  }
}
