package typings.domutils

import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.mod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmQueryingMod {
  
  @JSImport("domutils/lib/esm/querying", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def existsOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[AnyNode]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("existsOne")(test.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def filter(test: js.Function1[/* elem */ AnyNode, Boolean], node: js.Array[AnyNode]): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def filter(test: js.Function1[/* elem */ AnyNode, Boolean], node: js.Array[AnyNode], recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def filter(
    test: js.Function1[/* elem */ AnyNode, Boolean],
    node: js.Array[AnyNode],
    recurse: Boolean,
    limit: Double
  ): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def filter(
    test: js.Function1[/* elem */ AnyNode, Boolean],
    node: js.Array[AnyNode],
    recurse: Unit,
    limit: Double
  ): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def filter(test: js.Function1[/* elem */ AnyNode, Boolean], node: AnyNode): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def filter(test: js.Function1[/* elem */ AnyNode, Boolean], node: AnyNode, recurse: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def filter(test: js.Function1[/* elem */ AnyNode, Boolean], node: AnyNode, recurse: Boolean, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def filter(test: js.Function1[/* elem */ AnyNode, Boolean], node: AnyNode, recurse: Unit, limit: Double): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any], node.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  
  inline def find(
    test: js.Function1[/* elem */ AnyNode, Boolean],
    nodes: js.Array[AnyNode],
    recurse: Boolean,
    limit: Double
  ): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(test.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  
  inline def findAll(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[AnyNode]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAll")(test.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def findOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[AnyNode]): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(test.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def findOne(test: js.Function1[/* elem */ Element, Boolean], nodes: js.Array[AnyNode], recurse: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(test.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  inline def findOneChild[T](test: js.Function1[/* elem */ T, Boolean], nodes: js.Array[T]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOneChild")(test.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
}
