package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Value
import typings.firebaseFirestore.distLiteFirestoreSrcRemoteNumberSerializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcModelTransformOperationMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/transform_operation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/transform_operation", "ArrayRemoveTransformOperation")
  @js.native
  open class ArrayRemoveTransformOperation protected () extends TransformOperation {
    def this(elements: js.Array[Value]) = this()
    
    val elements: js.Array[Value] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/transform_operation", "ArrayUnionTransformOperation")
  @js.native
  open class ArrayUnionTransformOperation protected () extends TransformOperation {
    def this(elements: js.Array[Value]) = this()
    
    val elements: js.Array[Value] = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/transform_operation", "NumericIncrementTransformOperation")
  @js.native
  open class NumericIncrementTransformOperation protected () extends TransformOperation {
    def this(serializer: Serializer, operand: Value) = this()
    
    val operand: Value = js.native
    
    val serializer: Serializer = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/transform_operation", "ServerTimestampTransform")
  @js.native
  open class ServerTimestampTransform () extends TransformOperation
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/transform_operation", "TransformOperation")
  @js.native
  open class TransformOperation () extends StObject {
    
    /* private */ @JSName("_")
    var _underscore: Any = js.native
  }
  
  inline def applyNumericIncrementTransformOperationToLocalView(transform: NumericIncrementTransformOperation): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("applyNumericIncrementTransformOperationToLocalView")(transform.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def applyNumericIncrementTransformOperationToLocalView(transform: NumericIncrementTransformOperation, previousValue: Value): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("applyNumericIncrementTransformOperationToLocalView")(transform.asInstanceOf[js.Any], previousValue.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def applyTransformOperationToLocalView(transform: TransformOperation, previousValue: Null, localWriteTime: Timestamp): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransformOperationToLocalView")(transform.asInstanceOf[js.Any], previousValue.asInstanceOf[js.Any], localWriteTime.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def applyTransformOperationToLocalView(transform: TransformOperation, previousValue: Value, localWriteTime: Timestamp): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransformOperationToLocalView")(transform.asInstanceOf[js.Any], previousValue.asInstanceOf[js.Any], localWriteTime.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def applyTransformOperationToRemoteDocument(transform: TransformOperation): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("applyTransformOperationToRemoteDocument")(transform.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def applyTransformOperationToRemoteDocument(transform: TransformOperation, previousValue: Null, transformResult: Value): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransformOperationToRemoteDocument")(transform.asInstanceOf[js.Any], previousValue.asInstanceOf[js.Any], transformResult.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def applyTransformOperationToRemoteDocument(transform: TransformOperation, previousValue: Value): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransformOperationToRemoteDocument")(transform.asInstanceOf[js.Any], previousValue.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def applyTransformOperationToRemoteDocument(transform: TransformOperation, previousValue: Value, transformResult: Value): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransformOperationToRemoteDocument")(transform.asInstanceOf[js.Any], previousValue.asInstanceOf[js.Any], transformResult.asInstanceOf[js.Any])).asInstanceOf[Value]
  
  inline def computeTransformOperationBaseValue(transform: TransformOperation): Value | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("computeTransformOperationBaseValue")(transform.asInstanceOf[js.Any]).asInstanceOf[Value | Null]
  inline def computeTransformOperationBaseValue(transform: TransformOperation, previousValue: Value): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("computeTransformOperationBaseValue")(transform.asInstanceOf[js.Any], previousValue.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  
  inline def transformOperationEquals(left: TransformOperation, right: TransformOperation): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("transformOperationEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
