package typings.ghauth

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ghauth", JSImport.Namespace)
  @js.native
  def apply(authOptions: AuthOptions, callback: js.Function2[/* err */ Error, /* tokenData */ TokenData, Unit]): Unit = js.native
  
  @js.native
  trait AuthOptions extends StObject {
    
    /**
      * @default "https://api.github.com/authorizations"
      */
    var authUrl: js.UndefOr[String] = js.native
    
    var configName: String = js.native
    
    /**
      * @default false
      */
    var noSave: js.UndefOr[Boolean] = js.native
    
    /**
      * @default "Node.js command-line app with ghauth"
      */
    var note: js.UndefOr[String] = js.native
    
    /**
      * @default "GitHub"
      */
    var promptName: js.UndefOr[String] = js.native
    
    /**
      * @default []
      */
    var scopes: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * @default "Magic Node.js application that does magic things with ghauth"
      */
    var userAgent: js.UndefOr[String] = js.native
  }
  object AuthOptions {
    
    @scala.inline
    def apply(configName: String): AuthOptions = {
      val __obj = js.Dynamic.literal(configName = configName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthOptions]
    }
    
    @scala.inline
    implicit class AuthOptionsMutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthUrl(value: String): Self = StObject.set(x, "authUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUrlUndefined: Self = StObject.set(x, "authUrl", js.undefined)
      
      @scala.inline
      def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSave(value: Boolean): Self = StObject.set(x, "noSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSaveUndefined: Self = StObject.set(x, "noSave", js.undefined)
      
      @scala.inline
      def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
      
      @scala.inline
      def setPromptName(value: String): Self = StObject.set(x, "promptName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptNameUndefined: Self = StObject.set(x, "promptName", js.undefined)
      
      @scala.inline
      def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      @scala.inline
      def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  @js.native
  trait TokenData extends StObject {
    
    var token: String = js.native
    
    var user: String = js.native
  }
  object TokenData {
    
    @scala.inline
    def apply(token: String, user: String): TokenData = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenData]
    }
    
    @scala.inline
    implicit class TokenDataMutableBuilder[Self <: TokenData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
