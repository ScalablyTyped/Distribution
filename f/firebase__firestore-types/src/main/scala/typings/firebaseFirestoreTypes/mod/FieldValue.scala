package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "FieldValue")
@js.native
class FieldValue protected () extends StObject {
  
  def isEqual(other: FieldValue): Boolean = js.native
}
/* static members */
object FieldValue {
  
  @JSImport("@firebase/firestore-types", "FieldValue.arrayRemove")
  @js.native
  def arrayRemove(elements: js.Any*): FieldValue = js.native
  
  @JSImport("@firebase/firestore-types", "FieldValue.arrayUnion")
  @js.native
  def arrayUnion(elements: js.Any*): FieldValue = js.native
  
  @JSImport("@firebase/firestore-types", "FieldValue.delete")
  @js.native
  def delete(): FieldValue = js.native
  
  @JSImport("@firebase/firestore-types", "FieldValue.increment")
  @js.native
  def increment(n: Double): FieldValue = js.native
  
  @JSImport("@firebase/firestore-types", "FieldValue.serverTimestamp")
  @js.native
  def serverTimestamp(): FieldValue = js.native
}
