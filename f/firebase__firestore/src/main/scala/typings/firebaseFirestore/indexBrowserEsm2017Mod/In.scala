package typings.firebaseFirestore.indexBrowserEsm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait In extends StObject {
  
  var _byteString: Any
  
  /**
    * Returns true if this `Bytes` object is equal to the provided one.
    *
    * @param other - The `Bytes` object to compare against.
    * @returns true if this `Bytes` object is equal to the provided one.
    */ def isEqual(t: Any): Any
  
  /**
    * Returns the underlying bytes as a Base64-encoded string.
    *
    * @returns The Base64-encoded string created from the `Bytes` object.
    */ def toBase64(): Any
  
  /**
    * Returns the underlying bytes in a new `Uint8Array`.
    *
    * @returns The Uint8Array created from the `Bytes` object.
    */ def toUint8Array(): Any
}
object In {
  
  inline def apply(_byteString: Any, isEqual: Any => Any, toBase64: () => Any, toUint8Array: () => Any): In = {
    val __obj = js.Dynamic.literal(_byteString = _byteString.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), toBase64 = js.Any.fromFunction0(toBase64), toUint8Array = js.Any.fromFunction0(toUint8Array))
    __obj.asInstanceOf[In]
  }
  
  extension [Self <: In](x: Self) {
    
    inline def setIsEqual(value: Any => Any): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setToBase64(value: () => Any): Self = StObject.set(x, "toBase64", js.Any.fromFunction0(value))
    
    inline def setToUint8Array(value: () => Any): Self = StObject.set(x, "toUint8Array", js.Any.fromFunction0(value))
    
    inline def set_byteString(value: Any): Self = StObject.set(x, "_byteString", value.asInstanceOf[js.Any])
  }
}
