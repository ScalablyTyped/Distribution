package typings.docxTemplates.typesMod

import typings.docxTemplates.anon.Dictkey
import typings.docxTemplates.docxTemplatesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonTextNode
  extends StObject
     with BaseNode
     with Node {
  
  var _attrs: Dictkey
  
  var _fTextNode: `false`
  
  var _tag: String
}
object NonTextNode {
  
  inline def apply(_attrs: Dictkey, _children: js.Array[Node], _tag: String): NonTextNode = {
    val __obj = js.Dynamic.literal(_attrs = _attrs.asInstanceOf[js.Any], _children = _children.asInstanceOf[js.Any], _fTextNode = false, _tag = _tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonTextNode]
  }
  
  extension [Self <: NonTextNode](x: Self) {
    
    inline def set_attrs(value: Dictkey): Self = StObject.set(x, "_attrs", value.asInstanceOf[js.Any])
    
    inline def set_fTextNode(value: `false`): Self = StObject.set(x, "_fTextNode", value.asInstanceOf[js.Any])
    
    inline def set_tag(value: String): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
  }
}
