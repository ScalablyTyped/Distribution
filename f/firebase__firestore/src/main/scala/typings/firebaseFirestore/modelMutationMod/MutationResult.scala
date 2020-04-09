package typings.firebaseFirestore.modelMutationMod

import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.firestoreProtoApiMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/mutation", "MutationResult")
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
  transformResults: js.Array[Value | Null]
  ) = this()
  /**
    * The resulting fields returned from the backend after a
    * TransformMutation has been committed. Contains one FieldValue for each
    * FieldTransform that was in the mutation.
    *
    * Will be null if the mutation was not a TransformMutation.
    */
  val transformResults: (js.Array[Value | Null]) | Null = js.native
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

