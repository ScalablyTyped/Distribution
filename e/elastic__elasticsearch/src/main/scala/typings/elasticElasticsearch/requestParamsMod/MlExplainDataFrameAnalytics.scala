package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlExplainDataFrameAnalytics[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var id: js.UndefOr[String] = js.native
}
object MlExplainDataFrameAnalytics {
  
  @scala.inline
  def apply[T](): MlExplainDataFrameAnalytics[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlExplainDataFrameAnalytics[T]]
  }
  
  @scala.inline
  implicit class MlExplainDataFrameAnalyticsMutableBuilder[Self <: MlExplainDataFrameAnalytics[_], T] (val x: Self with MlExplainDataFrameAnalytics[T]) extends AnyVal {
    
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
