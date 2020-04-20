package typings.dojo.dojox.charting.bidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/bidi/_bidiutils.html
  *
  *
  */
trait bidiutils extends js.Object {
  /**
    *
    * @param plot
    * @param dim
    * @param offsets
    * @param rtl
    */
  def reverseMatrix(plot: js.Any, dim: js.Any, offsets: js.Any, rtl: js.Any): Unit
}

object bidiutils {
  @scala.inline
  def apply(reverseMatrix: (js.Any, js.Any, js.Any, js.Any) => Unit): bidiutils = {
    val __obj = js.Dynamic.literal(reverseMatrix = js.Any.fromFunction4(reverseMatrix))
    __obj.asInstanceOf[bidiutils]
  }
}

