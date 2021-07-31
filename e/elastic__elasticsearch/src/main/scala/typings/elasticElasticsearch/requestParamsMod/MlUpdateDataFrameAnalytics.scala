package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlUpdateDataFrameAnalytics[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var id: String
}
object MlUpdateDataFrameAnalytics {
  
  @scala.inline
  def apply[T](body: T, id: String): MlUpdateDataFrameAnalytics[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpdateDataFrameAnalytics[T]]
  }
  
  @scala.inline
  implicit class MlUpdateDataFrameAnalyticsMutableBuilder[Self <: MlUpdateDataFrameAnalytics[?], T] (val x: Self & MlUpdateDataFrameAnalytics[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
