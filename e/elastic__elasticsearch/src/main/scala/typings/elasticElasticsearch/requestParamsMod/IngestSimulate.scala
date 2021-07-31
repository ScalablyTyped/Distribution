package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSimulate[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var id: js.UndefOr[String] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object IngestSimulate {
  
  @scala.inline
  def apply[T](body: T): IngestSimulate[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestSimulate[T]]
  }
  
  @scala.inline
  implicit class IngestSimulateMutableBuilder[Self <: IngestSimulate[?], T] (val x: Self & IngestSimulate[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
