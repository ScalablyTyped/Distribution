package typings.dojo.dojox.dtl.tag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/tag/loop.html
  *
  *
  */
trait loop extends js.Object {
  /**
    *
    * @param cyclevars
    * @param name
    * @param text
    * @param shared
    */
  def CycleNode(cyclevars: js.Any, name: js.Any, text: js.Any, shared: js.Any): Unit
  /**
    *
    * @param nodes
    * @param vars
    * @param shared
    */
  def IfChangedNode(nodes: js.Any, vars: js.Any, shared: js.Any): Unit
  /**
    *
    * @param expression
    * @param key
    * @param alias
    */
  def RegroupNode(expression: js.Any, key: js.Any, alias: js.Any): Unit
  /**
    * Cycle among the given strings each time this tag is encountered
    *
    * @param parser
    * @param token
    */
  def cycle(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def ifchanged(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def regroup(parser: js.Any, token: js.Any): js.Any
}

object loop {
  @scala.inline
  def apply(
    CycleNode: (js.Any, js.Any, js.Any, js.Any) => Unit,
    IfChangedNode: (js.Any, js.Any, js.Any) => Unit,
    RegroupNode: (js.Any, js.Any, js.Any) => Unit,
    cycle: (js.Any, js.Any) => js.Any,
    ifchanged: (js.Any, js.Any) => js.Any,
    regroup: (js.Any, js.Any) => js.Any
  ): loop = {
    val __obj = js.Dynamic.literal(CycleNode = js.Any.fromFunction4(CycleNode), IfChangedNode = js.Any.fromFunction3(IfChangedNode), RegroupNode = js.Any.fromFunction3(RegroupNode), cycle = js.Any.fromFunction2(cycle), ifchanged = js.Any.fromFunction2(ifchanged), regroup = js.Any.fromFunction2(regroup))
  
    __obj.asInstanceOf[loop]
  }
}

