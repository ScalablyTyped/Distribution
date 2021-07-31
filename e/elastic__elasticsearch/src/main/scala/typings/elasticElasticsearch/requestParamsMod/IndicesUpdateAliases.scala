package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesUpdateAliases[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var master_timeout: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
}
object IndicesUpdateAliases {
  
  @scala.inline
  def apply[T](body: T): IndicesUpdateAliases[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesUpdateAliases[T]]
  }
  
  @scala.inline
  implicit class IndicesUpdateAliasesMutableBuilder[Self <: IndicesUpdateAliases[?], T] (val x: Self & IndicesUpdateAliases[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeout(value: String): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
