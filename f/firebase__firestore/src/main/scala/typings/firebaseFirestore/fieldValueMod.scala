package typings.firebaseFirestore

import typings.firebaseFirestore.mutationMod.FieldTransform
import typings.firebaseFirestore.userDataReaderMod.ParseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/api/field_value", JSImport.Namespace)
@js.native
object fieldValueMod extends js.Object {
  @js.native
  class ArrayRemoveFieldValueImpl protected () extends FieldValueImpl {
    def this(_elements: js.Array[_]) = this()
    val _elements: js.Array[_] = js.native
  }
  
  @js.native
  class ArrayUnionFieldValueImpl protected () extends FieldValueImpl {
    def this(_elements: js.Array[_]) = this()
    val _elements: js.Any = js.native
  }
  
  @js.native
  class DeleteFieldValueImpl () extends FieldValueImpl
  
  @js.native
  class FieldValue ()
    extends typings.firebaseFirestoreTypes.mod.FieldValue {
    def isEqual(other: FieldValue): Boolean = js.native
  }
  
  @js.native
  abstract class FieldValueImpl protected () extends js.Object {
    protected def this(_methodName: String) = this()
    val _methodName: String = js.native
    def isEqual(other: FieldValue): Boolean = js.native
    def toFieldTransform(context: ParseContext): FieldTransform | Null = js.native
  }
  
  @js.native
  class NumericIncrementFieldValueImpl protected () extends FieldValueImpl {
    def this(_operand: Double) = this()
    val _operand: js.Any = js.native
  }
  
  @js.native
  class ServerTimestampFieldValueImpl () extends FieldValueImpl
  
  /* static members */
  @js.native
  object FieldValue extends js.Object {
    def arrayRemove(elements: js.Any*): FieldValueImpl = js.native
    def arrayUnion(elements: js.Any*): FieldValueImpl = js.native
    def delete(): FieldValueImpl = js.native
    def increment(n: Double): FieldValueImpl = js.native
    def serverTimestamp(): FieldValueImpl = js.native
  }
  
}

