package typings.dojo.dojox.geo.openlayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/Patch.html
  *
  *
  */
trait Patch extends js.Object {
  /**
    *
    */
  def patchGFX(): Unit
}

object Patch {
  @scala.inline
  def apply(patchGFX: () => Unit): Patch = {
    val __obj = js.Dynamic.literal(patchGFX = js.Any.fromFunction0(patchGFX))
    __obj.asInstanceOf[Patch]
  }
}

