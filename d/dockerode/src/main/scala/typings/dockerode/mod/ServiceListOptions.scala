package typings.dockerode.mod

import typings.dockerode.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceListOptions extends StObject {
  
  var Filters: Id
}
object ServiceListOptions {
  
  inline def apply(Filters: Id): ServiceListOptions = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceListOptions]
  }
  
  extension [Self <: ServiceListOptions](x: Self) {
    
    inline def setFilters(value: Id): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
  }
}
