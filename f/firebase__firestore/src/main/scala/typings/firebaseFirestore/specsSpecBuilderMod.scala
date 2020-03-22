package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseFirestore.coreQueryMod.Query
import typings.firebaseFirestore.coreTargetIdGeneratorMod.TargetIdGenerator
import typings.firebaseFirestore.coreTargetMod.Target
import typings.firebaseFirestore.coreTypesMod.TargetId
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.Document
import typings.firebaseFirestore.modelDocumentMod.MaybeDocument
import typings.firebaseFirestore.modelDocumentMod.NoDocument
import typings.firebaseFirestore.specsSpecRpcErrorMod.RpcError
import typings.firebaseFirestore.specsSpecTestRunnerMod.SpecConfig
import typings.firebaseFirestore.specsSpecTestRunnerMod.SpecStep
import typings.firebaseFirestore.srcModelFieldValueMod.JsonObject
import typings.firebaseFirestore.testUtilHelpersMod.TestSnapshotVersion
import typings.firebaseFirestore.utilAsyncQueueMod.TimerId
import typings.firebaseFirestore.utilErrorMod.Code
import typings.firebaseFirestore.utilObjMapMod.ObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/specs/spec_builder", JSImport.Namespace)
@js.native
object specsSpecBuilderMod extends js.Object {
  @js.native
  class ClientMemoryState () extends js.Object {
    var activeTargets: ActiveTargetMap = js.native
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
  
  @js.native
  class MultiClientSpecBuilder () extends SpecBuilder {
    var activeClientIndex: js.Any = js.native
    var clientStates: js.Any = js.native
    def client(clientIndex: Double): MultiClientSpecBuilder = js.native
    /**
      * Take the primary lease, even if another client has already obtained the
      * lease.
      */
    def stealPrimaryLease(): this.type = js.native
  }
  
