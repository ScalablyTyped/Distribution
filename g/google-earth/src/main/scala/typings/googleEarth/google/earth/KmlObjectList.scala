package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlObjectList[T /* <: KmlObject */] extends js.Object {
  /**
    * Number of objects in collection.
    */
  def getLength(): Double
  /**
    * Gets an item from the object list. For example, list.item(0) returns the first object in the list.
    */
  def item(index: Double): T
}

object KmlObjectList {
  @scala.inline
  def apply[T](getLength: () => Double, item: Double => T): KmlObjectList[T] = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), item = js.Any.fromFunction1(item))
    __obj.asInstanceOf[KmlObjectList[T]]
  }
}

