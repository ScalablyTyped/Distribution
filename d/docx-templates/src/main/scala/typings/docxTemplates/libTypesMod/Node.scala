package typings.docxTemplates.libTypesMod

import typings.docxTemplates.anon.ContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.docxTemplates.libTypesMod.TextNode
  - typings.docxTemplates.libTypesMod.NonTextNode
*/
trait Node extends StObject
object Node {
  
  inline def NonTextNode(_attrs: ContentType, _children: js.Array[Node], _tag: String): typings.docxTemplates.libTypesMod.NonTextNode = {
    val __obj = js.Dynamic.literal(_attrs = _attrs.asInstanceOf[js.Any], _children = _children.asInstanceOf[js.Any], _fTextNode = false, _tag = _tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.docxTemplates.libTypesMod.NonTextNode]
  }
  
  inline def TextNode(_children: js.Array[Node], _text: String): typings.docxTemplates.libTypesMod.TextNode = {
    val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _fTextNode = true, _text = _text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.docxTemplates.libTypesMod.TextNode]
  }
}
