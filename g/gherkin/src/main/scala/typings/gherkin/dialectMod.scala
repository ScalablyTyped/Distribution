package typings.gherkin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialectMod {
  
  trait Dialect extends StObject {
    
    var and: js.Array[String]
    
    var background: js.Array[String]
    
    var but: js.Array[String]
    
    var examples: js.Array[String]
    
    var feature: js.Array[String]
    
    var `given`: js.Array[String]
    
    var name: String
    
    var native: String
    
    var rule: js.Array[String]
    
    var scenario: js.Array[String]
    
    var scenarioOutline: js.Array[String]
    
    var `then`: js.Array[String]
    
    var when: js.Array[String]
  }
  object Dialect {
    
    inline def apply(
      and: js.Array[String],
      background: js.Array[String],
      but: js.Array[String],
      examples: js.Array[String],
      feature: js.Array[String],
      `given`: js.Array[String],
      name: String,
      native: String,
      rule: js.Array[String],
      scenario: js.Array[String],
      scenarioOutline: js.Array[String],
      `then`: js.Array[String],
      when: js.Array[String]
    ): Dialect = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], but = but.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], scenarioOutline = scenarioOutline.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.updateDynamic("given")(`given`.asInstanceOf[js.Any])
      __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dialect]
    }
    
    extension [Self <: Dialect](x: Self) {
      
      inline def setAnd(value: js.Array[String]): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      inline def setAndVarargs(value: String*): Self = StObject.set(x, "and", js.Array(value :_*))
      
      inline def setBackground(value: js.Array[String]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundVarargs(value: String*): Self = StObject.set(x, "background", js.Array(value :_*))
      
      inline def setBut(value: js.Array[String]): Self = StObject.set(x, "but", value.asInstanceOf[js.Any])
      
      inline def setButVarargs(value: String*): Self = StObject.set(x, "but", js.Array(value :_*))
      
      inline def setExamples(value: js.Array[String]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      inline def setExamplesVarargs(value: String*): Self = StObject.set(x, "examples", js.Array(value :_*))
      
      inline def setFeature(value: js.Array[String]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setFeatureVarargs(value: String*): Self = StObject.set(x, "feature", js.Array(value :_*))
      
      inline def setGiven(value: js.Array[String]): Self = StObject.set(x, "given", value.asInstanceOf[js.Any])
      
      inline def setGivenVarargs(value: String*): Self = StObject.set(x, "given", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNative(value: String): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setRule(value: js.Array[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleVarargs(value: String*): Self = StObject.set(x, "rule", js.Array(value :_*))
      
      inline def setScenario(value: js.Array[String]): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
      
      inline def setScenarioOutline(value: js.Array[String]): Self = StObject.set(x, "scenarioOutline", value.asInstanceOf[js.Any])
      
      inline def setScenarioOutlineVarargs(value: String*): Self = StObject.set(x, "scenarioOutline", js.Array(value :_*))
      
      inline def setScenarioVarargs(value: String*): Self = StObject.set(x, "scenario", js.Array(value :_*))
      
      inline def setThen(value: js.Array[String]): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      inline def setThenVarargs(value: String*): Self = StObject.set(x, "then", js.Array(value :_*))
      
      inline def setWhen(value: js.Array[String]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenVarargs(value: String*): Self = StObject.set(x, "when", js.Array(value :_*))
    }
  }
}
