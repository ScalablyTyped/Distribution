package typings.gapi

import typings.gapi.anon.Authuser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiOAuth2TokenSessionState extends StObject {
  
  var extraQueryParams: Authuser
}
object GoogleApiOAuth2TokenSessionState {
  
  inline def apply(extraQueryParams: Authuser): GoogleApiOAuth2TokenSessionState = {
    val __obj = js.Dynamic.literal(extraQueryParams = extraQueryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiOAuth2TokenSessionState]
  }
  
  extension [Self <: GoogleApiOAuth2TokenSessionState](x: Self) {
    
    inline def setExtraQueryParams(value: Authuser): Self = StObject.set(x, "extraQueryParams", value.asInstanceOf[js.Any])
  }
}
