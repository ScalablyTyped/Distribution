package typings.firebaseFirestoreTypes.mod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "Blob")
@js.native
class Blob protected () extends StObject {
  
  def isEqual(other: Blob): Boolean = js.native
  
  def toBase64(): String = js.native
  
  def toUint8Array(): Uint8Array = js.native
}
/* static members */
object Blob {
  
  @JSImport("@firebase/firestore-types", "Blob.fromBase64String")
  @js.native
  def fromBase64String(base64: String): Blob = js.native
  
  @JSImport("@firebase/firestore-types", "Blob.fromUint8Array")
  @js.native
  def fromUint8Array(array: Uint8Array): Blob = js.native
}
