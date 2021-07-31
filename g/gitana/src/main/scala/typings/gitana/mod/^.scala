package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", JSImport.Namespace)
@js.native
class ^ protected ()
  extends StObject
     with Gitana {
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
object ^ extends StObject
