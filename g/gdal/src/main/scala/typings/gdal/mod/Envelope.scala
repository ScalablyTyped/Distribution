package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gdal", "Envelope")
@js.native
class Envelope protected () extends StObject {
  def this(bounds: EnvelopeBounds) = this()
  
  def contains(envelope: Envelope): Boolean = js.native
  
  def intersect(envelope: Envelope): Unit = js.native
  
  def intersects(envelope: Envelope): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  def merge(envelope: Envelope): Unit = js.native
  
  def toPolygon(): Polygon = js.native
}
