package typings.docxTemplates.libTypesMod

import typings.docxTemplates.docxTemplatesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextNode
  extends StObject
     with BaseNode
     with Node {
  
  var _fTextNode: `true`
  
  var _text: String
}
object TextNode {
  
  inline def apply(_children: js.Array[Node], _text: String): TextNode = {
    val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _fTextNode = true, _text = _text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNode]
  }
  
  extension [Self <: TextNode](x: Self) {
    
    inline def set_fTextNode(value: `true`): Self = StObject.set(x, "_fTextNode", value.asInstanceOf[js.Any])
    
    inline def set_text(value: String): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
  }
}
