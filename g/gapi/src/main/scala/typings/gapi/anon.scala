package typings.gapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ApiKey extends StObject {
    
    /**
      * The API Key to use.
      */
    var apiKey: js.UndefOr[String] = js.undefined
    
    /**
      * The app's client ID, found and created in the Google Developers Console.
      */
    var clientId: js.UndefOr[String] = js.undefined
    
    /**
      * An array of discovery doc URLs or discovery doc JSON objects.
      */
    var discoveryDocs: js.UndefOr[js.Array[String]] = js.undefined
    
    var hosted_domain: js.UndefOr[String] = js.undefined
    
    /**
      * The scopes to request, as a space-delimited string.
      */
    var scope: js.UndefOr[String] = js.undefined
  }
  object ApiKey {
    
    inline def apply(): ApiKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiKey]
    }
    
    extension [Self <: ApiKey](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setDiscoveryDocs(value: js.Array[String]): Self = StObject.set(x, "discoveryDocs", value.asInstanceOf[js.Any])
      
      inline def setDiscoveryDocsUndefined: Self = StObject.set(x, "discoveryDocs", js.undefined)
      
      inline def setDiscoveryDocsVarargs(value: String*): Self = StObject.set(x, "discoveryDocs", js.Array(value :_*))
      
      inline def setHosted_domain(value: String): Self = StObject.set(x, "hosted_domain", value.asInstanceOf[js.Any])
      
      inline def setHosted_domainUndefined: Self = StObject.set(x, "hosted_domain", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait Apppackagename extends StObject {
    
    /**
      * If you have an Android app, you can drive automatic Android downloads from your web sign-in flow.
      */
    var apppackagename: js.UndefOr[String] = js.undefined
    
    /**
      * A function in the global namespace, which is called when the sign-in button is rendered and also called after a sign-in flow completes.
      */
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Your OAuth 2.0 client ID that you obtained from the Google Developers Console.
      */
    var clientid: js.UndefOr[String] = js.undefined
    
    /**
      * Directs the sign-in button to store user and session information in a session cookie and HTML5 session storage on the user's client for the purpose of minimizing HTTP traffic and distinguishing between multiple Google accounts a user might be signed into.
      */
    var cookiepolicy: js.UndefOr[String] = js.undefined
    
    /**
      * If true, all previously granted scopes remain granted in each incremental request, for incremental authorization. The default value true is correct for most use cases; use false only if employing delegated auth, where you pass the bearer token to a less-trusted component with lower programmatic authority.
      */
    var includegrantedscopes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If your app will write moments, list the full URI of the types of moments that you intend to write.
      */
    var requestvisibleactions: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The OAuth 2.0 scopes for the APIs that you would like to use as a space-delimited list.
      */
    var scope: js.UndefOr[js.Any] = js.undefined
  }
  object Apppackagename {
    
    inline def apply(): Apppackagename = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Apppackagename]
    }
    
    extension [Self <: Apppackagename](x: Self) {
      
      inline def setApppackagename(value: String): Self = StObject.set(x, "apppackagename", value.asInstanceOf[js.Any])
      
      inline def setApppackagenameUndefined: Self = StObject.set(x, "apppackagename", js.undefined)
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setClientid(value: String): Self = StObject.set(x, "clientid", value.asInstanceOf[js.Any])
      
      inline def setClientidUndefined: Self = StObject.set(x, "clientid", js.undefined)
      
      inline def setCookiepolicy(value: String): Self = StObject.set(x, "cookiepolicy", value.asInstanceOf[js.Any])
      
      inline def setCookiepolicyUndefined: Self = StObject.set(x, "cookiepolicy", js.undefined)
      
      inline def setIncludegrantedscopes(value: Boolean): Self = StObject.set(x, "includegrantedscopes", value.asInstanceOf[js.Any])
      
      inline def setIncludegrantedscopesUndefined: Self = StObject.set(x, "includegrantedscopes", js.undefined)
      
      inline def setRequestvisibleactions(value: js.Any): Self = StObject.set(x, "requestvisibleactions", value.asInstanceOf[js.Any])
      
      inline def setRequestvisibleactionsUndefined: Self = StObject.set(x, "requestvisibleactions", js.undefined)
      
      inline def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait Authuser extends StObject {
    
    var authuser: String
  }
  object Authuser {
    
    inline def apply(authuser: String): Authuser = {
      val __obj = js.Dynamic.literal(authuser = authuser.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authuser]
    }
    
    extension [Self <: Authuser](x: Self) {
      
      inline def setAuthuser(value: String): Self = StObject.set(x, "authuser", value.asInstanceOf[js.Any])
    }
  }
  
  trait Body extends StObject {
    
    var body: String
    
    var headers: js.Array[js.Any]
    
    var status: Double
    
    var statusText: String
  }
  object Body {
    
    inline def apply(body: String, headers: js.Array[js.Any], status: Double, statusText: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Array[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: js.Any*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  trait Callback extends StObject {
    
    def callback(
      /**
      * is the response for this request only. Its format is defined by the API method being called.
      */
    individualResponse: js.Any,
      /**
      * is the raw batch ID-response map as a string. It contains all responses to all requests in the batch.
      */
    rawBatchResponse: js.Any
    ): js.Any
    
    /**
      * Identifies the response for this request in the map of batch responses. If one is not provided, the system generates a random ID.
      */
    var id: String
  }
  object Callback {
    
    inline def apply(callback: (js.Any, js.Any) => js.Any, id: String): Callback = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    extension [Self <: Callback](x: Self) {
      
      inline def setCallback(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Clientid extends StObject {
    
    /**
      * The user to sign in as. -1 to toggle a multi-account chooser, 0 to default to the user's current account, and 1 to automatically sign in if the user is signed into Google Plus.
      */
    var authuser: js.UndefOr[Double] = js.undefined
    
    /**
      * The application's client ID.
      */
    var client_id: js.UndefOr[String] = js.undefined
    
    /**
      * If true, then login uses "immediate mode", which means that the token is refreshed behind the scenes, and no UI is shown to the user.
      */
    var immediate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The OAuth 2.0 response type property. Default: token
      */
    var response_type: js.UndefOr[String] = js.undefined
    
    /**
      * The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation.
      */
    var scope: js.UndefOr[js.Any] = js.undefined
  }
  object Clientid {
    
    inline def apply(): Clientid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Clientid]
    }
    
    extension [Self <: Clientid](x: Self) {
      
      inline def setAuthuser(value: Double): Self = StObject.set(x, "authuser", value.asInstanceOf[js.Any])
      
      inline def setAuthuserUndefined: Self = StObject.set(x, "authuser", js.undefined)
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      inline def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      inline def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
      
      inline def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
