package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEstimateModelMemory[T]
  extends StObject
     with Generic {
  
  var body: T
}
object MlEstimateModelMemory {
  
  @scala.inline
  def apply[T](body: T): MlEstimateModelMemory[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEstimateModelMemory[T]]
  }
  
  @scala.inline
  implicit class MlEstimateModelMemoryMutableBuilder[Self <: MlEstimateModelMemory[?], T] (val x: Self & MlEstimateModelMemory[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
