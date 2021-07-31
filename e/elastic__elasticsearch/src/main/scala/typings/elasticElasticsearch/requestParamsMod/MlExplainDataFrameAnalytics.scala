package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlExplainDataFrameAnalytics[T]
  extends StObject
     with Generic {
  
  var body: js.UndefOr[T] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
}
object MlExplainDataFrameAnalytics {
  
  @scala.inline
  def apply[T](): MlExplainDataFrameAnalytics[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlExplainDataFrameAnalytics[T]]
  }
  
  @scala.inline
  implicit class MlExplainDataFrameAnalyticsMutableBuilder[Self <: MlExplainDataFrameAnalytics[?], T] (val x: Self & MlExplainDataFrameAnalytics[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
