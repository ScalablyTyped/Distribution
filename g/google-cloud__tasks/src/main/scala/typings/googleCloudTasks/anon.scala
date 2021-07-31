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
    
    @scala.inline
    def apply(parent: String, queue: PartialQueue): CreateNamedRequestqueuePa = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateNamedRequestqueuePa]
    }
    
    @scala.inline
    implicit class CreateNamedRequestqueuePaMutableBuilder[Self <: CreateNamedRequestqueuePa] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueue(value: PartialQueue): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @google-cloud/tasks.@google-cloud/tasks.EnhancedPick<@google-cloud/tasks.@google-cloud/tasks.Queue, 'name', 'appEngineHttpQueue' | 'rateLimits' | 'retryConfig'> */
  trait EnhancedPickQueuenameappE extends StObject {
    
    var name: String & js.UndefOr[String]
  }
  object EnhancedPickQueuenameappE {
    
    @scala.inline
    def apply(name: String & js.UndefOr[String]): EnhancedPickQueuenameappE = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnhancedPickQueuenameappE]
    }
    
    @scala.inline
    implicit class EnhancedPickQueuenameappEMutableBuilder[Self <: EnhancedPickQueuenameappE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String & js.UndefOr[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@google-cloud/tasks.@google-cloud/tasks.Policy> */
  trait PartialPolicy extends StObject {
    
    var bindings: js.UndefOr[js.Array[Binding]] = js.undefined
    
    var etag: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object PartialPolicy {
    
    @scala.inline
    def apply(): PartialPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPolicy]
    }
    
    @scala.inline
    implicit class PartialPolicyMutableBuilder[Self <: PartialPolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindings(value: js.Array[Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
      
      @scala.inline
      def setBindingsVarargs(value: Binding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
      
      @scala.inline
      def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
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
    
    @scala.inline
    def apply(): PartialQueue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialQueue]
    }
    
    @scala.inline
    implicit class PartialQueueMutableBuilder[Self <: PartialQueue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppEngineHttpQueue(value: AppEngineHttpQueue): Self = StObject.set(x, "appEngineHttpQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppEngineHttpQueueUndefined: Self = StObject.set(x, "appEngineHttpQueue", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPurgeTime(value: String): Self = StObject.set(x, "purgeTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurgeTimeUndefined: Self = StObject.set(x, "purgeTime", js.undefined)
      
      @scala.inline
      def setRateLimits(value: RateLimits): Self = StObject.set(x, "rateLimits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateLimitsUndefined: Self = StObject.set(x, "rateLimits", js.undefined)
      
      @scala.inline
      def setRetryConfig(value: RetryConfig): Self = StObject.set(x, "retryConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryConfigUndefined: Self = StObject.set(x, "retryConfig", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
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
    
    @scala.inline
    def apply(): PartialTask = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTask]
    }
    
    @scala.inline
    implicit class PartialTaskMutableBuilder[Self <: PartialTask] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppEngineHttpRequest(value: AppEngineHttpRequest): Self = StObject.set(x, "appEngineHttpRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppEngineHttpRequestUndefined: Self = StObject.set(x, "appEngineHttpRequest", js.undefined)
      
      @scala.inline
      def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
      
      @scala.inline
      def setDispatchCount(value: Double): Self = StObject.set(x, "dispatchCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispatchCountUndefined: Self = StObject.set(x, "dispatchCount", js.undefined)
      
      @scala.inline
      def setFirstAttempt(value: Attempt): Self = StObject.set(x, "firstAttempt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstAttemptUndefined: Self = StObject.set(x, "firstAttempt", js.undefined)
      
      @scala.inline
      def setLastAttempt(value: Attempt): Self = StObject.set(x, "lastAttempt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastAttemptUndefined: Self = StObject.set(x, "lastAttempt", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResponseCount(value: Double): Self = StObject.set(x, "responseCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseCountUndefined: Self = StObject.set(x, "responseCount", js.undefined)
      
      @scala.inline
      def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
      
      @scala.inline
      def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
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
    
    @scala.inline
    def apply(parent: String, queue: EnhancedPickQueuenameappE): UpdateNamedRequestqueueEn = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateNamedRequestqueueEn]
    }
    
    @scala.inline
    implicit class UpdateNamedRequestqueueEnMutableBuilder[Self <: UpdateNamedRequestqueueEn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueue(value: EnhancedPickQueuenameappE): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
}
