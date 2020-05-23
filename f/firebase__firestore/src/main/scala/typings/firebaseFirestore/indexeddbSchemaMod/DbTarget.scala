package typings.firebaseFirestore.indexeddbSchemaMod

import typings.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_schema", "DbTarget")
@js.native
class DbTarget protected () extends js.Object {
  def this(
    /**
    * An auto-generated sequential numeric identifier for the query.
    *
    * Queries are stored using their canonicalId as the key, but these
    * canonicalIds can be quite long so we additionally assign a unique
    * queryId which can be used by referenced data structures (e.g.
    * indexes) to minimize the on-disk cost.
    */
  targetId: TargetId,
    /**
    * The canonical string representing this query. This is not unique.
    */
  canonicalId: String,
    /**
    * The last readTime received from the Watch Service for this query.
    *
    * This is the same value as TargetChange.read_time in the protos.
    */
  readTime: DbTimestamp,
    /**
    * An opaque, server-assigned token that allows watching a query to be
    * resumed after disconnecting without retransmitting all the data
    * that matches the query. The resume token essentially identifies a
    * point in time from which the server should resume sending results.
    *
    * This is related to the snapshotVersion in that the resumeToken
    * effectively also encodes that value, but the resumeToken is opaque
    * and sometimes encodes additional information.
    *
    * A consequence of this is that the resumeToken should be used when
    * asking the server to reason about where this client is in the watch
    * stream, but the client should use the snapshotVersion for its own
    * purposes.
    *
    * This is the same value as TargetChange.resume_token in the protos.
    */
  resumeToken: String,
    /**
    * A sequence number representing the last time this query was
    * listened to, used for garbage collection purposes.
    *
    * Conventionally this would be a timestamp value, but device-local
    * clocks are unreliable and they must be able to create new listens
    * even while disconnected. Instead this should be a monotonically
    * increasing number that's incremented on each listen call.
    *
    * This is different from the queryId since the queryId is an
    * immutable identifier assigned to the Query on first use while
    * lastListenSequenceNumber is updated every time the query is
    * listened to.
    */
  lastListenSequenceNumber: Double,
    /**
    * Denotes the maximum snapshot version at which the associated query view
    * contained no limbo documents.  Undefined for data written prior to
    * schema version 9.
    */
  lastLimboFreeSnapshotVersion: js.UndefOr[DbTimestamp],
    /**
    * The query for this target.
    *
    * Because canonical ids are not unique we must store the actual query. We
    * use the proto to have an object we can persist without having to
    * duplicate translation logic to and from a `Query` object.
    */
  query: DbQuery
  ) = this()
  /**
    * The canonical string representing this query. This is not unique.
    */
  var canonicalId: String = js.native
  /**
    * Denotes the maximum snapshot version at which the associated query view
    * contained no limbo documents.  Undefined for data written prior to
    * schema version 9.
    */
  var lastLimboFreeSnapshotVersion: js.UndefOr[DbTimestamp] = js.native
  /**
    * A sequence number representing the last time this query was
    * listened to, used for garbage collection purposes.
    *
    * Conventionally this would be a timestamp value, but device-local
    * clocks are unreliable and they must be able to create new listens
    * even while disconnected. Instead this should be a monotonically
    * increasing number that's incremented on each listen call.
    *
    * This is different from the queryId since the queryId is an
    * immutable identifier assigned to the Query on first use while
    * lastListenSequenceNumber is updated every time the query is
    * listened to.
    */
  var lastListenSequenceNumber: Double = js.native
  /**
    * The query for this target.
    *
    * Because canonical ids are not unique we must store the actual query. We
    * use the proto to have an object we can persist without having to
    * duplicate translation logic to and from a `Query` object.
    */
  var query: DbQuery = js.native
  /**
    * The last readTime received from the Watch Service for this query.
    *
    * This is the same value as TargetChange.read_time in the protos.
    */
  var readTime: DbTimestamp = js.native
  /**
    * An opaque, server-assigned token that allows watching a query to be
    * resumed after disconnecting without retransmitting all the data
    * that matches the query. The resume token essentially identifies a
    * point in time from which the server should resume sending results.
    *
    * This is related to the snapshotVersion in that the resumeToken
    * effectively also encodes that value, but the resumeToken is opaque
    * and sometimes encodes additional information.
    *
    * A consequence of this is that the resumeToken should be used when
    * asking the server to reason about where this client is in the watch
    * stream, but the client should use the snapshotVersion for its own
    * purposes.
    *
    * This is the same value as TargetChange.resume_token in the protos.
    */
  var resumeToken: String = js.native
  /**
    * An auto-generated sequential numeric identifier for the query.
    *
    * Queries are stored using their canonicalId as the key, but these
    * canonicalIds can be quite long so we additionally assign a unique
    * queryId which can be used by referenced data structures (e.g.
    * indexes) to minimize the on-disk cost.
    */
  var targetId: TargetId = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_schema", "DbTarget")
@js.native
object DbTarget extends js.Object {
  /** Keys are automatically assigned via the targetId property. */
  var keyPath: String = js.native
  /** The name of the queryTargets index. */
  var queryTargetsIndexName: String = js.native
  /**
    * The index of all canonicalIds to the targets that they match. This is not
    * a unique mapping because canonicalId does not promise a unique name for all
    * possible queries, so we append the targetId to make the mapping unique.
    */
  var queryTargetsKeyPath: js.Array[String] = js.native
  var store: String = js.native
}

