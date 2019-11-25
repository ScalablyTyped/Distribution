package typings.eslint.eslintMod.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eslint.eslintStrings.Boolean
  - typings.eslint.eslintStrings.Null
  - typings.eslint.eslintStrings.Identifier
  - typings.eslint.eslintStrings.Keyword
  - typings.eslint.eslintStrings.Punctuator
  - typings.eslint.eslintStrings.JSXIdentifier
  - typings.eslint.eslintStrings.JSXText
  - typings.eslint.eslintStrings.Numeric
  - typings.eslint.eslintStrings.String
  - typings.eslint.eslintStrings.RegularExpression
*/
trait TokenType extends js.Object

object TokenType {
  @scala.inline
  def Boolean: typings.eslint.eslintStrings.Boolean = this.cast("Boolean")
  @scala.inline
  def Identifier: typings.eslint.eslintStrings.Identifier = this.cast("Identifier")
  @scala.inline
  def JSXIdentifier: typings.eslint.eslintStrings.JSXIdentifier = this.cast("JSXIdentifier")
  @scala.inline
  def JSXText: typings.eslint.eslintStrings.JSXText = this.cast("JSXText")
  @scala.inline
  def Keyword: typings.eslint.eslintStrings.Keyword = this.cast("Keyword")
  @scala.inline
  def Null: typings.eslint.eslintStrings.Null = this.cast("Null")
  @scala.inline
  def Numeric: typings.eslint.eslintStrings.Numeric = this.cast("Numeric")
  @scala.inline
  def Punctuator: typings.eslint.eslintStrings.Punctuator = this.cast("Punctuator")
  @scala.inline
  def RegularExpression: typings.eslint.eslintStrings.RegularExpression = this.cast("RegularExpression")
  @scala.inline
  def String: typings.eslint.eslintStrings.String = this.cast("String")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

