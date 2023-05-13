package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A component used by the RemoteStore to track the OnlineState (that is,
  * whether or not the client as a whole should be considered to be online or
  * offline), implementing the appropriate heuristics.
  *
  * In particular, when the client is trying to connect to the backend, we
  * allow up to MAX_WATCH_STREAM_FAILURES within ONLINE_STATE_TIMEOUT_MS for
  * a connection to succeed. If we have too many failures or the timeout elapses,
  * then we set the OnlineState to Offline, and the client will behave as if
  * it is offline (get()s will return cached data, etc.).
  */
trait Qu extends StObject {
  
  /**
    * Updates our OnlineState as appropriate after the watch stream reports a
    * failure. The first failure moves us to the 'Unknown' state. We then may
    * allow multiple failures (based on MAX_WATCH_STREAM_FAILURES) before we
    * actually transition to the 'Offline' state.
    */ def Iu(t: Any): Unit
  
  def Tu(): Unit
  
  /**
    * A timer that elapses after ONLINE_STATE_TIMEOUT_MS, at which point we
    * transition from OnlineState.Unknown to OnlineState.Offline without waiting
    * for the stream to actually fail (MAX_WATCH_STREAM_FAILURES times).
    */
  var _u: Any
  
  var asyncQueue: Any
  
  /**
    * Called by RemoteStore when a watch stream is started (including on each
    * backoff attempt).
    *
    * If this is the first attempt, it sets the OnlineState to Unknown and starts
    * the onlineStateTimer.
    */ def gu(): Unit
  
  /**
    * Whether the client should log a warning message if it fails to connect to
    * the backend (initially true, cleared after a successful stream, or if we've
    * logged the message already).
    */
  var mu: Boolean
  
  var onlineStateHandler: Any
  
  def pu(t: Any): Unit
  
  /**
    * Explicitly sets the OnlineState to the specified state.
    *
    * Note that this resets our timers / failure counters, etc. used by our
    * Offline heuristics, so must not be used in place of
    * handleWatchStreamStart() and handleWatchStreamFailure().
    */ def set(t: Any): Unit
  
  /** The current OnlineState. */
  var state: String
  
  /**
    * A count of consecutive failures to open the stream. If it reaches the
    * maximum defined by MAX_WATCH_STREAM_FAILURES, we'll set the OnlineState to
    * Offline.
    */
  var wu: Double
  
  def yu(t: Any): Unit
}
object Qu {
  
  inline def apply(
    Iu: Any => Unit,
    Tu: () => Unit,
    _u: Any,
    asyncQueue: Any,
    gu: () => Unit,
    mu: Boolean,
    onlineStateHandler: Any,
    pu: Any => Unit,
    set: Any => Unit,
    state: String,
    wu: Double,
    yu: Any => Unit
  ): Qu = {
    val __obj = js.Dynamic.literal(Iu = js.Any.fromFunction1(Iu), Tu = js.Any.fromFunction0(Tu), _u = _u.asInstanceOf[js.Any], asyncQueue = asyncQueue.asInstanceOf[js.Any], gu = js.Any.fromFunction0(gu), mu = mu.asInstanceOf[js.Any], onlineStateHandler = onlineStateHandler.asInstanceOf[js.Any], pu = js.Any.fromFunction1(pu), set = js.Any.fromFunction1(set), state = state.asInstanceOf[js.Any], wu = wu.asInstanceOf[js.Any], yu = js.Any.fromFunction1(yu))
    __obj.asInstanceOf[Qu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Qu] (val x: Self) extends AnyVal {
    
    inline def setAsyncQueue(value: Any): Self = StObject.set(x, "asyncQueue", value.asInstanceOf[js.Any])
    
    inline def setGu(value: () => Unit): Self = StObject.set(x, "gu", js.Any.fromFunction0(value))
    
    inline def setIu(value: Any => Unit): Self = StObject.set(x, "Iu", js.Any.fromFunction1(value))
    
    inline def setMu(value: Boolean): Self = StObject.set(x, "mu", value.asInstanceOf[js.Any])
    
    inline def setOnlineStateHandler(value: Any): Self = StObject.set(x, "onlineStateHandler", value.asInstanceOf[js.Any])
    
    inline def setPu(value: Any => Unit): Self = StObject.set(x, "pu", js.Any.fromFunction1(value))
    
    inline def setSet(value: Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTu(value: () => Unit): Self = StObject.set(x, "Tu", js.Any.fromFunction0(value))
    
    inline def setWu(value: Double): Self = StObject.set(x, "wu", value.asInstanceOf[js.Any])
    
    inline def setYu(value: Any => Unit): Self = StObject.set(x, "yu", js.Any.fromFunction1(value))
    
    inline def set_u(value: Any): Self = StObject.set(x, "_u", value.asInstanceOf[js.Any])
  }
}
