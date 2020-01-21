package typings.eslint.mod.Rule

import typings.eslint.mod.AST.Range
import typings.eslint.mod.AST.Token
import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleFixer extends js.Object {
  def insertTextAfter(nodeOrToken: Token, text: String): Fix = js.native
  def insertTextAfter(nodeOrToken: Node, text: String): Fix = js.native
  def insertTextAfterRange(range: Range, text: String): Fix = js.native
  def insertTextBefore(nodeOrToken: Token, text: String): Fix = js.native
  def insertTextBefore(nodeOrToken: Node, text: String): Fix = js.native
  def insertTextBeforeRange(range: Range, text: String): Fix = js.native
  def remove(nodeOrToken: Token): Fix = js.native
  def remove(nodeOrToken: Node): Fix = js.native
  def removeRange(range: Range): Fix = js.native
  def replaceText(nodeOrToken: Token, text: String): Fix = js.native
  def replaceText(nodeOrToken: Node, text: String): Fix = js.native
  def replaceTextRange(range: Range, text: String): Fix = js.native
}

