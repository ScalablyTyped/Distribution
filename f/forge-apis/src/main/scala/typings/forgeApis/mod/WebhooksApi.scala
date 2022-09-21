package typings.forgeApis.mod

import typings.forgeApis.mod.WebhooksApi.HooksOptions
import typings.forgeApis.mod.WebhooksApi.RegionEnum
import typings.forgeApis.mod.WebhooksApi.WebhookEventEnum
import typings.forgeApis.mod.WebhooksApi.WebhooksSystemEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "WebhooksApi")
@js.native
open class WebhooksApi () extends StObject {
  def this(apiClient: Any) = this()
  def this(apiClient: Any, region: RegionEnum) = this()
  def this(apiClient: Unit, region: RegionEnum) = this()
  
  def CreateSystemEventHook(
    webhooksSystem: WebhooksSystemEnum,
    eventType: WebhookEventEnum,
    callbackUrl: String,
    scope: Any,
    opts: HooksOptions,
    oauth2client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  def CreateSystemHook(
    webhooksSystem: WebhooksSystemEnum,
    callbackUrl: String,
    scope: Any,
    opts: HooksOptions,
    oauth2client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  def DeleteHook(
    webhooksSystem: WebhooksSystemEnum,
    eventType: WebhookEventEnum,
    hookId: String,
    opts: HooksOptions,
    oauth2client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  def GetHook(
    webhooksSystem: WebhooksSystemEnum,
    eventType: WebhookEventEnum,
    hookId: String,
    opts: HooksOptions,
    oauth2client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  def GetHooks(opts: HooksOptions, oauth2client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  def GetSystemEventsHooks(
    webhooksSystem: WebhooksSystemEnum,
    eventType: WebhookEventEnum,
    opts: HooksOptions,
    oauth2client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  def GetSystemHooks(
    webhooksSystem: WebhooksSystemEnum,
    opts: HooksOptions,
    oauth2client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  def UpdateSystemEventHook(
    webhooksSystem: WebhooksSystemEnum,
    eventType: WebhookEventEnum,
    hookId: String,
    payload: String,
    opts: HooksOptions,
    oauth2client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
}
object WebhooksApi {
  
  @js.native
  sealed trait RegionEnum extends StObject
  @JSImport("forge-apis", "WebhooksApi.RegionEnum")
  @js.native
  object RegionEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RegionEnum & String] = js.native
    
    @js.native
    sealed trait EMEA
      extends StObject
         with RegionEnum
    /* "EMEA" */ val EMEA: typings.forgeApis.mod.WebhooksApi.RegionEnum.EMEA & String = js.native
    
    @js.native
    sealed trait EU
      extends StObject
         with RegionEnum
    /* "EMEA" */ val EU: typings.forgeApis.mod.WebhooksApi.RegionEnum.EU & String = js.native
    
    @js.native
    sealed trait US
      extends StObject
         with RegionEnum
    /* "US" */ val US: typings.forgeApis.mod.WebhooksApi.RegionEnum.US & String = js.native
  }
  
  @js.native
  sealed trait StatusEnum extends StObject
  @JSImport("forge-apis", "WebhooksApi.StatusEnum")
  @js.native
  object StatusEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatusEnum & String] = js.native
    
    @js.native
    sealed trait Active
      extends StObject
         with StatusEnum
    /* "active" */ val Active: typings.forgeApis.mod.WebhooksApi.StatusEnum.Active & String = js.native
    
    @js.native
    sealed trait Inactive
      extends StObject
         with StatusEnum
    /* "inactive" */ val Inactive: typings.forgeApis.mod.WebhooksApi.StatusEnum.Inactive & String = js.native
  }
  
  @js.native
  sealed trait WebhookEventEnum extends StObject
  @JSImport("forge-apis", "WebhooksApi.WebhookEventEnum")
  @js.native
  object WebhookEventEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WebhookEventEnum & String] = js.native
    
    // Model Derivatives
    @js.native
    sealed trait ExtractionFinished
      extends StObject
         with WebhookEventEnum
    /* "extraction.finished" */ val ExtractionFinished: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.ExtractionFinished & String = js.native
    
    @js.native
    sealed trait ExtractionUpdated
      extends StObject
         with WebhookEventEnum
    /* "extraction.updated" */ val ExtractionUpdated: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.ExtractionUpdated & String = js.native
    
    @js.native
    sealed trait FolderAdded
      extends StObject
         with WebhookEventEnum
    /* "dm.folder.added" */ val FolderAdded: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.FolderAdded & String = js.native
    
    @js.native
    sealed trait FolderCopied
      extends StObject
         with WebhookEventEnum
    /* "dm.folder.copied" */ val FolderCopied: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.FolderCopied & String = js.native
    
    @js.native
    sealed trait FolderDeleted
      extends StObject
         with WebhookEventEnum
    /* "dm.folder.deleted" */ val FolderDeleted: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.FolderDeleted & String = js.native
    
    @js.native
    sealed trait FolderModified
      extends StObject
         with WebhookEventEnum
    /* "dm.folder.modified" */ val FolderModified: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.FolderModified & String = js.native
    
    @js.native
    sealed trait FolderMoved
      extends StObject
         with WebhookEventEnum
    /* "dm.folder.moved" */ val FolderMoved: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.FolderMoved & String = js.native
    
    // Fusion Lifecycle
    @js.native
    sealed trait ItemClone
      extends StObject
         with WebhookEventEnum
    /* "item.clone" */ val ItemClone: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.ItemClone & String = js.native
    
    @js.native
    sealed trait ItemCreate
      extends StObject
         with WebhookEventEnum
    /* "item.create" */ val ItemCreate: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.ItemCreate & String = js.native
    
    @js.native
    sealed trait ItemLock
      extends StObject
         with WebhookEventEnum
    /* "item.lock" */ val ItemLock: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.ItemLock & String = js.native
    
    @js.native
    sealed trait ItemRelease
      extends StObject
         with WebhookEventEnum
    /* "item.release" */ val ItemRelease: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.ItemRelease & String = js.native
    
    @js.native
    sealed trait ItemUnlock
      extends StObject
         with WebhookEventEnum
    /* "item.unlock" */ val ItemUnlock: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.ItemUnlock & String = js.native
    
    @js.native
    sealed trait ItemUpdate
      extends StObject
         with WebhookEventEnum
    /* "item.update" */ val ItemUpdate: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.ItemUpdate & String = js.native
    
    @js.native
    sealed trait ModelPublish
      extends StObject
         with WebhookEventEnum
    /* "model.publish" */ val ModelPublish: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.ModelPublish & String = js.native
    
    // Revit Cloud Worksharing
    @js.native
    sealed trait ModelSync
      extends StObject
         with WebhookEventEnum
    /* "model.sync" */ val ModelSync: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.ModelSync & String = js.native
    
    // Data Management
    @js.native
    sealed trait VersionAdded
      extends StObject
         with WebhookEventEnum
    /* "dm.version.added" */ val VersionAdded: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.VersionAdded & String = js.native
    
    @js.native
    sealed trait VersionCopied
      extends StObject
         with WebhookEventEnum
    /* "dm.version.copied" */ val VersionCopied: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.VersionCopied & String = js.native
    
    @js.native
    sealed trait VersionDeleted
      extends StObject
         with WebhookEventEnum
    /* "dm.version.deleted" */ val VersionDeleted: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.VersionDeleted & String = js.native
    
    @js.native
    sealed trait VersionModified
      extends StObject
         with WebhookEventEnum
    /* "dm.version.modified" */ val VersionModified: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.VersionModified & String = js.native
    
    @js.native
    sealed trait VersionMoved
      extends StObject
         with WebhookEventEnum
    /* "dm.version.moved" */ val VersionMoved: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.VersionMoved & String = js.native
    
    @js.native
    sealed trait WorkflowTransition
      extends StObject
         with WebhookEventEnum
    /* "workflow.transition" */ val WorkflowTransition: typings.forgeApis.mod.WebhooksApi.WebhookEventEnum.WorkflowTransition & String = js.native
  }
  
  @js.native
  sealed trait WebhooksSystemEnum extends StObject
  @JSImport("forge-apis", "WebhooksApi.WebhooksSystemEnum")
  @js.native
  object WebhooksSystemEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WebhooksSystemEnum & String] = js.native
    
    @js.native
    sealed trait c4r
      extends StObject
         with WebhooksSystemEnum
    /* "adsk.c4r" */ val c4r: typings.forgeApis.mod.WebhooksApi.WebhooksSystemEnum.c4r & String = js.native
    
    @js.native
    sealed trait data
      extends StObject
         with WebhooksSystemEnum
    /* "data" */ val data: typings.forgeApis.mod.WebhooksApi.WebhooksSystemEnum.data & String = js.native
    
    @js.native
    sealed trait derivative
      extends StObject
         with WebhooksSystemEnum
    /* "derivative" */ val derivative: typings.forgeApis.mod.WebhooksApi.WebhooksSystemEnum.derivative & String = js.native
  }
  
