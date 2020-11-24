package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gdal", "Envelope")
@js.native
class Envelope protected () extends js.Object {
  def this(bounds: EnvelopeBounds) = this()
  
  def contains(envelope: Envelope): Boolean = js.native
  
  def intersect(envelope: Envelope): Unit = js.native
  
  def intersects(envelope: Envelope): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  def merge(envelope: Envelope): Unit = js.native
  
  def toPolygon(): Polygon = js.native
}
