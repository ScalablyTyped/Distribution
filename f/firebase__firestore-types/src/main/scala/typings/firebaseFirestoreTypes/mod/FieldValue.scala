package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "FieldValue")
@js.native
class FieldValue protected () extends StObject {
  
  def isEqual(other: FieldValue): Boolean = js.native
}
/* static members */
object FieldValue {
  
  @JSImport("@firebase/firestore-types", "FieldValue")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arrayRemove(elements: js.Any*): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[js.Any]).asInstanceOf[FieldValue]
  
  @scala.inline
  def arrayUnion(elements: js.Any*): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[js.Any]).asInstanceOf[FieldValue]
  
  @scala.inline
  def delete(): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")().asInstanceOf[FieldValue]
  
  @scala.inline
  def increment(n: Double): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[FieldValue]
  
  @scala.inline
  def serverTimestamp(): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[FieldValue]
}
