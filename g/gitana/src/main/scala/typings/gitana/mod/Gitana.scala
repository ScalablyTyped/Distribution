package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gitana extends StObject {
  
  def ajax(
    method: js.Any,
    url: js.Any,
    contentType: js.Any,
    data: js.Any,
    headers: js.Any,
    successCallback: js.Any,
    failureCallback: js.Any
  ): js.Any
  
  def authenticate(settings: js.Any, authFailureHandler: js.Any): js.Any
  
  def base(): Unit
  
  def clearAuthentication(): Unit
  
  def defaultFailureCallback(http: js.Any): Unit
  
  def destroy(): Unit
  
  def getApplicationInfo(): js.Any
  
  def getAuthInfo(): js.Any
  
  def getFactory(): js.Any
  
  def getLocale(): js.Any
  
  def getStackInfo(): js.Any
  
  def gitanaDelete(url: js.Any, params: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any
  
  def gitanaDownload(url: js.Any, params: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any
  
  def gitanaGet(url: js.Any, params: js.Any, headers: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any
  
  def gitanaPatch(url: js.Any, params: js.Any, jsonData: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any
  
  def gitanaPost(url: js.Any, params: js.Any, jsonData: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any
  
  def gitanaPut(url: js.Any, params: js.Any, jsonData: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any
  
  def gitanaRequest(
    method: js.Any,
    url: js.Any,
    params: js.Any,
    contentType: js.Any,
    data: js.Any,
    headers: js.Any,
    successCallback: js.Any,
    failureCallback: js.Any
  ): js.Any
  
  def gitanaUpload(
    url: js.Any,
    params: js.Any,
    contentType: js.Any,
    data: js.Any,
    successCallback: js.Any,
    failureCallback: js.Any
  ): js.Any
  
  def refreshAuthentication(callback: js.Any): Unit
  
  def reloadAuthInfo(callback: js.Any): Unit
  
  def setLocale(locale: js.Any): Unit
}
object Gitana {
  
  inline def apply(
    ajax: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    authenticate: (js.Any, js.Any) => js.Any,
    base: () => Unit,
    clearAuthentication: () => Unit,
    defaultFailureCallback: js.Any => Unit,
    destroy: () => Unit,
    getApplicationInfo: () => js.Any,
    getAuthInfo: () => js.Any,
    getFactory: () => js.Any,
    getLocale: () => js.Any,
    getStackInfo: () => js.Any,
    gitanaDelete: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    gitanaDownload: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    gitanaGet: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    gitanaPatch: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    gitanaPost: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    gitanaPut: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    gitanaRequest: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    gitanaUpload: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    refreshAuthentication: js.Any => Unit,
    reloadAuthInfo: js.Any => Unit,
    setLocale: js.Any => Unit
  ): Gitana = {
    val __obj = js.Dynamic.literal(ajax = js.Any.fromFunction7(ajax), authenticate = js.Any.fromFunction2(authenticate), base = js.Any.fromFunction0(base), clearAuthentication = js.Any.fromFunction0(clearAuthentication), defaultFailureCallback = js.Any.fromFunction1(defaultFailureCallback), destroy = js.Any.fromFunction0(destroy), getApplicationInfo = js.Any.fromFunction0(getApplicationInfo), getAuthInfo = js.Any.fromFunction0(getAuthInfo), getFactory = js.Any.fromFunction0(getFactory), getLocale = js.Any.fromFunction0(getLocale), getStackInfo = js.Any.fromFunction0(getStackInfo), gitanaDelete = js.Any.fromFunction4(gitanaDelete), gitanaDownload = js.Any.fromFunction4(gitanaDownload), gitanaGet = js.Any.fromFunction5(gitanaGet), gitanaPatch = js.Any.fromFunction5(gitanaPatch), gitanaPost = js.Any.fromFunction5(gitanaPost), gitanaPut = js.Any.fromFunction5(gitanaPut), gitanaRequest = js.Any.fromFunction8(gitanaRequest), gitanaUpload = js.Any.fromFunction6(gitanaUpload), refreshAuthentication = js.Any.fromFunction1(refreshAuthentication), reloadAuthInfo = js.Any.fromFunction1(reloadAuthInfo), setLocale = js.Any.fromFunction1(setLocale))
    __obj.asInstanceOf[Gitana]
  }
  
  extension [Self <: Gitana](x: Self) {
    
    inline def setAjax(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "ajax", js.Any.fromFunction7(value))
    
    inline def setAuthenticate(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "authenticate", js.Any.fromFunction2(value))
    
    inline def setBase(value: () => Unit): Self = StObject.set(x, "base", js.Any.fromFunction0(value))
    
    inline def setClearAuthentication(value: () => Unit): Self = StObject.set(x, "clearAuthentication", js.Any.fromFunction0(value))
    
    inline def setDefaultFailureCallback(value: js.Any => Unit): Self = StObject.set(x, "defaultFailureCallback", js.Any.fromFunction1(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetApplicationInfo(value: () => js.Any): Self = StObject.set(x, "getApplicationInfo", js.Any.fromFunction0(value))
    
    inline def setGetAuthInfo(value: () => js.Any): Self = StObject.set(x, "getAuthInfo", js.Any.fromFunction0(value))
    
    inline def setGetFactory(value: () => js.Any): Self = StObject.set(x, "getFactory", js.Any.fromFunction0(value))
    
    inline def setGetLocale(value: () => js.Any): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
    
    inline def setGetStackInfo(value: () => js.Any): Self = StObject.set(x, "getStackInfo", js.Any.fromFunction0(value))
    
    inline def setGitanaDelete(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaDelete", js.Any.fromFunction4(value))
    
    inline def setGitanaDownload(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaDownload", js.Any.fromFunction4(value))
    
    inline def setGitanaGet(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaGet", js.Any.fromFunction5(value))
    
    inline def setGitanaPatch(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaPatch", js.Any.fromFunction5(value))
    
    inline def setGitanaPost(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaPost", js.Any.fromFunction5(value))
    
    inline def setGitanaPut(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaPut", js.Any.fromFunction5(value))
    
    inline def setGitanaRequest(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaRequest", js.Any.fromFunction8(value))
    
    inline def setGitanaUpload(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaUpload", js.Any.fromFunction6(value))
    
    inline def setRefreshAuthentication(value: js.Any => Unit): Self = StObject.set(x, "refreshAuthentication", js.Any.fromFunction1(value))
    
    inline def setReloadAuthInfo(value: js.Any => Unit): Self = StObject.set(x, "reloadAuthInfo", js.Any.fromFunction1(value))
    
    inline def setSetLocale(value: js.Any => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
  }
}
