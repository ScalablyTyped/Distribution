package typings.gherkin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialectMod {
  
  @js.native
  trait Dialect extends StObject {
    
    var and: js.Array[String] = js.native
    
    var background: js.Array[String] = js.native
    
    var but: js.Array[String] = js.native
    
    var examples: js.Array[String] = js.native
    
    var feature: js.Array[String] = js.native
    
    var given: js.Array[String] = js.native
    
    var name: String = js.native
    
    var native: String = js.native
    
    var rule: js.Array[String] = js.native
    
    var scenario: js.Array[String] = js.native
    
    var scenarioOutline: js.Array[String] = js.native
    
    var `then`: js.Array[String] = js.native
    
    var when: js.Array[String] = js.native
  }
  object Dialect {
    
    @scala.inline
    def apply(
      and: js.Array[String],
      background: js.Array[String],
      but: js.Array[String],
      examples: js.Array[String],
      feature: js.Array[String],
      given: js.Array[String],
      name: String,
      native: String,
      rule: js.Array[String],
      scenario: js.Array[String],
      scenarioOutline: js.Array[String],
      `then`: js.Array[String],
      when: js.Array[String]
    ): Dialect = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], but = but.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], given = given.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], scenarioOutline = scenarioOutline.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dialect]
    }
    
    @scala.inline
    implicit class DialectMutableBuilder[Self <: Dialect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnd(value: js.Array[String]): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndVarargs(value: String*): Self = StObject.set(x, "and", js.Array(value :_*))
      
      @scala.inline
      def setBackground(value: js.Array[String]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundVarargs(value: String*): Self = StObject.set(x, "background", js.Array(value :_*))
      
      @scala.inline
      def setBut(value: js.Array[String]): Self = StObject.set(x, "but", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButVarargs(value: String*): Self = StObject.set(x, "but", js.Array(value :_*))
      
      @scala.inline
      def setExamples(value: js.Array[String]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExamplesVarargs(value: String*): Self = StObject.set(x, "examples", js.Array(value :_*))
      
      @scala.inline
      def setFeature(value: js.Array[String]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureVarargs(value: String*): Self = StObject.set(x, "feature", js.Array(value :_*))
      
      @scala.inline
      def setGiven(value: js.Array[String]): Self = StObject.set(x, "given", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGivenVarargs(value: String*): Self = StObject.set(x, "given", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNative(value: String): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRule(value: js.Array[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleVarargs(value: String*): Self = StObject.set(x, "rule", js.Array(value :_*))
      
      @scala.inline
      def setScenario(value: js.Array[String]): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenarioOutline(value: js.Array[String]): Self = StObject.set(x, "scenarioOutline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenarioOutlineVarargs(value: String*): Self = StObject.set(x, "scenarioOutline", js.Array(value :_*))
      
      @scala.inline
      def setScenarioVarargs(value: String*): Self = StObject.set(x, "scenario", js.Array(value :_*))
      
      @scala.inline
      def setThen(value: js.Array[String]): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThenVarargs(value: String*): Self = StObject.set(x, "then", js.Array(value :_*))
      
      @scala.inline
      def setWhen(value: js.Array[String]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhenVarargs(value: String*): Self = StObject.set(x, "when", js.Array(value :_*))
    }
  }
}
