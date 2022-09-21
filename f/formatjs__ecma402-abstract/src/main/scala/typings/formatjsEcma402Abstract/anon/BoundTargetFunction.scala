package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundTargetFunction extends StObject {
  
  var boundTargetFunction: Any
}
object BoundTargetFunction {
  
  inline def apply(boundTargetFunction: Any): BoundTargetFunction = {
    val __obj = js.Dynamic.literal(boundTargetFunction = boundTargetFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundTargetFunction]
  }
  
  extension [Self <: BoundTargetFunction](x: Self) {
    
    inline def setBoundTargetFunction(value: Any): Self = StObject.set(x, "boundTargetFunction", value.asInstanceOf[js.Any])
  }
}
