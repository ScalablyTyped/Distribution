package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gdal", "Envelope")
@js.native
class Envelope protected () extends js.Object {
  def this(bounds: EnvelopeBounds) = this()
  def contains(envelope: Envelope): scala.Boolean = js.native
  def intersect(envelope: Envelope): scala.Unit = js.native
  def intersects(envelope: Envelope): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  def merge(envelope: Envelope): scala.Unit = js.native
  def toPolygon(): Polygon = js.native
}

