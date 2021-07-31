package typings.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Query the code AST using the selector string. */
@scala.inline
def apply(ast: typings.estree.mod.Node, selector: java.lang.String): js.Array[typings.estree.mod.Node] = (typings.esquery.mod.^.asInstanceOf[js.Dynamic].apply(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.estree.mod.Node]]

/** From a JS AST and a selector AST, collect all JS AST nodes that match the selector. */
@scala.inline
def `match`(ast: typings.estree.mod.Node, selector: typings.esquery.mod.Selector): js.Array[typings.estree.mod.Node] = (typings.esquery.mod.^.asInstanceOf[js.Dynamic].applyDynamic("match")(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.estree.mod.Node]]

/** Given a `node` and its ancestors, determine if `node` is matched by `selector`. */
@scala.inline
def matches(
  node: typings.estree.mod.Node,
  selector: typings.esquery.mod.Selector,
  ancestry: js.Array[typings.estree.mod.Node]
): scala.Boolean = (typings.esquery.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matches")(node.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], ancestry.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

/** Parse a selector and return its AST. */
@scala.inline
def parse(selector: java.lang.String): typings.esquery.mod.Selector = typings.esquery.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.esquery.mod.Selector]

/** Query the code AST using the selector string. */
@scala.inline
def query(ast: typings.estree.mod.Node, selector: java.lang.String): js.Array[typings.estree.mod.Node] = (typings.esquery.mod.^.asInstanceOf[js.Dynamic].applyDynamic("query")(ast.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.estree.mod.Node]]
