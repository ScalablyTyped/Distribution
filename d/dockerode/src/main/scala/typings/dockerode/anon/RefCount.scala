package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefCount extends StObject {
  
  var RefCount: Double
  
  var Size: Double
}
object RefCount {
  
  inline def apply(RefCount: Double, Size: Double): RefCount = {
    val __obj = js.Dynamic.literal(RefCount = RefCount.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefCount]
  }
  
  extension [Self <: RefCount](x: Self) {
    
    inline def setRefCount(value: Double): Self = StObject.set(x, "RefCount", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}
