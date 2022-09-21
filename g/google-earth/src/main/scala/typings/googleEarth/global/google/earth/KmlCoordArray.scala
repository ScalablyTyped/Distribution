package typings.googleEarth.global.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.KmlCoordArray")
@js.native
open class KmlCoordArray ()
  extends StObject
     with typings.googleEarth.google.earth.KmlCoordArray {
  
  /**
    * Clears all of the elements in the array
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /**
    * Returns the coordinates at the given index.
    */
  /* CompleteClass */
  override def get(index: Double): typings.googleEarth.google.earth.KmlCoord = js.native
  
  /**
    * Specifies the length of the index array.
    */
  /* CompleteClass */
  override def getLength(): Double = js.native
  
  /**
    * Deletes the last element of an array, decrements the array length, and returns the value that is removed.
    */
  /* CompleteClass */
  override def pop(): typings.googleEarth.google.earth.KmlCoord = js.native
  
  /**
    * Appends one or more new elements to the end of an array and returns the new length of the array.
    */
  /* CompleteClass */
  override def push(coordOrList: typings.googleEarth.google.earth.KmlCoord): Unit = js.native
  
  /**
    * Appends one or more new elements to the end of an array and returns the new length of the array.
    */
  /* CompleteClass */
  override def pushLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit = js.native
  
  /**
    * Reverses the order of the elements in the array.
    */
  /* CompleteClass */
  override def reverse(): Unit = js.native
  
  /**
    * Sets the coordinates at the given index..
    */
  /* CompleteClass */
  override def set(index: Double, coord: typings.googleEarth.google.earth.KmlCoord): Unit = js.native
  
  /**
    * Sets the latitude, longitude, and altitude.
    */
  /* CompleteClass */
  override def setLatLngAlt(index: Double, latitude: Double, longitude: Double, altitude: Double): Unit = js.native
  
  /**
    * Removes and returns the first element of the array.
    */
  /* CompleteClass */
  override def shift(): typings.googleEarth.google.earth.KmlCoord = js.native
  
  /**
    * Adds an element or elements to the beginning of an array.
    */
  /* CompleteClass */
  override def unshift(coordOrList: typings.googleEarth.google.earth.KmlCoord): Double = js.native
  
  /**
    * Adds an element or elements to the beginning of an array.
    */
  /* CompleteClass */
  override def unshiftLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit = js.native
}
