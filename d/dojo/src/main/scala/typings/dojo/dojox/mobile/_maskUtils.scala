package typings.dojo.dojox.mobile

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_maskUtils.html
  *
  * Utility methods to clip rounded corners of various elements (Switch, ScrollablePane, scrollbars in scrollable widgets).
  * Uses -webkit-mask-image on webkit, or SVG on other browsers.
  *
  */
trait _maskUtils extends js.Object {
  /**
    * Creates and sets a mask for the specified node.
    *
    * @param node
    * @param x
    * @param y
    * @param r
    * @param b
    * @param w
    * @param h
    * @param rx
    * @param ry
    * @param e
    */
  def createRoundMask(
    node: HTMLElement,
    x: js.Any,
    y: js.Any,
    r: js.Any,
    b: js.Any,
    w: js.Any,
    h: js.Any,
    rx: Double,
    ry: Double,
    e: js.Any
  ): Unit
}

object _maskUtils {
  @scala.inline
  def apply(
    createRoundMask: (HTMLElement, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, Double, Double, js.Any) => Unit
  ): _maskUtils = {
    val __obj = js.Dynamic.literal(createRoundMask = js.Any.fromFunction10(createRoundMask))
  
    __obj.asInstanceOf[_maskUtils]
  }
}

