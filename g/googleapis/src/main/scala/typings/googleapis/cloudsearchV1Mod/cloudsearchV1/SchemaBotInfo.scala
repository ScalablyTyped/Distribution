package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBotInfo extends StObject {
  
  /**
    * Identifier of the application associated with the bot.
    */
  var appId: js.UndefOr[SchemaAppId] = js.undefined
  
  /**
    * URL for the avatar picture of the User in dynamite. This field should be populated if the request is FetchBotCategories/ListBotCatalogEntries
    */
  var botAvatarUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Non-unique, user-defined display name of the Bot. This field should be populated if the request is FetchBotCategories/ListBotCatalogEntries.
    */
  var botName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Short description for the bot.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of bot developer.
    */
  var developerName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL for the banner image in GSuite Market Place. The banner will be 220x140.
    */
  var marketPlaceBannerUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether bot is enabled/disabled.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Urls with additional information related to the bot. This field should always be set even if all the fields within it are empty, so that it is convenient for clients to work with this field in javascript.
    */
  var supportUrls: js.UndefOr[SchemaSupportUrls] = js.undefined
  
  /**
    * The supported uses are limited according to the user that made the request. If the user does not have permission to use the bot, the list will be empty. This could occur for non whitelisted bots in the catalog.
    */
  var supportedUses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var whitelistStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaBotInfo {
  
  inline def apply(): SchemaBotInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBotInfo]
  }
  
  extension [Self <: SchemaBotInfo](x: Self) {
    
    inline def setAppId(value: SchemaAppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setBotAvatarUrl(value: String): Self = StObject.set(x, "botAvatarUrl", value.asInstanceOf[js.Any])
    
    inline def setBotAvatarUrlNull: Self = StObject.set(x, "botAvatarUrl", null)
    
    inline def setBotAvatarUrlUndefined: Self = StObject.set(x, "botAvatarUrl", js.undefined)
    
    inline def setBotName(value: String): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotNameNull: Self = StObject.set(x, "botName", null)
    
    inline def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDeveloperName(value: String): Self = StObject.set(x, "developerName", value.asInstanceOf[js.Any])
    
    inline def setDeveloperNameNull: Self = StObject.set(x, "developerName", null)
    
    inline def setDeveloperNameUndefined: Self = StObject.set(x, "developerName", js.undefined)
    
    inline def setMarketPlaceBannerUrl(value: String): Self = StObject.set(x, "marketPlaceBannerUrl", value.asInstanceOf[js.Any])
    
    inline def setMarketPlaceBannerUrlNull: Self = StObject.set(x, "marketPlaceBannerUrl", null)
    
    inline def setMarketPlaceBannerUrlUndefined: Self = StObject.set(x, "marketPlaceBannerUrl", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSupportUrls(value: SchemaSupportUrls): Self = StObject.set(x, "supportUrls", value.asInstanceOf[js.Any])
    
    inline def setSupportUrlsUndefined: Self = StObject.set(x, "supportUrls", js.undefined)
    
    inline def setSupportedUses(value: js.Array[String]): Self = StObject.set(x, "supportedUses", value.asInstanceOf[js.Any])
    
    inline def setSupportedUsesNull: Self = StObject.set(x, "supportedUses", null)
    
    inline def setSupportedUsesUndefined: Self = StObject.set(x, "supportedUses", js.undefined)
    
    inline def setSupportedUsesVarargs(value: String*): Self = StObject.set(x, "supportedUses", js.Array(value*))
    
    inline def setWhitelistStatus(value: String): Self = StObject.set(x, "whitelistStatus", value.asInstanceOf[js.Any])
    
    inline def setWhitelistStatusNull: Self = StObject.set(x, "whitelistStatus", null)
    
    inline def setWhitelistStatusUndefined: Self = StObject.set(x, "whitelistStatus", js.undefined)
  }
}
