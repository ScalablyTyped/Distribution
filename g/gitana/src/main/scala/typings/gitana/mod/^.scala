package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", JSImport.Namespace)
@js.native
open class ^ protected ()
  extends StObject
     with Gitana {
  def this(settings: Any) = this()
  
  /* CompleteClass */
  override def ajax(
    method: Any,
    url: Any,
    contentType: Any,
    data: Any,
    headers: Any,
    successCallback: Any,
    failureCallback: Any
  ): Any = js.native
  
  /* CompleteClass */
  override def authenticate(settings: Any, authFailureHandler: Any): Any = js.native
  
  /* CompleteClass */
  override def base(): Unit = js.native
  
  /* CompleteClass */
  override def clearAuthentication(): Unit = js.native
  
  /* CompleteClass */
  override def defaultFailureCallback(http: Any): Unit = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* CompleteClass */
  override def getApplicationInfo(): Any = js.native
  
  /* CompleteClass */
  override def getAuthInfo(): Any = js.native
  
  /* CompleteClass */
  override def getFactory(): Any = js.native
  
  /* CompleteClass */
  override def getLocale(): Any = js.native
  
  /* CompleteClass */
  override def getStackInfo(): Any = js.native
  
  /* CompleteClass */
  override def gitanaDelete(url: Any, params: Any, successCallback: Any, failureCallback: Any): Any = js.native
  
  /* CompleteClass */
  override def gitanaDownload(url: Any, params: Any, successCallback: Any, failureCallback: Any): Any = js.native
  
  /* CompleteClass */
  override def gitanaGet(url: Any, params: Any, headers: Any, successCallback: Any, failureCallback: Any): Any = js.native
  
  /* CompleteClass */
  override def gitanaPatch(url: Any, params: Any, jsonData: Any, successCallback: Any, failureCallback: Any): Any = js.native
  
  /* CompleteClass */
  override def gitanaPost(url: Any, params: Any, jsonData: Any, successCallback: Any, failureCallback: Any): Any = js.native
  
  /* CompleteClass */
  override def gitanaPut(url: Any, params: Any, jsonData: Any, successCallback: Any, failureCallback: Any): Any = js.native
  
  /* CompleteClass */
  override def gitanaRequest(
    method: Any,
    url: Any,
    params: Any,
    contentType: Any,
    data: Any,
    headers: Any,
    successCallback: Any,
    failureCallback: Any
  ): Any = js.native
  
  /* CompleteClass */
  override def gitanaUpload(url: Any, params: Any, contentType: Any, data: Any, successCallback: Any, failureCallback: Any): Any = js.native
  
  /* CompleteClass */
  override def refreshAuthentication(callback: Any): Unit = js.native
  
  /* CompleteClass */
  override def reloadAuthInfo(callback: Any): Unit = js.native
  
  /* CompleteClass */
  override def setLocale(locale: Any): Unit = js.native
}
@JSImport("gitana", JSImport.Namespace)
@js.native
object ^ extends StObject
