package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ApplicationCache {
  
  trait ApplicationCache extends StObject {
    
    /**
      * Application cache creation time.
      */
    var creationTime: Double
    
    /**
      * Manifest URL.
      */
    var manifestURL: String
    
    /**
      * Application cache resources.
      */
    var resources: js.Array[ApplicationCacheResource]
    
    /**
      * Application cache size.
      */
    var size: Double
    
    /**
      * Application cache update time.
      */
    var updateTime: Double
  }
  object ApplicationCache {
    
    @scala.inline
    def apply(
      creationTime: Double,
      manifestURL: String,
      resources: js.Array[ApplicationCacheResource],
      size: Double,
      updateTime: Double
    ): typings.devtoolsProtocol.mod.Protocol.ApplicationCache.ApplicationCache = {
      val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], manifestURL = manifestURL.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.devtoolsProtocol.mod.Protocol.ApplicationCache.ApplicationCache]
    }
    
    @scala.inline
    implicit class ApplicationCacheMutableBuilder[Self <: typings.devtoolsProtocol.mod.Protocol.ApplicationCache.ApplicationCache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationTime(value: Double): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestURL(value: String): Self = StObject.set(x, "manifestURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResources(value: js.Array[ApplicationCacheResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesVarargs(value: ApplicationCacheResource*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateTime(value: Double): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApplicationCacheResource extends StObject {
    
    /**
      * Resource size.
      */
    var size: integer
    
    /**
      * Resource type.
      */
    var `type`: String
    
    /**
      * Resource url.
      */
    var url: String
  }
  object ApplicationCacheResource {
    
    @scala.inline
    def apply(size: integer, `type`: String, url: String): ApplicationCacheResource = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationCacheResource]
    }
    
    @scala.inline
    implicit class ApplicationCacheResourceMutableBuilder[Self <: ApplicationCacheResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApplicationCacheStatusUpdatedEvent extends StObject {
    
    /**
      * Identifier of the frame containing document whose application cache updated status.
      */
    var frameId: FrameId
    
    /**
      * Manifest URL.
      */
    var manifestURL: String
    
    /**
      * Updated application cache status.
      */
    var status: integer
  }
  object ApplicationCacheStatusUpdatedEvent {
    
    @scala.inline
    def apply(frameId: FrameId, manifestURL: String, status: integer): ApplicationCacheStatusUpdatedEvent = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], manifestURL = manifestURL.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationCacheStatusUpdatedEvent]
    }
    
    @scala.inline
    implicit class ApplicationCacheStatusUpdatedEventMutableBuilder[Self <: ApplicationCacheStatusUpdatedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestURL(value: String): Self = StObject.set(x, "manifestURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: integer): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait FrameWithManifest extends StObject {
    
    /**
      * Frame identifier.
      */
    var frameId: FrameId
    
    /**
      * Manifest URL.
      */
    var manifestURL: String
    
    /**
      * Application cache status.
      */
    var status: integer
  }
  object FrameWithManifest {
    
    @scala.inline
    def apply(frameId: FrameId, manifestURL: String, status: integer): FrameWithManifest = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], manifestURL = manifestURL.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameWithManifest]
    }
    
    @scala.inline
    implicit class FrameWithManifestMutableBuilder[Self <: FrameWithManifest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestURL(value: String): Self = StObject.set(x, "manifestURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: integer): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetApplicationCacheForFrameRequest extends StObject {
    
    /**
      * Identifier of the frame containing document whose application cache is retrieved.
      */
    var frameId: FrameId
  }
  object GetApplicationCacheForFrameRequest {
    
    @scala.inline
    def apply(frameId: FrameId): GetApplicationCacheForFrameRequest = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetApplicationCacheForFrameRequest]
    }
    
    @scala.inline
    implicit class GetApplicationCacheForFrameRequestMutableBuilder[Self <: GetApplicationCacheForFrameRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetApplicationCacheForFrameResponse extends StObject {
    
    /**
      * Relevant application cache data for the document in given frame.
      */
    var applicationCache: typings.devtoolsProtocol.mod.Protocol.ApplicationCache.ApplicationCache
  }
  object GetApplicationCacheForFrameResponse {
    
    @scala.inline
    def apply(applicationCache: typings.devtoolsProtocol.mod.Protocol.ApplicationCache.ApplicationCache): GetApplicationCacheForFrameResponse = {
      val __obj = js.Dynamic.literal(applicationCache = applicationCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetApplicationCacheForFrameResponse]
    }
    
    @scala.inline
    implicit class GetApplicationCacheForFrameResponseMutableBuilder[Self <: GetApplicationCacheForFrameResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationCache(value: typings.devtoolsProtocol.mod.Protocol.ApplicationCache.ApplicationCache): Self = StObject.set(x, "applicationCache", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetFramesWithManifestsResponse extends StObject {
    
    /**
      * Array of frame identifiers with manifest urls for each frame containing a document
      * associated with some application cache.
      */
    var frameIds: js.Array[FrameWithManifest]
  }
  object GetFramesWithManifestsResponse {
    
    @scala.inline
    def apply(frameIds: js.Array[FrameWithManifest]): GetFramesWithManifestsResponse = {
      val __obj = js.Dynamic.literal(frameIds = frameIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFramesWithManifestsResponse]
    }
    
    @scala.inline
    implicit class GetFramesWithManifestsResponseMutableBuilder[Self <: GetFramesWithManifestsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrameIds(value: js.Array[FrameWithManifest]): Self = StObject.set(x, "frameIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameIdsVarargs(value: FrameWithManifest*): Self = StObject.set(x, "frameIds", js.Array(value :_*))
    }
  }
  
  trait GetManifestForFrameRequest extends StObject {
    
    /**
      * Identifier of the frame containing document whose manifest is retrieved.
      */
    var frameId: FrameId
  }
  object GetManifestForFrameRequest {
    
    @scala.inline
    def apply(frameId: FrameId): GetManifestForFrameRequest = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetManifestForFrameRequest]
    }
    
    @scala.inline
    implicit class GetManifestForFrameRequestMutableBuilder[Self <: GetManifestForFrameRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetManifestForFrameResponse extends StObject {
    
    /**
      * Manifest URL for document in the given frame.
      */
    var manifestURL: String
  }
  object GetManifestForFrameResponse {
    
    @scala.inline
    def apply(manifestURL: String): GetManifestForFrameResponse = {
      val __obj = js.Dynamic.literal(manifestURL = manifestURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetManifestForFrameResponse]
    }
    
    @scala.inline
    implicit class GetManifestForFrameResponseMutableBuilder[Self <: GetManifestForFrameResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManifestURL(value: String): Self = StObject.set(x, "manifestURL", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkStateUpdatedEvent extends StObject {
    
    var isNowOnline: Boolean
  }
  object NetworkStateUpdatedEvent {
    
    @scala.inline
    def apply(isNowOnline: Boolean): NetworkStateUpdatedEvent = {
      val __obj = js.Dynamic.literal(isNowOnline = isNowOnline.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkStateUpdatedEvent]
    }
    
    @scala.inline
    implicit class NetworkStateUpdatedEventMutableBuilder[Self <: NetworkStateUpdatedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsNowOnline(value: Boolean): Self = StObject.set(x, "isNowOnline", value.asInstanceOf[js.Any])
    }
  }
}
