package typings.dojo.dojox.geo.openlayers.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.widget.html
  *
  *
  */
trait widget extends js.Object {
  /**
    *
    */
  def Map(): Unit
}

object widget {
  @scala.inline
  def apply(Map: () => Unit): widget = {
    val __obj = js.Dynamic.literal(Map = js.Any.fromFunction0(Map))
    __obj.asInstanceOf[widget]
  }
}

