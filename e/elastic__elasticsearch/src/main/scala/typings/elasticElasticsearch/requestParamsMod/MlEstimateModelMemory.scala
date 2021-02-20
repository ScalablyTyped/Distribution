package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlEstimateModelMemory[T] extends Generic {
  
  var body: T = js.native
}
object MlEstimateModelMemory {
  
  @scala.inline
  def apply[T](body: T): MlEstimateModelMemory[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEstimateModelMemory[T]]
  }
  
  @scala.inline
  implicit class MlEstimateModelMemoryMutableBuilder[Self <: MlEstimateModelMemory[_], T] (val x: Self with MlEstimateModelMemory[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
