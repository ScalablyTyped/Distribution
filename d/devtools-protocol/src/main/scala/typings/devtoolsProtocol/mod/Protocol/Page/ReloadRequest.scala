package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReloadRequest extends StObject {
  
  /**
    * If true, browser cache is ignored (as if the user pressed Shift+refresh).
    */
  var ignoreCache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set, the script will be injected into all frames of the inspected page after reload.
    * Argument will be ignored if reloading dataURL origin.
    */
  var scriptToEvaluateOnLoad: js.UndefOr[String] = js.undefined
}
object ReloadRequest {
  
  @scala.inline
  def apply(): ReloadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReloadRequest]
  }
  
  @scala.inline
  implicit class ReloadRequestMutableBuilder[Self <: ReloadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreCache(value: Boolean): Self = StObject.set(x, "ignoreCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCacheUndefined: Self = StObject.set(x, "ignoreCache", js.undefined)
    
    @scala.inline
    def setScriptToEvaluateOnLoad(value: String): Self = StObject.set(x, "scriptToEvaluateOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptToEvaluateOnLoadUndefined: Self = StObject.set(x, "scriptToEvaluateOnLoad", js.undefined)
  }
}
