package typings.firebaseFirestore

import typings.firebaseFirestore.apiBlobMod.Blob
import typings.firebaseFirestore.apiUserDataConverterMod.DocumentKeyReference
import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.coreQueryMod.Bound
import typings.firebaseFirestore.coreQueryMod.FieldFilter
import typings.firebaseFirestore.coreQueryMod.OrderBy
import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.coreTypesMod.TargetId
import typings.firebaseFirestore.coreViewMod.LimboDocumentChange
import typings.firebaseFirestore.coreViewMod.View
import typings.firebaseFirestore.coreViewMod.ViewChange
import typings.firebaseFirestore.firebaseFirestoreStrings.LessthansignDELETEGreaterthansign
import typings.firebaseFirestore.localLocalViewChangesMod.LocalViewChanges
import typings.firebaseFirestore.localTargetDataMod.TargetData
import typings.firebaseFirestore.localTargetDataMod.TargetPurpose
import typings.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.modelCollectionsMod.MaybeDocumentMap_
import typings.firebaseFirestore.modelDocumentComparatorMod.DocumentComparator
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.Document
import typings.firebaseFirestore.modelDocumentMod.DocumentOptions
import typings.firebaseFirestore.modelDocumentMod.MaybeDocument
import typings.firebaseFirestore.modelDocumentMod.NoDocument
import typings.firebaseFirestore.modelDocumentMod.UnknownDocument
import typings.firebaseFirestore.modelDocumentSetMod.DocumentSet
import typings.firebaseFirestore.modelMutationMod.DeleteMutation
import typings.firebaseFirestore.modelMutationMod.FieldMask
import typings.firebaseFirestore.modelMutationMod.MutationResult
import typings.firebaseFirestore.modelMutationMod.PatchMutation
import typings.firebaseFirestore.modelMutationMod.Precondition
import typings.firebaseFirestore.modelMutationMod.SetMutation
import typings.firebaseFirestore.modelMutationMod.TransformMutation
import typings.firebaseFirestore.modelPathMod.FieldPath
import typings.firebaseFirestore.modelPathMod.ResourcePath
import typings.firebaseFirestore.remoteRemoteEventMod.RemoteEvent
import typings.firebaseFirestore.remoteRemoteEventMod.TargetChange
import typings.firebaseFirestore.srcModelFieldValueMod.FieldValue
import typings.firebaseFirestore.srcModelFieldValueMod.JsonObject
import typings.firebaseFirestore.srcModelFieldValueMod.ObjectValue
import typings.firebaseFirestore.utilByteStringMod.ByteString
import typings.firebaseFirestore.utilObjMod.Dict
import typings.firebaseFirestore.utilSortedMapMod.SortedMap
import typings.firebaseFirestore.utilSortedSetMod.SortedSet
import typings.firebaseFirestoreTypes.mod.OrderByDirection
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/util/helpers", JSImport.Namespace)
@js.native
object testUtilHelpersMod extends js.Object {
  @js.native
  class DocComparator () extends js.Object
  
