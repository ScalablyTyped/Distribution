package typings
package flowdocLib.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var h: scala.Double
  var w: scala.Double
}

object Size {
  @scala.inline
  def apply(h: scala.Double, w: scala.Double): Size = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("w")(w)
    __obj.asInstanceOf[Size]
  }
}

