package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.tick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TickNode
  extends FormatNode
     with Node {
  
  var contents: js.Array[FragmentNode] = js.native
  
  var location: LocationRange = js.native
  
  var name: tick = js.native
}
object TickNode {
  
  @scala.inline
  def apply(contents: js.Array[FragmentNode], location: LocationRange, name: tick): TickNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickNode]
  }
  
  @scala.inline
  implicit class TickNodeMutableBuilder[Self <: TickNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: js.Array[FragmentNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsVarargs(value: FragmentNode*): Self = StObject.set(x, "contents", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: tick): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
