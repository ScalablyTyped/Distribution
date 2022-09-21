package typings.gherkin

import typings.cucumberMessages.idGeneratorMod.NewId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait And extends StObject {
    
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
  object And {
    
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
    ): And = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], but = but.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], scenarioOutline = scenarioOutline.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.updateDynamic("given")(`given`.asInstanceOf[js.Any])
      __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
      __obj.asInstanceOf[And]
    }
    
    extension [Self <: And](x: Self) {
      
      inline def setAnd(value: js.Array[String]): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      inline def setAndVarargs(value: String*): Self = StObject.set(x, "and", js.Array(value*))
      
      inline def setBackground(value: js.Array[String]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundVarargs(value: String*): Self = StObject.set(x, "background", js.Array(value*))
      
      inline def setBut(value: js.Array[String]): Self = StObject.set(x, "but", value.asInstanceOf[js.Any])
      
      inline def setButVarargs(value: String*): Self = StObject.set(x, "but", js.Array(value*))
      
      inline def setExamples(value: js.Array[String]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      inline def setExamplesVarargs(value: String*): Self = StObject.set(x, "examples", js.Array(value*))
      
      inline def setFeature(value: js.Array[String]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setFeatureVarargs(value: String*): Self = StObject.set(x, "feature", js.Array(value*))
      
      inline def setGiven(value: js.Array[String]): Self = StObject.set(x, "given", value.asInstanceOf[js.Any])
      
      inline def setGivenVarargs(value: String*): Self = StObject.set(x, "given", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNative(value: String): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setRule(value: js.Array[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleVarargs(value: String*): Self = StObject.set(x, "rule", js.Array(value*))
      
      inline def setScenario(value: js.Array[String]): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
      
      inline def setScenarioOutline(value: js.Array[String]): Self = StObject.set(x, "scenarioOutline", value.asInstanceOf[js.Any])
      
      inline def setScenarioOutlineVarargs(value: String*): Self = StObject.set(x, "scenarioOutline", js.Array(value*))
      
      inline def setScenarioVarargs(value: String*): Self = StObject.set(x, "scenario", js.Array(value*))
      
      inline def setThen(value: js.Array[String]): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
      
      inline def setThenVarargs(value: String*): Self = StObject.set(x, "then", js.Array(value*))
      
      inline def setWhen(value: js.Array[String]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenVarargs(value: String*): Self = StObject.set(x, "when", js.Array(value*))
    }
  }
  
  trait Column extends StObject {
    
    var column: Double
    
    var text: String
  }
  object Column {
    
    inline def apply(column: Double, text: String): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultDialect extends StObject {
    
    var defaultDialect: js.UndefOr[String] = js.undefined
    
    var includeGherkinDocument: js.UndefOr[Boolean] = js.undefined
    
    var includePickles: js.UndefOr[Boolean] = js.undefined
    
    var includeSource: js.UndefOr[Boolean] = js.undefined
    
    var newId: js.UndefOr[NewId] = js.undefined
  }
  object DefaultDialect {
    
    inline def apply(): DefaultDialect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultDialect]
    }
    
    extension [Self <: DefaultDialect](x: Self) {
      
      inline def setDefaultDialect(value: String): Self = StObject.set(x, "defaultDialect", value.asInstanceOf[js.Any])
      
      inline def setDefaultDialectUndefined: Self = StObject.set(x, "defaultDialect", js.undefined)
      
      inline def setIncludeGherkinDocument(value: Boolean): Self = StObject.set(x, "includeGherkinDocument", value.asInstanceOf[js.Any])
      
      inline def setIncludeGherkinDocumentUndefined: Self = StObject.set(x, "includeGherkinDocument", js.undefined)
      
      inline def setIncludePickles(value: Boolean): Self = StObject.set(x, "includePickles", value.asInstanceOf[js.Any])
      
      inline def setIncludePicklesUndefined: Self = StObject.set(x, "includePickles", js.undefined)
      
      inline def setIncludeSource(value: Boolean): Self = StObject.set(x, "includeSource", value.asInstanceOf[js.Any])
      
      inline def setIncludeSourceUndefined: Self = StObject.set(x, "includeSource", js.undefined)
      
      inline def setNewId(value: () => String): Self = StObject.set(x, "newId", js.Any.fromFunction0(value))
      
      inline def setNewIdUndefined: Self = StObject.set(x, "newId", js.undefined)
    }
  }
  
  trait Line extends StObject {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
  }
  object Line {
    
    inline def apply(): Line = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Line]
    }
    
    extension [Self <: Line](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    }
  }
}
