package typings.firebase.compatMod.firebase.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blob extends StObject {
  
  /**
    * Returns true if this `Blob` is equal to the provided one.
    *
    * @param other The `Blob` to compare against.
    * @return true if this `Blob` is equal to the provided one.
    */
  def isEqual(other: Blob): Boolean
  
  /**
    * Returns the bytes of a Blob as a Base64-encoded string.
    *
    * @return
    *   The Base64-encoded string created from the Blob object.
    */
  def toBase64(): String
  
  /**
    * Returns the bytes of a Blob in a new Uint8Array.
    *
    * @return
    *   The Uint8Array created from the Blob object.
    */
  def toUint8Array(): js.typedarray.Uint8Array
}
object Blob {
  
  inline def apply(isEqual: Blob => Boolean, toBase64: () => String, toUint8Array: () => js.typedarray.Uint8Array): Blob = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), toBase64 = js.Any.fromFunction0(toBase64), toUint8Array = js.Any.fromFunction0(toUint8Array))
    __obj.asInstanceOf[Blob]
  }
  
  extension [Self <: Blob](x: Self) {
    
    inline def setIsEqual(value: Blob => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setToBase64(value: () => String): Self = StObject.set(x, "toBase64", js.Any.fromFunction0(value))
    
    inline def setToUint8Array(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "toUint8Array", js.Any.fromFunction0(value))
  }
}
