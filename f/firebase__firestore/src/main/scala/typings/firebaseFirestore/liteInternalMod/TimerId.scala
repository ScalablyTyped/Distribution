package typings.firebaseFirestore.liteInternalMod

import typings.firebaseFirestore.firebaseFirestoreStrings.all
import typings.firebaseFirestore.firebaseFirestoreStrings.async_queue_retry
import typings.firebaseFirestore.firebaseFirestoreStrings.client_metadata_refresh
import typings.firebaseFirestore.firebaseFirestoreStrings.health_check_timeout
import typings.firebaseFirestore.firebaseFirestoreStrings.index_backfill
import typings.firebaseFirestore.firebaseFirestoreStrings.listen_stream_connection_backoff
import typings.firebaseFirestore.firebaseFirestoreStrings.listen_stream_idle
import typings.firebaseFirestore.firebaseFirestoreStrings.lru_garbage_collection
import typings.firebaseFirestore.firebaseFirestoreStrings.online_state_timeout
import typings.firebaseFirestore.firebaseFirestoreStrings.transaction_retry
import typings.firebaseFirestore.firebaseFirestoreStrings.write_stream_connection_backoff
import typings.firebaseFirestore.firebaseFirestoreStrings.write_stream_idle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Wellknown "timer" IDs used when scheduling delayed operations on the
  * AsyncQueue. These IDs can then be used from tests to check for the presence
  * of operations or to run them early.
  *
  * The string values are used when encoding these timer IDs in JSON spec tests.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.all
  - typings.firebaseFirestore.firebaseFirestoreStrings.listen_stream_idle
  - typings.firebaseFirestore.firebaseFirestoreStrings.listen_stream_connection_backoff
  - typings.firebaseFirestore.firebaseFirestoreStrings.write_stream_idle
  - typings.firebaseFirestore.firebaseFirestoreStrings.write_stream_connection_backoff
  - typings.firebaseFirestore.firebaseFirestoreStrings.health_check_timeout
  - typings.firebaseFirestore.firebaseFirestoreStrings.online_state_timeout
  - typings.firebaseFirestore.firebaseFirestoreStrings.client_metadata_refresh
  - typings.firebaseFirestore.firebaseFirestoreStrings.lru_garbage_collection
  - typings.firebaseFirestore.firebaseFirestoreStrings.transaction_retry
  - typings.firebaseFirestore.firebaseFirestoreStrings.async_queue_retry
  - typings.firebaseFirestore.firebaseFirestoreStrings.index_backfill
*/
trait TimerId extends StObject
object TimerId {
  
  /** All can be used with runDelayedOperationsEarly() to run all timers. */
  inline def All: all = "all".asInstanceOf[all]
  
  /**
    * A timer used to retry operations scheduled via retryable AsyncQueue
    * operations.
    */
  inline def AsyncQueueRetry: async_queue_retry = "async_queue_retry".asInstanceOf[async_queue_retry]
  
  /**
    * A timer used to update the client metadata in IndexedDb, which is used
    * to determine the primary leaseholder.
    */
  inline def ClientMetadataRefresh: client_metadata_refresh = "client_metadata_refresh".asInstanceOf[client_metadata_refresh]
  
  inline def HealthCheckTimeout: health_check_timeout = "health_check_timeout".asInstanceOf[health_check_timeout]
  
  /**
    *  A timer used to periodically attempt index backfill.
    */
  inline def IndexBackfill: index_backfill = "index_backfill".asInstanceOf[index_backfill]
  
  inline def ListenStreamConnectionBackoff: listen_stream_connection_backoff = "listen_stream_connection_backoff".asInstanceOf[listen_stream_connection_backoff]
  
  /**
    * The following 5 timers are used in persistent_stream.ts for the listen and
    * write streams. The "Idle" timer is used to close the stream due to
    * inactivity. The "ConnectionBackoff" timer is used to restart a stream once
    * the appropriate backoff delay has elapsed. The health check is used to mark
    * a stream healthy if it has not received an error during its initial setup.
    */
  inline def ListenStreamIdle: listen_stream_idle = "listen_stream_idle".asInstanceOf[listen_stream_idle]
  
  /** A timer used to periodically attempt LRU Garbage collection */
  inline def LruGarbageCollection: lru_garbage_collection = "lru_garbage_collection".asInstanceOf[lru_garbage_collection]
  
  /**
    * A timer used in online_state_tracker.ts to transition from
    * OnlineState.Unknown to Offline after a set timeout, rather than waiting
    * indefinitely for success or failure.
    */
  inline def OnlineStateTimeout: online_state_timeout = "online_state_timeout".asInstanceOf[online_state_timeout]
  
  /**
    * A timer used to retry transactions. Since there can be multiple concurrent
    * transactions, multiple of these may be in the queue at a given time.
    */
  inline def TransactionRetry: transaction_retry = "transaction_retry".asInstanceOf[transaction_retry]
  
  inline def WriteStreamConnectionBackoff: write_stream_connection_backoff = "write_stream_connection_backoff".asInstanceOf[write_stream_connection_backoff]
  
  inline def WriteStreamIdle: write_stream_idle = "write_stream_idle".asInstanceOf[write_stream_idle]
}
