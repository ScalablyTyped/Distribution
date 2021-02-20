package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridGrouping extends StObject {
  
  var groupBy: String = js.native
}
object GridGrouping {
  
  @scala.inline
  def apply(groupBy: String): GridGrouping = {
    val __obj = js.Dynamic.literal(groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridGrouping]
  }
  
  @scala.inline
  implicit class GridGroupingMutableBuilder[Self <: GridGrouping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
  }
}
