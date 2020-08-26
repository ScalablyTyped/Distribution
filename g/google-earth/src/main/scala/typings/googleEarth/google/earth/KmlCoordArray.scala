package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlCoordArray extends js.Object {
  /**
    * Clears all of the elements in the array
    */
  def clear(): Unit = js.native
  /**
    * Returns the coordinates at the given index.
    */
  def get(index: Double): KmlCoord = js.native
  /**
    * Specifies the length of the index array.
    */
  def getLength(): Double = js.native
  /**
    * Deletes the last element of an array, decrements the array length, and returns the value that is removed.
    */
  def pop(): KmlCoord = js.native
  /**
    * Appends one or more new elements to the end of an array and returns the new length of the array.
    */
  def push(coordOrList: KmlCoord): Unit = js.native
  /**
    * Appends one or more new elements to the end of an array and returns the new length of the array.
    */
  def pushLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit = js.native
  /**
    * Reverses the order of the elements in the array.
    */
  def reverse(): Unit = js.native
  /**
    * Sets the coordinates at the given index..
    */
  def set(index: Double, coord: KmlCoord): Unit = js.native
  /**
    * Sets the latitude, longitude, and altitude.
    */
  def setLatLngAlt(index: Double, latitude: Double, longitude: Double, altitude: Double): Unit = js.native
  /**
    * Removes and returns the first element of the array.
    */
  def shift(): KmlCoord = js.native
  /**
    * Adds an element or elements to the beginning of an array.
    */
  def unshift(coordOrList: KmlCoord): Double = js.native
  /**
    * Adds an element or elements to the beginning of an array.
    */
  def unshiftLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit = js.native
}

object KmlCoordArray {
  @scala.inline
  def apply(
    clear: () => Unit,
    get: Double => KmlCoord,
    getLength: () => Double,
    pop: () => KmlCoord,
    push: KmlCoord => Unit,
    pushLatLngAlt: (Double, Double, Double) => Unit,
    reverse: () => Unit,
    set: (Double, KmlCoord) => Unit,
    setLatLngAlt: (Double, Double, Double, Double) => Unit,
    shift: () => KmlCoord,
    unshift: KmlCoord => Double,
    unshiftLatLngAlt: (Double, Double, Double) => Unit
  ): KmlCoordArray = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), getLength = js.Any.fromFunction0(getLength), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), pushLatLngAlt = js.Any.fromFunction3(pushLatLngAlt), reverse = js.Any.fromFunction0(reverse), set = js.Any.fromFunction2(set), setLatLngAlt = js.Any.fromFunction4(setLatLngAlt), shift = js.Any.fromFunction0(shift), unshift = js.Any.fromFunction1(unshift), unshiftLatLngAlt = js.Any.fromFunction3(unshiftLatLngAlt))
    __obj.asInstanceOf[KmlCoordArray]
  }
  @scala.inline
  implicit class KmlCoordArrayOps[Self <: KmlCoordArray] (val x: Self) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGet(value: Double => KmlCoord): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def setPop(value: () => KmlCoord): Self = this.set("pop", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: KmlCoord => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def setPushLatLngAlt(value: (Double, Double, Double) => Unit): Self = this.set("pushLatLngAlt", js.Any.fromFunction3(value))
    @scala.inline
    def setReverse(value: () => Unit): Self = this.set("reverse", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (Double, KmlCoord) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setSetLatLngAlt(value: (Double, Double, Double, Double) => Unit): Self = this.set("setLatLngAlt", js.Any.fromFunction4(value))
    @scala.inline
    def setShift(value: () => KmlCoord): Self = this.set("shift", js.Any.fromFunction0(value))
    @scala.inline
    def setUnshift(value: KmlCoord => Double): Self = this.set("unshift", js.Any.fromFunction1(value))
    @scala.inline
    def setUnshiftLatLngAlt(value: (Double, Double, Double) => Unit): Self = this.set("unshiftLatLngAlt", js.Any.fromFunction3(value))
  }
  
}

