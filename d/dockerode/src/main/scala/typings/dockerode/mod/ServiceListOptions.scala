package typings.dockerode.mod

import typings.dockerode.anon.Id
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceListOptions extends StObject {
  
  var Filters: Id
  
  var abortSignal: js.UndefOr[AbortSignal] = js.undefined
}
object ServiceListOptions {
  
  inline def apply(Filters: Id): ServiceListOptions = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceListOptions]
  }
  
  extension [Self <: ServiceListOptions](x: Self) {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setFilters(value: Id): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
  }
}
