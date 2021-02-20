package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlValidateDetector[T] extends Generic {
  
  var body: T = js.native
}
object MlValidateDetector {
  
  @scala.inline
  def apply[T](body: T): MlValidateDetector[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlValidateDetector[T]]
  }
  
  @scala.inline
  implicit class MlValidateDetectorMutableBuilder[Self <: MlValidateDetector[_], T] (val x: Self with MlValidateDetector[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
