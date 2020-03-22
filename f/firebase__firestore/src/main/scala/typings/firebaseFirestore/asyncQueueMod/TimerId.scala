package typings.firebaseFirestore.asyncQueueMod

import typings.firebaseFirestore.firebaseFirestoreStrings.all
import typings.firebaseFirestore.firebaseFirestoreStrings.client_metadata_refresh
import typings.firebaseFirestore.firebaseFirestoreStrings.listen_stream_connection_backoff
import typings.firebaseFirestore.firebaseFirestoreStrings.listen_stream_idle
import typings.firebaseFirestore.firebaseFirestoreStrings.lru_garbage_collection
import typings.firebaseFirestore.firebaseFirestoreStrings.online_state_timeout
import typings.firebaseFirestore.firebaseFirestoreStrings.retry_transaction
import typings.firebaseFirestore.firebaseFirestoreStrings.write_stream_connection_backoff
import typings.firebaseFirestore.firebaseFirestoreStrings.write_stream_idle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.all
  - typings.firebaseFirestore.firebaseFirestoreStrings.listen_stream_idle
  - typings.firebaseFirestore.firebaseFirestoreStrings.listen_stream_connection_backoff
  - typings.firebaseFirestore.firebaseFirestoreStrings.write_stream_idle
  - typings.firebaseFirestore.firebaseFirestoreStrings.write_stream_connection_backoff
  - typings.firebaseFirestore.firebaseFirestoreStrings.online_state_timeout
  - typings.firebaseFirestore.firebaseFirestoreStrings.client_metadata_refresh
  - typings.firebaseFirestore.firebaseFirestoreStrings.lru_garbage_collection
  - typings.firebaseFirestore.firebaseFirestoreStrings.retry_transaction
*/
trait TimerId extends js.Object

object TimerId {
  /** All can be used with runDelayedOperationsEarly() to run all timers. */
  @scala.inline
  def All: all = this.cast("all")
  /**
    * A timer used to update the client metadata in IndexedDb, which is used
    * to determine the primary leaseholder.
    */
  @scala.inline
  def ClientMetadataRefresh: client_metadata_refresh = this.cast("client_metadata_refresh")
  @scala.inline
  def ListenStreamConnectionBackoff: listen_stream_connection_backoff = this.cast("listen_stream_connection_backoff")
  /**
    * The following 4 timers are used in persistent_stream.ts for the listen and
    * write streams. The "Idle" timer is used to close the stream due to
    * inactivity. The "ConnectionBackoff" timer is used to restart a stream once
    * the appropriate backoff delay has elapsed.
    */
  @scala.inline
  def ListenStreamIdle: listen_stream_idle = this.cast("listen_stream_idle")
  /** A timer used to periodically attempt LRU Garbage collection */
  @scala.inline
  def LruGarbageCollection: lru_garbage_collection = this.cast("lru_garbage_collection")
  /**
    * A timer used in online_state_tracker.ts to transition from
    * OnlineState.Unknown to Offline after a set timeout, rather than waiting
    * indefinitely for success or failure.
    */
  @scala.inline
  def OnlineStateTimeout: online_state_timeout = this.cast("online_state_timeout")
  /**
    * A timer used to retry transactions. Since there can be multiple concurrent
    * transactions, multiple of these may be in the queue at a given time.
    */
  @scala.inline
  def RetryTransaction: retry_transaction = this.cast("retry_transaction")
  @scala.inline
  def WriteStreamConnectionBackoff: write_stream_connection_backoff = this.cast("write_stream_connection_backoff")
  @scala.inline
  def WriteStreamIdle: write_stream_idle = this.cast("write_stream_idle")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

