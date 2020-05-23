package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gitana extends js.Object {
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
}

