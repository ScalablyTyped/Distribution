package typings.ecmarkdown.nodeTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait Token extends StObject
object Token {
  
  @scala.inline
  def CommentToken(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.CommentToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "comment")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.CommentToken]
  }
  
  @scala.inline
  def EOFToken(location: LocationRange): typings.ecmarkdown.nodeTypesMod.EOFToken = {
    val __obj = js.Dynamic.literal(done = true, location = location.asInstanceOf[js.Any], name = "EOF")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.EOFToken]
  }
  
  @scala.inline
  def FormatToken(contents: String, location: LocationRange, name: Format): typings.ecmarkdown.nodeTypesMod.FormatToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.FormatToken]
  }
  
  @scala.inline
  def LinebreakToken(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.LinebreakToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "linebreak")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.LinebreakToken]
  }
  
  @scala.inline
  def OpaqueTagToken(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.OpaqueTagToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "opaqueTag")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.OpaqueTagToken]
  }
  
  @scala.inline
  def OrderedListToken(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.OrderedListToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ol")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.OrderedListToken]
  }
  
  @scala.inline
  def ParabreakToken(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.ParabreakToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "parabreak")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.ParabreakToken]
  }
  
  @scala.inline
  def TagToken(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.TagToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tag")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.TagToken]
  }
  
  @scala.inline
  def TextToken(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.TextToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "text")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.TextToken]
  }
  
  @scala.inline
  def UnorderedListToken(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.UnorderedListToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ul")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.UnorderedListToken]
  }
  
  @scala.inline
  def WhitespaceToken(contents: String, location: LocationRange): typings.ecmarkdown.nodeTypesMod.WhitespaceToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "whitespace")
    __obj.asInstanceOf[typings.ecmarkdown.nodeTypesMod.WhitespaceToken]
  }
}
