package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gitana extends StObject {
  
  def ajax(
    method: js.Any,
    url: js.Any,
    contentType: js.Any,
    data: js.Any,
    headers: js.Any,
    successCallback: js.Any,
    failureCallback: js.Any
  ): js.Any = js.native
  
  def authenticate(settings: js.Any, authFailureHandler: js.Any): js.Any = js.native
  
  def base(): Unit = js.native
  
  def clearAuthentication(): Unit = js.native
  
  def defaultFailureCallback(http: js.Any): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def getApplicationInfo(): js.Any = js.native
  
  def getAuthInfo(): js.Any = js.native
  
  def getFactory(): js.Any = js.native
  
  def getLocale(): js.Any = js.native
  
  def getStackInfo(): js.Any = js.native
  
  def gitanaDelete(url: js.Any, params: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any = js.native
  
  def gitanaDownload(url: js.Any, params: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any = js.native
  
  def gitanaGet(url: js.Any, params: js.Any, headers: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any = js.native
  
  def gitanaPatch(url: js.Any, params: js.Any, jsonData: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any = js.native
  
  def gitanaPost(url: js.Any, params: js.Any, jsonData: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any = js.native
  
  def gitanaPut(url: js.Any, params: js.Any, jsonData: js.Any, successCallback: js.Any, failureCallback: js.Any): js.Any = js.native
  
  def gitanaRequest(
    method: js.Any,
    url: js.Any,
    params: js.Any,
    contentType: js.Any,
    data: js.Any,
    headers: js.Any,
    successCallback: js.Any,
    failureCallback: js.Any
  ): js.Any = js.native
  
  def gitanaUpload(
    url: js.Any,
    params: js.Any,
    contentType: js.Any,
    data: js.Any,
    successCallback: js.Any,
    failureCallback: js.Any
  ): js.Any = js.native
  
  def refreshAuthentication(callback: js.Any): Unit = js.native
  
  def reloadAuthInfo(callback: js.Any): Unit = js.native
  
  def setLocale(locale: js.Any): Unit = js.native
}
object Gitana {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GitanaMutableBuilder[Self <: Gitana] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAjax(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "ajax", js.Any.fromFunction7(value))
    
    @scala.inline
    def setAuthenticate(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "authenticate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBase(value: () => Unit): Self = StObject.set(x, "base", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearAuthentication(value: () => Unit): Self = StObject.set(x, "clearAuthentication", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultFailureCallback(value: js.Any => Unit): Self = StObject.set(x, "defaultFailureCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetApplicationInfo(value: () => js.Any): Self = StObject.set(x, "getApplicationInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAuthInfo(value: () => js.Any): Self = StObject.set(x, "getAuthInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFactory(value: () => js.Any): Self = StObject.set(x, "getFactory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocale(value: () => js.Any): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStackInfo(value: () => js.Any): Self = StObject.set(x, "getStackInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGitanaDelete(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaDelete", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGitanaDownload(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaDownload", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGitanaGet(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaGet", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGitanaPatch(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaPatch", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGitanaPost(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaPost", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGitanaPut(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaPut", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGitanaRequest(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaRequest", js.Any.fromFunction8(value))
    
    @scala.inline
    def setGitanaUpload(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "gitanaUpload", js.Any.fromFunction6(value))
    
    @scala.inline
    def setRefreshAuthentication(value: js.Any => Unit): Self = StObject.set(x, "refreshAuthentication", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReloadAuthInfo(value: js.Any => Unit): Self = StObject.set(x, "reloadAuthInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLocale(value: js.Any => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
  }
}
