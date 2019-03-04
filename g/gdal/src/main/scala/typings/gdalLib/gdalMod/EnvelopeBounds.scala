package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvelopeBounds extends js.Object {
  var maxX: scala.Double
  var maxY: scala.Double
  var minX: scala.Double
  var minY: scala.Double
}

object EnvelopeBounds {
  @scala.inline
  def apply(maxX: scala.Double, maxY: scala.Double, minX: scala.Double, minY: scala.Double): EnvelopeBounds = {
    val __obj = js.Dynamic.literal(maxX = maxX, maxY = maxY, minX = minX, minY = minY)
  
    __obj.asInstanceOf[EnvelopeBounds]
  }
}

