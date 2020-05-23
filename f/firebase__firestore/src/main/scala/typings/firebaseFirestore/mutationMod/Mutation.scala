package typings.firebaseFirestore.mutationMod

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.objectValueMod.ObjectValue
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.timestampMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/model/mutation", "Mutation")
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
    * (e.g. a numeric increment). The provided value guarantees consistent
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

/* static members */
@JSImport("@firebase/firestore/dist/packages/firestore/src/model/mutation", "Mutation")
@js.native
object Mutation extends js.Object {
  /* protected */ def getPostMutationVersion(): SnapshotVersion = js.native
  /**
    * Returns the version from the given document for use as the result of a
    * mutation. Mutations are defined to return the version of the base document
    * only if it is an existing document. Deleted and unknown documents have a
    * post-mutation version of SnapshotVersion.min().
    */
  /* protected */ def getPostMutationVersion(maybeDoc: MaybeDocument): SnapshotVersion = js.native
}

