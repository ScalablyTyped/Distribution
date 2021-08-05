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
  
  inline def apply[T](): MlExplainDataFrameAnalytics[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlExplainDataFrameAnalytics[T]]
  }
  
  extension [Self <: MlExplainDataFrameAnalytics[?], T](x: Self & MlExplainDataFrameAnalytics[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
