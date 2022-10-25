package typings.fusebitOauthConnector

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Router
import typings.fusebitAddOnSdk.mod.FusebitContext
import typings.fusebitOauthConnector.anon.Accesstoken
import typings.fusebitOauthConnector.anon.ConnectorBaseUrl
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fusebit/oauth-connector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fusebit/oauth-connector", "OAuthConnector")
  @js.native
  open class OAuthConnector () extends StObject {
    
    /**
      * Creates Express middleware that authorizes the call using Fusebit security. For example, the following will only execute
      * the Express handler if the access token supplied by the caller has the function:execute permission on the function resource.
      *
      * app.get('/myendpoint',
      *   authorize({
      *     action: 'function:execute',
      *     resourceFactory: req => `/account/${req.fusebit.accountId}/subscription/${req.fusebit.subscriptionId}/boundary/${req.fusebit.boundaryId}/function/${req.fusebit.functionId}/myendpoint/`
      *   }),
      *   handler
      * );
      *
      * @param param Object with action and resourceFactory properties
      */
    def authorize(params: AuthorizeParams): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    /**
      * Deletes user context from storage.
      *
      * @async
      * @param fusebitContext The Fusebit context
      * @param vendorUserId The vendor user id
      * @param vendorId If specified, vendorUserId represents the identity of the user in another system.
      * The vendorId must correspond to an entry in userContext.foreignOAuthIdentities.
      */
    def deleteUser(fusebitContext: FusebitContext, vendorUserId: String): js.Promise[Unit] = js.native
    def deleteUser(fusebitContext: FusebitContext, vendorUserId: String, vendorId: String): js.Promise[Unit] = js.native
    
    /**
      * Returns a valid access token to the vendor's system representing the vendor's user described by the userContext,
      * or a valid access token to a foreign system if foreignVendorId is specified.
      * For the vendor's system, if the currently stored access token is expired or nearing expiry, and a refresh token is available, a new access
      * token is obtained, stored for future use, and returned. If a current access token cannot be returned, an exception is thrown.
      *
      * @async
      * @param fusebitContext The Fusebit context of the request
      * @param userContext The vendor user context
      * @param foreignVendorId If specified, gets a valid access token for the OAuth connector identified by the
      * foreignVendorId entry in the userContext.foreignOAuthIdentities rather than a user of this connector.
      */
    def ensureAccessToken(fusebitContext: FusebitContext, userContext: UserContext[js.Object]): js.Promise[OAuthTokenResponse] = js.native
    def ensureAccessToken(fusebitContext: FusebitContext, userContext: UserContext[js.Object], foreignVendorId: String): js.Promise[OAuthTokenResponse] = js.native
    
    /**
      * Gets the user context representing the user with vendorUserId id. Returned object contains vendorToken and vendorUserProfile properties.
      *
      * @async
      * @param fusebitContext The Fusebit context
      * @param vendorUserId The vendor user id
      * @param foreignVendorId If specified, vendorUserId represents the identity of the user in another system.
      * The foreignVendorId must correspond to an entry in userContext.foreignOAuthIdentities.
      */
    def getUser(fusebitContext: FusebitContext, vendorUserId: String): js.Promise[UserContext[js.Object]] = js.native
    def getUser(fusebitContext: FusebitContext, vendorUserId: String, foreignVendorId: String): js.Promise[UserContext[js.Object]] = js.native
    
    /**
      * Returns a string uniquely identifying the user in vendor's system. Typically this is a property of
      * userContext.vendorUserProfile. Default implementation is opportunistically returning userContext.vendorUserProfile.id
      * if it exists.
      *
      * @async
      * @param userContext The user context representing the vendor's user. Contains vendorToken and vendorUserProfile, representing responses
      * from getAccessToken and getUserProfile, respectively.
      */
    def getUserId(userContext: UserContext[js.Object]): js.Promise[String] = js.native
    
    /**
      * Called during connector initialization to allow the connector to register additional, application-specific
      * routes on the provided Express router.
      *
      * @param Express router
      */
    def onCreate(app: Router): Unit = js.native
    
    /**
      * Called after a new user successfuly completed a configuration flow and was persisted in the system. This extensibility
      * point allows for creation of any artifacts required to serve this new user, for example creation of additional
      * Fusebit functions.
      *
      * @async
      * @param fusebitContext The Fusebit context of the request
      * @param userContext The user context representing the vendor's user. Contains vendorToken and vendorUserProfile, representing responses
      * from getAccessToken and getUserProfile, respectively.
      */
    def onNewUser(fusebitContext: FusebitContext, userContext: UserContext[js.Object]): js.Promise[Unit] = js.native
    
    /**
      * Saves user context in storage for future use.
      *
      * @async
      * @param fusebitContext The Fusebit context of the request
      * @param userContext The user context representing the vendor's user. Contains vendorToken and vendorUserProfile, representing responses
      * from getAccessToken and getUserProfile, respectively.
      */
    def saveUser(fusebitContext: FusebitContext, userContext: UserContext[js.Object]): js.Promise[UserContext[js.Object]] = js.native
  }
  
  inline def createOAuthConnector(vendorConnector: OAuthConnector): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOAuthConnector")(vendorConnector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  trait AuthorizeParams extends StObject {
    
    var action: String
    
    def resourceFactory(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): String
  }
  object AuthorizeParams {
    
    inline def apply(
      action: String,
      resourceFactory: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ] => String
    ): AuthorizeParams = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], resourceFactory = js.Any.fromFunction1(resourceFactory))
      __obj.asInstanceOf[AuthorizeParams]
    }
    
    extension [Self <: AuthorizeParams](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setResourceFactory(
        value: Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => String
      ): Self = StObject.set(x, "resourceFactory", js.Any.fromFunction1(value))
    }
  }
  
  trait OAuthTokenResponse extends StObject {
    
    var access_token: String
    
    var expires_in: String
    
    var refresh_token: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var token_type: String
  }
  object OAuthTokenResponse {
    
    inline def apply(access_token: String, expires_in: String, token_type: String): OAuthTokenResponse = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuthTokenResponse]
    }
    
    extension [Self <: OAuthTokenResponse](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: String): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserContext[TVendorUserProfile] extends StObject {
    
    var foreignOAuthIdentities: StringDictionary[ConnectorBaseUrl]
    
    var status: js.UndefOr[String] = js.undefined
    
    var timestamp: Double
    
    var vendorToken: js.UndefOr[Accesstoken] = js.undefined
    
    var vendorUserId: String
    
    var vendorUserProfile: TVendorUserProfile
  }
  object UserContext {
    
    inline def apply[TVendorUserProfile](
      foreignOAuthIdentities: StringDictionary[ConnectorBaseUrl],
      timestamp: Double,
      vendorUserId: String,
      vendorUserProfile: TVendorUserProfile
    ): UserContext[TVendorUserProfile] = {
      val __obj = js.Dynamic.literal(foreignOAuthIdentities = foreignOAuthIdentities.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], vendorUserId = vendorUserId.asInstanceOf[js.Any], vendorUserProfile = vendorUserProfile.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserContext[TVendorUserProfile]]
    }
    
    extension [Self <: UserContext[?], TVendorUserProfile](x: Self & UserContext[TVendorUserProfile]) {
      
      inline def setForeignOAuthIdentities(value: StringDictionary[ConnectorBaseUrl]): Self = StObject.set(x, "foreignOAuthIdentities", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setVendorToken(value: Accesstoken): Self = StObject.set(x, "vendorToken", value.asInstanceOf[js.Any])
      
      inline def setVendorTokenUndefined: Self = StObject.set(x, "vendorToken", js.undefined)
      
      inline def setVendorUserId(value: String): Self = StObject.set(x, "vendorUserId", value.asInstanceOf[js.Any])
      
      inline def setVendorUserProfile(value: TVendorUserProfile): Self = StObject.set(x, "vendorUserProfile", value.asInstanceOf[js.Any])
    }
  }
}
