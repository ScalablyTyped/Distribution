package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDebuggerDebuggeesList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The client version making the call. Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    */
  var clientVersion: js.UndefOr[String] = js.undefined
  
  /**
    * When set to `true`, the result includes all debuggees. Otherwise, the result includes only debuggees that are active.
    */
  var includeInactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. Project number of a Google Cloud project whose debuggees to list.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceDebuggerDebuggeesList {
  
  inline def apply(): ParamsResourceDebuggerDebuggeesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDebuggerDebuggeesList]
  }
  
  extension [Self <: ParamsResourceDebuggerDebuggeesList](x: Self) {
    
    inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    inline def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
    
    inline def setIncludeInactive(value: Boolean): Self = StObject.set(x, "includeInactive", value.asInstanceOf[js.Any])
    
    inline def setIncludeInactiveUndefined: Self = StObject.set(x, "includeInactive", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
