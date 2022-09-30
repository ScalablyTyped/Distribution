package typings.firebaseFirestore

import typings.firebaseFirestore.firebaseFirestoreInts.`0`
import typings.firebaseFirestore.firebaseFirestoreInts.`1`
import typings.firebaseFirestore.firebaseFirestoreInts.`2`
import typings.firebaseFirestore.firebaseFirestoreInts.`3`
import typings.firebaseFirestore.firestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.firestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.firestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.firestoreSrcModelDocumentMod.MutableDocument
import typings.firebaseFirestore.firestoreSrcModelFieldMaskMod.FieldMask
import typings.firebaseFirestore.firestoreSrcModelObjectValueMod.ObjectValue
import typings.firebaseFirestore.firestoreSrcModelPathMod.FieldPath
import typings.firebaseFirestore.firestoreSrcModelTransformOperationMod.TransformOperation
import typings.firebaseFirestore.firestoreSrcProtosFirestoreProtoApiMod.Value
import typings.firebaseFirestore.packagesFirestoreSrcLiteApiTimestampMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreSrcModelMutationMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/model/mutation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/model/mutation", "DeleteMutation")
  @js.native
  open class DeleteMutation protected () extends Mutation {
    def this(key: DocumentKey, precondition: Precondition) = this()
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/model/mutation", "FieldTransform")
  @js.native
  open class FieldTransform protected () extends StObject {
    def this(field: FieldPath, transform: TransformOperation) = this()
    
    val field: FieldPath = js.native
    
    val transform: TransformOperation = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/model/mutation", "Mutation")
  @js.native
  abstract class Mutation () extends StObject {
    
    val fieldTransforms: js.Array[FieldTransform] = js.native
    
    /**
      * Returns a `FieldMask` representing the fields that will be changed by
      * applying this mutation. Returns `null` if the mutation will overwrite the
      * entire document.
      */
    def getFieldMask(): FieldMask | Null = js.native
    
    val key: DocumentKey = js.native
    
    val precondition: Precondition = js.native
    
    val `type`: MutationType = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/model/mutation", "MutationResult")
  @js.native
  open class MutationResult protected () extends StObject {
    def this(
      /**
      * The version at which the mutation was committed:
      *
      * - For most operations, this is the updateTime in the WriteResult.
      * - For deletes, the commitTime of the WriteResponse (because deletes are
      *   not stored and have no updateTime).
      *
      * Note that these versions can be different: No-op writes will not change
      * the updateTime even though the commitTime advances.
      */
    version: SnapshotVersion,
      /**
      * The resulting fields returned from the backend after a mutation
      * containing field transforms has been committed. Contains one FieldValue
      * for each FieldTransform that was in the mutation.
      *
      * Will be empty if the mutation did not contain any field transforms.
      */
    transformResults: js.Array[Value | Null]
    ) = this()
    
    /**
      * The resulting fields returned from the backend after a mutation
      * containing field transforms has been committed. Contains one FieldValue
      * for each FieldTransform that was in the mutation.
      *
      * Will be empty if the mutation did not contain any field transforms.
      */
    val transformResults: js.Array[Value | Null] = js.native
    
    /**
      * The version at which the mutation was committed:
      *
      * - For most operations, this is the updateTime in the WriteResult.
      * - For deletes, the commitTime of the WriteResponse (because deletes are
      *   not stored and have no updateTime).
      *
      * Note that these versions can be different: No-op writes will not change
      * the updateTime even though the commitTime advances.
      */
    val version: SnapshotVersion = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/model/mutation", "PatchMutation")
  @js.native
  open class PatchMutation protected () extends Mutation {
    def this(key: DocumentKey, data: ObjectValue, fieldMask: FieldMask, precondition: Precondition) = this()
    def this(
      key: DocumentKey,
      data: ObjectValue,
      fieldMask: FieldMask,
      precondition: Precondition,
      fieldTransforms: js.Array[FieldTransform]
    ) = this()
    
    val data: ObjectValue = js.native
    
    val fieldMask: FieldMask = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/model/mutation", "Precondition")
  @js.native
  /* private */ open class Precondition () extends StObject {
    
    val exists: js.UndefOr[Boolean] = js.native
    
    def isEqual(other: Precondition): Boolean = js.native
    
    /** Returns whether this Precondition is empty. */
    def isNone: Boolean = js.native
    
    val updateTime: js.UndefOr[SnapshotVersion] = js.native
  }
  /* static members */
  object Precondition {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/model/mutation", "Precondition")
    @js.native
    val ^ : js.Any = js.native
    
    /** Creates a new Precondition with an exists flag. */
    inline def exists(exists: Boolean): Precondition = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(exists.asInstanceOf[js.Any]).asInstanceOf[Precondition]
    
    /** Creates a new empty Precondition. */
    inline def none(): Precondition = ^.asInstanceOf[js.Dynamic].applyDynamic("none")().asInstanceOf[Precondition]
    
    /** Creates a new Precondition based on a version a document exists at. */
    inline def updateTime(version: SnapshotVersion): Precondition = ^.asInstanceOf[js.Dynamic].applyDynamic("updateTime")(version.asInstanceOf[js.Any]).asInstanceOf[Precondition]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/model/mutation", "SetMutation")
  @js.native
  open class SetMutation protected () extends Mutation {
    def this(key: DocumentKey, value: ObjectValue, precondition: Precondition) = this()
    def this(
      key: DocumentKey,
      value: ObjectValue,
      precondition: Precondition,
      fieldTransforms: js.Array[FieldTransform]
    ) = this()
    
    val value: ObjectValue = js.native
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/model/mutation", "VerifyMutation")
  @js.native
  open class VerifyMutation protected () extends Mutation {
    def this(key: DocumentKey, precondition: Precondition) = this()
  }
  
  inline def calculateOverlayMutation(doc: MutableDocument): Mutation | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateOverlayMutation")(doc.asInstanceOf[js.Any]).asInstanceOf[Mutation | Null]
  inline def calculateOverlayMutation(doc: MutableDocument, mask: FieldMask): Mutation | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateOverlayMutation")(doc.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Mutation | Null]
  
  inline def fieldTransformEquals(left: FieldTransform, right: FieldTransform): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldTransformEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fieldTransformsAreEqual(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldTransformsAreEqual")().asInstanceOf[Boolean]
  inline def fieldTransformsAreEqual(left: js.Array[FieldTransform]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldTransformsAreEqual")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def fieldTransformsAreEqual(left: js.Array[FieldTransform], right: js.Array[FieldTransform]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldTransformsAreEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def fieldTransformsAreEqual(left: Unit, right: js.Array[FieldTransform]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldTransformsAreEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mutationApplyToLocalView(mutation: Mutation, document: MutableDocument, previousMask: Null, localWriteTime: Timestamp): FieldMask | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mutationApplyToLocalView")(mutation.asInstanceOf[js.Any], document.asInstanceOf[js.Any], previousMask.asInstanceOf[js.Any], localWriteTime.asInstanceOf[js.Any])).asInstanceOf[FieldMask | Null]
  inline def mutationApplyToLocalView(mutation: Mutation, document: MutableDocument, previousMask: FieldMask, localWriteTime: Timestamp): FieldMask | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mutationApplyToLocalView")(mutation.asInstanceOf[js.Any], document.asInstanceOf[js.Any], previousMask.asInstanceOf[js.Any], localWriteTime.asInstanceOf[js.Any])).asInstanceOf[FieldMask | Null]
  
  inline def mutationApplyToRemoteDocument(mutation: Mutation, document: MutableDocument, mutationResult: MutationResult): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mutationApplyToRemoteDocument")(mutation.asInstanceOf[js.Any], document.asInstanceOf[js.Any], mutationResult.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mutationEquals(left: Mutation, right: Mutation): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("mutationEquals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mutationExtractBaseValue(mutation: Mutation, document: Document): ObjectValue | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mutationExtractBaseValue")(mutation.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[ObjectValue | Null]
  
  inline def preconditionIsValidForDocument(precondition: Precondition, document: MutableDocument): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionIsValidForDocument")(precondition.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreInts.`0`
    - typings.firebaseFirestore.firebaseFirestoreInts.`1`
    - typings.firebaseFirestore.firebaseFirestoreInts.`2`
    - typings.firebaseFirestore.firebaseFirestoreInts.`3`
  */
  trait MutationType extends StObject
  object MutationType {
    
    inline def Delete: `2` = 2.asInstanceOf[`2`]
    
    inline def Patch: `1` = 1.asInstanceOf[`1`]
    
    inline def Set: `0` = 0.asInstanceOf[`0`]
    
    inline def Verify: `3` = 3.asInstanceOf[`3`]
  }
}
