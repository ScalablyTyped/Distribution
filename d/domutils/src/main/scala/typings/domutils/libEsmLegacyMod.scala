package typings.domutils

import org.scalablytyped.runtime.StringDictionary
import typings.domelementtype.mod.ElementType
import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.mod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmLegacyMod {
  
  @JSImport("domutils/lib/esm/legacy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getElementById(id: String, nodes: js.Array[AnyNode]): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def getElementById(id: String, nodes: js.Array[AnyNode], recurse: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def getElementById(id: String, nodes: AnyNode): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def getElementById(id: String, nodes: AnyNode, recurse: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def getElementById(id: js.Function1[/* id */ String, Boolean], nodes: js.Array[AnyNode]): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def getElementById(id: js.Function1[/* id */ String, Boolean], nodes: js.Array[AnyNode], recurse: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def getElementById(id: js.Function1[/* id */ String, Boolean], nodes: AnyNode): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def getElementById(id: js.Function1[/* id */ String, Boolean], nodes: AnyNode, recurse: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  inline def getElements(options: TestElementOpts, nodes: js.Array[AnyNode], recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElements(options: TestElementOpts, nodes: js.Array[AnyNode], recurse: Boolean, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElements(options: TestElementOpts, nodes: AnyNode, recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElements(options: TestElementOpts, nodes: AnyNode, recurse: Boolean, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(options.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  
  inline def getElementsByTagName(tagName: String, nodes: js.Array[AnyNode]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(tagName: String, nodes: js.Array[AnyNode], recurse: Boolean): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(tagName: String, nodes: js.Array[AnyNode], recurse: Boolean, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(tagName: String, nodes: js.Array[AnyNode], recurse: Unit, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(tagName: String, nodes: AnyNode): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(tagName: String, nodes: AnyNode, recurse: Boolean): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(tagName: String, nodes: AnyNode, recurse: Boolean, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(tagName: String, nodes: AnyNode, recurse: Unit, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(tagName: js.Function1[/* name */ String, Boolean], nodes: js.Array[AnyNode]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(tagName: js.Function1[/* name */ String, Boolean], nodes: js.Array[AnyNode], recurse: Boolean): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(
    tagName: js.Function1[/* name */ String, Boolean],
    nodes: js.Array[AnyNode],
    recurse: Boolean,
    limit: Double
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(
    tagName: js.Function1[/* name */ String, Boolean],
    nodes: js.Array[AnyNode],
    recurse: Unit,
    limit: Double
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(tagName: js.Function1[/* name */ String, Boolean], nodes: AnyNode): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(tagName: js.Function1[/* name */ String, Boolean], nodes: AnyNode, recurse: Boolean): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(tagName: js.Function1[/* name */ String, Boolean], nodes: AnyNode, recurse: Boolean, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(tagName: js.Function1[/* name */ String, Boolean], nodes: AnyNode, recurse: Unit, limit: Double): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], nodes: js.Array[AnyNode]): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], nodes: js.Array[AnyNode], recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(
    `type`: js.Function1[/* type */ ElementType, Boolean],
    nodes: js.Array[AnyNode],
    recurse: Boolean,
    limit: Double
  ): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(
    `type`: js.Function1[/* type */ ElementType, Boolean],
    nodes: js.Array[AnyNode],
    recurse: Unit,
    limit: Double
  ): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], nodes: AnyNode): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(`type`: js.Function1[/* type */ ElementType, Boolean], nodes: AnyNode, recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(
    `type`: js.Function1[/* type */ ElementType, Boolean],
    nodes: AnyNode,
    recurse: Boolean,
    limit: Double
  ): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(
    `type`: js.Function1[/* type */ ElementType, Boolean],
    nodes: AnyNode,
    recurse: Unit,
    limit: Double
  ): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(`type`: ElementType, nodes: js.Array[AnyNode]): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(`type`: ElementType, nodes: js.Array[AnyNode], recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(`type`: ElementType, nodes: js.Array[AnyNode], recurse: Boolean, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(`type`: ElementType, nodes: js.Array[AnyNode], recurse: Unit, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(`type`: ElementType, nodes: AnyNode): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(`type`: ElementType, nodes: AnyNode, recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(`type`: ElementType, nodes: AnyNode, recurse: Boolean, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def getElementsByTagType(`type`: ElementType, nodes: AnyNode, recurse: Unit, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagType")(`type`.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  
  inline def testElement(options: TestElementOpts, node: AnyNode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testElement")(options.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait TestElementOpts
    extends StObject
       with /* attributeName */ StringDictionary[js.UndefOr[String | (js.Function1[/* attributeValue */ String, Boolean])]] {
    
    var tag_contains: js.UndefOr[String | (js.Function1[/* data */ js.UndefOr[String], Boolean])] = js.undefined
    
    var tag_name: js.UndefOr[String | (js.Function1[/* name */ String, Boolean])] = js.undefined
    
    var tag_type: js.UndefOr[String | (js.Function1[/* name */ String, Boolean])] = js.undefined
  }
  object TestElementOpts {
    
    inline def apply(): TestElementOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestElementOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestElementOpts] (val x: Self) extends AnyVal {
      
      inline def setTag_contains(value: String | (js.Function1[/* data */ js.UndefOr[String], Boolean])): Self = StObject.set(x, "tag_contains", value.asInstanceOf[js.Any])
      
      inline def setTag_containsFunction1(value: /* data */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "tag_contains", js.Any.fromFunction1(value))
      
      inline def setTag_containsUndefined: Self = StObject.set(x, "tag_contains", js.undefined)
      
      inline def setTag_name(value: String | (js.Function1[/* name */ String, Boolean])): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
      
      inline def setTag_nameFunction1(value: /* name */ String => Boolean): Self = StObject.set(x, "tag_name", js.Any.fromFunction1(value))
      
      inline def setTag_nameUndefined: Self = StObject.set(x, "tag_name", js.undefined)
      
      inline def setTag_type(value: String | (js.Function1[/* name */ String, Boolean])): Self = StObject.set(x, "tag_type", value.asInstanceOf[js.Any])
      
      inline def setTag_typeFunction1(value: /* name */ String => Boolean): Self = StObject.set(x, "tag_type", js.Any.fromFunction1(value))
      
      inline def setTag_typeUndefined: Self = StObject.set(x, "tag_type", js.undefined)
    }
  }
}
