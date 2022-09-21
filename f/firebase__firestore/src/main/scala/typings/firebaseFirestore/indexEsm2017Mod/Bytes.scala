package typings.firebaseFirestore.indexEsm2017Mod

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
  */ @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "Bytes")
@js.native
open class Bytes protected ()
  extends StObject
     with Ya_ {
  /** @hideconstructor */
  def this(t: Any) = this()
  
  /* CompleteClass */
  var _byteString: Any = js.native
  
  /**
    * Returns true if this `Bytes` object is equal to the provided one.
    *
    * @param other - The `Bytes` object to compare against.
    * @returns true if this `Bytes` object is equal to the provided one.
    */ /* CompleteClass */
  override def isEqual(t: Any): Any = js.native
  
  /**
    * Returns the underlying bytes as a Base64-encoded string.
    *
    * @returns The Base64-encoded string created from the `Bytes` object.
    */ /* CompleteClass */
  override def toBase64(): Any = js.native
  
  /**
    * Returns the underlying bytes in a new `Uint8Array`.
    *
    * @returns The Uint8Array created from the `Bytes` object.
    */ /* CompleteClass */
  override def toUint8Array(): Any = js.native
}
object Bytes {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/dist/index.esm2017", "Bytes")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new `Bytes` object from the given Base64 string, converting it to
    * bytes.
    *
    * @param base64 - The Base64 string used to create the `Bytes` object.
    */ /* static member */
  inline def fromBase64String(t: Any): Ya_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(t.asInstanceOf[js.Any]).asInstanceOf[Ya_]
  
  /**
    * Creates a new `Bytes` object from the given Uint8Array.
    *
    * @param array - The Uint8Array used to create the `Bytes` object.
    */ /* static member */
  inline def fromUint8Array(t: Any): Ya_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(t.asInstanceOf[js.Any]).asInstanceOf[Ya_]
}
