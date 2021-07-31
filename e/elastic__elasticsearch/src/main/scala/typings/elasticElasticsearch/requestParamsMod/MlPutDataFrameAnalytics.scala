package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutDataFrameAnalytics[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var id: String
}
object MlPutDataFrameAnalytics {
  
  @scala.inline
  def apply[T](body: T, id: String): MlPutDataFrameAnalytics[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutDataFrameAnalytics[T]]
  }
  
  @scala.inline
  implicit class MlPutDataFrameAnalyticsMutableBuilder[Self <: MlPutDataFrameAnalytics[?], T] (val x: Self & MlPutDataFrameAnalytics[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
