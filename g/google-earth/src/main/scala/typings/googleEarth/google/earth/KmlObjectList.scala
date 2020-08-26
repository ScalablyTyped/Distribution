package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlObjectList[T /* <: KmlObject */] extends js.Object {
  /**
    * Number of objects in collection.
    */
  def getLength(): Double = js.native
  /**
    * Gets an item from the object list. For example, list.item(0) returns the first object in the list.
    */
  def item(index: Double): T = js.native
}

object KmlObjectList {
  @scala.inline
  def apply[/* <: typings.googleEarth.google.earth.KmlObject */ T](getLength: () => Double, item: Double => T): KmlObjectList[T] = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), item = js.Any.fromFunction1(item))
    __obj.asInstanceOf[KmlObjectList[T]]
  }
  @scala.inline
  implicit class KmlObjectListOps[Self <: KmlObjectList[_], /* <: typings.googleEarth.google.earth.KmlObject */ T] (val x: Self with KmlObjectList[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def setItem(value: Double => T): Self = this.set("item", js.Any.fromFunction1(value))
  }
  
}

