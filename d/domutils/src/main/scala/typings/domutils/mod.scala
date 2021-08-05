package typings.domutils

import typings.domhandler.mod.DomElement
import typings.domutils.anon.DecodeEntities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("domutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def append(elem: DomElement, next: DomElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(elem.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def appendChild(elem: DomElement, child: DomElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendChild")(elem.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def compareDocumentPosition(nodeA: DomElement, nodeB: DomElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDocumentPosition")(nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def existsOne(test: js.Any, elems: js.Array[DomElement]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("existsOne")(test.asInstanceOf[js.Any], elems.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def filter(test: js.Any, element: DomElement, recurse: Boolean, limit: Double): js.Array[DomElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[DomElement]]
  
  inline def find(test: js.Any, elems: js.Array[DomElement], recurse: Boolean, limit: Double): js.Array[DomElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(test.asInstanceOf[js.Any], elems.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[DomElement]]
  
  inline def findAll(test: js.Any, rootElems: js.Array[DomElement]): js.Array[DomElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAll")(test.asInstanceOf[js.Any], rootElems.asInstanceOf[js.Any])).asInstanceOf[js.Array[DomElement]]
  
  inline def findOne(test: js.Any, elems: js.Array[DomElement]): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(test.asInstanceOf[js.Any], elems.asInstanceOf[js.Any])).asInstanceOf[DomElement]
  
  inline def findOneChild(test: js.Any, elems: js.Array[DomElement]): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("findOneChild")(test.asInstanceOf[js.Any], elems.asInstanceOf[js.Any])).asInstanceOf[DomElement]
  
  inline def getAttributeValue(elem: DomElement, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAttributeValue")(elem.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getChildren(elem: DomElement): js.Array[DomElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Array[DomElement]]
  
  inline def getElementById(id: js.Any, element: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getElementById(id: js.Any, element: js.Any, recurse: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getElements(options: js.Any, element: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getElements(options: js.Any, element: js.Any, recurse: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getElements(options: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getElements(options: js.Any, element: js.Any, recurse: Unit, limit: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getElementsByTagName(name: js.Any, element: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(name.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(name.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getElementsByTagName(name: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(name.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getElementsByTagName(name: js.Any, element: js.Any, recurse: Unit, limit: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(name.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getElementsByTagType(`type`: js.Any, element: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: js.Any, limit: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getElementsByTagType(`type`: js.Any, element: js.Any, recurse: Unit, limit: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], element.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getInnerHTML(elem: DomElement, opts: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getInnerHTML")(elem.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getName(elem: DomElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getOuterHTML(dom: js.Array[DomElement]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHTML")(dom.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getOuterHTML(dom: js.Array[DomElement], opts: DecodeEntities): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getOuterHTML")(dom.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getParent(elem: DomElement): DomElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(elem.asInstanceOf[js.Any]).asInstanceOf[DomElement]
  
  inline def getSiblings(elem: DomElement): js.Array[DomElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSiblings")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Array[DomElement]]
  
  inline def getText(elem: DomElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hasAttrib(elem: DomElement, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasAttrib")(elem.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTag(elem: DomElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTag")(elem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def prepend(elem: DomElement, prev: DomElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prepend")(elem.asInstanceOf[js.Any], prev.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeElement(elem: DomElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeElement")(elem.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeSubsets(nodes: js.Array[DomElement]): js.Array[DomElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSubsets")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[DomElement]]
  
  inline def replaceElement(elem: DomElement, replacement: DomElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceElement")(elem.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def testElement(options: js.Any, element: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("testElement")(options.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def uniqueSort(nodes: js.Array[DomElement]): js.Array[DomElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueSort")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[DomElement]]
}
