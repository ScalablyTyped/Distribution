package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcApiTimestampMod.Timestamp
import typings.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
import typings.atFirebaseFirestore.distSrcModelDocumentMod.MaybeDocument
import typings.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import typings.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.FieldValue
import typings.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.ObjectValue
import typings.atFirebaseFirestore.distSrcModelMutationMod.FieldMask
import typings.atFirebaseFirestore.distSrcModelMutationMod.FieldTransform
import typings.atFirebaseFirestore.distSrcModelMutationMod.Mutation
import typings.atFirebaseFirestore.distSrcModelMutationMod.MutationResult
import typings.atFirebaseFirestore.distSrcModelMutationMod.MutationType
import typings.atFirebaseFirestore.distSrcModelMutationMod.Precondition
import typings.atFirebaseFirestore.distSrcModelPathMod.FieldPath
import typings.atFirebaseFirestore.distSrcModelTransformUnderscoreOperationMod.TransformOperation
import typings.atFirebaseFirestore.distSrcUtilSortedUnderscoreSetMod.SortedSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/mutation", JSImport.Namespace)
@js.native
object distSrcModelMutationMod extends js.Object {
  @js.native
  class DeleteMutation protected () extends Mutation {
    def this(key: DocumentKey, precondition: Precondition) = this()
  }
  
  @js.native
  class FieldMask protected () extends js.Object {
    def this(fields: SortedSet[FieldPath]) = this()
    val fields: SortedSet[FieldPath] = js.native
    /**
      * Verifies that `fieldPath` is included by at least one field in this field
      * mask.
      *
      * This is an O(n) operation, where `n` is the size of the field mask.
      */
    def covers(fieldPath: FieldPath): Boolean = js.native
    def isEqual(other: FieldMask): Boolean = js.native
  }
  
  @js.native
  class FieldTransform protected () extends js.Object {
    def this(field: FieldPath, transform: TransformOperation) = this()
    val field: FieldPath = js.native
    val transform: TransformOperation = js.native
    def isEqual(other: FieldTransform): Boolean = js.native
  }
  
  @js.native
  abstract class Mutation () extends js.Object {
    val key: DocumentKey = js.native
    val precondition: Precondition = js.native
    val `type`: MutationType = js.native
    def applyToLocalView(maybeDoc: Null, baseDoc: Null, localWriteTime: Timestamp): MaybeDocument | Null = js.native
    def applyToLocalView(maybeDoc: Null, baseDoc: MaybeDocument, localWriteTime: Timestamp): MaybeDocument | Null = js.native
    def applyToLocalView(maybeDoc: MaybeDocument, baseDoc: Null, localWriteTime: Timestamp): MaybeDocument | Null = js.native
    /**
      * Applies this mutation to the given MaybeDocument or null for the purposes
      * of computing the new local view of a document. Both the input and returned
      * documents can be null.
      *
      * @param maybeDoc The document to mutate. The input document can be null if
      *     the client has no knowledge of the pre-mutation state of the document.
      * @param baseDoc The state of the document prior to this mutation batch. The
      *     input document can be null if the client has no knowledge of the
      *     pre-mutation state of the document.
      * @param localWriteTime A timestamp indicating the local write time of the
      *     batch this mutation is a part of.
      * @return The mutated document. The returned document may be null, but only
      *     if maybeDoc was null and the mutation would not create a new document.
      */
    def applyToLocalView(maybeDoc: MaybeDocument, baseDoc: MaybeDocument, localWriteTime: Timestamp): MaybeDocument | Null = js.native
    def applyToRemoteDocument(maybeDoc: Null, mutationResult: MutationResult): MaybeDocument = js.native
    /**
      * Applies this mutation to the given MaybeDocument or null for the purposes
      * of computing a new remote document. If the input document doesn't match the
      * expected state (e.g. it is null or outdated), an `UnknownDocument` can be
      * returned.
      *
      * @param maybeDoc The document to mutate. The input document can be null if
      *     the client has no knowledge of the pre-mutation state of the document.
      * @param mutationResult The result of applying the mutation from the backend.
      * @return The mutated document. The returned document may be an
      *     UnknownDocument if the mutation could not be applied to the locally
      *     cached base document.
      */
    def applyToRemoteDocument(maybeDoc: MaybeDocument, mutationResult: MutationResult): MaybeDocument = js.native
    def extractBaseValue(): ObjectValue | Null = js.native
    /**
      * If this mutation is not idempotent, returns the base value to persist with
      * this mutation. If a base value is returned, the mutation is always applied
      * to this base value, even if document has already been updated.
      *
      * The base value is a sparse object that consists of only the document
      * fields for which this mutation contains a non-idempotent transformation
      * (e.g. a numeric increment). The provided alue guarantees consistent
      * behavior for non-idempotent transforms and allow us to return the same
      * latency-compensated value even if the backend has already applied the
      * mutation. The base value is null for idempotent mutations, as they can be
      * re-played even if the backend has already applied them.
      *
      * @return a base value to store along with the mutation, or null for
      * idempotent mutations.
      */
    def extractBaseValue(maybeDoc: MaybeDocument): ObjectValue | Null = js.native
    def isEqual(other: Mutation): Boolean = js.native
    /* protected */ def verifyKeyMatches(): Unit = js.native
    /* protected */ def verifyKeyMatches(maybeDoc: MaybeDocument): Unit = js.native
  }
  
