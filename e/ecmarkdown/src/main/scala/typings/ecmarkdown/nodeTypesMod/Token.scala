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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def CommentToken(contents: String, location: LocationRange, name: comment): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  def ParabreakToken(contents: String, location: LocationRange, name: parabreak): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  def OrderedListToken(contents: String, location: LocationRange, name: ol): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  def WhitespaceToken(contents: String, location: LocationRange, name: whitespace): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  def FormatToken(contents: String, location: LocationRange, name: Format): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  def EOFToken(done: `true`, location: LocationRange, name: EOF): Token = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  def OpaqueTagToken(contents: String, location: LocationRange, name: opaqueTag): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  def TextToken(contents: String, location: LocationRange, name: text): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  def LinebreakToken(contents: String, location: LocationRange, name: linebreak): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  def UnorderedListToken(contents: String, location: LocationRange, name: ul): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  def TagToken(contents: String, location: LocationRange, name: tag): Token = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}
