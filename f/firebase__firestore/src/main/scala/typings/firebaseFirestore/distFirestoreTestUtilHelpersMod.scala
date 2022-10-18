package typings.firebaseFirestore

import typings.firebaseFirestore.anon.AddedRemoved
import typings.firebaseFirestore.anon.Fields
import typings.firebaseFirestore.anon.KeyValue
import typings.firebaseFirestore.anon.Removed
import typings.firebaseFirestore.distFirestoreSrcCoreBundleMod.BundledDocuments
import typings.firebaseFirestore.distFirestoreSrcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distFirestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Bound
import typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.FieldFilter
import typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Filter
import typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.OrderBy
import typings.firebaseFirestore.distFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distFirestoreSrcCoreViewMod.LimboDocumentChange
import typings.firebaseFirestore.distFirestoreSrcCoreViewMod.View
import typings.firebaseFirestore.distFirestoreSrcCoreViewMod.ViewChange
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentData
import typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataReaderMod.UserDataReader
import typings.firebaseFirestore.distFirestoreSrcLocalLocalViewChangesMod.LocalViewChanges
import typings.firebaseFirestore.distFirestoreSrcLocalTargetDataMod.TargetData
import typings.firebaseFirestore.distFirestoreSrcLocalTargetDataMod.TargetPurpose
import typings.firebaseFirestore.distFirestoreSrcMod.Bytes
import typings.firebaseFirestore.distFirestoreSrcMod.DocumentReference
import typings.firebaseFirestore.distFirestoreSrcModelCollectionsMod.DocumentKeySet_
import typings.firebaseFirestore.distFirestoreSrcModelCollectionsMod.DocumentMap_
import typings.firebaseFirestore.distFirestoreSrcModelDocumentComparatorMod.DocumentComparator
import typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distFirestoreSrcModelDocumentMod.MutableDocument
import typings.firebaseFirestore.distFirestoreSrcModelDocumentSetMod.DocumentSet
import typings.firebaseFirestore.distFirestoreSrcModelFieldIndexMod.FieldIndex
import typings.firebaseFirestore.distFirestoreSrcModelFieldMaskMod.FieldMask
import typings.firebaseFirestore.distFirestoreSrcModelMutationMod.DeleteMutation
import typings.firebaseFirestore.distFirestoreSrcModelMutationMod.MutationResult
import typings.firebaseFirestore.distFirestoreSrcModelMutationMod.PatchMutation
import typings.firebaseFirestore.distFirestoreSrcModelMutationMod.Precondition
import typings.firebaseFirestore.distFirestoreSrcModelMutationMod.SetMutation
import typings.firebaseFirestore.distFirestoreSrcModelObjectValueMod.JsonObject
import typings.firebaseFirestore.distFirestoreSrcModelObjectValueMod.ObjectValue
import typings.firebaseFirestore.distFirestoreSrcModelPathMod.FieldPath
import typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath
import typings.firebaseFirestore.distFirestoreSrcProtosFirestoreBundleProtoMod.BundleMetadata
import typings.firebaseFirestore.distFirestoreSrcProtosFirestoreBundleProtoMod.LimitType
import typings.firebaseFirestore.distFirestoreSrcProtosFirestoreBundleProtoMod.NamedQuery
import typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Value
import typings.firebaseFirestore.distFirestoreSrcRemoteRemoteEventMod.RemoteEvent
import typings.firebaseFirestore.distFirestoreSrcRemoteRemoteEventMod.TargetChange
import typings.firebaseFirestore.distFirestoreSrcUtilByteStringMod.ByteString
import typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.Code
import typings.firebaseFirestore.distFirestoreSrcUtilObjMod.Dict
import typings.firebaseFirestore.distFirestoreSrcUtilSortedMapMod.SortedMap
import typings.firebaseFirestore.distFirestoreSrcUtilSortedSetMod.SortedSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreTestUtilHelpersMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/util/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/test/util/helpers", "DocComparator")
  @js.native
  open class DocComparator () extends StObject
  /* static members */
  object DocComparator {
    
    @JSImport("@firebase/firestore/dist/firestore/test/util/helpers", "DocComparator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def byField(fields: String*): DocumentComparator = ^.asInstanceOf[js.Dynamic].applyDynamic("byField")(fields.asInstanceOf[Seq[js.Any]]*).asInstanceOf[DocumentComparator]
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/util/helpers", "TestBundledDocuments")
  @js.native
  open class TestBundledDocuments protected () extends StObject {
    def this(documents: BundledDocuments, bundleName: String) = this()
    
    var bundleName: String = js.native
    
    var documents: BundledDocuments = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/util/helpers", "TestNamedQuery")
  @js.native
  open class TestNamedQuery protected () extends StObject {
    def this(namedQuery: NamedQuery, matchingDocuments: DocumentKeySet_) = this()
    
    var matchingDocuments: DocumentKeySet_ = js.native
    
    var namedQuery: NamedQuery = js.native
  }
  
  inline def ackTarget(docsOrKeys: (MutableDocument | String)*): TargetChange = ^.asInstanceOf[js.Dynamic].applyDynamic("ackTarget")(docsOrKeys.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TargetChange]
  
  inline def addTargetMapping(docsOrKeys: (MutableDocument | String)*): TargetChange = ^.asInstanceOf[js.Dynamic].applyDynamic("addTargetMapping")(docsOrKeys.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TargetChange]
  
  inline def applyDocChanges(view: View, docsOrKeys: (Document | DocumentKey)*): ViewChange = ^.asInstanceOf[js.Dynamic].applyDynamic("applyDocChanges")(scala.List(view.asInstanceOf[js.Any]).`++`(docsOrKeys.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ViewChange]
  
  inline def blob(bytes: Double*): Bytes = ^.asInstanceOf[js.Dynamic].applyDynamic("blob")(bytes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Bytes]
  
  inline def bound(values: js.Array[Any], inclusive: Boolean): Bound = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(values.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Bound]
  
  inline def bundleMetadata(id: String, createTime: TestSnapshotVersion): BundleMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("bundleMetadata")(id.asInstanceOf[js.Any], createTime.asInstanceOf[js.Any])).asInstanceOf[BundleMetadata]
  inline def bundleMetadata(id: String, createTime: TestSnapshotVersion, version: Double): BundleMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("bundleMetadata")(id.asInstanceOf[js.Any], createTime.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[BundleMetadata]
  inline def bundleMetadata(id: String, createTime: TestSnapshotVersion, version: Double, totalDocuments: Double): BundleMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("bundleMetadata")(id.asInstanceOf[js.Any], createTime.asInstanceOf[js.Any], version.asInstanceOf[js.Any], totalDocuments.asInstanceOf[js.Any])).asInstanceOf[BundleMetadata]
  inline def bundleMetadata(
    id: String,
    createTime: TestSnapshotVersion,
    version: Double,
    totalDocuments: Double,
    totalBytes: Double
  ): BundleMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("bundleMetadata")(id.asInstanceOf[js.Any], createTime.asInstanceOf[js.Any], version.asInstanceOf[js.Any], totalDocuments.asInstanceOf[js.Any], totalBytes.asInstanceOf[js.Any])).asInstanceOf[BundleMetadata]
  inline def bundleMetadata(
    id: String,
    createTime: TestSnapshotVersion,
    version: Double,
    totalDocuments: Unit,
    totalBytes: Double
  ): BundleMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("bundleMetadata")(id.asInstanceOf[js.Any], createTime.asInstanceOf[js.Any], version.asInstanceOf[js.Any], totalDocuments.asInstanceOf[js.Any], totalBytes.asInstanceOf[js.Any])).asInstanceOf[BundleMetadata]
  inline def bundleMetadata(id: String, createTime: TestSnapshotVersion, version: Unit, totalDocuments: Double): BundleMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("bundleMetadata")(id.asInstanceOf[js.Any], createTime.asInstanceOf[js.Any], version.asInstanceOf[js.Any], totalDocuments.asInstanceOf[js.Any])).asInstanceOf[BundleMetadata]
  inline def bundleMetadata(
    id: String,
    createTime: TestSnapshotVersion,
    version: Unit,
    totalDocuments: Double,
    totalBytes: Double
  ): BundleMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("bundleMetadata")(id.asInstanceOf[js.Any], createTime.asInstanceOf[js.Any], version.asInstanceOf[js.Any], totalDocuments.asInstanceOf[js.Any], totalBytes.asInstanceOf[js.Any])).asInstanceOf[BundleMetadata]
  inline def bundleMetadata(
    id: String,
    createTime: TestSnapshotVersion,
    version: Unit,
    totalDocuments: Unit,
    totalBytes: Double
  ): BundleMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("bundleMetadata")(id.asInstanceOf[js.Any], createTime.asInstanceOf[js.Any], version.asInstanceOf[js.Any], totalDocuments.asInstanceOf[js.Any], totalBytes.asInstanceOf[js.Any])).asInstanceOf[BundleMetadata]
  
  inline def bundledDocuments(documents: js.Array[MutableDocument]): TestBundledDocuments = ^.asInstanceOf[js.Dynamic].applyDynamic("bundledDocuments")(documents.asInstanceOf[js.Any]).asInstanceOf[TestBundledDocuments]
  inline def bundledDocuments(documents: js.Array[MutableDocument], queryNames: js.Array[js.Array[String]]): TestBundledDocuments = (^.asInstanceOf[js.Dynamic].applyDynamic("bundledDocuments")(documents.asInstanceOf[js.Any], queryNames.asInstanceOf[js.Any])).asInstanceOf[TestBundledDocuments]
  inline def bundledDocuments(documents: js.Array[MutableDocument], queryNames: js.Array[js.Array[String]], bundleName: String): TestBundledDocuments = (^.asInstanceOf[js.Dynamic].applyDynamic("bundledDocuments")(documents.asInstanceOf[js.Any], queryNames.asInstanceOf[js.Any], bundleName.asInstanceOf[js.Any])).asInstanceOf[TestBundledDocuments]
  inline def bundledDocuments(documents: js.Array[MutableDocument], queryNames: Unit, bundleName: String): TestBundledDocuments = (^.asInstanceOf[js.Dynamic].applyDynamic("bundledDocuments")(documents.asInstanceOf[js.Any], queryNames.asInstanceOf[js.Any], bundleName.asInstanceOf[js.Any])).asInstanceOf[TestBundledDocuments]
  
  inline def byteStringFromString(value: String): ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("byteStringFromString")(value.asInstanceOf[js.Any]).asInstanceOf[ByteString]
  
  inline def computeCombinations[T](input: js.Array[T]): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCombinations")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
  
  inline def computePermutations[T](input: js.Array[T]): js.Array[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computePermutations")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[T]]]
  
  inline def dbId(project: String): DatabaseId = ^.asInstanceOf[js.Dynamic].applyDynamic("dbId")(project.asInstanceOf[js.Any]).asInstanceOf[DatabaseId]
  inline def dbId(project: String, database: String): DatabaseId = (^.asInstanceOf[js.Dynamic].applyDynamic("dbId")(project.asInstanceOf[js.Any], database.asInstanceOf[js.Any])).asInstanceOf[DatabaseId]
  
  inline def deleteMutation(keyStr: String): DeleteMutation = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteMutation")(keyStr.asInstanceOf[js.Any]).asInstanceOf[DeleteMutation]
  
  inline def deletedDoc(keyStr: String, ver: TestSnapshotVersion): MutableDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("deletedDoc")(keyStr.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[MutableDocument]
  
  inline def doc(keyStr: String, ver: TestSnapshotVersion, jsonOrObjectValue: JsonObject[Any]): MutableDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")(keyStr.asInstanceOf[js.Any], ver.asInstanceOf[js.Any], jsonOrObjectValue.asInstanceOf[js.Any])).asInstanceOf[MutableDocument]
  inline def doc(keyStr: String, ver: TestSnapshotVersion, jsonOrObjectValue: ObjectValue): MutableDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")(keyStr.asInstanceOf[js.Any], ver.asInstanceOf[js.Any], jsonOrObjectValue.asInstanceOf[js.Any])).asInstanceOf[MutableDocument]
  
  inline def docAddedRemoteEvent(docOrDocs: js.Array[MutableDocument]): RemoteEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any]).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(docOrDocs: js.Array[MutableDocument], updatedInTargets: js.Array[TargetId]): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(
    docOrDocs: js.Array[MutableDocument],
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(
    docOrDocs: js.Array[MutableDocument],
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId],
    activeTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any], activeTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(
    docOrDocs: js.Array[MutableDocument],
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: Unit,
    activeTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any], activeTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(
    docOrDocs: js.Array[MutableDocument],
    updatedInTargets: Unit,
    removedFromTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(
    docOrDocs: js.Array[MutableDocument],
    updatedInTargets: Unit,
    removedFromTargets: js.Array[TargetId],
    activeTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any], activeTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(
    docOrDocs: js.Array[MutableDocument],
    updatedInTargets: Unit,
    removedFromTargets: Unit,
    activeTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any], activeTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(docOrDocs: MutableDocument): RemoteEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any]).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(docOrDocs: MutableDocument, updatedInTargets: js.Array[TargetId]): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(
    docOrDocs: MutableDocument,
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(
    docOrDocs: MutableDocument,
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId],
    activeTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any], activeTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(
    docOrDocs: MutableDocument,
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: Unit,
    activeTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any], activeTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(docOrDocs: MutableDocument, updatedInTargets: Unit, removedFromTargets: js.Array[TargetId]): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(
    docOrDocs: MutableDocument,
    updatedInTargets: Unit,
    removedFromTargets: js.Array[TargetId],
    activeTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any], activeTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docAddedRemoteEvent(
    docOrDocs: MutableDocument,
    updatedInTargets: Unit,
    removedFromTargets: Unit,
    activeTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docAddedRemoteEvent")(docOrDocs.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any], activeTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  
  inline def docUpdateRemoteEvent(doc: MutableDocument): RemoteEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("docUpdateRemoteEvent")(doc.asInstanceOf[js.Any]).asInstanceOf[RemoteEvent]
  inline def docUpdateRemoteEvent(doc: MutableDocument, updatedInTargets: js.Array[TargetId]): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docUpdateRemoteEvent")(doc.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docUpdateRemoteEvent(doc: MutableDocument, updatedInTargets: js.Array[TargetId], removedFromTargets: js.Array[TargetId]): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docUpdateRemoteEvent")(doc.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docUpdateRemoteEvent(
    doc: MutableDocument,
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId],
    limboTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docUpdateRemoteEvent")(doc.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any], limboTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docUpdateRemoteEvent(
    doc: MutableDocument,
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: Unit,
    limboTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docUpdateRemoteEvent")(doc.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any], limboTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docUpdateRemoteEvent(doc: MutableDocument, updatedInTargets: Unit, removedFromTargets: js.Array[TargetId]): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docUpdateRemoteEvent")(doc.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docUpdateRemoteEvent(
    doc: MutableDocument,
    updatedInTargets: Unit,
    removedFromTargets: js.Array[TargetId],
    limboTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docUpdateRemoteEvent")(doc.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any], limboTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def docUpdateRemoteEvent(
    doc: MutableDocument,
    updatedInTargets: Unit,
    removedFromTargets: Unit,
    limboTargets: js.Array[TargetId]
  ): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("docUpdateRemoteEvent")(doc.asInstanceOf[js.Any], updatedInTargets.asInstanceOf[js.Any], removedFromTargets.asInstanceOf[js.Any], limboTargets.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  
  inline def documentSet(comp: DocumentComparator, docs: Document*): DocumentSet = ^.asInstanceOf[js.Dynamic].applyDynamic("documentSet")(scala.List(comp.asInstanceOf[js.Any]).`++`(docs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[DocumentSet]
  inline def documentSet(docs: Document*): DocumentSet = ^.asInstanceOf[js.Dynamic].applyDynamic("documentSet")(docs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[DocumentSet]
  
  inline def documentSetAsArray(docs: DocumentSet): js.Array[Document] = ^.asInstanceOf[js.Dynamic].applyDynamic("documentSetAsArray")(docs.asInstanceOf[js.Any]).asInstanceOf[js.Array[Document]]
  
  inline def documentUpdates(docsOrKeys: (Document | DocumentKey)*): DocumentMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("documentUpdates")(docsOrKeys.asInstanceOf[Seq[js.Any]]*).asInstanceOf[DocumentMap_]
  
  inline def existenceFilterEvent(targetId: Double, syncedKeys: DocumentKeySet_, remoteCount: Double, snapshotVersion: Double): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("existenceFilterEvent")(targetId.asInstanceOf[js.Any], syncedKeys.asInstanceOf[js.Any], remoteCount.asInstanceOf[js.Any], snapshotVersion.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  
  inline def expectCorrectComparisonGroups[T /* <: Any */](groups: js.Array[js.Array[T]], comp: js.Function2[/* left */ T, /* right */ T, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectCorrectComparisonGroups")(groups.asInstanceOf[js.Any], comp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectCorrectComparisons[T /* <: Any */](array: js.Array[T], comp: js.Function2[/* left */ T, /* right */ T, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectCorrectComparisons")(array.asInstanceOf[js.Any], comp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectEqual(left: Any, right: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectEqual(left: Any, right: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectEqualArrays(left: js.Array[Any], right: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectEqualArrays")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectEqualArrays(left: js.Array[Any], right: js.Array[Any], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectEqualArrays")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectEqualitySets[T](elems: js.Array[js.Array[T]], equalityFn: js.Function2[/* v1 */ T, /* v2 */ T, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectEqualitySets")(elems.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectEqualitySets[T](
    elems: js.Array[js.Array[T]],
    equalityFn: js.Function2[/* v1 */ T, /* v2 */ T, Boolean],
    stringifyFn: js.Function1[/* v */ T, String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectEqualitySets")(elems.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any], stringifyFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectNotEqual(left: Any, right: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectNotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def expectNotEqual(left: Any, right: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectNotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectSetToEqual[T](set: SortedSet[T], arr: js.Array[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectSetToEqual")(set.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def field(path: String): FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("field")(path.asInstanceOf[js.Any]).asInstanceOf[FieldPath]
  
  inline def fieldIndex(collectionGroup: String): FieldIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldIndex")(collectionGroup.asInstanceOf[js.Any]).asInstanceOf[FieldIndex]
  inline def fieldIndex(collectionGroup: String, options: Fields): FieldIndex = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldIndex")(collectionGroup.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FieldIndex]
  
  inline def filter(path: String, op: String, value: Any): FieldFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(path.asInstanceOf[js.Any], op.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FieldFilter]
  
  inline def forEachNumber[V](obj: Dict[V], fn: js.Function2[/* key */ Double, /* val */ V, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachNumber")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def invalidDoc(keyStr: String): MutableDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidDoc")(keyStr.asInstanceOf[js.Any]).asInstanceOf[MutableDocument]
  
  inline def key(path: String): DocumentKey = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(path.asInstanceOf[js.Any]).asInstanceOf[DocumentKey]
  
  inline def keySet(keys: DocumentKey*): DocumentKeySet_ = ^.asInstanceOf[js.Dynamic].applyDynamic("keySet")(keys.asInstanceOf[Seq[js.Any]]*).asInstanceOf[DocumentKeySet_]
  
  inline def keys(documents: (Document | String)*): DocumentKeySet_ = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(documents.asInstanceOf[Seq[js.Any]]*).asInstanceOf[DocumentKeySet_]
  
  inline def limboChanges(changes: Removed): js.Array[LimboDocumentChange] = ^.asInstanceOf[js.Dynamic].applyDynamic("limboChanges")(changes.asInstanceOf[js.Any]).asInstanceOf[js.Array[LimboDocumentChange]]
  
  inline def localViewChanges(targetId: TargetId, fromCache: Boolean, changes: AddedRemoved): LocalViewChanges = (^.asInstanceOf[js.Dynamic].applyDynamic("localViewChanges")(targetId.asInstanceOf[js.Any], fromCache.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[LocalViewChanges]
  
  inline def mapAsArray[K, V](sortedMap: SortedMap[K, V]): js.Array[KeyValue[K, V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapAsArray")(sortedMap.asInstanceOf[js.Any]).asInstanceOf[js.Array[KeyValue[K, V]]]
  
  inline def mask(paths: String*): FieldMask = ^.asInstanceOf[js.Dynamic].applyDynamic("mask")(paths.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FieldMask]
  
  inline def mergeMutation(keyStr: String, json: JsonObject[Any], updateMask: js.Array[FieldPath]): PatchMutation = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeMutation")(keyStr.asInstanceOf[js.Any], json.asInstanceOf[js.Any], updateMask.asInstanceOf[js.Any])).asInstanceOf[PatchMutation]
  
  inline def mutationResult(testVersion: TestSnapshotVersion): MutationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("mutationResult")(testVersion.asInstanceOf[js.Any]).asInstanceOf[MutationResult]
  
  inline def namedQuery(name: String, query: Query, limitType: LimitType, readTime: SnapshotVersion): TestNamedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("namedQuery")(name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any], readTime.asInstanceOf[js.Any])).asInstanceOf[TestNamedQuery]
  inline def namedQuery(
    name: String,
    query: Query,
    limitType: LimitType,
    readTime: SnapshotVersion,
    matchingDocuments: DocumentKeySet_
  ): TestNamedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("namedQuery")(name.asInstanceOf[js.Any], query.asInstanceOf[js.Any], limitType.asInstanceOf[js.Any], readTime.asInstanceOf[js.Any], matchingDocuments.asInstanceOf[js.Any])).asInstanceOf[TestNamedQuery]
  
  inline def noChangeEvent(targetId: Double, snapshotVersion: Double): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("noChangeEvent")(targetId.asInstanceOf[js.Any], snapshotVersion.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  inline def noChangeEvent(targetId: Double, snapshotVersion: Double, resumeToken: ByteString): RemoteEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("noChangeEvent")(targetId.asInstanceOf[js.Any], snapshotVersion.asInstanceOf[js.Any], resumeToken.asInstanceOf[js.Any])).asInstanceOf[RemoteEvent]
  
  inline def orderBy(path: String): OrderBy = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(path.asInstanceOf[js.Any]).asInstanceOf[OrderBy]
  inline def orderBy(path: String, op: String): OrderBy = (^.asInstanceOf[js.Dynamic].applyDynamic("orderBy")(path.asInstanceOf[js.Any], op.asInstanceOf[js.Any])).asInstanceOf[OrderBy]
  
  inline def patchMutation(keyStr: String, json: JsonObject[Any]): PatchMutation = (^.asInstanceOf[js.Dynamic].applyDynamic("patchMutation")(keyStr.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[PatchMutation]
  inline def patchMutation(keyStr: String, json: JsonObject[Any], precondition: Precondition): PatchMutation = (^.asInstanceOf[js.Dynamic].applyDynamic("patchMutation")(keyStr.asInstanceOf[js.Any], json.asInstanceOf[js.Any], precondition.asInstanceOf[js.Any])).asInstanceOf[PatchMutation]
  
  inline def path(path: String): ResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any]).asInstanceOf[ResourcePath]
  inline def path(path: String, offset: Double): ResourcePath = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[ResourcePath]
  
  inline def query(resourcePath: String, constraints: (OrderBy | Filter)*): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(resourcePath.asInstanceOf[js.Any]).`++`(constraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query]
  
  inline def ref(key: String): DocumentReference[DocumentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(key.asInstanceOf[js.Any]).asInstanceOf[DocumentReference[DocumentData]]
  inline def ref(key: String, offset: Double): DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(key.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[DocumentReference[DocumentData]]
  
  inline def removedDoc(keyStr: String): MutableDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("removedDoc")(keyStr.asInstanceOf[js.Any]).asInstanceOf[MutableDocument]
  
  inline def resumeTokenForSnapshot(snapshotVersion: SnapshotVersion): ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeTokenForSnapshot")(snapshotVersion.asInstanceOf[js.Any]).asInstanceOf[ByteString]
  
  inline def setMutation(keyStr: String, json: JsonObject[Any]): SetMutation = (^.asInstanceOf[js.Dynamic].applyDynamic("setMutation")(keyStr.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[SetMutation]
  
  inline def stringFromBase64String(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringFromBase64String")().asInstanceOf[String]
  inline def stringFromBase64String(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringFromBase64String")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringFromBase64String(value: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringFromBase64String")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def targetData(targetId: TargetId, queryPurpose: TargetPurpose, path: String): TargetData = (^.asInstanceOf[js.Dynamic].applyDynamic("targetData")(targetId.asInstanceOf[js.Any], queryPurpose.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[TargetData]
  
  inline def testUserDataReader(): UserDataReader = ^.asInstanceOf[js.Dynamic].applyDynamic("testUserDataReader")().asInstanceOf[UserDataReader]
  inline def testUserDataReader(useProto3Json: Boolean): UserDataReader = ^.asInstanceOf[js.Dynamic].applyDynamic("testUserDataReader")(useProto3Json.asInstanceOf[js.Any]).asInstanceOf[UserDataReader]
  
  inline def unknownDoc(keyStr: String, ver: TestSnapshotVersion): MutableDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("unknownDoc")(keyStr.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[MutableDocument]
  
  inline def updateMapping(
    snapshotVersion: SnapshotVersion,
    added: js.Array[MutableDocument | String],
    modified: js.Array[MutableDocument | String],
    removed: js.Array[MutableDocument | String]
  ): TargetChange = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMapping")(snapshotVersion.asInstanceOf[js.Any], added.asInstanceOf[js.Any], modified.asInstanceOf[js.Any], removed.asInstanceOf[js.Any])).asInstanceOf[TargetChange]
  inline def updateMapping(
    snapshotVersion: SnapshotVersion,
    added: js.Array[MutableDocument | String],
    modified: js.Array[MutableDocument | String],
    removed: js.Array[MutableDocument | String],
    current: Boolean
  ): TargetChange = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMapping")(snapshotVersion.asInstanceOf[js.Any], added.asInstanceOf[js.Any], modified.asInstanceOf[js.Any], removed.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[TargetChange]
  
  inline def validateFirestoreError(expectedCode: Code, actualError: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateFirestoreError")(expectedCode.asInstanceOf[js.Any], actualError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def version(v: TestSnapshotVersion): SnapshotVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("version")(v.asInstanceOf[js.Any]).asInstanceOf[SnapshotVersion]
  
  inline def wrap(value: Any): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  inline def wrapObject(obj: JsonObject[Any]): ObjectValue = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapObject")(obj.asInstanceOf[js.Any]).asInstanceOf[ObjectValue]
  
  type TestSnapshotVersion = Double
}
