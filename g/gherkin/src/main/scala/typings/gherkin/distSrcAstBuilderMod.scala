package typings.gherkin

import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITag
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ILocation
import typings.cucumberMessages.distSrcIdGeneratorMod.NewId
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
import typings.gherkin.distSrcParserMod.RuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAstBuilderMod {
  
  @JSImport("gherkin/dist/src/AstBuilder", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AstBuilder {
    def this(newId: NewId) = this()
  }
  
  @js.native
  trait AstBuilder extends StObject {
    
    def build(token: typings.gherkin.distSrcTokenMod.default): Unit = js.native
    
    /* private */ var comments: Any = js.native
    
    def currentNode(): typings.gherkin.distSrcAstNodeMod.default = js.native
    
    def endRule(ruleType: RuleType): Unit = js.native
    
    def ensureCellCount(rows: js.Array[Any]): Unit = js.native
    
    def getCells(tableRowToken: typings.gherkin.distSrcTokenMod.default): js.Array[TableCell] = js.native
    
    def getDescription(node: typings.gherkin.distSrcAstNodeMod.default): Any = js.native
    
    def getLocation(token: typings.gherkin.distSrcTokenMod.default): ILocation = js.native
    def getLocation(token: typings.gherkin.distSrcTokenMod.default, column: Double): ILocation = js.native
    
    def getResult(): Any = js.native
    
    def getSteps(node: typings.gherkin.distSrcAstNodeMod.default): js.Array[Any] = js.native
    
    def getTableRows(node: typings.gherkin.distSrcAstNodeMod.default): js.Array[TableRow] = js.native
    
    def getTags(node: typings.gherkin.distSrcAstNodeMod.default): js.Array[ITag] = js.native
    
    /* private */ val newId: Any = js.native
    
    def reset(): Unit = js.native
    
    /* private */ var stack: Any = js.native
    
    def startRule(ruleType: RuleType): Unit = js.native
    
    def transformNode(node: typings.gherkin.distSrcAstNodeMod.default): String | typings.gherkin.distSrcAstNodeMod.default | GherkinDocument | Feature | Step | DocString | DataTable | js.Array[TableRow] | Background | Scenario | Examples | Rule = js.native
  }
}
