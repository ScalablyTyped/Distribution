package typings.firebaseFirestore

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.errorMod.FirestoreError
import typings.firebaseFirestore.typesMod.OnlineState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onlineStateTrackerMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/remote/online_state_tracker", "OnlineStateTracker")
  @js.native
  open class OnlineStateTracker protected () extends StObject {
    def this(asyncQueue: AsyncQueue, onlineStateHandler: js.Function1[/* onlineState */ OnlineState, Unit]) = this()
    
    /* private */ var asyncQueue: Any = js.native
    
    /* private */ var clearOnlineStateTimer: Any = js.native
    
    /**
      * Updates our OnlineState as appropriate after the watch stream reports a
      * failure. The first failure moves us to the 'Unknown' state. We then may
      * allow multiple failures (based on MAX_WATCH_STREAM_FAILURES) before we
      * actually transition to the 'Offline' state.
      */
    def handleWatchStreamFailure(error: FirestoreError): Unit = js.native
    
    /**
      * Called by RemoteStore when a watch stream is started (including on each
      * backoff attempt).
      *
      * If this is the first attempt, it sets the OnlineState to Unknown and starts
      * the onlineStateTimer.
      */
    def handleWatchStreamStart(): Unit = js.native
    
    /* private */ var logClientOfflineWarningIfNecessary: Any = js.native
    
    /* private */ var onlineStateHandler: Any = js.native
    
    /**
      * A timer that elapses after ONLINE_STATE_TIMEOUT_MS, at which point we
      * transition from OnlineState.Unknown to OnlineState.Offline without waiting
      * for the stream to actually fail (MAX_WATCH_STREAM_FAILURES times).
      */
    /* private */ var onlineStateTimer: Any = js.native
    
    /**
      * Explicitly sets the OnlineState to the specified state.
      *
      * Note that this resets our timers / failure counters, etc. used by our
      * Offline heuristics, so must not be used in place of
      * handleWatchStreamStart() and handleWatchStreamFailure().
      */
    def set(newState: OnlineState): Unit = js.native
    
    /* private */ var setAndBroadcast: Any = js.native
    
    /**
      * Whether the client should log a warning message if it fails to connect to
      * the backend (initially true, cleared after a successful stream, or if we've
      * logged the message already).
      */
    /* private */ var shouldWarnClientIsOffline: Any = js.native
    
    /** The current OnlineState. */
    /* private */ var state: Any = js.native
    
    /**
      * A count of consecutive failures to open the stream. If it reaches the
      * maximum defined by MAX_WATCH_STREAM_FAILURES, we'll set the OnlineState to
      * Offline.
      */
    /* private */ var watchStreamFailures: Any = js.native
  }
}
