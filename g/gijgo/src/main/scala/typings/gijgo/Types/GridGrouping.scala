package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridGrouping extends StObject {
  
  var groupBy: String
}
object GridGrouping {
  
  inline def apply(groupBy: String): GridGrouping = {
    val __obj = js.Dynamic.literal(groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridGrouping]
  }
  
  extension [Self <: GridGrouping](x: Self) {
    
    inline def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
  }
}
