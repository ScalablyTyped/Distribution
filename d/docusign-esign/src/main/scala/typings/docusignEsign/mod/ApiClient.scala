package typings.docusignEsign.mod

import typings.docusignEsign.anon.BasePath
import typings.docusignEsign.anon.BasePathDEMO
import typings.docusignEsign.anon.CSV
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "ApiClient")
@js.native
open class ApiClient () extends StObject {
  def this(opts: BasePath) = this()
  
  def addDefaultHeader(header: String, value: String): Unit = js.native
  
  def applyAuthToRequest(request: Any, authNames: js.Array[String]): Unit = js.native
  
  def buildCollectionParam(param: js.Array[Any], collectionFormat: Any): js.Array[String] = js.native
  
  def buildUrl(path: String, pathParams: Any): String = js.native
  
  def callApi(
    path: String,
    httpMethod: String,
    pathParams: js.Object,
    queryParams: js.Object,
    headerParams: js.Object,
    formParams: js.Object,
    bodyParam: js.Object,
    authNames: js.Array[String],
    contentTypes: js.Array[String],
    accepts: js.Array[String],
    returnType: Any
  ): js.Promise[Any] = js.native
  def callApi(
    path: String,
    httpMethod: String,
    pathParams: js.Object,
    queryParams: js.Object,
    headerParams: js.Object,
    formParams: js.Object,
    bodyParam: js.Object,
    authNames: js.Array[String],
    contentTypes: js.Array[String],
    accepts: js.Array[String],
    returnType: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Any] = js.native
  
  def deserialize(response: js.Object, returnType: Any): Any = js.native
  
  def generateAccessToken(clientId: String, clientSecret: String, code: String): js.Promise[Any] = js.native
  def generateAccessToken(clientId: String, clientSecret: String, code: String, callback: js.Function0[Unit]): js.Promise[Any] = js.native
  
  def getAuthorizationUri(
    clientId: String,
    scopes: js.Array[String],
    redirectUri: String,
    responseType: String,
    state: String
  ): String = js.native
  
  def getBasePath(): String = js.native
  
  def getJWTUri(clientId: String, redirectURI: String, oAuthBasePath: String): String = js.native
  
  def getOAuthBasePath(): String = js.native
  
  def getUserInfo(accessToken: String): js.Promise[Any] = js.native
  def getUserInfo(accessToken: String, callback: js.Function0[Unit]): js.Promise[Any] = js.native
  
  def hasNoInvalidScopes(scopes: js.Array[String]): Boolean = js.native
  
  def isFileParam(param: Any): Boolean = js.native
  
  def isJsonMime(contentType: String): Boolean = js.native
  
  def jsonPreferredMime(contentTypes: js.Array[String]): String = js.native
  
  def normalizeParams(params: Any): Any = js.native
  
  def paramToString(param: Any): String = js.native
  
  def requestJWTApplicationToken(clientId: String, scopes: js.Array[String], rsaPrivateKey: Buffer, expiresIn: Double): js.Promise[Any] = js.native
  def requestJWTApplicationToken(
    clientId: String,
    scopes: js.Array[String],
    rsaPrivateKey: Buffer,
    expiresIn: Double,
    callback: js.Function0[Unit]
  ): js.Promise[Any] = js.native
  
  def requestJWTUserToken(
    clientId: String,
    userId: String,
    scopes: js.Array[String],
    rsaPrivateKey: Buffer,
    expiresIn: Double
  ): js.Promise[Any] = js.native
  def requestJWTUserToken(
    clientId: String,
    userId: String,
    scopes: js.Array[String],
    rsaPrivateKey: Buffer,
    expiresIn: Double,
    callback: js.Function0[Unit]
  ): js.Promise[Any] = js.native
  
  def setBasePath(basePath: String): Unit = js.native
  
  def setOAuthBasePath(oAuthBasePath: String): Unit = js.native
}
/* static members */
object ApiClient {
  
  @JSImport("docusign-esign", "ApiClient")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("docusign-esign", "ApiClient.CollectionFormatEnum")
  @js.native
  def CollectionFormatEnum: CSV = js.native
  inline def CollectionFormatEnum_=(x: CSV): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CollectionFormatEnum")(x.asInstanceOf[js.Any])
  
  object OAuth {
    
    object BasePath {
      
      @JSImport("docusign-esign", "ApiClient.OAuth.BasePath")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("docusign-esign", "ApiClient.OAuth.BasePath.DEMO")
      @js.native
      def DEMO: String = js.native
      inline def DEMO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEMO")(x.asInstanceOf[js.Any])
      
      @JSImport("docusign-esign", "ApiClient.OAuth.BasePath.PRODUCTION")
      @js.native
      def PRODUCTION: String = js.native
      inline def PRODUCTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRODUCTION")(x.asInstanceOf[js.Any])
      
      @JSImport("docusign-esign", "ApiClient.OAuth.BasePath.STAGE")
      @js.native
      def STAGE: String = js.native
      inline def STAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STAGE")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("docusign-esign", "ApiClient.OAuth.OAuthToken")
    @js.native
    open class OAuthToken () extends StObject {
      
      def constructFromObject(data: Any, obj: Any): Any = js.native
    }
    
    object ResponseType {
      
      @JSImport("docusign-esign", "ApiClient.OAuth.ResponseType")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("docusign-esign", "ApiClient.OAuth.ResponseType.CODE")
      @js.native
      def CODE: String = js.native
      inline def CODE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODE")(x.asInstanceOf[js.Any])
      
      @JSImport("docusign-esign", "ApiClient.OAuth.ResponseType.TOKEN")
      @js.native
      def TOKEN: String = js.native
      inline def TOKEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOKEN")(x.asInstanceOf[js.Any])
    }
    
    object Scope {
      
      @JSImport("docusign-esign", "ApiClient.OAuth.Scope")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("docusign-esign", "ApiClient.OAuth.Scope.EXTENDED")
      @js.native
      def EXTENDED: String = js.native
      inline def EXTENDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTENDED")(x.asInstanceOf[js.Any])
      
      @JSImport("docusign-esign", "ApiClient.OAuth.Scope.IMPERSONATION")
      @js.native
      def IMPERSONATION: String = js.native
      inline def IMPERSONATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMPERSONATION")(x.asInstanceOf[js.Any])
      
      @JSImport("docusign-esign", "ApiClient.OAuth.Scope.SIGNATURE")
      @js.native
      def SIGNATURE: String = js.native
      inline def SIGNATURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGNATURE")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("docusign-esign", "ApiClient.OAuth.UserInfo")
    @js.native
    open class UserInfo () extends StObject {
      
      def constructFromObject(data: Any, obj: Any): Any = js.native
    }
  }
  
  @JSImport("docusign-esign", "ApiClient.RestApi")
  @js.native
  def RestApi: BasePathDEMO = js.native
  inline def RestApi_=(x: BasePathDEMO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RestApi")(x.asInstanceOf[js.Any])
  
  inline def constructFromObject(data: Any, obj: Any, itemType: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("constructFromObject")(data.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], itemType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def convertToType(data: Any, `type`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToType")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseDate(str: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(str.asInstanceOf[js.Any]).asInstanceOf[Date]
}
