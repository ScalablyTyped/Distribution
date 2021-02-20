package typings.entriaRelayExperimental

import typings.entriaRelayExperimental.queryResourceMod.RenderPolicy
import typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.Action
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cursor extends StObject {
    
    var cursor: String | Null = js.native
    
    var hasMore: Boolean = js.native
  }
  object Cursor {
    
    @scala.inline
    def apply(hasMore: Boolean): Cursor = {
      val __obj = js.Dynamic.literal(hasMore = hasMore.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cursor]
    }
    
    @scala.inline
    implicit class CursorMutableBuilder[Self <: Cursor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorNull: Self = StObject.set(x, "cursor", null)
      
      @scala.inline
      def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Environment extends Action {
    
    var environment: typings.relayRuntime.relayStoreTypesMod.Environment = js.native
    
    var fragmentIdentifier: String = js.native
    
    var `type`: String = js.native
  }
  object Environment {
    
    @scala.inline
    def apply(
      environment: typings.relayRuntime.relayStoreTypesMod.Environment,
      fragmentIdentifier: String,
      `type`: String
    ): Environment = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Environment]
    }
    
    @scala.inline
    implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvironment(value: typings.relayRuntime.relayStoreTypesMod.Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentIdentifier(value: String): Self = StObject.set(x, "fragmentIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FetchKey extends StObject {
    
    var fetchKey: js.UndefOr[String | Double] = js.native
    
    var fetchPolicy: js.UndefOr[typings.entriaRelayExperimental.queryResourceMod.FetchPolicy] = js.native
    
    var networkCacheConfig: js.UndefOr[CacheConfig] = js.native
  }
  object FetchKey {
    
    @scala.inline
    def apply(): FetchKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchKey]
    }
    
    @scala.inline
    implicit class FetchKeyMutableBuilder[Self <: FetchKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchKey(value: String | Double): Self = StObject.set(x, "fetchKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchKeyUndefined: Self = StObject.set(x, "fetchKey", js.undefined)
      
      @scala.inline
      def setFetchPolicy(value: typings.entriaRelayExperimental.queryResourceMod.FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      @scala.inline
      def setNetworkCacheConfig(value: CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
    }
  }
  
  @js.native
  trait FetchPolicy extends Action {
    
    var environment: typings.relayRuntime.relayStoreTypesMod.Environment = js.native
    
    var fetchPolicy: js.UndefOr[typings.entriaRelayExperimental.queryResourceMod.FetchPolicy] = js.native
    
    var onComplete: js.UndefOr[js.Function1[/* args */ Error | Null, Unit]] = js.native
    
    var refetchVariables: Variables = js.native
    
    var renderPolicy: js.UndefOr[RenderPolicy] = js.native
    
    var `type`: String = js.native
  }
  object FetchPolicy {
    
    @scala.inline
    def apply(
      environment: typings.relayRuntime.relayStoreTypesMod.Environment,
      refetchVariables: Variables,
      `type`: String
    ): FetchPolicy = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], refetchVariables = refetchVariables.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchPolicy]
    }
    
    @scala.inline
    implicit class FetchPolicyMutableBuilder[Self <: FetchPolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvironment(value: typings.relayRuntime.relayStoreTypesMod.Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchPolicy(value: typings.entriaRelayExperimental.queryResourceMod.FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      @scala.inline
      def setOnComplete(value: /* args */ Error | Null => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setRefetchVariables(value: Variables): Self = StObject.set(x, "refetchVariables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "renderPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderPolicyUndefined: Self = StObject.set(x, "renderPolicy", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NetworkCacheConfig extends StObject {
    
    var networkCacheConfig: js.UndefOr[CacheConfig] = js.native
  }
  object NetworkCacheConfig {
    
    @scala.inline
    def apply(): NetworkCacheConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkCacheConfig]
    }
    
    @scala.inline
    implicit class NetworkCacheConfigMutableBuilder[Self <: NetworkCacheConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNetworkCacheConfig(value: CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
    }
  }
  
  @js.native
  trait OnComplete extends StObject {
    
    var onComplete: js.UndefOr[js.Function1[/* arg */ Error | Null, Unit]] = js.native
  }
  object OnComplete {
    
    @scala.inline
    def apply(): OnComplete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnComplete]
    }
    
    @scala.inline
    implicit class OnCompleteMutableBuilder[Self <: OnComplete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnComplete(value: /* arg */ Error | Null => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    }
  }
}
