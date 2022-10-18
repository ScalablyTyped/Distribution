package typings.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Start extends StObject {
  
  var start: Offset
}
object Start {
  
  inline def apply(start: Offset): Start = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
  
  extension [Self <: Start](x: Self) {
    
    inline def setStart(value: Offset): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
