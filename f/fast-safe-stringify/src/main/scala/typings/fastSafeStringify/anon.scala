package typings.fastSafeStringify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DepthLimit extends StObject {
    
    var depthLimit: js.UndefOr[Double] = js.undefined
    
    var edgesLimit: js.UndefOr[Double] = js.undefined
  }
  object DepthLimit {
    
    inline def apply(): DepthLimit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DepthLimit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DepthLimit] (val x: Self) extends AnyVal {
      
      inline def setDepthLimit(value: Double): Self = StObject.set(x, "depthLimit", value.asInstanceOf[js.Any])
      
      inline def setDepthLimitUndefined: Self = StObject.set(x, "depthLimit", js.undefined)
      
      inline def setEdgesLimit(value: Double): Self = StObject.set(x, "edgesLimit", value.asInstanceOf[js.Any])
      
      inline def setEdgesLimitUndefined: Self = StObject.set(x, "edgesLimit", js.undefined)
    }
  }
}
