package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlObjectList")
@js.native
class KmlObjectList[T /* <: KmlObject */] () extends js.Object {
  /**
    * Number of objects in collection.
    */
  def getLength(): Double = js.native
  /**
    * Gets an item from the object list. For example, list.item(0) returns the first object in the list.
    */
  def item(index: Double): T = js.native
}

