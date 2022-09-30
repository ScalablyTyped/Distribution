package typings.googleCloudTasks

import typings.googleCloudTasks.mod.AppEngineHttpQueue
import typings.googleCloudTasks.mod.AppEngineHttpRequest
import typings.googleCloudTasks.mod.Attempt
import typings.googleCloudTasks.mod.Binding
import typings.googleCloudTasks.mod.RateLimits
import typings.googleCloudTasks.mod.RetryConfig
import typings.googleCloudTasks.mod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @google-cloud/tasks.@google-cloud/tasks.CreateNamedRequest<'queue', std.Partial<@google-cloud/tasks.@google-cloud/tasks.Queue>> */
  trait CreateNamedRequestqueuePa extends StObject {
    
    /**
      * The location name. For example: projects/PROJECT_ID/locations/LOCATION_ID
      */
    var parent: String
    
    var queue: PartialQueue
  }
  object CreateNamedRequestqueuePa {
    
    inline def apply(parent: String, queue: PartialQueue): CreateNamedRequestqueuePa = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateNamedRequestqueuePa]
    }
    
    extension [Self <: CreateNamedRequestqueuePa](x: Self) {
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: PartialQueue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @google-cloud/tasks.@google-cloud/tasks.EnhancedPick<@google-cloud/tasks.@google-cloud/tasks.Queue, 'name', 'appEngineHttpQueue' | 'rateLimits' | 'retryConfig'> */
  trait EnhancedPickQueuenameappE extends StObject {
    
    var name: String & js.UndefOr[String]
  }
  object EnhancedPickQueuenameappE {
    
    inline def apply(name: String & js.UndefOr[String]): EnhancedPickQueuenameappE = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnhancedPickQueuenameappE]
    }
    
    extension [Self <: EnhancedPickQueuenameappE](x: Self) {
      
      inline def setName(value: String & js.UndefOr[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@google-cloud/tasks.@google-cloud/tasks.Policy> */
  trait PartialPolicy extends StObject {
    
    var bindings: js.UndefOr[js.Array[Binding]] = js.undefined
    
    var etag: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object PartialPolicy {
    
    inline def apply(): PartialPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPolicy]
    }
    
    extension [Self <: PartialPolicy](x: Self) {
      
      inline def setBindings(value: js.Array[Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
      
      inline def setBindingsVarargs(value: Binding*): Self = StObject.set(x, "bindings", js.Array(value*))
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@google-cloud/tasks.@google-cloud/tasks.Queue> */
  trait PartialQueue extends StObject {
    
    var appEngineHttpQueue: js.UndefOr[AppEngineHttpQueue] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var purgeTime: js.UndefOr[String] = js.undefined
    
    var rateLimits: js.UndefOr[RateLimits] = js.undefined
    
    var retryConfig: js.UndefOr[RetryConfig] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object PartialQueue {
    
    inline def apply(): PartialQueue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialQueue]
    }
    
    extension [Self <: PartialQueue](x: Self) {
      
      inline def setAppEngineHttpQueue(value: AppEngineHttpQueue): Self = StObject.set(x, "appEngineHttpQueue", value.asInstanceOf[js.Any])
      
      inline def setAppEngineHttpQueueUndefined: Self = StObject.set(x, "appEngineHttpQueue", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPurgeTime(value: String): Self = StObject.set(x, "purgeTime", value.asInstanceOf[js.Any])
      
      inline def setPurgeTimeUndefined: Self = StObject.set(x, "purgeTime", js.undefined)
      
      inline def setRateLimits(value: RateLimits): Self = StObject.set(x, "rateLimits", value.asInstanceOf[js.Any])
      
      inline def setRateLimitsUndefined: Self = StObject.set(x, "rateLimits", js.undefined)
      
      inline def setRetryConfig(value: RetryConfig): Self = StObject.set(x, "retryConfig", value.asInstanceOf[js.Any])
      
      inline def setRetryConfigUndefined: Self = StObject.set(x, "retryConfig", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@google-cloud/tasks.@google-cloud/tasks.Task> */
  trait PartialTask extends StObject {
    
    var appEngineHttpRequest: js.UndefOr[AppEngineHttpRequest] = js.undefined
    
    var createTime: js.UndefOr[String] = js.undefined
    
    var dispatchCount: js.UndefOr[Double] = js.undefined
    
    var firstAttempt: js.UndefOr[Attempt] = js.undefined
    
    var lastAttempt: js.UndefOr[Attempt] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var responseCount: js.UndefOr[Double] = js.undefined
    
    var scheduleTime: js.UndefOr[String] = js.undefined
    
    var view: js.UndefOr[View] = js.undefined
  }
  object PartialTask {
    
    inline def apply(): PartialTask = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTask]
    }
    
    extension [Self <: PartialTask](x: Self) {
      
      inline def setAppEngineHttpRequest(value: AppEngineHttpRequest): Self = StObject.set(x, "appEngineHttpRequest", value.asInstanceOf[js.Any])
      
      inline def setAppEngineHttpRequestUndefined: Self = StObject.set(x, "appEngineHttpRequest", js.undefined)
      
      inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
      
      inline def setDispatchCount(value: Double): Self = StObject.set(x, "dispatchCount", value.asInstanceOf[js.Any])
      
      inline def setDispatchCountUndefined: Self = StObject.set(x, "dispatchCount", js.undefined)
      
      inline def setFirstAttempt(value: Attempt): Self = StObject.set(x, "firstAttempt", value.asInstanceOf[js.Any])
      
      inline def setFirstAttemptUndefined: Self = StObject.set(x, "firstAttempt", js.undefined)
      
      inline def setLastAttempt(value: Attempt): Self = StObject.set(x, "lastAttempt", value.asInstanceOf[js.Any])
      
      inline def setLastAttemptUndefined: Self = StObject.set(x, "lastAttempt", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResponseCount(value: Double): Self = StObject.set(x, "responseCount", value.asInstanceOf[js.Any])
      
      inline def setResponseCountUndefined: Self = StObject.set(x, "responseCount", js.undefined)
      
      inline def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
      
      inline def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  /* Inlined @google-cloud/tasks.@google-cloud/tasks.UpdateNamedRequest<'queue', @google-cloud/tasks.@google-cloud/tasks.EnhancedPick<@google-cloud/tasks.@google-cloud/tasks.Queue, 'name', 'appEngineHttpQueue' | 'rateLimits' | 'retryConfig'>> */
  trait UpdateNamedRequestqueueEn extends StObject {
    
    /**
      * The location name. For example: projects/PROJECT_ID/locations/LOCATION_ID
      */
    var parent: String
    
    var queue: EnhancedPickQueuenameappE
  }
  object UpdateNamedRequestqueueEn {
    
    inline def apply(parent: String, queue: EnhancedPickQueuenameappE): UpdateNamedRequestqueueEn = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateNamedRequestqueueEn]
    }
    
    extension [Self <: UpdateNamedRequestqueueEn](x: Self) {
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: EnhancedPickQueuenameappE): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
}
