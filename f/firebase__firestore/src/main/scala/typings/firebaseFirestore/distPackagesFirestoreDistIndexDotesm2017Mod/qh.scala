package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2020 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
/**
  * An immutable object representing an array of bytes.
  */ trait qh extends StObject {
  
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
object qh {
  
  inline def apply(_byteString: Any, isEqual: Any => Any, toBase64: () => Any, toUint8Array: () => Any): qh = {
    val __obj = js.Dynamic.literal(_byteString = _byteString.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), toBase64 = js.Any.fromFunction0(toBase64), toUint8Array = js.Any.fromFunction0(toUint8Array))
    __obj.asInstanceOf[qh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: qh] (val x: Self) extends AnyVal {
    
    inline def setIsEqual(value: Any => Any): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setToBase64(value: () => Any): Self = StObject.set(x, "toBase64", js.Any.fromFunction0(value))
    
    inline def setToUint8Array(value: () => Any): Self = StObject.set(x, "toUint8Array", js.Any.fromFunction0(value))
    
    inline def set_byteString(value: Any): Self = StObject.set(x, "_byteString", value.asInstanceOf[js.Any])
  }
}
