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
  
  inline def apply(): ReloadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReloadRequest]
  }
  
  extension [Self <: ReloadRequest](x: Self) {
    
    inline def setIgnoreCache(value: Boolean): Self = StObject.set(x, "ignoreCache", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCacheUndefined: Self = StObject.set(x, "ignoreCache", js.undefined)
    
    inline def setScriptToEvaluateOnLoad(value: String): Self = StObject.set(x, "scriptToEvaluateOnLoad", value.asInstanceOf[js.Any])
    
    inline def setScriptToEvaluateOnLoadUndefined: Self = StObject.set(x, "scriptToEvaluateOnLoad", js.undefined)
  }
}
