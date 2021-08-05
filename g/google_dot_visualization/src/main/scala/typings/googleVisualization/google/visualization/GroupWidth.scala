package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupWidth extends StObject {
  
  var groupWidth: js.Any
}
object GroupWidth {
  
  inline def apply(groupWidth: js.Any): GroupWidth = {
    val __obj = js.Dynamic.literal(groupWidth = groupWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupWidth]
  }
  
  extension [Self <: GroupWidth](x: Self) {
    
    inline def setGroupWidth(value: js.Any): Self = StObject.set(x, "groupWidth", value.asInstanceOf[js.Any])
  }
}
