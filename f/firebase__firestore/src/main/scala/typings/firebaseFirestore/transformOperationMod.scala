package typings.firebaseFirestore

import typings.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.timestampMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/model/transform_operation", JSImport.Namespace)
@js.native
object transformOperationMod extends js.Object {
  @js.native
  class ArrayRemoveTransformOperation protected () extends TransformOperation {
    def this(elements: js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ _
          ]) = this()
    @JSName("apply")
    var apply: js.Any = js.native
    val elements: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ _
      ] = js.native
  }
  
  @js.native
  class ArrayUnionTransformOperation protected () extends TransformOperation {
    def this(elements: js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ _
          ]) = this()
    @JSName("apply")
    var apply: js.Any = js.native
    val elements: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ _
      ] = js.native
  }
  
  @js.native
  class NumericIncrementTransformOperation protected () extends TransformOperation {
    def this(
      serializer: JsonProtoSerializer,
      operand: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
    ) = this()
    var asNumber: js.Any = js.native
    val operand: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any = js.native
    val serializer: js.Any = js.native
  }
  
  @js.native
  class ServerTimestampTransform protected () extends TransformOperation
  
  @js.native
  trait TransformOperation extends js.Object {
    /**
      * Computes the local transform result against the provided `previousValue`,
      * optionally using the provided localWriteTime.
      */
    def applyToLocalView(
      previousValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any,
      localWriteTime: Timestamp
    ): js.Any = js.native
    def applyToLocalView(previousValue: Null, localWriteTime: Timestamp): js.Any = js.native
    def applyToRemoteDocument(): js.Any = js.native
    def applyToRemoteDocument(
      previousValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
    ): js.Any = js.native
    /**
      * Computes a final transform result after the transform has been acknowledged
      * by the server, potentially using the server-provided transformResult.
      */
    def applyToRemoteDocument(
      previousValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any,
      transformResult: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
    ): js.Any = js.native
    def applyToRemoteDocument(
      previousValue: Null,
      transformResult: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
    ): js.Any = js.native
    def computeBaseValue(): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any) | Null = js.native
    /**
      * If this transform operation is not idempotent, returns the base value to
      * persist for this transform. If a base value is returned, the transform
      * operation is always applied to this base value, even if document has
      * already been updated.
      *
      * Base values provide consistent behavior for non-idempotent transforms and
      * allow us to return the same latency-compensated value even if the backend
      * has already applied the transform operation. The base value is null for
      * idempotent transforms, as they can be re-played even if the backend has
      * already applied them.
      *
      * @return a base value to store along with the mutation, or null for
      * idempotent transforms.
      */
    def computeBaseValue(
      previousValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
    ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any) | Null = js.native
    def isEqual(other: TransformOperation): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ServerTimestampTransform extends js.Object {
    var instance: ServerTimestampTransform = js.native
  }
  
}