  trait HooksOptions extends StObject {
    
    var acceptEncoding: js.UndefOr[String] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var hookAttribute: js.UndefOr[Any] = js.undefined
    
    var hubId: String
    
    var pageState: js.UndefOr[String] = js.undefined
    
    var projectId: js.UndefOr[String] = js.undefined
    
    var scopeName: js.UndefOr[String] = js.undefined
    
    var scopeValue: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[StatusEnum] = js.undefined
    
    var tenant: js.UndefOr[String] = js.undefined
    
    var xAdsRegion: js.UndefOr[RegionEnum] = js.undefined
  }
  object HooksOptions {
    
    inline def apply(hubId: String): HooksOptions = {
      val __obj = js.Dynamic.literal(hubId = hubId.asInstanceOf[js.Any])
      __obj.asInstanceOf[HooksOptions]
    }
    
    extension [Self <: HooksOptions](x: Self) {
      
      inline def setAcceptEncoding(value: String): Self = StObject.set(x, "acceptEncoding", value.asInstanceOf[js.Any])
      
      inline def setAcceptEncodingUndefined: Self = StObject.set(x, "acceptEncoding", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setHookAttribute(value: Any): Self = StObject.set(x, "hookAttribute", value.asInstanceOf[js.Any])
      
      inline def setHookAttributeUndefined: Self = StObject.set(x, "hookAttribute", js.undefined)
      
      inline def setHubId(value: String): Self = StObject.set(x, "hubId", value.asInstanceOf[js.Any])
      
      inline def setPageState(value: String): Self = StObject.set(x, "pageState", value.asInstanceOf[js.Any])
      
      inline def setPageStateUndefined: Self = StObject.set(x, "pageState", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      inline def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
      
      inline def setScopeNameUndefined: Self = StObject.set(x, "scopeName", js.undefined)
      
      inline def setScopeValue(value: String): Self = StObject.set(x, "scopeValue", value.asInstanceOf[js.Any])
      
      inline def setScopeValueUndefined: Self = StObject.set(x, "scopeValue", js.undefined)
      
      inline def setStatus(value: StatusEnum): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
      
      inline def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
      
      inline def setXAdsRegion(value: RegionEnum): Self = StObject.set(x, "xAdsRegion", value.asInstanceOf[js.Any])
      
      inline def setXAdsRegionUndefined: Self = StObject.set(x, "xAdsRegion", js.undefined)
    }
  }
}
