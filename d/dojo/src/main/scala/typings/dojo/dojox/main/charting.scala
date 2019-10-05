package typings.dojo.dojox.main

import typings.dojo.dojox.gfx.shape.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/main.charting.html
  *
  *
  */
trait charting extends js.Object {
  /**
    * Hides the tooltip displayed around the given shape.
    *
    * @param gfxObject A gfx shape.
    */
  def hideTooltip(gfxObject: Shape): Unit
  /**
    * Show a Tooltip displaying the given HTML message around the given gfx shape.
    *
    * @param innerHTML The message to display as a HTML string.
    * @param gfxObject The gfx shape around which the tooltip will be placed.
    * @param positions               Optional
    */
  def showTooltip(innerHTML: String, gfxObject: Shape, positions: js.Array[String]): Unit
}

object charting {
  @scala.inline
  def apply(hideTooltip: Shape => Unit, showTooltip: (String, Shape, js.Array[String]) => Unit): charting = {
    val __obj = js.Dynamic.literal(hideTooltip = js.Any.fromFunction1(hideTooltip), showTooltip = js.Any.fromFunction3(showTooltip))
  
    __obj.asInstanceOf[charting]
  }
}

