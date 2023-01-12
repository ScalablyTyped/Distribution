package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoffloat extends StObject {
  
  /**
    * Reads a 64 bit double from a buffer using big endian byte order.
    * @param buf Source buffer
    * @param pos Source buffer offset
    * @returns Value read
    */
  def readDoubleBE(buf: js.typedarray.Uint8Array, pos: Double): Double
  
  /**
    * Reads a 64 bit double from a buffer using little endian byte order.
    * @param buf Source buffer
    * @param pos Source buffer offset
    * @returns Value read
    */
  def readDoubleLE(buf: js.typedarray.Uint8Array, pos: Double): Double
  
  /**
    * Reads a 32 bit float from a buffer using big endian byte order.
    * @param buf Source buffer
    * @param pos Source buffer offset
    * @returns Value read
    */
  def readFloatBE(buf: js.typedarray.Uint8Array, pos: Double): Double
  
  /**
    * Reads a 32 bit float from a buffer using little endian byte order.
    * @param buf Source buffer
    * @param pos Source buffer offset
    * @returns Value read
    */
  def readFloatLE(buf: js.typedarray.Uint8Array, pos: Double): Double
  
  /**
    * Writes a 64 bit double to a buffer using big endian byte order.
    * @param val Value to write
    * @param buf Target buffer
    * @param pos Target buffer offset
    */
  def writeDoubleBE(`val`: Double, buf: js.typedarray.Uint8Array, pos: Double): Unit
  
  /**
    * Writes a 64 bit double to a buffer using little endian byte order.
    * @param val Value to write
    * @param buf Target buffer
    * @param pos Target buffer offset
    */
  def writeDoubleLE(`val`: Double, buf: js.typedarray.Uint8Array, pos: Double): Unit
  
  /**
    * Writes a 32 bit float to a buffer using big endian byte order.
    * @param val Value to write
    * @param buf Target buffer
    * @param pos Target buffer offset
    */
  def writeFloatBE(`val`: Double, buf: js.typedarray.Uint8Array, pos: Double): Unit
  
  /**
    * Writes a 32 bit float to a buffer using little endian byte order.
    * @param val Value to write
    * @param buf Target buffer
    * @param pos Target buffer offset
    */
  def writeFloatLE(`val`: Double, buf: js.typedarray.Uint8Array, pos: Double): Unit
}
object Typeoffloat {
  
  inline def apply(
    readDoubleBE: (js.typedarray.Uint8Array, Double) => Double,
    readDoubleLE: (js.typedarray.Uint8Array, Double) => Double,
    readFloatBE: (js.typedarray.Uint8Array, Double) => Double,
    readFloatLE: (js.typedarray.Uint8Array, Double) => Double,
    writeDoubleBE: (Double, js.typedarray.Uint8Array, Double) => Unit,
    writeDoubleLE: (Double, js.typedarray.Uint8Array, Double) => Unit,
    writeFloatBE: (Double, js.typedarray.Uint8Array, Double) => Unit,
    writeFloatLE: (Double, js.typedarray.Uint8Array, Double) => Unit
  ): Typeoffloat = {
    val __obj = js.Dynamic.literal(readDoubleBE = js.Any.fromFunction2(readDoubleBE), readDoubleLE = js.Any.fromFunction2(readDoubleLE), readFloatBE = js.Any.fromFunction2(readFloatBE), readFloatLE = js.Any.fromFunction2(readFloatLE), writeDoubleBE = js.Any.fromFunction3(writeDoubleBE), writeDoubleLE = js.Any.fromFunction3(writeDoubleLE), writeFloatBE = js.Any.fromFunction3(writeFloatBE), writeFloatLE = js.Any.fromFunction3(writeFloatLE))
    __obj.asInstanceOf[Typeoffloat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeoffloat] (val x: Self) extends AnyVal {
    
    inline def setReadDoubleBE(value: (js.typedarray.Uint8Array, Double) => Double): Self = StObject.set(x, "readDoubleBE", js.Any.fromFunction2(value))
    
    inline def setReadDoubleLE(value: (js.typedarray.Uint8Array, Double) => Double): Self = StObject.set(x, "readDoubleLE", js.Any.fromFunction2(value))
    
    inline def setReadFloatBE(value: (js.typedarray.Uint8Array, Double) => Double): Self = StObject.set(x, "readFloatBE", js.Any.fromFunction2(value))
    
    inline def setReadFloatLE(value: (js.typedarray.Uint8Array, Double) => Double): Self = StObject.set(x, "readFloatLE", js.Any.fromFunction2(value))
    
    inline def setWriteDoubleBE(value: (Double, js.typedarray.Uint8Array, Double) => Unit): Self = StObject.set(x, "writeDoubleBE", js.Any.fromFunction3(value))
    
    inline def setWriteDoubleLE(value: (Double, js.typedarray.Uint8Array, Double) => Unit): Self = StObject.set(x, "writeDoubleLE", js.Any.fromFunction3(value))
    
    inline def setWriteFloatBE(value: (Double, js.typedarray.Uint8Array, Double) => Unit): Self = StObject.set(x, "writeFloatBE", js.Any.fromFunction3(value))
    
    inline def setWriteFloatLE(value: (Double, js.typedarray.Uint8Array, Double) => Unit): Self = StObject.set(x, "writeFloatLE", js.Any.fromFunction3(value))
  }
}
