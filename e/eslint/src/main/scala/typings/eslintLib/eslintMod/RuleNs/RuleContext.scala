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
    getAncestors: js.Function0[js.Array[estreeLib.estreeMod.Node]],
    getDeclaredVariables: js.Function1[estreeLib.estreeMod.Node, js.Array[eslintLib.eslintMod.ScopeNs.Variable]],
    getFilename: js.Function0[java.lang.String],
    getScope: js.Function0[eslintLib.eslintMod.ScopeNs.Scope],
    getSourceCode: js.Function0[eslintLib.eslintMod.SourceCode],
    id: java.lang.String,
    markVariableAsUsed: js.Function1[java.lang.String, scala.Boolean],
    options: js.Array[_],
    parserOptions: eslintLib.eslintMod.LinterNs.ParserOptions,
    parserPath: java.lang.String,
    parserServices: eslintLib.eslintMod.SourceCodeNs.ParserServices,
    report: js.Function1[ReportDescriptor, scala.Unit],
    settings: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): RuleContext = {
    val __obj = js.Dynamic.literal(getAncestors = getAncestors, getDeclaredVariables = getDeclaredVariables, getFilename = getFilename, getScope = getScope, getSourceCode = getSourceCode, id = id, markVariableAsUsed = markVariableAsUsed, options = options, parserOptions = parserOptions, parserPath = parserPath, parserServices = parserServices, report = report, settings = settings)
  
    __obj.asInstanceOf[RuleContext]
  }
}

