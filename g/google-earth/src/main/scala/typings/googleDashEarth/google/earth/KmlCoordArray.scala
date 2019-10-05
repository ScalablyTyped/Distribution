package typings.googleDashEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlCoordArray")
@js.native
class KmlCoordArray () extends js.Object {
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

