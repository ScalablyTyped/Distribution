package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  var group: Double
  
  var item: Double
}
object Group {
  
  inline def apply(group: Double, item: Double): Group = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