  @js.native
  class SpecBuilder () extends js.Object {
    /**
      * Add the specified `Query` under give active targe id. If it is already
      * added, this is a no-op.
      */
    var addQueryToActiveTargets: js.Any = js.native
    var assertStep: js.Any = js.native
    var config: SpecConfig = js.native
    val currentClientState: js.Any = js.native
    var currentStep: SpecStep | Null = js.native
    var getTargetId: js.Any = js.native
    var queryIdGenerator: js.Any = js.native
    var removeQueryFromActiveTargets: js.Any = js.native
    var steps: js.Any = js.native
    /**
      * Special helper for limbo documents that acks with either a document or
      * with no document for NoDocument. This is translated into normal watch
      * messages.
      */
    def ackLimbo(version: TestSnapshotVersion, doc: Document): this.type = js.native
    def ackLimbo(version: TestSnapshotVersion, doc: NoDocument): this.type = js.native
    /* private */ def activeTargets(): js.Any = js.native
    def becomeHidden(): this.type = js.native
    def becomeVisible(): this.type = js.native
    def changeUser(): this.type = js.native
    def changeUser(uid: String): this.type = js.native
    def clearPersistence(): this.type = js.native
    /* protected */ def clientState(): ClientMemoryState = js.native
    def disableNetwork(): this.type = js.native
    def enableNetwork(): this.type = js.native
    /** Overrides the currently expected set of active targets. */
    def expectActiveTargets(targets: AnonQueryResumeToken*): this.type = js.native
    def expectEvents(query: Query, events: AnonErrorCode): this.type = js.native
    def expectIsShutdown(): this.type = js.native
    /**
      * Expects a document to be in limbo. A targetId is assigned if it's not in
      * limbo yet.
      */
    def expectLimboDocs(keys: DocumentKey*): this.type = js.native
    /** Registers a query that is active in another tab. */
    def expectListen(query: Query): this.type = js.native
    def expectListen(query: Query, resumeToken: String): this.type = js.native
    def expectNumActiveClients(num: Double): this.type = js.native
    def expectNumOutstandingWrites(num: Double): this.type = js.native
    def expectPrimaryState(isPrimary: Boolean): this.type = js.native
    def expectSnapshotsInSyncEvent(): this.type = js.native
    def expectSnapshotsInSyncEvent(count: Double): this.type = js.native
    /** Removes a query that is no longer active in any tab. */
    def expectUnlisten(query: Query): this.type = js.native
    def expectUserCallbacks(docs: AnonAcknowledged): this.type = js.native
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
      * Fails a write with an error and optional additional options.
      *
      * expectUserCallback defaults to true if omitted.
      */
    def failWrite(doc: String, error: RpcError): this.type = js.native
    def failWrite(doc: String, error: RpcError, options: AnonExpectUserCallback): this.type = js.native
    /* private */ def limboIdGenerator(): js.Any = js.native
    /* private */ def limboMapping(): js.Any = js.native
    /* protected */ def nextStep(): Unit = js.native
    /* private */ def queryMapping(): js.Any = js.native
    def restart(): this.type = js.native
    /**
      * Registers a previously active target with the test expectations after a
      * stream disconnect.
      */
    def restoreListen(query: Query, resumeToken: String): this.type = js.native
    /**
      * Run the spec as a test. If persistence is available it will run it with and
      * without persistence enabled.
      */
    def runAsTest(name: String, tags: js.Array[String], usePersistence: Boolean): js.Promise[Unit] = js.native
    def runTimer(timerId: TimerId): this.type = js.native
    def shutdown(): this.type = js.native
    /**
      * Exports the spec steps as a JSON object that be used in the spec runner.
      */
    def toJSON(): AnonSteps = js.native
    def userAddsSnapshotsInSyncListener(): this.type = js.native
    def userDeletes(key: String): this.type = js.native
    def userListens(query: Query): this.type = js.native
    def userListens(query: Query, resumeToken: String): this.type = js.native
    def userPatches(key: String, value: JsonObject[_]): this.type = js.native
    def userRemovesSnapshotsInSyncListener(): this.type = js.native
    def userSets(key: String, value: JsonObject[_]): this.type = js.native
    def userUnlistens(query: Query): this.type = js.native
    def watchAcks(query: Query): this.type = js.native
    def watchAcksFull(query: Query, version: TestSnapshotVersion, docs: Document*): this.type = js.native
    def watchCurrents(query: Query, resumeToken: String): this.type = js.native
    def watchFilters(queries: js.Array[Query], docs: DocumentKey*): this.type = js.native
    def watchRemoves(query: Query): this.type = js.native
    def watchRemoves(query: Query, cause: RpcError): this.type = js.native
    def watchRemovesDoc(key: DocumentKey, targets: Query*): this.type = js.native
    /**
      * Special helper for limbo documents that acks an unlisten for a limbo doc
      * with either a document or with no document for NoDocument. This is
      * translated into normal watch messages.
      */
    def watchRemovesLimboTarget(doc: Document): this.type = js.native
    def watchRemovesLimboTarget(doc: NoDocument): this.type = js.native
    def watchResets(queries: Query*): this.type = js.native
    def watchSends(targets: AnonAffectsRemoved, docs: MaybeDocument*): this.type = js.native
    def watchSnapshots(version: TestSnapshotVersion): this.type = js.native
    def watchSnapshots(version: TestSnapshotVersion, targets: js.Array[Query]): this.type = js.native
    def watchSnapshots(version: TestSnapshotVersion, targets: js.Array[Query], resumeToken: String): this.type = js.native
    def watchStreamCloses(error: Code): this.type = js.native
    def watchStreamCloses(error: Code, opts: AnonRunBackoffTimer): this.type = js.native
    def withGCEnabled(gcEnabled: Boolean): this.type = js.native
    /**
      * Acks a write with a version and optional additional options.
      *
      * expectUserCallback defaults to true if omitted.
      */
    def writeAcks(doc: String, version: TestSnapshotVersion): this.type = js.native
    def writeAcks(doc: String, version: TestSnapshotVersion, options: AnonExpectUserCallback): this.type = js.native
  }
  
  def client(num: Double): MultiClientSpecBuilder = js.native
  def client(num: Double, withGcEnabled: Boolean): MultiClientSpecBuilder = js.native
  def spec(): SpecBuilder = js.native
  /* static members */
  @js.native
  object SpecBuilder extends js.Object {
    var docToSpec: js.Any = js.native
    var keyToSpec: js.Any = js.native
    var queryToSpec: js.Any = js.native
  }
  
  type ActiveTargetMap = StringDictionary[AnonResumeToken]
  type LimboMap = StringDictionary[TargetId]
}

