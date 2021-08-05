package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeGroupAutoscalingPolicy extends StObject {
  
  var maxSize: js.UndefOr[Double] = js.undefined
  
  var minSize: js.UndefOr[Double] = js.undefined
}
object SchemaNodeGroupAutoscalingPolicy {
  
  inline def apply(): SchemaNodeGroupAutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupAutoscalingPolicy]
  }
  
  extension [Self <: SchemaNodeGroupAutoscalingPolicy](x: Self) {
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
