package typings.domutils

import typings.domhandler.mod.DomElement
import typings.domutils.anon.DecodeEntities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("domutils", "append")
  @js.native
  def append(elem: DomElement, next: DomElement): Unit = js.native
  
  @JSImport("domutils", "appendChild")
  @js.native
  def appendChild(elem: DomElement, child: DomElement): Unit = js.native
  
  @JSImport("domutils", "compareDocumentPosition")
  @js.native
  def compareDocumentPosition(nodeA: DomElement, nodeB: DomElement): Double = js.native
  
  @JSImport("domutils", "existsOne")
  @js.native
  def existsOne(test: js.Any, elems: js.Array[DomElement]): Boolean = js.native
  
  @JSImport("domutils", "filter")
  @js.native
  def filter(test: js.Any, element: DomElement, recurse: Boolean, limit: Double): js.Array[DomElement] = js.native
  
  @JSImport("domutils", "find")
  @js.native
  def find(test: js.Any, elems: js.Array[DomElement], recurse: Boolean, limit: Double): js.Array[DomElement] = js.native
  
  @JSImport("domutils", "findAll")
  @js.native
  def findAll(test: js.Any, rootElems: js.Array[DomElement]): js.Array[DomElement] = js.native
  
  @JSImport("domutils", "findOne")
  @js.native
  def findOne(test: js.Any, elems: js.Array[DomElement]): DomElement = js.native
  
  @JSImport("domutils", "findOneChild")
  @js.native
  def findOneChild(test: js.Any, elems: js.Array[DomElement]): DomElement = js.native
  
  @JSImport("domutils", "getAttributeValue")
  @js.native
  def getAttributeValue(elem: DomElement, name: String): String = js.native
  
  @JSImport("domutils", "getChildren")
  @js.native
  def getChildren(elem: DomElement): js.Array[DomElement] = js.native
  
  @JSImport("domutils", "getElementById")
  @js.native
  def getElementById(id: js.Any, element: js.Any): js.Any = js.native
  @JSImport("domutils", "getElementById")
  @js.native
  def getElementById(id: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
  
  @JSImport("domutils", "getElements")
  @js.native
  def getElements(options: js.Any, element: js.Any): js.Any = js.native
  @JSImport("domutils", "getElements")
  @js.native
  def getElements(options: js.Any, element: js.Any, recurse: js.UndefOr[scala.Nothing], limit: js.Any): js.Any = js.native
  @JSImport("domutils", "getElements")
  @js.native
  def getElements(options: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
  @JSImport("domutils", "getElements")
  @js.native
  def getElements(options: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = js.native
  
  @JSImport("domutils", "getElementsByTagName")
  @js.native
  def getElementsByTagName(name: js.Any, element: js.Any): js.Any = js.native
  @JSImport("domutils", "getElementsByTagName")
  @js.native
  def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.UndefOr[scala.Nothing], limit: js.Any): js.Any = js.native
  @JSImport("domutils", "getElementsByTagName")
  @js.native
  def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
  @JSImport("domutils", "getElementsByTagName")
  @js.native
  def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = js.native
  
  @JSImport("domutils", "getElementsByTagType")
  @js.native
  def getElementsByTagType(`type`: js.Any, element: js.Any): js.Any = js.native
  @JSImport("domutils", "getElementsByTagType")
  @js.native
  def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.UndefOr[scala.Nothing], limit: js.Any): js.Any = js.native
  @JSImport("domutils", "getElementsByTagType")
  @js.native
  def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.Any): js.Any = js.native
  @JSImport("domutils", "getElementsByTagType")
  @js.native
  def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = js.native
  
  @JSImport("domutils", "getInnerHTML")
  @js.native
  def getInnerHTML(elem: DomElement, opts: js.Any): String = js.native
  
  @JSImport("domutils", "getName")
  @js.native
  def getName(elem: DomElement): String = js.native
  
  @JSImport("domutils", "getOuterHTML")
  @js.native
  def getOuterHTML(dom: js.Array[DomElement]): String = js.native
  @JSImport("domutils", "getOuterHTML")
  @js.native
  def getOuterHTML(dom: js.Array[DomElement], opts: DecodeEntities): String = js.native
  
  @JSImport("domutils", "getParent")
  @js.native
  def getParent(elem: DomElement): DomElement = js.native
  
  @JSImport("domutils", "getSiblings")
  @js.native
  def getSiblings(elem: DomElement): js.Array[DomElement] = js.native
  
  @JSImport("domutils", "getText")
  @js.native
  def getText(elem: DomElement): String = js.native
  
  @JSImport("domutils", "hasAttrib")
  @js.native
  def hasAttrib(elem: DomElement, name: String): Boolean = js.native
  
  @JSImport("domutils", "isTag")
  @js.native
  def isTag(elem: DomElement): Boolean = js.native
  
  @JSImport("domutils", "prepend")
  @js.native
  def prepend(elem: DomElement, prev: DomElement): Unit = js.native
  
  @JSImport("domutils", "removeElement")
  @js.native
  def removeElement(elem: DomElement): Unit = js.native
  
  @JSImport("domutils", "removeSubsets")
  @js.native
  def removeSubsets(nodes: js.Array[DomElement]): js.Array[DomElement] = js.native
  
  @JSImport("domutils", "replaceElement")
  @js.native
  def replaceElement(elem: DomElement, replacement: DomElement): Unit = js.native
  
  @JSImport("domutils", "testElement")
  @js.native
  def testElement(options: js.Any, element: js.Any): js.Any = js.native
  
  @JSImport("domutils", "uniqueSort")
  @js.native
  def uniqueSort(nodes: js.Array[DomElement]): js.Array[DomElement] = js.native
}
