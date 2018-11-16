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
  var settings: ScalablyTyped.runtime.StringDictionary[js.Any]
  def getAncestors(): js.Array[estreeLib.estreeMod.Node]
  def getDeclaredVariables(node: estreeLib.estreeMod.Node): js.Array[eslintLib.eslintMod.ScopeNs.Variable]
  def getFilename(): java.lang.String
  def getScope(): eslintLib.eslintMod.ScopeNs.Scope
  def getSourceCode(): eslintLib.eslintMod.SourceCode
  def markVariableAsUsed(name: java.lang.String): scala.Boolean
  def report(descriptor: ReportDescriptor): scala.Unit
}

