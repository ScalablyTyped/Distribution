package typings.dojo.dojox.drawing.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/util/positioning.html
  *
  *
  */
trait positioning extends js.Object {
  /**
    * Returns the optimal position for annotations.Angle.
    *
    * @param start
    * @param end
    */
  def angle(start: js.Object, end: js.Object): js.Object
  /**
    * Returns the optimal text positions for annotations.Label.
    *
    * @param start
    * @param end
    */
  def label(start: js.Object, end: js.Object): js.Object
}

object positioning {
  @scala.inline
  def apply(angle: (js.Object, js.Object) => js.Object, label: (js.Object, js.Object) => js.Object): positioning = {
    val __obj = js.Dynamic.literal(angle = js.Any.fromFunction2(angle), label = js.Any.fromFunction2(label))
    __obj.asInstanceOf[positioning]
  }
}

