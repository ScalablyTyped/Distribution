package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlValidate[T] extends Generic {
  
  var body: T = js.native
}
object MlValidate {
  
  @scala.inline
  def apply[T](body: T): MlValidate[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlValidate[T]]
  }
  
  @scala.inline
  implicit class MlValidateMutableBuilder[Self <: MlValidate[_], T] (val x: Self with MlValidate[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
