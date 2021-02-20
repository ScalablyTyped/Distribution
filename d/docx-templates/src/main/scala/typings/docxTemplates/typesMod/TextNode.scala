package typings.docxTemplates.typesMod

import typings.docxTemplates.docxTemplatesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined docx-templates.docx-templates/lib/types.BaseNode & {  _fTextNode :true,   _text :string} */
@js.native
trait TextNode extends Node {
  
  var _children: js.Array[Node] = js.native
  
  var _fTextNode: `true` = js.native
  
  var _ifName: js.UndefOr[String] = js.native
  
  var _parent: js.UndefOr[Node] = js.native
  
  var _text: String = js.native
}
object TextNode {
  
  @scala.inline
  def apply(_children: js.Array[Node], _fTextNode: `true`, _text: String): TextNode = {
    val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _fTextNode = _fTextNode.asInstanceOf[js.Any], _text = _text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNode]
  }
  
  @scala.inline
  implicit class TextNodeMutableBuilder[Self <: TextNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_children(value: js.Array[Node]): Self = StObject.set(x, "_children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_childrenVarargs(value: Node*): Self = StObject.set(x, "_children", js.Array(value :_*))
    
    @scala.inline
    def set_fTextNode(value: `true`): Self = StObject.set(x, "_fTextNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ifName(value: String): Self = StObject.set(x, "_ifName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ifNameUndefined: Self = StObject.set(x, "_ifName", js.undefined)
    
    @scala.inline
    def set_parent(value: Node): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_parentUndefined: Self = StObject.set(x, "_parent", js.undefined)
    
    @scala.inline
    def set_text(value: String): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
  }
}
