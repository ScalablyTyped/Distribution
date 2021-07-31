package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentNode
  extends StObject
     with FragmentNode
     with Node {
  
  var contents: String
  
  var location: LocationRange
  
  var name: comment
}
object CommentNode {
  
  @scala.inline
  def apply(contents: String, location: LocationRange): CommentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "comment")
    __obj.asInstanceOf[CommentNode]
  }
  
  @scala.inline
  implicit class CommentNodeMutableBuilder[Self <: CommentNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: comment): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
