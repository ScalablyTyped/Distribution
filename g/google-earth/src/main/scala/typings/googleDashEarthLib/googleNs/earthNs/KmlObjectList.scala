package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlObjectList")
@js.native
class KmlObjectList[T /* <: KmlObject */] () extends js.Object {
  /**
       * Number of objects in collection.
       */
  def getLength(): scala.Double = js.native
  /**
       * Gets an item from the object list. For example, list.item(0) returns the first object in the list.
       */
  def item(index: scala.Double): T = js.native
}

