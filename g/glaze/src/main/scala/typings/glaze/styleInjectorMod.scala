package typings.glaze

import typings.glaze.ruleManagerMod.RuleManager
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleInjectorMod {
  
  @JSImport("glaze/dist-types/StyleInjector", "DebuggableStyleInjector")
  @js.native
  class DebuggableStyleInjector () extends StyleInjector {
    
    var freeIndexes: js.Any = js.native
    
    var nodes: js.Any = js.native
    
    def replaceRule(index: Double, cssText: String): Double = js.native
    
    var styleEl: js.Any = js.native
  }
  
  @JSImport("glaze/dist-types/StyleInjector", "NullStyleInjector")
  @js.native
  class NullStyleInjector () extends StyleInjector {
    
    def addRule(): Double = js.native
    
    def nullifyRule(): Unit = js.native
  }
  
  @JSImport("glaze/dist-types/StyleInjector", "OptimizedStyleInjector")
  @js.native
  class OptimizedStyleInjector () extends StyleInjector {
    
    var freeIndexes: js.Any = js.native
    
    def replaceRule(index: Double, cssText: String): Double = js.native
    
    var ruleCount: js.Any = js.native
    
    var sheet: js.Any = js.native
  }
  
  @JSImport("glaze/dist-types/StyleInjector", "VirtualStyleInjector")
  @js.native
  class VirtualStyleInjector () extends StyleInjector {
    
    var cssTexts: js.Any = js.native
    
    def getStyleElement(): Element = js.native
    
    def nullifyRule(): Unit = js.native
  }
  
  @js.native
  trait StyleInjector extends StObject {
    
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
    implicit class StyleInjectorMutableBuilder[Self <: StyleInjector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddRule(value: String => Double): Self = StObject.set(x, "addRule", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNullifyRule(value: Double => Unit): Self = StObject.set(x, "nullifyRule", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRuleManager(value: RuleManager): Self = StObject.set(x, "ruleManager", value.asInstanceOf[js.Any])
    }
  }
}
