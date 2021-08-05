package typings.frctlFractal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params extends StObject {
  
  var params: js.Any
  
  var route: View
}
object Params {
  
  inline def apply(params: js.Any, route: View): Params = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
  
  extension [Self <: Params](x: Self) {
    
    inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: View): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
