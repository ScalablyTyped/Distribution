package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformGetTransformStats
  extends StObject
     with Generic {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var transform_id: String
}
object TransformGetTransformStats {
  
  @scala.inline
  def apply(transform_id: String): TransformGetTransformStats = {
    val __obj = js.Dynamic.literal(transform_id = transform_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformGetTransformStats]
  }
  
  @scala.inline
  implicit class TransformGetTransformStatsMutableBuilder[Self <: TransformGetTransformStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTransform_id(value: String): Self = StObject.set(x, "transform_id", value.asInstanceOf[js.Any])
  }
}
