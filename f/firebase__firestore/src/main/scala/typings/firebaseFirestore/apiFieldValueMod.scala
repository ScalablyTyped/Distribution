package typings.firebaseFirestore

import typings.firebaseFirestore.mutationMod.FieldTransform
import typings.firebaseFirestore.userDataReaderMod.ParseContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/api/field_value", JSImport.Namespace)
@js.native
object apiFieldValueMod extends js.Object {
  @js.native
  class ArrayRemoveFieldValueImpl protected () extends SerializableFieldValue {
    def this(_methodName: String, _elements: js.Array[_]) = this()
    val _elements: js.Array[_] = js.native
    def isEqual(other: FieldValue): Boolean = js.native
  }
  
  @js.native
  class ArrayUnionFieldValueImpl protected () extends SerializableFieldValue {
    def this(_methodName: String, _elements: js.Array[_]) = this()
    val _elements: js.Any = js.native
    def isEqual(other: FieldValue): Boolean = js.native
  }
  
  @js.native
  class DeleteFieldValueImpl protected () extends SerializableFieldValue {
    def this(_methodName: String) = this()
    def isEqual(other: FieldValue): Boolean = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.firebaseFirestoreTypes.mod.FieldValue because Inheritance from two classes. Inlined isEqual */ @js.native
  abstract class FieldValue () extends SerializableFieldValue {
    def isEqual(other: typings.firebaseFirestoreTypes.mod.FieldValue): Boolean = js.native
  }
  
  @js.native
  class NumericIncrementFieldValueImpl protected () extends SerializableFieldValue {
    def this(_methodName: String, _operand: Double) = this()
    val _operand: js.Any = js.native
    def isEqual(other: FieldValue): Boolean = js.native
  }
  
  @js.native
  abstract class SerializableFieldValue () extends js.Object {
    /** A pointer to the implementing class. */
    val _delegate: SerializableFieldValue = js.native
    /** The public API endpoint that returns this class. */
    val _methodName: String = js.native
    def _toFieldTransform(context: ParseContext): FieldTransform | Null = js.native
    def isEqual(other: SerializableFieldValue): Boolean = js.native
  }
  
  @js.native
  class ServerTimestampFieldValueImpl protected () extends SerializableFieldValue {
    def this(_methodName: String) = this()
    def isEqual(other: FieldValue): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object FieldValue extends js.Object {
    def arrayRemove(elements: js.Any*): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
    def arrayUnion(elements: js.Any*): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
    def delete(): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
    def increment(n: Double): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
    def serverTimestamp(): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
  }
  
}

