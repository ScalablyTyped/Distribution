package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlUpdateFilter[T] extends Generic {
  
  var body: T = js.native
  
  var filter_id: String = js.native
}
object MlUpdateFilter {
  
  @scala.inline
  def apply[T](body: T, filter_id: String): MlUpdateFilter[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filter_id = filter_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpdateFilter[T]]
  }
  
  @scala.inline
  implicit class MlUpdateFilterMutableBuilder[Self <: MlUpdateFilter[_], T] (val x: Self with MlUpdateFilter[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_id(value: String): Self = StObject.set(x, "filter_id", value.asInstanceOf[js.Any])
  }
}
