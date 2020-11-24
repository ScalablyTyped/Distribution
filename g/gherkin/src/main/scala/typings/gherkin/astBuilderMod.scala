package typings.gherkin

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITag
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import typings.cucumberMessages.idGeneratorMod.NewId
import typings.cucumberMessages.mod.messages.GherkinDocument
import typings.cucumberMessages.mod.messages.GherkinDocument.Feature
import typings.cucumberMessages.mod.messages.GherkinDocument.Feature.Background
import typings.cucumberMessages.mod.messages.GherkinDocument.Feature.FeatureChild.Rule
import typings.cucumberMessages.mod.messages.GherkinDocument.Feature.Scenario
import typings.cucumberMessages.mod.messages.GherkinDocument.Feature.Scenario.Examples
import typings.cucumberMessages.mod.messages.GherkinDocument.Feature.Step
import typings.cucumberMessages.mod.messages.GherkinDocument.Feature.Step.DataTable
import typings.cucumberMessages.mod.messages.GherkinDocument.Feature.Step.DocString
import typings.cucumberMessages.mod.messages.GherkinDocument.Feature.TableRow
import typings.cucumberMessages.mod.messages.GherkinDocument.Feature.TableRow.TableCell
import typings.gherkin.parserMod.RuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gherkin/dist/src/AstBuilder", JSImport.Namespace)
@js.native
object astBuilderMod extends js.Object {
  
  @js.native
  trait AstBuilder extends js.Object {
    
    def build(token: typings.gherkin.tokenMod.default): Unit = js.native
    
    var comments: js.Any = js.native
    
    def currentNode(): typings.gherkin.astNodeMod.default = js.native
    
    def endRule(ruleType: RuleType): Unit = js.native
    
    def ensureCellCount(rows: js.Array[_]): Unit = js.native
    
    def getCells(tableRowToken: typings.gherkin.tokenMod.default): js.Array[TableCell] = js.native
    
    def getDescription(node: typings.gherkin.astNodeMod.default): js.Any = js.native
    
    def getLocation(token: typings.gherkin.tokenMod.default): ILocation = js.native
    def getLocation(token: typings.gherkin.tokenMod.default, column: Double): ILocation = js.native
    
    def getResult(): js.Any = js.native
    
    def getSteps(node: typings.gherkin.astNodeMod.default): js.Array[_] = js.native
    
    def getTableRows(node: typings.gherkin.astNodeMod.default): js.Array[TableRow] = js.native
    
    def getTags(node: typings.gherkin.astNodeMod.default): js.Array[ITag] = js.native
    
    val newId: js.Any = js.native
    
    def reset(): Unit = js.native
    
    var stack: js.Any = js.native
    
    def startRule(ruleType: RuleType): Unit = js.native
    
    def transformNode(node: typings.gherkin.astNodeMod.default): String | typings.gherkin.astNodeMod.default | GherkinDocument | Feature | Step | DocString | DataTable | js.Array[TableRow] | Background | Scenario | Examples | Rule = js.native
  }
  
  @js.native
  class default protected () extends AstBuilder {
    def this(newId: NewId) = this()
  }
}
