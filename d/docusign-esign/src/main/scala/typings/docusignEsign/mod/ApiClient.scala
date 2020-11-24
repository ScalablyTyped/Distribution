package typings.docusignEsign.mod

import typings.docusignEsign.anon.BasePath
import typings.docusignEsign.anon.BasePathDEMO
import typings.docusignEsign.anon.CSV
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "ApiClient")
@js.native
class ApiClient protected () extends js.Object {
  def this(opts: BasePath) = this()
  
  def addDefaultHeader(header: String, value: String): Unit = js.native
  
  def applyAuthToRequest(request: js.Any, authNames: js.Array[String]): Unit = js.native
  
  def buildCollectionParam(param: js.Array[_], collectionFormat: js.Any): js.Array[String] = js.native
  
  def buildUrl(path: String, pathParams: js.Any): String = js.native
  
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
    returnType: js.Any
  ): js.Promise[_] = js.native
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
    returnType: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[_] = js.native
  
  def deserialize(response: js.Object, returnType: js.Any): js.Any = js.native
  
  def generateAccessToken(clientId: String, clientSecret: String, code: String): js.Promise[_] = js.native
  def generateAccessToken(clientId: String, clientSecret: String, code: String, callback: js.Function0[Unit]): js.Promise[_] = js.native
  
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
  
  def getUserInfo(accessToken: String): js.Promise[_] = js.native
  def getUserInfo(accessToken: String, callback: js.Function0[Unit]): js.Promise[_] = js.native
  
  def hasNoInvalidScopes(scopes: js.Array[String]): Boolean = js.native
  
  def isFileParam(param: js.Any): Boolean = js.native
  
  def isJsonMime(contentType: String): Boolean = js.native
  
  def jsonPreferredMime(contentTypes: js.Array[String]): String = js.native
  
  def normalizeParams(params: js.Any): js.Any = js.native
  
  def paramToString(param: js.Any): String = js.native
  
  def requestJWTApplicationToken(clientId: String, scopes: js.Array[String], rsaPrivateKey: Buffer, expiresIn: Double): js.Promise[_] = js.native
  def requestJWTApplicationToken(
    clientId: String,
    scopes: js.Array[String],
    rsaPrivateKey: Buffer,
    expiresIn: Double,
    callback: js.Function0[Unit]
  ): js.Promise[_] = js.native
  
  def requestJWTUserToken(
    clientId: String,
    userId: String,
    scopes: js.Array[String],
    rsaPrivateKey: Buffer,
    expiresIn: Double
  ): js.Promise[_] = js.native
  def requestJWTUserToken(
    clientId: String,
    userId: String,
    scopes: js.Array[String],
    rsaPrivateKey: Buffer,
    expiresIn: Double,
    callback: js.Function0[Unit]
  ): js.Promise[_] = js.native
  
  def setBasePath(basePath: String): Unit = js.native
  
  def setOAuthBasePath(oAuthBasePath: String): Unit = js.native
}
/* static members */
@JSImport("docusign-esign", "ApiClient")
@js.native
object ApiClient extends js.Object {
  
  var CollectionFormatEnum: CSV = js.native
  
  var RestApi: BasePathDEMO = js.native
  
  def constructFromObject(data: js.Any, obj: js.Any, itemType: js.Any): Unit = js.native
  
  def convertToType(data: js.Any, `type`: js.Any): js.Any = js.native
  
  def parseDate(str: String): Date = js.native
  
  @js.native
  object OAuth extends js.Object {
    
    @js.native
    object BasePath extends js.Object {
      
      var DEMO: String = js.native
      
      var PRODUCTION: String = js.native
      
      var STAGE: String = js.native
    }
    
    @js.native
    class OAuthToken () extends js.Object {
      
      def constructFromObject(data: js.Any, obj: js.Any): js.Any = js.native
    }
    
    @js.native
    object ResponseType extends js.Object {
      
      var CODE: String = js.native
      
      var TOKEN: String = js.native
    }
    
    @js.native
    object Scope extends js.Object {
      
      var EXTENDED: String = js.native
      
      var IMPERSONATION: String = js.native
      
      var SIGNATURE: String = js.native
    }
    
    @js.native
    class UserInfo () extends js.Object {
      
      def constructFromObject(data: js.Any, obj: js.Any): js.Any = js.native
    }
  }
}
