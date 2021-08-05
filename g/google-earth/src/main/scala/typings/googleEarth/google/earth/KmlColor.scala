package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlColor extends StObject {
  
  /**
    * Returns the color of an object.
    */
  def get(): String
  
  /**
    * opacity value
    */
  def getA(): Double
  
  /**
    * blue numerical value
    */
  def getB(): Double
  
  /**
    * green numerical value
    */
  def getG(): Double
  
  /**
    * red numerical value
    */
  def getR(): Double
  
  /**
    * Set the color of an object.
    */
  def set(color: String): Unit
  
  /**
    * opacity value
    */
  def setA(a: Double): Unit
  
  /**
    * blue numerical value
    */
  def setB(b: Double): Unit
  
  /**
    * green numerical value
    */
  def setG(g: Double): Unit
  
  /**
    * red numerical value
    */
  def setR(r: Double): Unit
}
object KmlColor {
  
  inline def apply(
    get: () => String,
    getA: () => Double,
    getB: () => Double,
    getG: () => Double,
    getR: () => Double,
    set: String => Unit,
    setA: Double => Unit,
    setB: Double => Unit,
    setG: Double => Unit,
    setR: Double => Unit
  ): KmlColor = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), getA = js.Any.fromFunction0(getA), getB = js.Any.fromFunction0(getB), getG = js.Any.fromFunction0(getG), getR = js.Any.fromFunction0(getR), set = js.Any.fromFunction1(set), setA = js.Any.fromFunction1(setA), setB = js.Any.fromFunction1(setB), setG = js.Any.fromFunction1(setG), setR = js.Any.fromFunction1(setR))
    __obj.asInstanceOf[KmlColor]
  }
  
  extension [Self <: KmlColor](x: Self) {
    
    inline def setGet(value: () => String): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setGetA(value: () => Double): Self = StObject.set(x, "getA", js.Any.fromFunction0(value))
    
    inline def setGetB(value: () => Double): Self = StObject.set(x, "getB", js.Any.fromFunction0(value))
    
    inline def setGetG(value: () => Double): Self = StObject.set(x, "getG", js.Any.fromFunction0(value))
    
    inline def setGetR(value: () => Double): Self = StObject.set(x, "getR", js.Any.fromFunction0(value))
    
    inline def setSet(value: String => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setSetA(value: Double => Unit): Self = StObject.set(x, "setA", js.Any.fromFunction1(value))
    
    inline def setSetB(value: Double => Unit): Self = StObject.set(x, "setB", js.Any.fromFunction1(value))
    
    inline def setSetG(value: Double => Unit): Self = StObject.set(x, "setG", js.Any.fromFunction1(value))
    
    inline def setSetR(value: Double => Unit): Self = StObject.set(x, "setR", js.Any.fromFunction1(value))
  }
}
