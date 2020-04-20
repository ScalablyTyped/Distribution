package typings.eslint.mod.Rule

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.mod.Linter.ParserOptions
import typings.eslint.mod.Scope.Scope
import typings.eslint.mod.Scope.Variable
import typings.eslint.mod.SourceCode
import typings.eslint.mod.SourceCode.ParserServices
import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleContext extends js.Object {
  var id: String
  var options: js.Array[_]
  var parserOptions: ParserOptions
  var parserPath: String
  var parserServices: ParserServices
  var settings: StringDictionary[js.Any]
  def getAncestors(): js.Array[Node]
  def getDeclaredVariables(node: Node): js.Array[Variable]
  def getFilename(): String
  def getScope(): Scope
  def getSourceCode(): SourceCode
  def markVariableAsUsed(name: String): Boolean
  def report(descriptor: ReportDescriptor): Unit
}

object RuleContext {
  @scala.inline
  def apply(
    getAncestors: () => js.Array[Node],
    getDeclaredVariables: Node => js.Array[Variable],
    getFilename: () => String,
    getScope: () => Scope,
    getSourceCode: () => SourceCode,
    id: String,
    markVariableAsUsed: String => Boolean,
    options: js.Array[_],
    parserOptions: ParserOptions,
    parserPath: String,
    parserServices: ParserServices,
    report: ReportDescriptor => Unit,
    settings: StringDictionary[js.Any]
  ): RuleContext = {
    val __obj = js.Dynamic.literal(getAncestors = js.Any.fromFunction0(getAncestors), getDeclaredVariables = js.Any.fromFunction1(getDeclaredVariables), getFilename = js.Any.fromFunction0(getFilename), getScope = js.Any.fromFunction0(getScope), getSourceCode = js.Any.fromFunction0(getSourceCode), id = id.asInstanceOf[js.Any], markVariableAsUsed = js.Any.fromFunction1(markVariableAsUsed), options = options.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any], parserPath = parserPath.asInstanceOf[js.Any], parserServices = parserServices.asInstanceOf[js.Any], report = js.Any.fromFunction1(report), settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleContext]
  }
}

