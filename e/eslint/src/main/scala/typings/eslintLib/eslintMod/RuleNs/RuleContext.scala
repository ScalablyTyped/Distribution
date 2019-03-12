package typings
package eslintLib.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleContext extends js.Object {
  var id: java.lang.String
  var options: js.Array[_]
  var parserOptions: eslintLib.eslintMod.LinterNs.ParserOptions
  var parserPath: java.lang.String
  var parserServices: eslintLib.eslintMod.SourceCodeNs.ParserServices
  var settings: org.scalablytyped.runtime.StringDictionary[js.Any]
  def getAncestors(): js.Array[estreeLib.estreeMod.Node]
  def getDeclaredVariables(node: estreeLib.estreeMod.Node): js.Array[eslintLib.eslintMod.ScopeNs.Variable]
  def getFilename(): java.lang.String
  def getScope(): eslintLib.eslintMod.ScopeNs.Scope
  def getSourceCode(): eslintLib.eslintMod.SourceCode
  def markVariableAsUsed(name: java.lang.String): scala.Boolean
  def report(descriptor: ReportDescriptor): scala.Unit
}

object RuleContext {
  @scala.inline
  def apply(
    getAncestors: () => js.Array[estreeLib.estreeMod.Node],
    getDeclaredVariables: estreeLib.estreeMod.Node => js.Array[eslintLib.eslintMod.ScopeNs.Variable],
    getFilename: () => java.lang.String,
    getScope: () => eslintLib.eslintMod.ScopeNs.Scope,
    getSourceCode: () => eslintLib.eslintMod.SourceCode,
    id: java.lang.String,
    markVariableAsUsed: java.lang.String => scala.Boolean,
    options: js.Array[_],
    parserOptions: eslintLib.eslintMod.LinterNs.ParserOptions,
    parserPath: java.lang.String,
    parserServices: eslintLib.eslintMod.SourceCodeNs.ParserServices,
    report: ReportDescriptor => scala.Unit,
    settings: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): RuleContext = {
    val __obj = js.Dynamic.literal(getAncestors = js.Any.fromFunction0(getAncestors), getDeclaredVariables = js.Any.fromFunction1(getDeclaredVariables), getFilename = js.Any.fromFunction0(getFilename), getScope = js.Any.fromFunction0(getScope), getSourceCode = js.Any.fromFunction0(getSourceCode), id = id, markVariableAsUsed = js.Any.fromFunction1(markVariableAsUsed), options = options, parserOptions = parserOptions, parserPath = parserPath, parserServices = parserServices, report = js.Any.fromFunction1(report), settings = settings)
  
    __obj.asInstanceOf[RuleContext]
  }
}

