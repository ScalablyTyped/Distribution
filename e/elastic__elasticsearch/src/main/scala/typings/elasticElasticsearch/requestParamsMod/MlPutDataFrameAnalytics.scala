package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlPutDataFrameAnalytics[T] extends Generic {
  
  var body: T = js.native
  
  var id: String = js.native
}
object MlPutDataFrameAnalytics {
  
  @scala.inline
  def apply[T](body: T, id: String): MlPutDataFrameAnalytics[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutDataFrameAnalytics[T]]
  }
  
  @scala.inline
  implicit class MlPutDataFrameAnalyticsMutableBuilder[Self <: MlPutDataFrameAnalytics[_], T] (val x: Self with MlPutDataFrameAnalytics[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
