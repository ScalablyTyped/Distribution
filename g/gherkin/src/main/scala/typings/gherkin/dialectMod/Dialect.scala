package typings.gherkin.dialectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dialect extends js.Object {
  
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
  implicit class DialectOps[Self <: Dialect] (val x: Self) extends AnyVal {
    
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
    def setAndVarargs(value: String*): Self = this.set("and", js.Array(value :_*))
    
    @scala.inline
    def setAnd(value: js.Array[String]): Self = this.set("and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundVarargs(value: String*): Self = this.set("background", js.Array(value :_*))
    
    @scala.inline
    def setBackground(value: js.Array[String]): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButVarargs(value: String*): Self = this.set("but", js.Array(value :_*))
    
    @scala.inline
    def setBut(value: js.Array[String]): Self = this.set("but", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExamplesVarargs(value: String*): Self = this.set("examples", js.Array(value :_*))
    
    @scala.inline
    def setExamples(value: js.Array[String]): Self = this.set("examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureVarargs(value: String*): Self = this.set("feature", js.Array(value :_*))
    
    @scala.inline
    def setFeature(value: js.Array[String]): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenVarargs(value: String*): Self = this.set("given", js.Array(value :_*))
    
    @scala.inline
    def setGiven(value: js.Array[String]): Self = this.set("given", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: String): Self = this.set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVarargs(value: String*): Self = this.set("rule", js.Array(value :_*))
    
    @scala.inline
    def setRule(value: js.Array[String]): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenarioVarargs(value: String*): Self = this.set("scenario", js.Array(value :_*))
    
    @scala.inline
    def setScenario(value: js.Array[String]): Self = this.set("scenario", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenarioOutlineVarargs(value: String*): Self = this.set("scenarioOutline", js.Array(value :_*))
    
    @scala.inline
    def setScenarioOutline(value: js.Array[String]): Self = this.set("scenarioOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThenVarargs(value: String*): Self = this.set("then", js.Array(value :_*))
    
    @scala.inline
    def setThen(value: js.Array[String]): Self = this.set("then", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenVarargs(value: String*): Self = this.set("when", js.Array(value :_*))
    
    @scala.inline
    def setWhen(value: js.Array[String]): Self = this.set("when", value.asInstanceOf[js.Any])
  }
}
