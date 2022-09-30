package typings.googleAccounts

import typings.googleAccounts.google.accounts.id.Credential
import typings.googleAccounts.google.accounts.id.GsiButtonConfiguration
import typings.googleAccounts.google.accounts.id.IdConfiguration
import typings.googleAccounts.google.accounts.id.PromptMomentNotification
import typings.googleAccounts.google.accounts.id.RevocationResponse
import typings.googleAccounts.google.accounts.oauth2.CodeClient
import typings.googleAccounts.google.accounts.oauth2.CodeClientConfig
import typings.googleAccounts.google.accounts.oauth2.TokenClient
import typings.googleAccounts.google.accounts.oauth2.TokenClientConfig
import typings.googleAccounts.google.accounts.oauth2.TokenResponse
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object google {
    
    object accounts {
      
      object id {
        
        @JSGlobal("google.accounts.id")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Cancel the One Tap flow if you remove the prompt from the relying
          * party DOM. The cancel operation is ignored if a credential is already
          * selected
          */
        inline def cancel(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")().asInstanceOf[Unit]
        
        /**
          * When the user signs out of your website, you need to call the method
          * google.accounts.id.disableAutoSelect to record the status in cookies.
          * This prevents a UX dead loop.
          */
        inline def disableAutoSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableAutoSelect")().asInstanceOf[Unit]
        
        /**
          * Initializes the Sign In With Google client based on the configuration
          * object.
          */
        inline def initialize(idConfig: IdConfiguration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(idConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        /**
          * Displays the One Tap prompt or the browser native credential manager
          * after the initialize() method is invoked.
          */
        inline def prompt(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")().asInstanceOf[Unit]
        inline def prompt(momentListener: js.Function1[/* promptMomentNotification */ PromptMomentNotification, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(momentListener.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        /**
          * Renders a Sign In With Google button in your web pages.
          */
        inline def renderButton(parent: HTMLElement, options: GsiButtonConfiguration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderButton")(parent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        /**
          * Revokes the OAuth grant used to share the ID token for the specified
          * user.
          */
        inline def revoke(hint: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revoke")(hint.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def revoke(hint: String, callback: js.Function1[/* response */ RevocationResponse, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("revoke")(hint.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        /**
          * A simple wrapper for the store() method of the browser's native
          * credential manager API. Therefore, it can only be used to store a
          * password credential.
          */
        inline def storeCredential(credential: Credential): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("storeCredential")(credential.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def storeCredential(credential: Credential, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("storeCredential")(credential.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      }
      
      object oauth2 {
        
        @JSGlobal("google.accounts.oauth2")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Checks if the user granted all the specified scope or scopes.
          */
        inline def hasGrantedAllScopes(tokenResponse: TokenResponse, firstScope: String, restScopes: String*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasGrantedAllScopes")((scala.List(tokenResponse.asInstanceOf[js.Any], firstScope.asInstanceOf[js.Any])).`++`(restScopes.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Boolean]
        
        /**
          * Checks if the user granted any of the specified scope or scopes.
          */
        inline def hasGrantedAnyScope(tokenResponse: TokenResponse, firstScope: String, restScopes: String*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasGrantedAnyScope")((scala.List(tokenResponse.asInstanceOf[js.Any], firstScope.asInstanceOf[js.Any])).`++`(restScopes.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Boolean]
        
        /**
          * Initializes and returns a code client, with the configurations in the
          * parameter.
          */
        inline def initCodeClient(config: CodeClientConfig): CodeClient = ^.asInstanceOf[js.Dynamic].applyDynamic("initCodeClient")(config.asInstanceOf[js.Any]).asInstanceOf[CodeClient]
        
        /**
          * Initializes and returns a token client, with the configurations in the
          * parameter.
          */
        inline def initTokenClient(config: TokenClientConfig): TokenClient = ^.asInstanceOf[js.Dynamic].applyDynamic("initTokenClient")(config.asInstanceOf[js.Any]).asInstanceOf[TokenClient]
        
        /**
          * Revokes all of the scopes that the user granted to the app. A valid
          * access token is required to revoke the permission
          */
        inline def revoke(accessToken: String, done: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("revoke")(accessToken.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
      }
    }
  }
}
