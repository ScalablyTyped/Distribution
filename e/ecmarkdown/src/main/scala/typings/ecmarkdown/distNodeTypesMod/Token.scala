package typings.ecmarkdown.distNodeTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ecmarkdown.distNodeTypesMod.EOFToken
  - typings.ecmarkdown.distNodeTypesMod.FormatToken
  - typings.ecmarkdown.distNodeTypesMod.ParabreakToken
  - typings.ecmarkdown.distNodeTypesMod.LinebreakToken
  - typings.ecmarkdown.distNodeTypesMod.WhitespaceToken
  - typings.ecmarkdown.distNodeTypesMod.TextToken
  - typings.ecmarkdown.distNodeTypesMod.CommentToken
  - typings.ecmarkdown.distNodeTypesMod.TagToken
  - typings.ecmarkdown.distNodeTypesMod.UnorderedListToken
  - typings.ecmarkdown.distNodeTypesMod.OrderedListToken
  - typings.ecmarkdown.distNodeTypesMod.OpaqueTagToken
*/
trait Token extends StObject
object Token {
  
  inline def CommentToken(contents: String, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.CommentToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "comment")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.CommentToken]
  }
  
  inline def EOFToken(location: LocationRange): typings.ecmarkdown.distNodeTypesMod.EOFToken = {
    val __obj = js.Dynamic.literal(done = true, location = location.asInstanceOf[js.Any], name = "EOF")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.EOFToken]
  }
  
  inline def FormatToken(contents: String, location: LocationRange, name: Format): typings.ecmarkdown.distNodeTypesMod.FormatToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.FormatToken]
  }
  
  inline def LinebreakToken(contents: String, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.LinebreakToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "linebreak")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.LinebreakToken]
  }
  
  inline def OpaqueTagToken(contents: String, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.OpaqueTagToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "opaqueTag")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.OpaqueTagToken]
  }
  
  inline def OrderedListToken(contents: String, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.OrderedListToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ol")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.OrderedListToken]
  }
  
  inline def ParabreakToken(contents: String, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.ParabreakToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "parabreak")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.ParabreakToken]
  }
  
  inline def TagToken(contents: String, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.TagToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "tag")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.TagToken]
  }
  
  inline def TextToken(contents: String, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.TextToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "text")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.TextToken]
  }
  
  inline def UnorderedListToken(contents: String, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.UnorderedListToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "ul")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.UnorderedListToken]
  }
  
  inline def WhitespaceToken(contents: String, location: LocationRange): typings.ecmarkdown.distNodeTypesMod.WhitespaceToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "whitespace")
    __obj.asInstanceOf[typings.ecmarkdown.distNodeTypesMod.WhitespaceToken]
  }
}
