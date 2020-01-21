package typings.firebaseFirestore.indexeddbSchemaMod

import typings.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/indexeddb_schema", "DbTargetGlobal")
@js.native
class DbTargetGlobal protected () extends js.Object {
  def this(
    /**
    * The highest numbered target id across all targets.
    *
    * See DbTarget.targetId.
    */
  highestTargetId: TargetId,
    /**
    * The highest numbered lastListenSequenceNumber across all targets.
    *
    * See DbTarget.lastListenSequenceNumber.
    */
  highestListenSequenceNumber: Double,
    /**
    * A global snapshot version representing the last consistent snapshot we
    * received from the backend. This is monotonically increasing and any
    * snapshots received from the backend prior to this version (e.g. for
    * targets resumed with a resumeToken) should be suppressed (buffered)
    * until the backend has caught up to this snapshot version again. This
    * prevents our cache from ever going backwards in time.
    */
  lastRemoteSnapshotVersion: DbTimestamp,
    /**
    * The number of targets persisted.
    */
  targetCount: Double
  ) = this()
  /**
    * The highest numbered lastListenSequenceNumber across all targets.
    *
    * See DbTarget.lastListenSequenceNumber.
    */
  var highestListenSequenceNumber: Double = js.native
  /**
    * The highest numbered target id across all targets.
    *
    * See DbTarget.targetId.
    */
  var highestTargetId: TargetId = js.native
  /**
    * A global snapshot version representing the last consistent snapshot we
    * received from the backend. This is monotonically increasing and any
    * snapshots received from the backend prior to this version (e.g. for
    * targets resumed with a resumeToken) should be suppressed (buffered)
    * until the backend has caught up to this snapshot version again. This
    * prevents our cache from ever going backwards in time.
    */
  var lastRemoteSnapshotVersion: DbTimestamp = js.native
  /**
    * The number of targets persisted.
    */
  var targetCount: Double = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/lib/src/local/indexeddb_schema", "DbTargetGlobal")
@js.native
object DbTargetGlobal extends js.Object {
  /**
    * The key string used for the single object that exists in the
    * DbTargetGlobal store.
    */
  var key: String = js.native
  var store: String = js.native
}

