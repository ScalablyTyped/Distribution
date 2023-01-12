package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlCoordArray extends StObject {
  
  /**
    * Clears all of the elements in the array
    */
  def clear(): Unit
  
  /**
    * Returns the coordinates at the given index.
    */
  def get(index: Double): KmlCoord
  
  /**
    * Specifies the length of the index array.
    */
  def getLength(): Double
  
  /**
    * Deletes the last element of an array, decrements the array length, and returns the value that is removed.
    */
  def pop(): KmlCoord
  
  /**
    * Appends one or more new elements to the end of an array and returns the new length of the array.
    */
  def push(coordOrList: KmlCoord): Unit
  
  /**
    * Appends one or more new elements to the end of an array and returns the new length of the array.
    */
  def pushLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit
  
  /**
    * Reverses the order of the elements in the array.
    */
  def reverse(): Unit
  
  /**
    * Sets the coordinates at the given index..
    */
  def set(index: Double, coord: KmlCoord): Unit
  
  /**
    * Sets the latitude, longitude, and altitude.
    */
  def setLatLngAlt(index: Double, latitude: Double, longitude: Double, altitude: Double): Unit
  
  /**
    * Removes and returns the first element of the array.
    */
  def shift(): KmlCoord
  
  /**
    * Adds an element or elements to the beginning of an array.
    */
  def unshift(coordOrList: KmlCoord): Double
  
  /**
    * Adds an element or elements to the beginning of an array.
    */
  def unshiftLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit
}
object KmlCoordArray {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: KmlCoordArray] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGet(value: Double => KmlCoord): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    inline def setPop(value: () => KmlCoord): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    inline def setPush(value: KmlCoord => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setPushLatLngAlt(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "pushLatLngAlt", js.Any.fromFunction3(value))
    
    inline def setReverse(value: () => Unit): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
    
    inline def setSet(value: (Double, KmlCoord) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetLatLngAlt(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setLatLngAlt", js.Any.fromFunction4(value))
    
    inline def setShift(value: () => KmlCoord): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
    
    inline def setUnshift(value: KmlCoord => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    
    inline def setUnshiftLatLngAlt(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "unshiftLatLngAlt", js.Any.fromFunction3(value))
  }
}
