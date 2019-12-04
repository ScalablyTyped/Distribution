package typings.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/gradutils.html
  *
  *
  */
trait gradutils extends js.Object {
  /**
    * sample a color from a gradient using a point
    *
    * @param fill fill object
    * @param pt point where to sample a color
    */
  def getColor(fill: js.Object, pt: js.Object): Unit
  /**
    * reverses a gradient
    *
    * @param fill fill object
    */
  def reverse(fill: js.Object): Unit
}

object gradutils {
  @scala.inline
  def apply(getColor: (js.Object, js.Object) => Unit, reverse: js.Object => Unit): gradutils = {
    val __obj = js.Dynamic.literal(getColor = js.Any.fromFunction2(getColor), reverse = js.Any.fromFunction1(reverse))
  
    __obj.asInstanceOf[gradutils]
  }
}

