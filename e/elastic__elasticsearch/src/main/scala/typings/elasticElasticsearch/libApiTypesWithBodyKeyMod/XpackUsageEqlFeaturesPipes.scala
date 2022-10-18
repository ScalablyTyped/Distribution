package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageEqlFeaturesPipes extends StObject {
  
  var pipe_head: uint
  
  var pipe_tail: uint
}
object XpackUsageEqlFeaturesPipes {
  
  inline def apply(pipe_head: uint, pipe_tail: uint): XpackUsageEqlFeaturesPipes = {
    val __obj = js.Dynamic.literal(pipe_head = pipe_head.asInstanceOf[js.Any], pipe_tail = pipe_tail.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageEqlFeaturesPipes]
  }
  
  extension [Self <: XpackUsageEqlFeaturesPipes](x: Self) {
    
    inline def setPipe_head(value: uint): Self = StObject.set(x, "pipe_head", value.asInstanceOf[js.Any])
    
    inline def setPipe_tail(value: uint): Self = StObject.set(x, "pipe_tail", value.asInstanceOf[js.Any])
  }
}