  @js.native
  class MutationResult protected () extends js.Object {
    def this(/**
      * The version at which the mutation was committed:
      *
      * - For most operations, this is the updateTime in the WriteResult.
      * - For deletes, the commitTime of the WriteResponse (because deletes are
      *   not stored and have no updateTime).
      *
      * Note that these versions can be different: No-op writes will not change
      * the updateTime even though the commitTime advances.
      */
    version: SnapshotVersion) = this()
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
      * The resulting fields returned from the backend after a
      * TransformMutation has been committed. Contains one FieldValue for each
      * FieldTransform that was in the mutation.
      *
      * Will be null if the mutation was not a TransformMutation.
      */
    transformResults: js.Array[FieldValue | Null]
    ) = this()
    /**
      * The resulting fields returned from the backend after a
      * TransformMutation has been committed. Contains one FieldValue for each
      * FieldTransform that was in the mutation.
      *
      * Will be null if the mutation was not a TransformMutation.
      */
    val transformResults: (js.Array[FieldValue | Null]) | Null = js.native
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
  
  @js.native
  sealed trait MutationType extends js.Object
  
  @js.native
  class PatchMutation protected () extends Mutation {
    def this(key: DocumentKey, data: ObjectValue, fieldMask: FieldMask, precondition: Precondition) = this()
    val data: ObjectValue = js.native
    val fieldMask: FieldMask = js.native
    /**
      * Patches the data of document if available or creates a new document. Note
      * that this does not check whether or not the precondition of this patch
      * holds.
      */
    var patchDocument: js.Any = js.native
    var patchObject: js.Any = js.native
  }
  
  @js.native
  class Precondition protected () extends js.Object {
    val exists: js.UndefOr[Boolean] = js.native
    val updateTime: js.UndefOr[SnapshotVersion] = js.native
    def isEqual(other: Precondition): Boolean = js.native
    /** Returns whether this Precondition is empty. */
    def isNone(): Boolean = js.native
    def isValidFor(): Boolean = js.native
    /**
      * Returns true if the preconditions is valid for the given document
      * (or null if no document is available).
      */
    def isValidFor(maybeDoc: MaybeDocument): Boolean = js.native
  }
  
  @js.native
  class SetMutation protected () extends Mutation {
    def this(key: DocumentKey, value: ObjectValue, precondition: Precondition) = this()
    val value: ObjectValue = js.native
  }
  
  @js.native
  class TransformMutation protected () extends Mutation {
    def this(key: DocumentKey, fieldTransforms: js.Array[FieldTransform]) = this()
    val fieldTransforms: js.Array[FieldTransform] = js.native
    /**
      * Creates a list of "transform results" (a transform result is a field value
      * representing the result of applying a transform) for use when applying a
      * TransformMutation locally.
      *
      * @param localWriteTime The local time of the transform mutation (used to
      *     generate ServerTimestampValues).
      * @param maybeDoc The current state of the document after applying all
      *     previous mutations.
      * @param baseDoc The document prior to applying this mutation batch.
      * @return The transform results list.
      */
    var localTransformResults: js.Any = js.native
    /**
      * Asserts that the given MaybeDocument is actually a Document and verifies
      * that it matches the key for this mutation. Since we only support
      * transformations with precondition exists this method is guaranteed to be
      * safe.
      */
    var requireDocument: js.Any = js.native
    /**
      * Creates a list of "transform results" (a transform result is a field value
      * representing the result of applying a transform) for use after a
      * TransformMutation has been acknowledged by the server.
      *
      * @param baseDoc The document prior to applying this mutation batch.
      * @param serverTransformResults The transform results received by the server.
      * @return The transform results list.
      */
    var serverTransformResults: js.Any = js.native
    var transformObject: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object FieldMask extends js.Object {
    def fromArray(fields: js.Array[FieldPath]): FieldMask = js.native
    def fromSet(fields: SortedSet[FieldPath]): FieldMask = js.native
  }
  
  /* static members */
  @js.native
  object Mutation extends js.Object {
    /* protected */ def getPostMutationVersion(): SnapshotVersion = js.native
    /**
      * Returns the version from the given document for use as the result of a
      * mutation. Mutations are defined to return the version of the base document
      * only if it is an existing document. Deleted and unknown documents have a
      * post-mutation version of SnapshotVersion.MIN.
      */
    /* protected */ def getPostMutationVersion(maybeDoc: MaybeDocument): SnapshotVersion = js.native
  }
  
  @js.native
  object MutationType extends js.Object {
    @js.native
    sealed trait Delete extends MutationType
    
    @js.native
    sealed trait Patch extends MutationType
    
    @js.native
    sealed trait Set extends MutationType
    
    @js.native
    sealed trait Transform extends MutationType
    
    /* 3 */ val Delete: typings.atFirebaseFirestore.distSrcModelMutationMod.MutationType.Delete with Double = js.native
    /* 1 */ val Patch: typings.atFirebaseFirestore.distSrcModelMutationMod.MutationType.Patch with Double = js.native
    /* 0 */ val Set: typings.atFirebaseFirestore.distSrcModelMutationMod.MutationType.Set with Double = js.native
    /* 2 */ val Transform: typings.atFirebaseFirestore.distSrcModelMutationMod.MutationType.Transform with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MutationType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Precondition extends js.Object {
    val NONE: Precondition = js.native
    /** Creates a new Precondition with an exists flag. */
    def exists(exists: Boolean): Precondition = js.native
    /** Creates a new Precondition based on a version a document exists at. */
    def updateTime(version: SnapshotVersion): Precondition = js.native
  }
  
}

