package typings.dockerode.mod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceListOptions extends StObject {
  
  var abortSignal: js.UndefOr[AbortSignal] = js.undefined
  
  var filters: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[Boolean] = js.undefined
}
object ServiceListOptions {
  
  inline def apply(): ServiceListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceListOptions]
  }
  
  extension [Self <: ServiceListOptions](x: Self) {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
