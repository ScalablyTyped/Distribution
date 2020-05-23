package typings.gitana.mod

import typings.gitana.anon.BaseURL
import typings.gitana.anon.Name
import typings.gitana.anon.TYPEACCESSPOLICY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", JSImport.Namespace)
@js.native
class ^ protected () extends Gitana {
  def this(settings: js.Any) = this()
  /* CompleteClass */
  override def ajax(
    method: js.Any,
    url: js.Any,
    contentType: js.Any,
    data: js.Any,
    headers: js.Any,
    successCallback: js.Any,
    failureCallback: js.Any
  ): js.Any = js.native
  /* CompleteClass */
  override def authenticate(settings: js.Any, authFailureHandler: js.Any): js.Any = js.native
  /* CompleteClass */
  override def base(): Unit = js.native
  /* CompleteClass */
  override def clearAuthentication(): Unit = js.native
  /* CompleteClass */
  override def defaultFailureCallback(http: js.Any): Unit = js.native
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def getApplicationInfo(): js.Any = js.native
  /* CompleteClass */
  override def getAuthInfo(): js.Any = js.native
  /* CompleteClass */
  override def getFactory(): js.Any = js.native
  /* CompleteClass */
  override def getLocale(): js.Any = js.native
  /* CompleteClass */
  override def getStackInfo(): js.Any = js.native
  /* CompleteClass */
  override def gitanaDelete(url: js.Any, params: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any = js.native
  /* CompleteClass */
  override def gitanaDownload(url: js.Any, params: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any = js.native
  /* CompleteClass */
  override def gitanaGet(url: js.Any, params: js.Any, headers: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any = js.native
  /* CompleteClass */
  override def gitanaPatch(url: js.Any, params: js.Any, jsonData: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any = js.native
  /* CompleteClass */
  override def gitanaPost(url: js.Any, params: js.Any, jsonData: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any = js.native
  /* CompleteClass */
  override def gitanaPut(url: js.Any, params: js.Any, jsonData: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any = js.native
  /* CompleteClass */
  override def gitanaRequest(
    method: js.Any,
    url: js.Any,
    params: js.Any,
    contentType: js.Any,
    data: js.Any,
    headers: js.Any,
    successCallback: js.Any,
    failureCallback: js.Any
  ): js.Any = js.native
  /* CompleteClass */
  override def gitanaUpload(
    url: js.Any,
    params: js.Any,
    contentType: js.Any,
    data: js.Any,
    successCallback: js.Any,
    failureCallback: js.Any
  ): js.Any = js.native
  /* CompleteClass */
  override def refreshAuthentication(callback: js.Any): Unit = js.native
  /* CompleteClass */
  override def reloadAuthInfo(callback: js.Any): Unit = js.native
  /* CompleteClass */
  override def setLocale(locale: js.Any): Unit = js.native
}

@JSImport("gitana", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var AUTO_UPGRADE_TO_CLOUDFRONT: Boolean = js.native
  var CSRF_COOKIE_NAMES: js.Array[String] = js.native
  var CSRF_HEADER_NAME: String = js.native
  var CSRF_TOKEN: js.Any = js.native
  var DEFAULT_CONFIG: BaseURL = js.native
  var DEFAULT_LOCALE: js.Any = js.native
  var EVERYONE: Name = js.native
  var HTTP_TIMEOUT: Double = js.native
  var HTTP_WORK_QUEUE_SIZE: Double = js.native
  var HTTP_X_CLOUDCMS_ORIGIN_HEADER: Boolean = js.native
  var PREFER_GET_OVER_POST: Boolean = js.native
  var TypedIDConstants: TYPEACCESSPOLICY = js.native
  var VERSION: String = js.native
  var XHR_WITH_CREDENTIALS: Boolean = js.native
  var requestCount: Double = js.native
  var uniqueIdCounter: Double = js.native
  def HTTP_TIMEOUT_FN(xhr: js.Any, method: js.Any, url: js.Any): Unit = js.native
  def HTTP_XHR_FACTORY(): js.Any = js.native
  def MemoryCache(): js.Any = js.native
  def PLATFORM_CACHE(k: js.Any, v: js.Any): js.Any = js.native
  def Promise(defer: js.Any): js.Any = js.native
  def REFRESH_TOKEN_FAILURE_FN(http: js.Any): Unit = js.native
  def WorkQueue(maxSize: js.Any): js.Any = js.native
  def btoa(string: js.Any): js.Any = js.native
  def configureRequestHeaders(method: js.Any, url: js.Any, headers: js.Any, options: js.Any): Unit = js.native
  def connect(config: String, callback: gitanaCallback[AppHelper]): AppHelper = js.native
  def connect(config: connectionObject, callback: gitanaCallback[AppHelper]): AppHelper = js.native
  def contains(a: js.Any, obj: js.Any): js.Any = js.native
  def copyInto(target: js.Any, source: js.Any): Unit = js.native
  def copyKeepers(target: js.Any, source: js.Any): Unit = js.native
  def debug(str: js.Any): Unit = js.native
  def defaultErrorHandler(err: js.Any): Unit = js.native
  def deleteCookie(name: js.Any, path: js.Any): js.Any = js.native
  def deleteProperties(`object`: js.Any, deleteFunctions: js.Any): Unit = js.native
  def determinePlatformCacheKey(config: js.Any, fallbackToDefault: js.Any): js.Any = js.native
  def disconnect(key: js.Any, expireAccessToken: js.Any): Unit = js.native
  def error(str: js.Any): Unit = js.native
  def escape(text: js.Any): js.Any = js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def generateId(): js.Any = js.native
  def getCurrentHashStringParameter(paramName: js.Any): js.Any = js.native
  def getCurrentQueryStringParameter(paramName: js.Any): js.Any = js.native
  def getNumberOfKeys(map: js.Any): js.Any = js.native
  def handleJobCompletion(chain: js.Any, cluster: js.Any, jobId: js.Any, synchronous: js.Any, reportFn: js.Any): js.Any = js.native
  def implement(args: js.Any*): js.Any = js.native
  def isArray(obj: js.Any): js.Any = js.native
  def isBoolean(arg: js.Any): js.Any = js.native
  def isElement(o: js.Any): js.Any = js.native
  def isEmpty(obj: js.Any): js.Any = js.native
  def isFunction(arg: js.Any): js.Any = js.native
  def isNode(o: js.Any): js.Any = js.native
  def isNumber(arg: js.Any): js.Any = js.native
  def isObject(obj: js.Any): js.Any = js.native
  def isString(arg: js.Any): js.Any = js.native
  def isUndefined(obj: js.Any): js.Any = js.native
  def loadDefaultConfig(): js.Any = js.native
  def makeArray(args: js.Any): js.Any = js.native
  def readCookie(name: js.Any): js.Any = js.native
  def reset(): Unit = js.native
  def stampInto(target: js.Any, source: js.Any): Unit = js.native
  def startsWith(text: js.Any, prefix: js.Any): js.Any = js.native
  def streamDownload(attachment: js.Any, callback: js.Any): Unit = js.native
  def streamUpload(driver: js.Any, readStream: js.Any, uploadUri: js.Any, contentType: js.Any, callback: js.Any): js.Any = js.native
  def stringify(`object`: js.Any, pretty: js.Any): js.Any = js.native
  def toCopyDependencyChain(typedID: js.Any): js.Any = js.native
  def toDependencyObject(typedID: js.Any): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
  def writeCookie(name: js.Any, value: js.Any, path: js.Any, days: js.Any, domain: js.Any): Unit = js.native
}

