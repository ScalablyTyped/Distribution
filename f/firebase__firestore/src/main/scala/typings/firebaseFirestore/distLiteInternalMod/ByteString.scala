package typings.firebaseFirestore.distLiteInternalMod

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
  * Immutable class that represents a "proto" byte string.
  *
  * Proto byte strings can either be Base64-encoded strings or Uint8Arrays when
  * sent on the wire. This class abstracts away this differentiation by holding
  * the proto byte string in a common class that must be converted into a string
  * before being sent as a proto.
  * @internal
  */
@js.native
trait ByteString extends StObject {
  
  def approximateByteSize(): Double = js.native
  
  /* private */ val binaryString: Any = js.native
  
  def compareTo(other: ByteString): Double = js.native
  
  def isEqual(other: ByteString): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[js.Iterator[Double]] = js.native
  
  def toBase64(): String = js.native
  
  def toUint8Array(): js.typedarray.Uint8Array = js.native
}
