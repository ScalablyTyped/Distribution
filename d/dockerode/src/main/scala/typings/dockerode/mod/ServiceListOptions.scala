package typings.dockerode.mod

import typings.dockerode.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceListOptions extends StObject {
  
  var Filters: Id
}
object ServiceListOptions {
  
  @scala.inline
  def apply(Filters: Id): ServiceListOptions = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceListOptions]
  }
  
  @scala.inline
  implicit class ServiceListOptionsMutableBuilder[Self <: ServiceListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: Id): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
  }
}
