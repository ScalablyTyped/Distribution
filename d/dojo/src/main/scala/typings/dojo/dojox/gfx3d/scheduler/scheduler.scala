package typings.dojo.dojox.gfx3d.scheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/scheduler.scheduler.html
  *
  *
  */
trait scheduler extends js.Object {
  /**
    *
    */
  def BinarySearchTree(): Unit
  /**
    *
    * @param buffer
    * @param outline
    */
  def bsp(buffer: js.Any, outline: js.Any): js.Any
  /**
    *
    * @param it
    */
  def order(it: js.Any): js.Any
  /**
    *
    * @param it
    */
  def outline(it: js.Any): js.Any
  /**
    *
    * @param buffer
    * @param order
    */
  def zOrder(buffer: js.Any, order: js.Any): js.Any
}

object scheduler {
  @scala.inline
  def apply(
    BinarySearchTree: () => Unit,
    bsp: (js.Any, js.Any) => js.Any,
    order: js.Any => js.Any,
    outline: js.Any => js.Any,
    zOrder: (js.Any, js.Any) => js.Any
  ): scheduler = {
    val __obj = js.Dynamic.literal(BinarySearchTree = js.Any.fromFunction0(BinarySearchTree), bsp = js.Any.fromFunction2(bsp), order = js.Any.fromFunction1(order), outline = js.Any.fromFunction1(outline), zOrder = js.Any.fromFunction2(zOrder))
  
    __obj.asInstanceOf[scheduler]
  }
}

