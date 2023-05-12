package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithDepth extends StObject {
  
  var depth: Double
}
object WithDepth {
  
  inline def apply(depth: Double): WithDepth = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithDepth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WithDepth] (val x: Self) extends AnyVal {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
  }
}