  val DELETE_SENTINEL: LessthansignDELETEGreaterthansign = js.native
  def ackTarget(docsOrKeys: (Document | String)*): TargetChange = js.native
  def addTargetMapping(docsOrKeys: (Document | String)*): TargetChange = js.native
  def applyDocChanges(view: View, docsOrKeys: (Document | DocumentKey)*): ViewChange = js.native
  def blob(bytes: Double*): Blob = js.native
  def bound(values: js.Array[js.Tuple3[String, js.Object, OrderByDirection]], before: Boolean): Bound = js.native
  def byteStringFromString(value: String): ByteString = js.native
  def dbId(project: String): DatabaseId = js.native
  def dbId(project: String, database: String): DatabaseId = js.native
  def deleteMutation(keyStr: String): DeleteMutation = js.native
  def deletedDoc(keyStr: String, ver: TestSnapshotVersion): NoDocument = js.native
  def deletedDoc(keyStr: String, ver: TestSnapshotVersion, options: DocumentOptions): NoDocument = js.native
  def doc(keyStr: String, ver: TestSnapshotVersion, json: JsonObject[_]): Document = js.native
  def doc(keyStr: String, ver: TestSnapshotVersion, json: JsonObject[_], options: DocumentOptions): Document = js.native
  def docAddedRemoteEvent(docOrDocs: js.Array[MaybeDocument]): RemoteEvent = js.native
  def docAddedRemoteEvent(docOrDocs: js.Array[MaybeDocument], updatedInTargets: js.Array[TargetId]): RemoteEvent = js.native
  def docAddedRemoteEvent(
    docOrDocs: js.Array[MaybeDocument],
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def docAddedRemoteEvent(
    docOrDocs: js.Array[MaybeDocument],
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId],
    activeTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def docAddedRemoteEvent(docOrDocs: MaybeDocument): RemoteEvent = js.native
  def docAddedRemoteEvent(docOrDocs: MaybeDocument, updatedInTargets: js.Array[TargetId]): RemoteEvent = js.native
  def docAddedRemoteEvent(
    docOrDocs: MaybeDocument,
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def docAddedRemoteEvent(
    docOrDocs: MaybeDocument,
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId],
    activeTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def docUpdateRemoteEvent(doc: MaybeDocument): RemoteEvent = js.native
  def docUpdateRemoteEvent(doc: MaybeDocument, updatedInTargets: js.Array[TargetId]): RemoteEvent = js.native
  def docUpdateRemoteEvent(doc: MaybeDocument, updatedInTargets: js.Array[TargetId], removedFromTargets: js.Array[TargetId]): RemoteEvent = js.native
  def docUpdateRemoteEvent(
    doc: MaybeDocument,
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId],
    limboTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def documentSet(comp: DocumentComparator, docs: Document*): DocumentSet = js.native
  def documentSet(docs: Document*): DocumentSet = js.native
  def documentSetAsArray(docs: DocumentSet): js.Array[Document] = js.native
  def documentUpdates(docsOrKeys: (Document | DocumentKey)*): MaybeDocumentMap_ = js.native
  def expectCorrectComparisonGroups[T /* <: js.Any */](groups: js.Array[js.Array[T]], comp: js.Function2[/* left */ T, /* right */ T, Double]): Unit = js.native
  def expectCorrectComparisons[T /* <: js.Any */](array: js.Array[T], comp: js.Function2[/* left */ T, /* right */ T, Double]): Unit = js.native
  def expectEqual(left: js.Any, right: js.Any): Unit = js.native
  def expectEqual(left: js.Any, right: js.Any, message: String): Unit = js.native
  def expectEqualArrays(left: js.Array[_], right: js.Array[_]): Unit = js.native
  def expectEqualArrays(left: js.Array[_], right: js.Array[_], message: String): Unit = js.native
  def expectEqualitySets[T](elems: js.Array[js.Array[T]], equalityFn: js.Function2[/* v1 */ T, /* v2 */ T, Boolean]): Unit = js.native
  def expectFirestoreError(err: Error): Unit = js.native
  def expectNotEqual(left: js.Any, right: js.Any): Unit = js.native
  def expectNotEqual(left: js.Any, right: js.Any, message: String): Unit = js.native
  def expectSetToEqual[T](set: SortedSet[T], arr: js.Array[T]): Unit = js.native
  def field(path: String): FieldPath = js.native
  def filter(path: String, op: String, value: js.Any): FieldFilter = js.native
  def key(path: String): DocumentKey = js.native
  def keySet(keys: DocumentKey*): DocumentKeySet_ = js.native
  def keys(documents: (MaybeDocument | String)*): DocumentKeySet_ = js.native
  def limboChanges(changes: AnonAddedArray): js.Array[LimboDocumentChange] = js.native
  def localViewChanges(targetId: TargetId, fromCache: Boolean, changes: AnonAddedRemoved): LocalViewChanges = js.native
  def mapAsArray[K, V](sortedMap: SortedMap[K, V]): js.Array[AnonKey[K, V]] = js.native
  def mask(paths: String*): FieldMask = js.native
  def mutationResult(testVersion: TestSnapshotVersion): MutationResult = js.native
  def noChangeEvent(targetId: Double, snapshotVersion: Double): RemoteEvent = js.native
  def noChangeEvent(targetId: Double, snapshotVersion: Double, resumeToken: ByteString): RemoteEvent = js.native
  def orderBy(path: String): OrderBy = js.native
  def orderBy(path: String, op: String): OrderBy = js.native
  def patchMutation(keyStr: String, json: JsonObject[_]): PatchMutation = js.native
  def patchMutation(keyStr: String, json: JsonObject[_], precondition: Precondition): PatchMutation = js.native
  def path(path: String): ResourcePath = js.native
  def path(path: String, offset: Double): ResourcePath = js.native
  def ref(dbIdStr: String, keyStr: String): DocumentKeyReference = js.native
  def ref(dbIdStr: String, keyStr: String, offset: Double): DocumentKeyReference = js.native
  def removedDoc(keyStr: String): NoDocument = js.native
  def resumeTokenForSnapshot(snapshotVersion: SnapshotVersion): ByteString = js.native
  def setMutation(keyStr: String, json: JsonObject[_]): SetMutation = js.native
  def size(obj: JsonObject[_]): Double = js.native
  def targetData(targetId: TargetId, queryPurpose: TargetPurpose, path: String): TargetData = js.native
  def transformMutation(keyStr: String, data: Dict[_]): TransformMutation = js.native
  def unknownDoc(keyStr: String, ver: TestSnapshotVersion): UnknownDocument = js.native
  def updateMapping(
    snapshotVersion: SnapshotVersion,
    added: js.Array[Document | String],
    modified: js.Array[Document | String],
    removed: js.Array[MaybeDocument | String]
  ): TargetChange = js.native
  def updateMapping(
    snapshotVersion: SnapshotVersion,
    added: js.Array[Document | String],
    modified: js.Array[Document | String],
    removed: js.Array[MaybeDocument | String],
    current: Boolean
  ): TargetChange = js.native
  def version(v: TestSnapshotVersion): SnapshotVersion = js.native
  def wrap(value: js.Any): FieldValue = js.native
  def wrapObject(obj: JsonObject[_]): ObjectValue = js.native
  /* static members */
  @js.native
  object DocComparator extends js.Object {
    def byField(fields: String*): DocumentComparator = js.native
  }
  
  type TestSnapshotVersion = Double
}

