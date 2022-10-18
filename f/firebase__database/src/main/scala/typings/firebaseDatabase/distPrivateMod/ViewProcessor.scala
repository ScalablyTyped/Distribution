package typings.firebaseDatabase.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewProcessor extends StObject {
  
  val filter: NodeFilter2
}
object ViewProcessor {
  
  inline def apply(filter: NodeFilter2): ViewProcessor = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewProcessor]
  }
  
  extension [Self <: ViewProcessor](x: Self) {
    
    inline def setFilter(value: NodeFilter2): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
