package typings.ghauth

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(authOptions: AuthOptions, callback: js.Function2[/* err */ Error, /* tokenData */ TokenData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(authOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("ghauth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AuthOptions extends StObject {
    
    /**
      * @default "https://api.github.com/authorizations"
      */
    var authUrl: js.UndefOr[String] = js.undefined
    
    var configName: String
    
    /**
      * @default false
      */
    var noSave: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default "Node.js command-line app with ghauth"
      */
    var note: js.UndefOr[String] = js.undefined
    
    /**
      * @default "GitHub"
      */
    var promptName: js.UndefOr[String] = js.undefined
    
    /**
      * @default []
      */
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @default "Magic Node.js application that does magic things with ghauth"
      */
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object AuthOptions {
    
    inline def apply(configName: String): AuthOptions = {
      val __obj = js.Dynamic.literal(configName = configName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthOptions]
    }
    
    extension [Self <: AuthOptions](x: Self) {
      
      inline def setAuthUrl(value: String): Self = StObject.set(x, "authUrl", value.asInstanceOf[js.Any])
      
      inline def setAuthUrlUndefined: Self = StObject.set(x, "authUrl", js.undefined)
      
      inline def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
      
      inline def setNoSave(value: Boolean): Self = StObject.set(x, "noSave", value.asInstanceOf[js.Any])
      
      inline def setNoSaveUndefined: Self = StObject.set(x, "noSave", js.undefined)
      
      inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
      
      inline def setPromptName(value: String): Self = StObject.set(x, "promptName", value.asInstanceOf[js.Any])
      
      inline def setPromptNameUndefined: Self = StObject.set(x, "promptName", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  trait TokenData extends StObject {
    
    var token: String
    
    var user: String
  }
  object TokenData {
    
    inline def apply(token: String, user: String): TokenData = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenData]
    }
    
    extension [Self <: TokenData](x: Self) {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
