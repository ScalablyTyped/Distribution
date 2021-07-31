package typings.flowdoc.Flow

import typings.flowdoc.Node
import typings.flowdoc.flowdocStrings.PAGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page
  extends StObject
     with Node {
  
  var backgroundColor: Color
  
  var children: js.Array[Screen | Image | Rectangle | Ellipse | Diamond]
  
  var startNodeID: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_Page: PAGE
}
object Page {
  
  @scala.inline
  def apply(
    backgroundColor: Color,
    children: js.Array[Screen | Image | Rectangle | Ellipse | Diamond],
    id: String,
    name: String
  ): Page = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PAGE")
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: js.Array[Screen | Image | Rectangle | Ellipse | Diamond]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: (Screen | Image | Rectangle | Ellipse | Diamond)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setStartNodeID(value: String): Self = StObject.set(x, "startNodeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartNodeIDUndefined: Self = StObject.set(x, "startNodeID", js.undefined)
    
    @scala.inline
    def setType(value: PAGE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
