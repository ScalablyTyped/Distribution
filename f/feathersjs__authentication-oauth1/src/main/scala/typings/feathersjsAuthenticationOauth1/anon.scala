package typings.feathersjsAuthenticationOauth1

import org.scalablytyped.runtime.Instantiable2
import typings.feathersjsAuthenticationOauth1.mod.FeathersAuthenticationOAuth1Options
import typings.feathersjsFeathers.mod.Application
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessToken extends StObject {
    
    var accessToken: String
    
    var profile: Any
    
    var refreshToken: String
  }
  object AccessToken {
    
    inline def apply(accessToken: String, profile: Any, refreshToken: String): AccessToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: Any): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofself extends StObject {
    
    def default(): js.Function0[Unit] = js.native
    def default(options: FeathersAuthenticationOAuth1Options): js.Function0[Unit] = js.native
    
    var OAuth1Verifier: Instantiable2[
        /* app */ Application[js.Object], 
        /* options */ Any, 
        typings.feathersjsAuthenticationOauth1.mod.OAuth1Verifier
      ] = js.native
  }
}
