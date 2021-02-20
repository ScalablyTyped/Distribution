package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.star
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StarNode
  extends FormatNode
     with Node {
  
  var contents: js.Array[FragmentNode] = js.native
  
  var location: LocationRange = js.native
  
  var name: star = js.native
}
object StarNode {
  
  @scala.inline
  def apply(contents: js.Array[FragmentNode], location: LocationRange, name: star): StarNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarNode]
  }
  
  @scala.inline
  implicit class StarNodeMutableBuilder[Self <: StarNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: js.Array[FragmentNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsVarargs(value: FragmentNode*): Self = StObject.set(x, "contents", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: star): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
