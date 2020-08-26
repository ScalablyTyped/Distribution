package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownBooleans.`true`
import typings.ecmarkdown.ecmarkdownStrings.EOF
import typings.ecmarkdown.ecmarkdownStrings.comment
import typings.ecmarkdown.ecmarkdownStrings.linebreak
import typings.ecmarkdown.ecmarkdownStrings.ol
import typings.ecmarkdown.ecmarkdownStrings.opaqueTag
import typings.ecmarkdown.ecmarkdownStrings.parabreak
import typings.ecmarkdown.ecmarkdownStrings.tag
import typings.ecmarkdown.ecmarkdownStrings.text
import typings.ecmarkdown.ecmarkdownStrings.ul
import typings.ecmarkdown.ecmarkdownStrings.whitespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ecmarkdown.nodeTypesMod.EOFToken
  - typings.ecmarkdown.nodeTypesMod.FormatToken
  - typings.ecmarkdown.nodeTypesMod.ParabreakToken
  - typings.ecmarkdown.nodeTypesMod.LinebreakToken
  - typings.ecmarkdown.nodeTypesMod.WhitespaceToken
  - typings.ecmarkdown.nodeTypesMod.TextToken
  - typings.ecmarkdown.nodeTypesMod.CommentToken
  - typings.ecmarkdown.nodeTypesMod.TagToken
  - typings.ecmarkdown.nodeTypesMod.UnorderedListToken
  - typings.ecmarkdown.nodeTypesMod.OrderedListToken
  - typings.ecmarkdown.nodeTypesMod.OpaqueTagToken
*/
trait Token extends js.Object

object Token {
  @scala.inline
  def CommentToken(contents: String, name: comment): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ParabreakToken(contents: String, name: parabreak): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def OrderedListToken(contents: String, name: ol): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def WhitespaceToken(contents: String, name: whitespace): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def FormatToken(contents: String, name: Format): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def EOFToken(done: `true`, name: EOF): Token = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def OpaqueTagToken(contents: String, name: opaqueTag): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def TextToken(contents: String, name: text): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def LinebreakToken(contents: String, name: linebreak): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def UnorderedListToken(contents: String, name: ul): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def TagToken(contents: String, name: tag): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

