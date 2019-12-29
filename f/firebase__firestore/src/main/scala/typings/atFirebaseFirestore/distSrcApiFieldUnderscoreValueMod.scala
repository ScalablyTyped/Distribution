package typings.atFirebaseFirestore

import org.scalablytyped.runtime.Instantiable1
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FieldValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/field_value", JSImport.Namespace)
@js.native
object distSrcApiFieldUnderscoreValueMod extends js.Object {
  @js.native
  class ArrayRemoveFieldValueImpl protected () extends FieldValueImpl {
    def this(_elements: js.Array[_]) = this()
    val _elements: js.Array[_] = js.native
  }
  
  @js.native
  class ArrayUnionFieldValueImpl protected () extends FieldValueImpl {
    def this(_elements: js.Array[_]) = this()
    val _elements: js.Array[_] = js.native
  }
  
  @js.native
  class DeleteFieldValueImpl protected () extends FieldValueImpl
  
  @js.native
  abstract class FieldValueImpl protected () extends FieldValue {
    protected def this(_methodName: String) = this()
    val _methodName: String = js.native
    def isEqual(other: FieldValueImpl): Boolean = js.native
  }
  
  @js.native
  class NumericIncrementFieldValueImpl protected () extends FieldValueImpl {
    def this(_operand: Double) = this()
    val _operand: Double = js.native
  }
  
  @js.native
  class PublicFieldValue protected () extends FieldValueImpl {
    def this(_methodName: String) = this()
  }
  
  @js.native
  class ServerTimestampFieldValueImpl protected () extends FieldValueImpl
  
  /* static members */
  @js.native
  object DeleteFieldValueImpl extends js.Object {
    /** Singleton instance. */
    var instance: DeleteFieldValueImpl = js.native
  }
  
  /* static members */
  @js.native
  object FieldValueImpl extends js.Object {
    def arrayRemove(elements: js.Any*): FieldValueImpl = js.native
    def arrayUnion(elements: js.Any*): FieldValueImpl = js.native
    def delete(): FieldValueImpl = js.native
    def increment(n: Double): FieldValueImpl = js.native
    def serverTimestamp(): FieldValueImpl = js.native
  }
  
  @js.native
  object PublicFieldValue extends Instantiable1[/* _methodName */ String, FieldValueImpl] {
    def arrayRemove(elements: js.Any*): FieldValueImpl = js.native
    def arrayUnion(elements: js.Any*): FieldValueImpl = js.native
    def delete(): FieldValueImpl = js.native
    def increment(n: Double): FieldValueImpl = js.native
    def serverTimestamp(): FieldValueImpl = js.native
  }
  
  /* static members */
  @js.native
  object ServerTimestampFieldValueImpl extends js.Object {
    /** Singleton instance. */
    var instance: ServerTimestampFieldValueImpl = js.native
  }
  
}

