package typings.googleAppsScriptOauth2

import typings.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.OAuth2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object GoogleAppsScriptOAuth2 {
    
    @JSGlobal("GoogleAppsScriptOAuth2.TokenFormat")
    @js.native
    object TokenFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.TokenFormat & String] = js.native
      
      /* "application/x-www-form-urlencoded" */ val FORM_URL_ENCODED: typings.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.TokenFormat.FORM_URL_ENCODED & String = js.native
      
      /* "application/json" */ val JSON: typings.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.TokenFormat.JSON & String = js.native
    }
  }
  
  @JSGlobal("OAuth2")
  @js.native
  def OAuth2: typings.googleAppsScriptOauth2.GoogleAppsScriptOAuth2.OAuth2 = js.native
  inline def OAuth2_=(x: OAuth2): Unit = js.Dynamic.global.updateDynamic("OAuth2")(x.asInstanceOf[js.Any])
}
