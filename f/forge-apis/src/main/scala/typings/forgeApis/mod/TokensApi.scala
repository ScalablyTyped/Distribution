package typings.forgeApis.mod

import typings.forgeApis.mod.TokensApi.TokensOptions
import typings.forgeApis.mod.WebhooksApi.RegionEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "TokensApi")
@js.native
open class TokensApi () extends StObject {
  def this(apiClient: Any) = this()
  def this(apiClient: Any, region: RegionEnum) = this()
  def this(apiClient: Unit, region: RegionEnum) = this()
  
  def CreateToken(token: String, opts: TokensOptions, oauth2client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  def DeleteToken(opts: TokensOptions, oauth2client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  def UpdateToken(token: String, opts: TokensOptions, oauth2client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}
object TokensApi {
  
  @js.native
  sealed trait RegionEnum extends StObject
  @JSImport("forge-apis", "TokensApi.RegionEnum")
  @js.native
  object RegionEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.forgeApis.mod.TokensApi.RegionEnum & String] = js.native
    
    @js.native
    sealed trait EMEA
      extends StObject
         with typings.forgeApis.mod.TokensApi.RegionEnum
    /* "EMEA" */ val EMEA: typings.forgeApis.mod.TokensApi.RegionEnum.EMEA & String = js.native
    
    @js.native
    sealed trait EU
      extends StObject
         with typings.forgeApis.mod.TokensApi.RegionEnum
    /* "EMEA" */ val EU: typings.forgeApis.mod.TokensApi.RegionEnum.EU & String = js.native
    
    @js.native
    sealed trait US
      extends StObject
         with typings.forgeApis.mod.TokensApi.RegionEnum
    /* "US" */ val US: typings.forgeApis.mod.TokensApi.RegionEnum.US & String = js.native
  }
  
  trait TokensOptions extends StObject {
    
    var xAdsRegion: js.UndefOr[typings.forgeApis.mod.TokensApi.RegionEnum] = js.undefined
  }
  object TokensOptions {
    
    inline def apply(): TokensOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokensOptions]
    }
    
    extension [Self <: TokensOptions](x: Self) {
      
      inline def setXAdsRegion(value: typings.forgeApis.mod.TokensApi.RegionEnum): Self = StObject.set(x, "xAdsRegion", value.asInstanceOf[js.Any])
      
      inline def setXAdsRegionUndefined: Self = StObject.set(x, "xAdsRegion", js.undefined)
    }
  }
}
