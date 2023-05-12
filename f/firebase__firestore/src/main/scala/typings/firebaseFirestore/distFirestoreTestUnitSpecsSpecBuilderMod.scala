package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseFirestore.anon.Acknowledged
import typings.firebaseFirestore.anon.Added
import typings.firebaseFirestore.anon.Affects
import typings.firebaseFirestore.anon.Config
import typings.firebaseFirestore.anon.ExpectUserCallback
import typings.firebaseFirestore.anon.ExpectedCount
import typings.firebaseFirestore.anon.RunBackoffTimer
import typings.firebaseFirestore.distFirestoreSrcApiIndexConfigurationMod.IndexConfiguration
import typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distFirestoreSrcCoreTargetIdGeneratorMod.TargetIdGenerator
import typings.firebaseFirestore.distFirestoreSrcCoreTargetMod.Target
import typings.firebaseFirestore.distFirestoreSrcCoreTypesMod.TargetId
import typings.firebaseFirestore.distFirestoreSrcLocalTargetDataMod.TargetPurpose
import typings.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distFirestoreSrcModelDocumentMod.Document
import typings.firebaseFirestore.distFirestoreSrcModelFieldIndexMod.FieldIndex
import typings.firebaseFirestore.distFirestoreSrcModelObjectValueMod.JsonObject
import typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.BloomFilter
import typings.firebaseFirestore.distFirestoreSrcUtilAsyncQueueMod.TimerId
import typings.firebaseFirestore.distFirestoreSrcUtilErrorMod.Code
import typings.firebaseFirestore.distFirestoreSrcUtilObjMapMod.ObjectMap
import typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecRpcErrorMod.RpcError
import typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.PersistenceAction
import typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.SpecConfig
import typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.SpecQuery
import typings.firebaseFirestore.distFirestoreTestUnitSpecsSpecTestRunnerMod.SpecStep
import typings.firebaseFirestore.distFirestoreTestUtilHelpersMod.TestSnapshotVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreTestUnitSpecsSpecBuilderMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/unit/specs/spec_builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/test/unit/specs/spec_builder", "ClientMemoryState")
  @js.native
  open class ClientMemoryState () extends StObject {
    
    var activeTargets: ActiveTargetMap = js.native
    
    var injectFailures: Boolean = js.native
    
    var limboIdGenerator: TargetIdGenerator = js.native
    
    var limboMapping: LimboMap = js.native
    
    var queryMapping: ObjectMap[Target, Double] = js.native
    
    /** Reset all internal memory state (as done during a client restart). */
    def reset(): Unit = js.native
    
    /**
      * Reset the internal limbo mapping (as done during a primary lease failover).
      */
    def resetLimboMapping(): Unit = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/unit/specs/spec_builder", "MultiClientSpecBuilder")
  @js.native
  open class MultiClientSpecBuilder () extends SpecBuilder {
    
    /* private */ var activeClientIndex: Any = js.native
    
    def client(clientIndex: Double): MultiClientSpecBuilder = js.native
    
    /* private */ var clientStates: Any = js.native
    
    /**
      * Take the primary lease, even if another client has already obtained the
      * lease.
      */
    def stealPrimaryLease(): this.type = js.native
  }
  
  @JSImport("@firebase/firestore/dist/firestore/test/unit/specs/spec_builder", "SpecBuilder")
  @js.native
  open class SpecBuilder () extends StObject {
    
    /**
      * Special helper for limbo documents that acks with either a document or
      * with no document for NoDocument. This is translated into normal watch
      * messages.
      */
    def ackLimbo(version: TestSnapshotVersion, doc: Document): this.type = js.native
    
    /* private */ def activeTargets: Any = js.native
    
    /**
      * Add the specified `Query` under give active targe id. If it is already
      * added, this is a no-op.
      */
    /* private */ var addQueryToActiveTargets: Any = js.native
    
    /* private */ var assertStep: Any = js.native
    
    def becomeHidden(): this.type = js.native
    
    def becomeVisible(): this.type = js.native
    
    def changeUser(): this.type = js.native
    def changeUser(uid: String): this.type = js.native
    
    def clearPersistence(): this.type = js.native
    
    /* protected */ def clientState: ClientMemoryState = js.native
    
    /* protected */ var config: SpecConfig = js.native
    
    /* private */ val currentClientState: Any = js.native
    
    /* protected */ var currentStep: SpecStep | Null = js.native
    
    def disableNetwork(): this.type = js.native
    
    def enableNetwork(): this.type = js.native
    
    def ensureManualLruGC(): this.type = js.native
    
    /** Overrides the currently expected set of active targets. */
    def expectActiveTargets(targets: ExpectedCount*): this.type = js.native
    
    /**
      * Expects a document to be in limbo, enqueued for limbo resolution, and
      * therefore *without* an active targetId.
      */
    def expectEnqueuedLimboDocs(keys: DocumentKey*): this.type = js.native
    
    def expectEvents(query: Query, events: Added): this.type = js.native
    
    /** Expects indexes to exist (in any order) */
    def expectIndexes(indexes: js.Array[FieldIndex]): this.type = js.native
    
    def expectIsShutdown(): this.type = js.native
    
    /**
      * Expects a document to be in limbo. A targetId is assigned if it's not in
      * limbo yet.
      */
    def expectLimboDocs(keys: DocumentKey*): this.type = js.native
    
    /** Registers a query that is active in another tab. */
    def expectListen(query: Query): this.type = js.native
    def expectListen(query: Query, resume: ResumeSpec): this.type = js.native
    
    def expectNumActiveClients(num: Double): this.type = js.native
    
    def expectNumOutstandingWrites(num: Double): this.type = js.native
    
    def expectPrimaryState(isPrimary: Boolean): this.type = js.native
    
    def expectSnapshotsInSyncEvent(): this.type = js.native
    def expectSnapshotsInSyncEvent(count: Double): this.type = js.native
    
    /** Removes a query that is no longer active in any tab. */
    def expectUnlisten(query: Query): this.type = js.native
    
    def expectUserCallbacks(docs: Acknowledged): this.type = js.native
    
    def expectWaitForPendingWritesEvent(): this.type = js.native
    def expectWaitForPendingWritesEvent(count: Double): this.type = js.native
    
    /**
      * Verifies the total number of requests sent to the watch backend since test
      * initialization.
      */
    def expectWatchStreamRequestCount(num: Double): this.type = js.native
    
    /**
      * Verifies the total number of requests sent to the write backend since test
      * initialization.
      */
    def expectWriteStreamRequestCount(num: Double): this.type = js.native
    
    /**
      * Fails the specified database transaction until `recoverDatabase()` is
      * called.
      */
    def failDatabaseTransactions(actions: PersistenceAction*): this.type = js.native
    
    /**
      * Fails a write with an error and optional additional options.
      *
      * expectUserCallback defaults to true if omitted.
      */
    def failWrite(doc: String, error: RpcError): this.type = js.native
    def failWrite(doc: String, error: RpcError, options: ExpectUserCallback): this.type = js.native
    
    /* private */ var getTargetId: Any = js.native
    
    /* private */ def injectFailures: Any = js.native
    /* private */ def injectFailures_=(value: Any): Unit = js.native
    
    /* private */ def limboIdGenerator: Any = js.native
    
    /* private */ def limboMapping: Any = js.native
    
    def loadBundle(bundleContent: String): this.type = js.native
    
    /* protected */ def nextStep(): Unit = js.native
    
    /* private */ var queryIdGenerator: Any = js.native
    
    /* private */ def queryMapping: Any = js.native
    
    /** Stops failing database operations. */
    def recoverDatabase(): this.type = js.native
    
    def removeExpectedTargetMapping(query: Query): this.type = js.native
    
    /* private */ var removeQueryFromActiveTargets: Any = js.native
    
    def restart(): this.type = js.native
    
    /**
      * Registers a previously active target with the test expectations after a
      * stream disconnect.
      */
    def restoreListen(query: Query, resumeToken: String): this.type = js.native
    def restoreListen(query: Query, resumeToken: String, expectedCount: Double): this.type = js.native
    
    /**
      * Run the spec as a test. If persistence is available it will run it with and
      * without persistence enabled.
      */
    def runAsTest(name: String, tags: js.Array[String], usePersistence: Boolean): js.Promise[Unit] = js.native
    
    def runTimer(timerId: TimerId): this.type = js.native
    
    def setIndexConfiguration(jsonOrConfiguration: String): this.type = js.native
    def setIndexConfiguration(jsonOrConfiguration: IndexConfiguration): this.type = js.native
    
    def shutdown(): this.type = js.native
    
    /* private */ var steps: Any = js.native
    
    /**
      * Exports the spec steps as a JSON object that be used in the spec runner.
      */
    def toJSON(): Config = js.native
    
    def triggerLruGC(cacheThreshold: Double): this.type = js.native
    
    def userAddsSnapshotsInSyncListener(): this.type = js.native
    
    def userDeletes(key: String): this.type = js.native
    
    def userListens(query: Query): this.type = js.native
    def userListens(query: Query, resume: ResumeSpec): this.type = js.native
    
    def userPatches(key: String, value: JsonObject[Any]): this.type = js.native
    
    def userRemovesSnapshotsInSyncListener(): this.type = js.native
    
    def userSets(key: String, value: JsonObject[Any]): this.type = js.native
    
    def userUnlistens(query: Query): this.type = js.native
    
    def waitForPendingWrites(): this.type = js.native
    
    def watchAcks(query: Query): this.type = js.native
    
    def watchAcksFull(query: Query, version: TestSnapshotVersion, docs: Document*): this.type = js.native
    
    def watchCurrents(query: Query, resumeToken: String): this.type = js.native
    
    def watchFilters(queries: js.Array[Query]): this.type = js.native
    def watchFilters(queries: js.Array[Query], docs: js.Array[DocumentKey]): this.type = js.native
    def watchFilters(queries: js.Array[Query], docs: js.Array[DocumentKey], bloomFilter: BloomFilter): this.type = js.native
    def watchFilters(queries: js.Array[Query], docs: Unit, bloomFilter: BloomFilter): this.type = js.native
    
    def watchRemoves(query: Query): this.type = js.native
    def watchRemoves(query: Query, cause: RpcError): this.type = js.native
    
    def watchRemovesDoc(key: DocumentKey, targets: Query*): this.type = js.native
    
    /**
      * Special helper for limbo documents that acks an unlisten for a limbo doc
      * with either a document or with no document for NoDocument. This is
      * translated into normal watch messages.
      */
    def watchRemovesLimboTarget(doc: Document): this.type = js.native
    
    def watchResets(queries: Query*): this.type = js.native
    
    def watchSends(targets: Affects, docs: Document*): this.type = js.native
    
    def watchSnapshots(version: TestSnapshotVersion): this.type = js.native
    def watchSnapshots(version: TestSnapshotVersion, targets: js.Array[Query]): this.type = js.native
    def watchSnapshots(version: TestSnapshotVersion, targets: js.Array[Query], resumeToken: String): this.type = js.native
    def watchSnapshots(version: TestSnapshotVersion, targets: Unit, resumeToken: String): this.type = js.native
    
    def watchStreamCloses(error: Code): this.type = js.native
    def watchStreamCloses(error: Code, opts: RunBackoffTimer): this.type = js.native
    
    def withMaxConcurrentLimboResolutions(): this.type = js.native
    def withMaxConcurrentLimboResolutions(value: Double): this.type = js.native
    
    /**
      * Acks a write with a version and optional additional options.
      *
      * expectUserCallback defaults to true if omitted.
      */
    def writeAcks(doc: String, version: TestSnapshotVersion): this.type = js.native
    def writeAcks(doc: String, version: TestSnapshotVersion, options: ExpectUserCallback): this.type = js.native
  }
  /* static members */
  object SpecBuilder {
    
    @JSImport("@firebase/firestore/dist/firestore/test/unit/specs/spec_builder", "SpecBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/firestore/dist/firestore/test/unit/specs/spec_builder", "SpecBuilder.docToSpec")
    @js.native
    def docToSpec: Any = js.native
    inline def docToSpec_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("docToSpec")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/firestore/dist/firestore/test/unit/specs/spec_builder", "SpecBuilder.keyToSpec")
    @js.native
    def keyToSpec: Any = js.native
    inline def keyToSpec_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyToSpec")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/firestore/dist/firestore/test/unit/specs/spec_builder", "SpecBuilder.queryToSpec")
    @js.native
    def queryToSpec: Any = js.native
    inline def queryToSpec_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryToSpec")(x.asInstanceOf[js.Any])
  }
  
  inline def client(num: Double): MultiClientSpecBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("client")(num.asInstanceOf[js.Any]).asInstanceOf[MultiClientSpecBuilder]
  
  inline def spec(): SpecBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("spec")().asInstanceOf[SpecBuilder]
  
  type ActiveTargetMap = StringDictionary[ActiveTargetSpec]
  
  trait ActiveTargetSpec extends StObject {
    
    var expectedCount: js.UndefOr[Double] = js.undefined
    
    var queries: js.Array[SpecQuery]
    
    var readTime: js.UndefOr[TestSnapshotVersion] = js.undefined
    
    var resumeToken: js.UndefOr[String] = js.undefined
    
    var targetPurpose: js.UndefOr[TargetPurpose] = js.undefined
  }
  object ActiveTargetSpec {
    
    inline def apply(queries: js.Array[SpecQuery]): ActiveTargetSpec = {
      val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveTargetSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActiveTargetSpec] (val x: Self) extends AnyVal {
      
      inline def setExpectedCount(value: Double): Self = StObject.set(x, "expectedCount", value.asInstanceOf[js.Any])
      
      inline def setExpectedCountUndefined: Self = StObject.set(x, "expectedCount", js.undefined)
      
      inline def setQueries(value: js.Array[SpecQuery]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueriesVarargs(value: SpecQuery*): Self = StObject.set(x, "queries", js.Array(value*))
      
      inline def setReadTime(value: TestSnapshotVersion): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
      
      inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
      
      inline def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
      
      inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
      
      inline def setTargetPurpose(value: TargetPurpose): Self = StObject.set(x, "targetPurpose", value.asInstanceOf[js.Any])
      
      inline def setTargetPurposeUndefined: Self = StObject.set(x, "targetPurpose", js.undefined)
    }
  }
  
  type LimboMap = StringDictionary[TargetId]
  
  trait ResumeSpec extends StObject {
    
    var expectedCount: js.UndefOr[Double] = js.undefined
    
    var readTime: js.UndefOr[TestSnapshotVersion] = js.undefined
    
    var resumeToken: js.UndefOr[String] = js.undefined
  }
  object ResumeSpec {
    
    inline def apply(): ResumeSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResumeSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResumeSpec] (val x: Self) extends AnyVal {
      
      inline def setExpectedCount(value: Double): Self = StObject.set(x, "expectedCount", value.asInstanceOf[js.Any])
      
      inline def setExpectedCountUndefined: Self = StObject.set(x, "expectedCount", js.undefined)
      
      inline def setReadTime(value: TestSnapshotVersion): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
      
      inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
      
      inline def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
      
      inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    }
  }
}
