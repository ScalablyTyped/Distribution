package typings
package eslintLib.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleFixer extends js.Object {
  def insertTextAfter(nodeOrToken: eslintLib.eslintMod.ASTNs.Token, text: java.lang.String): Fix = js.native
  def insertTextAfter(nodeOrToken: estreeLib.estreeMod.Node, text: java.lang.String): Fix = js.native
  def insertTextAfterRange(range: eslintLib.eslintMod.ASTNs.Range, text: java.lang.String): Fix = js.native
  def insertTextBefore(nodeOrToken: eslintLib.eslintMod.ASTNs.Token, text: java.lang.String): Fix = js.native
  def insertTextBefore(nodeOrToken: estreeLib.estreeMod.Node, text: java.lang.String): Fix = js.native
  def insertTextBeforeRange(range: eslintLib.eslintMod.ASTNs.Range, text: java.lang.String): Fix = js.native
  def remove(nodeOrToken: eslintLib.eslintMod.ASTNs.Token): Fix = js.native
  def remove(nodeOrToken: estreeLib.estreeMod.Node): Fix = js.native
  def removeRange(range: eslintLib.eslintMod.ASTNs.Range): Fix = js.native
  def replaceText(nodeOrToken: eslintLib.eslintMod.ASTNs.Token, text: java.lang.String): Fix = js.native
  def replaceText(nodeOrToken: estreeLib.estreeMod.Node, text: java.lang.String): Fix = js.native
  def replaceTextRange(range: eslintLib.eslintMod.ASTNs.Range, text: java.lang.String): Fix = js.native
}

