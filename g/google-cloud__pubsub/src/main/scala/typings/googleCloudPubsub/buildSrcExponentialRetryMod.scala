package typings.googleCloudPubsub

import typings.googleCloudPubsub.buildSrcTemporalMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcExponentialRetryMod {
  
  @JSImport("@google-cloud/pubsub/build/src/exponential-retry", "ExponentialRetry")
  @js.native
  open class ExponentialRetry[T] protected () extends StObject {
    def this(backoff: Duration, maxBackoff: Duration) = this()
    
    /* private */ var _backoffMs: Any = js.native
    
    /* private */ var _items: Any = js.native
    
    /* private */ var _maxBackoffMs: Any = js.native
    
    /* private */ var _timer: Any = js.native
    
    /**
      * Shut down all operations/timers/etc and return a list of
      * items that were still pending retry.
      *
      * @private
      */
    def close(): js.Array[T] = js.native
    
    /* private */ var doRetries: Any = js.native
    
    /* private */ var randomizeDelta: Any = js.native
    
    /**
      * Resets an item that was previously retried. This is useful if you have
      * persistent items that just need to be retried occasionally.
      *
      * @private
      */
    def reset(item: T): Unit = js.native
    
    /**
      * Place an item on the retry queue. It's important that it's the
      * same exact item that was already on the queue, if it's being retried
      * more than once.
      *
      * @private
      */
    def retryLater(item: T, callback: RetryCallback[T]): Unit = js.native
    
    /* private */ var scheduleRetry: Any = js.native
  }
  
  trait RetriedItem[T] extends StObject {
    
    var retryInfo: js.UndefOr[RetryInfo[T]] = js.undefined
  }
  object RetriedItem {
    
    inline def apply[T](): RetriedItem[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetriedItem[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetriedItem[?], T] (val x: Self & RetriedItem[T]) extends AnyVal {
      
      inline def setRetryInfo(value: RetryInfo[T]): Self = StObject.set(x, "retryInfo", value.asInstanceOf[js.Any])
      
      inline def setRetryInfoUndefined: Self = StObject.set(x, "retryInfo", js.undefined)
    }
  }
  
  type RetryCallback[T] = js.Function2[/* item */ T, /* totalTime */ Duration, Unit]
  
  trait RetryInfo[T] extends StObject {
    
    def callback(item: T, totalTime: Duration): Unit
    @JSName("callback")
    var callback_Original: RetryCallback[T]
    
    var firstRetry: Double
    
    var multiplier: Double
    
    var nextRetry: Double
  }
  object RetryInfo {
    
    inline def apply[T](
      callback: (T, /* totalTime */ Duration) => Unit,
      firstRetry: Double,
      multiplier: Double,
      nextRetry: Double
    ): RetryInfo[T] = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), firstRetry = firstRetry.asInstanceOf[js.Any], multiplier = multiplier.asInstanceOf[js.Any], nextRetry = nextRetry.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryInfo[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryInfo[?], T] (val x: Self & RetryInfo[T]) extends AnyVal {
      
      inline def setCallback(value: (T, /* totalTime */ Duration) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setFirstRetry(value: Double): Self = StObject.set(x, "firstRetry", value.asInstanceOf[js.Any])
      
      inline def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
      
      inline def setNextRetry(value: Double): Self = StObject.set(x, "nextRetry", value.asInstanceOf[js.Any])
    }
  }
}
