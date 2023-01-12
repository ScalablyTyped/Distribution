package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gitana extends StObject {
  
  def ajax(
    method: Any,
    url: Any,
    contentType: Any,
    data: Any,
    headers: Any,
    successCallback: Any,
    failureCallback: Any
  ): Any
  
  def authenticate(settings: Any, authFailureHandler: Any): Any
  
  def base(): Unit
  
  def clearAuthentication(): Unit
  
  def defaultFailureCallback(http: Any): Unit
  
  def destroy(): Unit
  
  def getApplicationInfo(): Any
  
  def getAuthInfo(): Any
  
  def getFactory(): Any
  
  def getLocale(): Any
  
  def getStackInfo(): Any
  
  def gitanaDelete(url: Any, params: Any, successCallback: Any, failureCallback: Any): Any
  
  def gitanaDownload(url: Any, params: Any, successCallback: Any, failureCallback: Any): Any
  
  def gitanaGet(url: Any, params: Any, headers: Any, successCallback: Any, failureCallback: Any): Any
  
  def gitanaPatch(url: Any, params: Any, jsonData: Any, successCallback: Any, failureCallback: Any): Any
  
  def gitanaPost(url: Any, params: Any, jsonData: Any, successCallback: Any, failureCallback: Any): Any
  
  def gitanaPut(url: Any, params: Any, jsonData: Any, successCallback: Any, failureCallback: Any): Any
  
  def gitanaRequest(
    method: Any,
    url: Any,
    params: Any,
    contentType: Any,
    data: Any,
    headers: Any,
    successCallback: Any,
    failureCallback: Any
  ): Any
  
  def gitanaUpload(url: Any, params: Any, contentType: Any, data: Any, successCallback: Any, failureCallback: Any): Any
  
  def refreshAuthentication(callback: Any): Unit
  
  def reloadAuthInfo(callback: Any): Unit
  
  def setLocale(locale: Any): Unit
}
object Gitana {
  
  inline def apply(
    ajax: (Any, Any, Any, Any, Any, Any, Any) => Any,
    authenticate: (Any, Any) => Any,
    base: () => Unit,
    clearAuthentication: () => Unit,
    defaultFailureCallback: Any => Unit,
    destroy: () => Unit,
    getApplicationInfo: () => Any,
    getAuthInfo: () => Any,
    getFactory: () => Any,
    getLocale: () => Any,
    getStackInfo: () => Any,
    gitanaDelete: (Any, Any, Any, Any) => Any,
    gitanaDownload: (Any, Any, Any, Any) => Any,
    gitanaGet: (Any, Any, Any, Any, Any) => Any,
    gitanaPatch: (Any, Any, Any, Any, Any) => Any,
    gitanaPost: (Any, Any, Any, Any, Any) => Any,
    gitanaPut: (Any, Any, Any, Any, Any) => Any,
    gitanaRequest: (Any, Any, Any, Any, Any, Any, Any, Any) => Any,
    gitanaUpload: (Any, Any, Any, Any, Any, Any) => Any,
    refreshAuthentication: Any => Unit,
    reloadAuthInfo: Any => Unit,
    setLocale: Any => Unit
  ): Gitana = {
    val __obj = js.Dynamic.literal(ajax = js.Any.fromFunction7(ajax), authenticate = js.Any.fromFunction2(authenticate), base = js.Any.fromFunction0(base), clearAuthentication = js.Any.fromFunction0(clearAuthentication), defaultFailureCallback = js.Any.fromFunction1(defaultFailureCallback), destroy = js.Any.fromFunction0(destroy), getApplicationInfo = js.Any.fromFunction0(getApplicationInfo), getAuthInfo = js.Any.fromFunction0(getAuthInfo), getFactory = js.Any.fromFunction0(getFactory), getLocale = js.Any.fromFunction0(getLocale), getStackInfo = js.Any.fromFunction0(getStackInfo), gitanaDelete = js.Any.fromFunction4(gitanaDelete), gitanaDownload = js.Any.fromFunction4(gitanaDownload), gitanaGet = js.Any.fromFunction5(gitanaGet), gitanaPatch = js.Any.fromFunction5(gitanaPatch), gitanaPost = js.Any.fromFunction5(gitanaPost), gitanaPut = js.Any.fromFunction5(gitanaPut), gitanaRequest = js.Any.fromFunction8(gitanaRequest), gitanaUpload = js.Any.fromFunction6(gitanaUpload), refreshAuthentication = js.Any.fromFunction1(refreshAuthentication), reloadAuthInfo = js.Any.fromFunction1(reloadAuthInfo), setLocale = js.Any.fromFunction1(setLocale))
    __obj.asInstanceOf[Gitana]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gitana] (val x: Self) extends AnyVal {
    
    inline def setAjax(value: (Any, Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "ajax", js.Any.fromFunction7(value))
    
    inline def setAuthenticate(value: (Any, Any) => Any): Self = StObject.set(x, "authenticate", js.Any.fromFunction2(value))
    
    inline def setBase(value: () => Unit): Self = StObject.set(x, "base", js.Any.fromFunction0(value))
    
    inline def setClearAuthentication(value: () => Unit): Self = StObject.set(x, "clearAuthentication", js.Any.fromFunction0(value))
    
    inline def setDefaultFailureCallback(value: Any => Unit): Self = StObject.set(x, "defaultFailureCallback", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetApplicationInfo(value: () => Any): Self = StObject.set(x, "getApplicationInfo", js.Any.fromFunction0(value))
    
    inline def setGetAuthInfo(value: () => Any): Self = StObject.set(x, "getAuthInfo", js.Any.fromFunction0(value))
    
    inline def setGetFactory(value: () => Any): Self = StObject.set(x, "getFactory", js.Any.fromFunction0(value))
    
    inline def setGetLocale(value: () => Any): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
    
    inline def setGetStackInfo(value: () => Any): Self = StObject.set(x, "getStackInfo", js.Any.fromFunction0(value))
    
    inline def setGitanaDelete(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaDelete", js.Any.fromFunction4(value))
    
    inline def setGitanaDownload(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaDownload", js.Any.fromFunction4(value))
    
    inline def setGitanaGet(value: (Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaGet", js.Any.fromFunction5(value))
    
    inline def setGitanaPatch(value: (Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaPatch", js.Any.fromFunction5(value))
    
    inline def setGitanaPost(value: (Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaPost", js.Any.fromFunction5(value))
    
    inline def setGitanaPut(value: (Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaPut", js.Any.fromFunction5(value))
    
    inline def setGitanaRequest(value: (Any, Any, Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaRequest", js.Any.fromFunction8(value))
    
    inline def setGitanaUpload(value: (Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "gitanaUpload", js.Any.fromFunction6(value))
    
    inline def setRefreshAuthentication(value: Any => Unit): Self = StObject.set(x, "refreshAuthentication", js.Any.fromFunction1(value))
    
    inline def setReloadAuthInfo(value: Any => Unit): Self = StObject.set(x, "reloadAuthInfo", js.Any.fromFunction1(value))
    
    inline def setSetLocale(value: Any => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
  }
}
