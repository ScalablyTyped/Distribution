package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNodeGroupAutoscalingPolicy extends StObject {
  
  var maxSize: js.UndefOr[Double] = js.native
  
  var minSize: js.UndefOr[Double] = js.native
}
object SchemaNodeGroupAutoscalingPolicy {
  
  @scala.inline
  def apply(): SchemaNodeGroupAutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupAutoscalingPolicy]
  }
  
  @scala.inline
  implicit class SchemaNodeGroupAutoscalingPolicyMutableBuilder[Self <: SchemaNodeGroupAutoscalingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
