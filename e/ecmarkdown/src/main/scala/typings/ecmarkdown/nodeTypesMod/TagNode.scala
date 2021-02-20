package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagNode
  extends FragmentNode
     with Node {
  
  var contents: String = js.native
  
  var location: LocationRange = js.native
  
  var name: tag = js.native
}
object TagNode {
  
  @scala.inline
  def apply(contents: String, location: LocationRange, name: tag): TagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagNode]
  }
  
  @scala.inline
  implicit class TagNodeMutableBuilder[Self <: TagNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: tag): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
