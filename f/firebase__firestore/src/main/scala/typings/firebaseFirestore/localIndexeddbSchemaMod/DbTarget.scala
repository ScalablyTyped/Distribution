package typings.firebaseFirestore.localIndexeddbSchemaMod

import typings.firebaseFirestore.coreTypesMod.TargetId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbTarget extends StObject {
  
  /**
    * The canonical string representing this query. This is not unique.
    */
  var canonicalId: String
  
  /**
    * Denotes the maximum snapshot version at which the associated query view
    * contained no limbo documents.  Undefined for data written prior to
    * schema version 9.
    */
  var lastLimboFreeSnapshotVersion: js.UndefOr[DbTimestamp] = js.undefined
  
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
  var lastListenSequenceNumber: Double
  
  /**
    * The query for this target.
    *
    * Because canonical ids are not unique we must store the actual query. We
    * use the proto to have an object we can persist without having to
    * duplicate translation logic to and from a `Query` object.
    */
  var query: DbQuery
  
  /**
    * The last readTime received from the Watch Service for this query.
    *
    * This is the same value as TargetChange.read_time in the protos.
    */
  var readTime: DbTimestamp
  
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
  var resumeToken: String
  
  /**
    * An auto-generated sequential numeric identifier for the query.
    *
    * Queries are stored using their canonicalId as the key, but these
    * canonicalIds can be quite long so we additionally assign a unique
    * queryId which can be used by referenced data structures (e.g.
    * indexes) to minimize the on-disk cost.
    */
  var targetId: TargetId
}
object DbTarget {
  
  inline def apply(
    canonicalId: String,
    lastListenSequenceNumber: Double,
    query: DbQuery,
    readTime: DbTimestamp,
    resumeToken: String,
    targetId: TargetId
  ): DbTarget = {
    val __obj = js.Dynamic.literal(canonicalId = canonicalId.asInstanceOf[js.Any], lastListenSequenceNumber = lastListenSequenceNumber.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbTarget]
  }
  
  extension [Self <: DbTarget](x: Self) {
    
    inline def setCanonicalId(value: String): Self = StObject.set(x, "canonicalId", value.asInstanceOf[js.Any])
    
    inline def setLastLimboFreeSnapshotVersion(value: DbTimestamp): Self = StObject.set(x, "lastLimboFreeSnapshotVersion", value.asInstanceOf[js.Any])
    
    inline def setLastLimboFreeSnapshotVersionUndefined: Self = StObject.set(x, "lastLimboFreeSnapshotVersion", js.undefined)
    
    inline def setLastListenSequenceNumber(value: Double): Self = StObject.set(x, "lastListenSequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: DbQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: DbTimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: TargetId): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
