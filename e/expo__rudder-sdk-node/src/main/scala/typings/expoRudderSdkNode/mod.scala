package typings.expoRudderSdkNode

import org.scalablytyped.runtime.StringDictionary
import typings.expoRudderSdkNode.anon.Batch
import typings.expoRudderSdkNode.anon.Dictkey
import typings.expoRudderSdkNode.anon.Enable
import typings.expoRudderSdkNode.anon.Event
import typings.expoRudderSdkNode.anon.GroupId
import typings.expoRudderSdkNode.anon.Name
import typings.expoRudderSdkNode.anon.PreviousId
import typings.expoRudderSdkNode.anon.Traits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@expo/rudder-sdk-node", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Analytics {
    /**
      * Initialize a new `Analytics` instance with your RudderStack project's `writeKey` and an
      * optional dictionary of options.
      */
    def this(writeKey: String, dataPlaneURL: String) = this()
    def this(writeKey: String, dataPlaneURL: String, param2: Enable) = this()
  }
  
  @js.native
  trait Analytics extends StObject {
    
    /**
      * Sends an "alias" message that associates one ID with another.
      */
    def alias(message: PreviousId & AnalyticsIdentity): Analytics = js.native
    def alias(message: PreviousId & AnalyticsIdentity, callback: AnalyticsMessageCallback): Analytics = js.native
    
    /* private */ val enable: Any = js.native
    
    /**
      * Adds a message of the specified type to the queue and flushes the queue if appropriate.
      */
    /* private */ var enqueue: Any = js.native
    
    /**
      * Flushes messages from the message queue to the server immediately. After the flush has finished,
      * this checks for pending flushes and executes them. All data is rolled up into a single FlushResponse.
      */
    /* private */ var executeFlush: Any = js.native
    
    /* private */ var finalMessageId: Any = js.native
    
    /**
      * Flushes the message queue to the server immediately if a flush is not already in progress.
      */
    def flush(): js.Promise[js.Array[FlushResponse]] = js.native
    def flush(callback: AnalyticsFlushCallback): js.Promise[js.Array[FlushResponse]] = js.native
    
    /* private */ val flushAt: Any = js.native
    
    /* private */ val flushCallbacks: Any = js.native
    
    /* private */ val flushInterval: Any = js.native
    
    /* private */ val flushResponses: Any = js.native
    
    /* private */ var flushed: Any = js.native
    
    /**
      * Calculates the amount of time to wait before retrying a request, given the number of prior
      * retries (excluding the initial attempt).
      *
      * @param priorRetryCount the number of prior retries, starting from zero
      */
    /* private */ var getExponentialDelay: Any = js.native
    
    /**
      * Sends a "group" message that identifies this user with a group.
      */
    def group(message: AnalyticsMessage & GroupId): Analytics = js.native
    def group(message: AnalyticsMessage & GroupId, callback: AnalyticsMessageCallback): Analytics = js.native
    
    /* private */ val host: Any = js.native
    
    /**
      * Sends an "identify" message that associates traits with a user.
      */
    def identify(message: AnalyticsMessage & Traits): Analytics = js.native
    def identify(message: AnalyticsMessage & Traits, callback: AnalyticsMessageCallback): Analytics = js.native
    
    /* private */ var inFlightFlush: Any = js.native
    
    /**
      * Returns whether to retry a request that failed with the given error or returned the given
      * response.
      */
    /* private */ var isErrorRetryable: Any = js.native
    
    /* private */ val logger: Any = js.native
    
    /* private */ val maxFlushSizeInBytes: Any = js.native
    
    /* private */ val maxQueueLength: Any = js.native
    
    /* private */ var nullFlushResponse: Any = js.native
    
    /**
      * Sends a "page" event that records a page view on a website.
      */
    def page(message: AnalyticsMessage & Name): Analytics = js.native
    def page(message: AnalyticsMessage & Name, callback: AnalyticsMessageCallback): Analytics = js.native
    
    /* private */ val queue: Any = js.native
    
    /**
      * Sends a "screen" event that records a screen view in an app.
      */
    def screen(message: AnalyticsMessage): Analytics = js.native
    def screen(message: AnalyticsMessage, callback: AnalyticsMessageCallback): Analytics = js.native
    
    /* private */ val timeout: Any = js.native
    
    /* private */ var timer: Any = js.native
    
    /**
      * Sends a "track" event that records an action.
      */
    def track(message: AnalyticsMessage & Event): Analytics = js.native
    def track(message: AnalyticsMessage & Event, callback: AnalyticsMessageCallback): Analytics = js.native
    
    var traits: js.UndefOr[StringDictionary[Any]] = js.native
    
    /* private */ var validate: Any = js.native
    
    /* private */ val writeKey: Any = js.native
  }
  
  type AnalyticsFlushCallback = js.Function1[/* flushResponses */ js.Array[FlushResponse], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoRudderSdkNode.anon.UserId
    - typings.expoRudderSdkNode.anon.AnonymousId
  */
  trait AnalyticsIdentity extends StObject
  object AnalyticsIdentity {
    
    inline def AnonymousId(anonymousId: String): typings.expoRudderSdkNode.anon.AnonymousId = {
      val __obj = js.Dynamic.literal(anonymousId = anonymousId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expoRudderSdkNode.anon.AnonymousId]
    }
    
    inline def UserId(userId: String): typings.expoRudderSdkNode.anon.UserId = {
      val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.expoRudderSdkNode.anon.UserId]
    }
  }
  
  type AnalyticsMessage = AnalyticsIdentity & Dictkey
  
  type AnalyticsMessageCallback = js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  
  trait AnalyticsPayload
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var _metadata: Any
    
    var context: Any
    
    var messageId: String
    
    var originalTimestamp: js.Date
    
    var `type`: String
  }
  object AnalyticsPayload {
    
    inline def apply(_metadata: Any, context: Any, messageId: String, originalTimestamp: js.Date, `type`: String): AnalyticsPayload = {
      val __obj = js.Dynamic.literal(_metadata = _metadata.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], originalTimestamp = originalTimestamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsPayload]
    }
    
    extension [Self <: AnalyticsPayload](x: Self) {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setOriginalTimestamp(value: js.Date): Self = StObject.set(x, "originalTimestamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def set_metadata(value: Any): Self = StObject.set(x, "_metadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait FlushResponse extends StObject {
    
    var data: Batch
    
    var error: js.UndefOr[js.Error] = js.undefined
  }
  object FlushResponse {
    
    inline def apply(data: Batch): FlushResponse = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlushResponse]
    }
    
    extension [Self <: FlushResponse](x: Self) {
      
      inline def setData(value: Batch): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
}
