package typings.docxTemplates.typesMod

import typings.docxTemplates.anon.Dictkey
import typings.docxTemplates.docxTemplatesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined docx-templates.docx-templates/lib/types.BaseNode & {  _fTextNode :false,   _tag :string,   _attrs :{[key: string] : sax.sax.QualifiedAttribute | string,   Extension :string | undefined,   ContentType :string | undefined,   PartName :string | undefined}} */
@js.native
trait NonTextNode extends Node {
  
  var _attrs: Dictkey = js.native
  
  var _children: js.Array[Node] = js.native
  
  var _fTextNode: `false` = js.native
  
  var _ifName: js.UndefOr[String] = js.native
  
  var _parent: js.UndefOr[Node] = js.native
  
  var _tag: String = js.native
}
object NonTextNode {
  
  @scala.inline
  def apply(_attrs: Dictkey, _children: js.Array[Node], _fTextNode: `false`, _tag: String): NonTextNode = {
    val __obj = js.Dynamic.literal(_attrs = _attrs.asInstanceOf[js.Any], _children = _children.asInstanceOf[js.Any], _fTextNode = _fTextNode.asInstanceOf[js.Any], _tag = _tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonTextNode]
  }
  
  @scala.inline
  implicit class NonTextNodeMutableBuilder[Self <: NonTextNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_attrs(value: Dictkey): Self = StObject.set(x, "_attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_children(value: js.Array[Node]): Self = StObject.set(x, "_children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_childrenVarargs(value: Node*): Self = StObject.set(x, "_children", js.Array(value :_*))
    
    @scala.inline
    def set_fTextNode(value: `false`): Self = StObject.set(x, "_fTextNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ifName(value: String): Self = StObject.set(x, "_ifName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ifNameUndefined: Self = StObject.set(x, "_ifName", js.undefined)
    
    @scala.inline
    def set_parent(value: Node): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_parentUndefined: Self = StObject.set(x, "_parent", js.undefined)
    
    @scala.inline
    def set_tag(value: String): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
  }
}
