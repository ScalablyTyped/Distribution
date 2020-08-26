package typings.domutils

import typings.domSerializer.mod.DomSerializerOptions
import typings.domelementtype.mod.ElementType
import typings.domutils.legacyMod.TestElementOpts
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domutils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def append(elem: Node, next: Node): Unit = js.native
  def appendChild(elem: Element, child: Node): Unit = js.native
  def compareDocumentPosition(nodeA: Node, nodeB: Node): Double = js.native
  def existsOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[Node]): Boolean = js.native
  def filter(test: js.Function1[/* elem */ Node, Boolean], node: js.Array[Node]): js.Array[Node] = js.native
  def filter(
    test: js.Function1[/* elem */ Node, Boolean],
    node: js.Array[Node],
    recurse: js.UndefOr[scala.Nothing],
    limit: Double
  ): js.Array[Node] = js.native
  def filter(test: js.Function1[/* elem */ Node, Boolean], node: js.Array[Node], recurse: Boolean): js.Array[Node] = js.native
  def filter(
    test: js.Function1[/* elem */ Node, Boolean],
    node: js.Array[Node],
    recurse: Boolean,
    limit: Double
  ): js.Array[Node] = js.native
  def filter(test: js.Function1[/* elem */ Node, Boolean], node: Node): js.Array[Node] = js.native
  def filter(
    test: js.Function1[/* elem */ Node, Boolean],
    node: Node,
    recurse: js.UndefOr[scala.Nothing],
    limit: Double
  ): js.Array[Node] = js.native
  def filter(test: js.Function1[/* elem */ Node, Boolean], node: Node, recurse: Boolean): js.Array[Node] = js.native
  def filter(test: js.Function1[/* elem */ Node, Boolean], node: Node, recurse: Boolean, limit: Double): js.Array[Node] = js.native
  def find(
    test: js.Function1[/* elem */ Node, Boolean],
    nodes: js.Array[Node],
    recurse: Boolean,
    limit: Double
  ): js.Array[Node] = js.native
  def findAll(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[Node]): js.Array[Element] = js.native
  def findOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[Node]): Element | Null = js.native
  def findOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[Node], recurse: Boolean): Element | Null = js.native
  def findOneChild(test: js.Function1[/* elem */ Node, Boolean], nodes: js.Array[Node]): js.UndefOr[Node] = js.native
  def getAttributeValue(elem: Element, name: String): String = js.native
  def getChildren(elem: Element): js.Array[Node] | Null = js.native
  def getChildren(elem: Node): js.Array[Node] | Null = js.native
  def getElementById(id: String, element: js.Array[Node]): Element | Null = js.native
  def getElementById(id: String, element: js.Array[Node], recurse: Boolean): Element | Null = js.native
  def getElementById(id: String, element: Node): Element | Null = js.native
  def getElementById(id: String, element: Node, recurse: Boolean): Element | Null = js.native
  def getElementById(id: js.Function1[/* id */ String, Boolean], element: js.Array[Node]): Element | Null = js.native
  def getElementById(id: js.Function1[/* id */ String, Boolean], element: js.Array[Node], recurse: Boolean): Element | Null = js.native
  def getElementById(id: js.Function1[/* id */ String, Boolean], element: Node): Element | Null = js.native
  def getElementById(id: js.Function1[/* id */ String, Boolean], element: Node, recurse: Boolean): Element | Null = js.native
  def getElements(options: TestElementOpts, element: js.Array[Node], recurse: Boolean): js.Array[Node] = js.native
  def getElements(options: TestElementOpts, element: js.Array[Node], recurse: Boolean, limit: Double): js.Array[Node] = js.native
  def getElements(options: TestElementOpts, element: Node, recurse: Boolean): js.Array[Node] = js.native
  def getElements(options: TestElementOpts, element: Node, recurse: Boolean, limit: Double): js.Array[Node] = js.native
  def getElementsByTagName(name: String, element: js.Array[Node], recurse: Boolean): js.Array[Element] = js.native
  def getElementsByTagName(name: String, element: js.Array[Node], recurse: Boolean, limit: Double): js.Array[Element] = js.native
  def getElementsByTagName(name: String, element: Node, recurse: Boolean): js.Array[Element] = js.native
  def getElementsByTagName(name: String, element: Node, recurse: Boolean, limit: Double): js.Array[Element] = js.native
  def getElementsByTagName(name: js.Function1[/* name */ String, Boolean], element: js.Array[Node], recurse: Boolean): js.Array[Element] = js.native
  def getElementsByTagName(
    name: js.Function1[/* name */ String, Boolean],
    element: js.Array[Node],
    recurse: Boolean,
    limit: Double
  ): js.Array[Element] = js.native
  def getElementsByTagName(name: js.Function1[/* name */ String, Boolean], element: Node, recurse: Boolean): js.Array[Element] = js.native
  def getElementsByTagName(name: js.Function1[/* name */ String, Boolean], element: Node, recurse: Boolean, limit: Double): js.Array[Element] = js.native
  def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], element: js.Array[Node]): js.Array[Node] = js.native
  def getElementsByTagType(
    `type`: js.Function1[/* type */ ElementType, Boolean],
    element: js.Array[Node],
    recurse: js.UndefOr[scala.Nothing],
    limit: Double
  ): js.Array[Node] = js.native
  def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], element: js.Array[Node], recurse: Boolean): js.Array[Node] = js.native
  def getElementsByTagType(
    `type`: js.Function1[/* type */ ElementType, Boolean],
    element: js.Array[Node],
    recurse: Boolean,
    limit: Double
  ): js.Array[Node] = js.native
  def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], element: Node): js.Array[Node] = js.native
  def getElementsByTagType(
    `type`: js.Function1[/* type */ ElementType, Boolean],
    element: Node,
    recurse: js.UndefOr[scala.Nothing],
    limit: Double
  ): js.Array[Node] = js.native
  def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], element: Node, recurse: Boolean): js.Array[Node] = js.native
  def getElementsByTagType(
    `type`: js.Function1[/* type */ ElementType, Boolean],
    element: Node,
    recurse: Boolean,
    limit: Double
  ): js.Array[Node] = js.native
  def getElementsByTagType(`type`: ElementType, element: js.Array[Node]): js.Array[Node] = js.native
  def getElementsByTagType(`type`: ElementType, element: js.Array[Node], recurse: js.UndefOr[scala.Nothing], limit: Double): js.Array[Node] = js.native
  def getElementsByTagType(`type`: ElementType, element: js.Array[Node], recurse: Boolean): js.Array[Node] = js.native
  def getElementsByTagType(`type`: ElementType, element: js.Array[Node], recurse: Boolean, limit: Double): js.Array[Node] = js.native
  def getElementsByTagType(`type`: ElementType, element: Node): js.Array[Node] = js.native
  def getElementsByTagType(`type`: ElementType, element: Node, recurse: js.UndefOr[scala.Nothing], limit: Double): js.Array[Node] = js.native
  def getElementsByTagType(`type`: ElementType, element: Node, recurse: Boolean): js.Array[Node] = js.native
  def getElementsByTagType(`type`: ElementType, element: Node, recurse: Boolean, limit: Double): js.Array[Node] = js.native
  def getInnerHTML(node: Node): String = js.native
  def getInnerHTML(node: Node, options: DomSerializerOptions): String = js.native
  def getName(elem: Element): String = js.native
  def getOuterHTML(node: js.Array[Node]): String = js.native
  def getOuterHTML(node: js.Array[Node], options: DomSerializerOptions): String = js.native
  def getOuterHTML(node: Node): String = js.native
  def getOuterHTML(node: Node, options: DomSerializerOptions): String = js.native
  def getParent(elem: Node): Node | Null = js.native
  def getSiblings(elem: Node): js.Array[Node] | Null = js.native
  def getText(node: js.Array[Node]): String = js.native
  def getText(node: Node): String = js.native
  def hasAttrib(elem: Element, name: String): Boolean = js.native
  def hasChildren(node: Node): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeWithChildren * / any */ Boolean = js.native
  def isCDATA(node: Node): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeWithChildren * / any */ Boolean = js.native
  def isComment(node: Node): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode * / any */ Boolean = js.native
  def isTag(node: Node): /* is std.Element */ Boolean = js.native
  def isText(node: Node): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode * / any */ Boolean = js.native
  def prepend(elem: Node, prev: Node): Unit = js.native
  def removeElement(elem: Node): Unit = js.native
  def removeSubsets(nodes: js.Array[Node]): js.Array[Node] = js.native
  def replaceElement(elem: Node, replacement: Node): Unit = js.native
  def testElement(options: TestElementOpts, element: Node): Boolean = js.native
  def uniqueSort(nodes: js.Array[Node]): js.Array[Node] = js.native
}

