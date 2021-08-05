package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentToken
  extends StObject
     with Token {
  
  var contents: String
  
  var location: LocationRange
  
  var name: comment
}
object CommentToken {
  
  inline def apply(contents: String, location: LocationRange): CommentToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "comment")
    __obj.asInstanceOf[CommentToken]
  }
  
  extension [Self <: CommentToken](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: comment): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
