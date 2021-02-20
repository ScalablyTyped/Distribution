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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @google-cloud/tasks.@google-cloud/tasks.CreateNamedRequest<'queue', std.Partial<@google-cloud/tasks.@google-cloud/tasks.Queue>> */
  @js.native
  trait CreateNamedRequestqueuePa extends StObject {
    
    /**
      * The location name. For example: projects/PROJECT_ID/locations/LOCATION_ID
      */
    var parent: String = js.native
    
    var queue: PartialQueue = js.native
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
  @js.native
  trait EnhancedPickQueuenameappE extends StObject {
    
    var name: String with js.UndefOr[String] = js.native
  }
  object EnhancedPickQueuenameappE {
    
    @scala.inline
    def apply(name: String with js.UndefOr[String]): EnhancedPickQueuenameappE = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnhancedPickQueuenameappE]
    }
    
    @scala.inline
    implicit class EnhancedPickQueuenameappEMutableBuilder[Self <: EnhancedPickQueuenameappE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String with js.UndefOr[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@google-cloud/tasks.@google-cloud/tasks.Policy> */
  @js.native
  trait PartialPolicy extends StObject {
    
    var bindings: js.UndefOr[js.Array[Binding]] = js.native
    
    var etag: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[Double] = js.native
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
  @js.native
  trait PartialQueue extends StObject {
    
    var appEngineHttpQueue: js.UndefOr[AppEngineHttpQueue] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var purgeTime: js.UndefOr[String] = js.native
    
    var rateLimits: js.UndefOr[RateLimits] = js.native
    
    var retryConfig: js.UndefOr[RetryConfig] = js.native
    
    var state: js.UndefOr[String] = js.native
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
  @js.native
  trait PartialTask extends StObject {
    
    var appEngineHttpRequest: js.UndefOr[AppEngineHttpRequest] = js.native
    
    var createTime: js.UndefOr[String] = js.native
    
    var dispatchCount: js.UndefOr[Double] = js.native
    
    var firstAttempt: js.UndefOr[Attempt] = js.native
    
    var lastAttempt: js.UndefOr[Attempt] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var responseCount: js.UndefOr[Double] = js.native
    
    var scheduleTime: js.UndefOr[String] = js.native
    
    var view: js.UndefOr[View] = js.native
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
  @js.native
  trait UpdateNamedRequestqueueEn extends StObject {
    
    /**
      * The location name. For example: projects/PROJECT_ID/locations/LOCATION_ID
      */
    var parent: String = js.native
    
    var queue: EnhancedPickQueuenameappE = js.native
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
