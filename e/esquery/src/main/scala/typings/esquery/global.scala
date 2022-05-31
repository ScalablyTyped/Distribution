package typings.esquery

import typings.esquery.mod.Selector
import typings.estree.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object esquery {
    
    /** Query the code AST using the selector string. */
    inline def apply(ast: Node, selector: String): js.Array[Node] = (^.asInstanceOf[js.Dynamic].apply(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
    
    @JSGlobal("esquery")
    @js.native
    val ^ : js.Any = js.native
    
    /** From a JS AST and a selector AST, collect all JS AST nodes that match the selector. */
    inline def `match`(ast: Node, selector: Selector): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
    
    /** Given a `node` and its ancestors, determine if `node` is matched by `selector`. */
    inline def matches(node: Node, selector: Selector, ancestry: js.Array[Node]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], ancestry.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /** Parse a selector and return its AST. */
    inline def parse(selector: String): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(selector.asInstanceOf[js.Any]).asInstanceOf[Selector]
    
    /** Query the code AST using the selector string. */
    inline def query(ast: Node, selector: String): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  }
}
