package typings.domParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends DOMSearchable {
  var attributes: js.Array[String] = js.native
  var childNodes: js.Array[Node] = js.native
  var firstChild: Node | Null = js.native
  var innerHTML: String = js.native
  var lastChild: Node | Null = js.native
  var nodeName: String = js.native
  var nodeType: NodeType = js.native
  var outerHTML: String = js.native
  var parentNode: Node | Null = js.native
  var textContent: String = js.native
  def getAttribute(name: String): String | Null = js.native
}

object Node {
  @scala.inline
  def apply(
    attributes: js.Array[String],
    childNodes: js.Array[Node],
    getAttribute: String => String | Null,
    getElementById: String => Node | Null,
    getElementsByClassName: String => js.Array[Node] | Null,
    getElementsByName: String => js.Array[Node] | Null,
    getElementsByTagName: String => js.Array[Node] | Null,
    innerHTML: String,
    nodeName: String,
    nodeType: NodeType,
    outerHTML: String,
    textContent: String
  ): Node = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], getAttribute = js.Any.fromFunction1(getAttribute), getElementById = js.Any.fromFunction1(getElementById), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByName = js.Any.fromFunction1(getElementsByName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), innerHTML = innerHTML.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], outerHTML = outerHTML.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildNodesVarargs(value: Node*): Self = this.set("childNodes", js.Array(value :_*))
    @scala.inline
    def setChildNodes(value: js.Array[Node]): Self = this.set("childNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAttribute(value: String => String | Null): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerHTML(value: String): Self = this.set("innerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeType(value: NodeType): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOuterHTML(value: String): Self = this.set("outerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextContent(value: String): Self = this.set("textContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstChild(value: Node): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstChildNull: Self = this.set("firstChild", null)
    @scala.inline
    def setLastChild(value: Node): Self = this.set("lastChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastChildNull: Self = this.set("lastChild", null)
    @scala.inline
    def setParentNode(value: Node): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNodeNull: Self = this.set("parentNode", null)
  }
  
}

