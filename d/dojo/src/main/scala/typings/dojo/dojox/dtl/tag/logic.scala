package typings.dojo.dojox.dtl.tag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/tag/logic.html
  *
  *
  */
trait logic extends js.Object {
  /**
    *
    * @param assign
    * @param loop
    * @param reversed
    * @param nodelist
    */
  def ForNode(assign: js.Any, loop: js.Any, reversed: js.Any, nodelist: js.Any): Unit
  /**
    *
    * @param var1
    * @param var2
    * @param trues
    * @param falses
    * @param negate
    */
  def IfEqualNode(var1: js.Any, var2: js.Any, trues: js.Any, falses: js.Any, negate: js.Any): Unit
  /**
    *
    * @param bools
    * @param trues
    * @param falses
    * @param type
    */
  def IfNode(bools: js.Any, trues: js.Any, falses: js.Any, `type`: js.Any): Unit
  /**
    *
    * @param parser
    * @param token
    */
  def for_(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def if_(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def ifequal(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def ifnotequal(parser: js.Any, token: js.Any): js.Any
}

object logic {
  @scala.inline
  def apply(
    ForNode: (js.Any, js.Any, js.Any, js.Any) => Unit,
    IfEqualNode: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit,
    IfNode: (js.Any, js.Any, js.Any, js.Any) => Unit,
    for_ : (js.Any, js.Any) => js.Any,
    if_ : (js.Any, js.Any) => js.Any,
    ifequal: (js.Any, js.Any) => js.Any,
    ifnotequal: (js.Any, js.Any) => js.Any
  ): logic = {
    val __obj = js.Dynamic.literal(ForNode = js.Any.fromFunction4(ForNode), IfEqualNode = js.Any.fromFunction5(IfEqualNode), IfNode = js.Any.fromFunction4(IfNode), for_ = js.Any.fromFunction2(for_), if_ = js.Any.fromFunction2(if_), ifequal = js.Any.fromFunction2(ifequal), ifnotequal = js.Any.fromFunction2(ifnotequal))
  
    __obj.asInstanceOf[logic]
  }
}

