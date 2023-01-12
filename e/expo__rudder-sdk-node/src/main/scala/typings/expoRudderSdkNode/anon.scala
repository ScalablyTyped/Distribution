package typings.expoRudderSdkNode

import org.scalablytyped.runtime.StringDictionary
import typings.expoBunyan.mod.LogLevel
import typings.expoRudderSdkNode.mod.AnalyticsIdentity
import typings.expoRudderSdkNode.mod.AnalyticsPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AnonymousId
    extends StObject
       with AnalyticsIdentity {
    
    var anonymousId: String
    
    var userId: js.UndefOr[String] = js.undefined
  }
  object AnonymousId {
    
    inline def apply(anonymousId: String): AnonymousId = {
      val __obj = js.Dynamic.literal(anonymousId = anonymousId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnonymousId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnonymousId] (val x: Self) extends AnyVal {
      
      inline def setAnonymousId(value: String): Self = StObject.set(x, "anonymousId", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  trait Batch extends StObject {
    
    var batch: js.Array[AnalyticsPayload]
    
    var sentAt: js.Date
  }
  object Batch {
    
    inline def apply(batch: js.Array[AnalyticsPayload], sentAt: js.Date): Batch = {
      val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any], sentAt = sentAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Batch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Batch] (val x: Self) extends AnyVal {
      
      inline def setBatch(value: js.Array[AnalyticsPayload]): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
      
      inline def setBatchVarargs(value: AnalyticsPayload*): Self = StObject.set(x, "batch", js.Array(value*))
      
      inline def setSentAt(value: js.Date): Self = StObject.set(x, "sentAt", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var context: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var integrations: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var properties: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var timestamp: js.UndefOr[js.Date] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setContext(value: StringDictionary[Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setIntegrations(value: StringDictionary[Boolean]): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait Enable extends StObject {
    
    var enable: js.UndefOr[Boolean] = js.undefined
    
    var flushAt: js.UndefOr[Double] = js.undefined
    
    var flushInterval: js.UndefOr[Double] = js.undefined
    
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    
    var maxFlushSizeInBytes: js.UndefOr[Double] = js.undefined
    
    var maxQueueLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The network timeout (in milliseconds) for how long to wait for a request to complete when
      * sending messages to the data plane. Omit or specify 0 or a negative value to disable
      * timeouts.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Enable {
    
    inline def apply(): Enable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Enable] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setFlushAt(value: Double): Self = StObject.set(x, "flushAt", value.asInstanceOf[js.Any])
      
      inline def setFlushAtUndefined: Self = StObject.set(x, "flushAt", js.undefined)
      
      inline def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
      
      inline def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
      
      inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMaxFlushSizeInBytes(value: Double): Self = StObject.set(x, "maxFlushSizeInBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxFlushSizeInBytesUndefined: Self = StObject.set(x, "maxFlushSizeInBytes", js.undefined)
      
      inline def setMaxQueueLength(value: Double): Self = StObject.set(x, "maxQueueLength", value.asInstanceOf[js.Any])
      
      inline def setMaxQueueLengthUndefined: Self = StObject.set(x, "maxQueueLength", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Event extends StObject {
    
    var event: String
  }
  object Event {
    
    inline def apply(event: String): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  trait GroupId extends StObject {
    
    var groupId: String
    
    var traits: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object GroupId {
    
    inline def apply(groupId: String): GroupId = {
      val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupId] (val x: Self) extends AnyVal {
      
      inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setTraits(value: StringDictionary[Any]): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
      
      inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreviousId extends StObject {
    
    var previousId: String
    
    var traits: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object PreviousId {
    
    inline def apply(previousId: String): PreviousId = {
      val __obj = js.Dynamic.literal(previousId = previousId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviousId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreviousId] (val x: Self) extends AnyVal {
      
      inline def setPreviousId(value: String): Self = StObject.set(x, "previousId", value.asInstanceOf[js.Any])
      
      inline def setTraits(value: StringDictionary[Any]): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
      
      inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
    }
  }
  
  trait Traits extends StObject {
    
    var traits: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object Traits {
    
    inline def apply(): Traits = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Traits]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Traits] (val x: Self) extends AnyVal {
      
      inline def setTraits(value: StringDictionary[Any]): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
      
      inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
    }
  }
  
  trait UserId
    extends StObject
       with AnalyticsIdentity {
    
    var userId: String
  }
  object UserId {
    
    inline def apply(userId: String): UserId = {
      val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserId] (val x: Self) extends AnyVal {
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
}
