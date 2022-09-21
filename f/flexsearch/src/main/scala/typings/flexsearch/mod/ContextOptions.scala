package typings.flexsearch.mod

import typings.flexsearch.flexsearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextOptions extends StObject {
  
  var bidirectional: Boolean
  
  var depth: `false` | Double
  
  var resolution: Double
}
object ContextOptions {
  
  inline def apply(bidirectional: Boolean, depth: `false` | Double, resolution: Double): ContextOptions = {
    val __obj = js.Dynamic.literal(bidirectional = bidirectional.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextOptions]
  }
  
  extension [Self <: ContextOptions](x: Self) {
    
    inline def setBidirectional(value: Boolean): Self = StObject.set(x, "bidirectional", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: `false` | Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
  }
}
