package typings
package domutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domutils", JSImport.Namespace)
@js.native
object domutilsMod extends js.Object {
  def append(elem: domhandlerLib.domhandlerMod.DomElement, next: domhandlerLib.domhandlerMod.DomElement): scala.Unit = js.native
  def appendChild(elem: domhandlerLib.domhandlerMod.DomElement, child: domhandlerLib.domhandlerMod.DomElement): scala.Unit = js.native
  def compareDocumentPosition(nodeA: domhandlerLib.domhandlerMod.DomElement, nodeB: domhandlerLib.domhandlerMod.DomElement): scala.Double = js.native
  def existsOne(test: js.Any, elems: js.Array[domhandlerLib.domhandlerMod.DomElement]): scala.Boolean = js.native
  def filter(
    test: js.Any,
    element: domhandlerLib.domhandlerMod.DomElement,
    recurse: scala.Boolean,
    limit: scala.Double
  ): js.Array[domhandlerLib.domhandlerMod.DomElement] = js.native
  def find(
    test: js.Any,
    elems: js.Array[domhandlerLib.domhandlerMod.DomElement],
    recurse: scala.Boolean,
    limit: scala.Double
  ): js.Array[domhandlerLib.domhandlerMod.DomElement] = js.native
  def findAll(test: js.Any, rootElems: js.Array[domhandlerLib.domhandlerMod.DomElement]): js.Array[domhandlerLib.domhandlerMod.DomElement] = js.native
  def findOne(test: js.Any, elems: js.Array[domhandlerLib.domhandlerMod.DomElement]): domhandlerLib.domhandlerMod.DomElement = js.native
  def findOneChild(test: js.Any, elems: js.Array[domhandlerLib.domhandlerMod.DomElement]): domhandlerLib.domhandlerMod.DomElement = js.native
  def getAttributeValue(elem: domhandlerLib.domhandlerMod.DomElement, name: java.lang.String): java.lang.String = js.native
  def getChildren(elem: domhandlerLib.domhandlerMod.DomElement): js.Array[domhandlerLib.domhandlerMod.DomElement] = js.native
  def getElementById(id: js.Any, element: js.Any): js.Any = js.native
  def getElementById(id: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
  def getElements(options: js.Any, element: js.Any): js.Any = js.native
  def getElements(options: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
  def getElements(options: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = js.native
  def getElementsByTagName(name: js.Any, element: js.Any): js.Any = js.native
  def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
  def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = js.native
  def getElementsByTagType(`type`: js.Any, element: js.Any): js.Any = js.native
  def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
  def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = js.native
  def getInnerHTML(elem: domhandlerLib.domhandlerMod.DomElement, opts: js.Any): java.lang.String = js.native
  def getName(elem: domhandlerLib.domhandlerMod.DomElement): java.lang.String = js.native
  def getOuterHTML(dom: js.Array[domhandlerLib.domhandlerMod.DomElement]): java.lang.String = js.native
  def getOuterHTML(dom: js.Array[domhandlerLib.domhandlerMod.DomElement], opts: domutilsLib.Anon_DecodeEntities): java.lang.String = js.native
  def getParent(elem: domhandlerLib.domhandlerMod.DomElement): domhandlerLib.domhandlerMod.DomElement = js.native
  def getSiblings(elem: domhandlerLib.domhandlerMod.DomElement): js.Array[domhandlerLib.domhandlerMod.DomElement] = js.native
  def getText(elem: domhandlerLib.domhandlerMod.DomElement): java.lang.String = js.native
  def hasAttrib(elem: domhandlerLib.domhandlerMod.DomElement, name: java.lang.String): scala.Boolean = js.native
  def isTag(elem: domhandlerLib.domhandlerMod.DomElement): scala.Boolean = js.native
  def prepend(elem: domhandlerLib.domhandlerMod.DomElement, prev: domhandlerLib.domhandlerMod.DomElement): scala.Unit = js.native
  def removeElement(elem: domhandlerLib.domhandlerMod.DomElement): scala.Unit = js.native
  def removeSubsets(nodes: js.Array[domhandlerLib.domhandlerMod.DomElement]): js.Array[domhandlerLib.domhandlerMod.DomElement] = js.native
  def replaceElement(elem: domhandlerLib.domhandlerMod.DomElement, replacement: domhandlerLib.domhandlerMod.DomElement): scala.Unit = js.native
  def testElement(options: js.Any, element: js.Any): js.Any = js.native
  def uniqueSort(nodes: js.Array[domhandlerLib.domhandlerMod.DomElement]): js.Array[domhandlerLib.domhandlerMod.DomElement] = js.native
}

