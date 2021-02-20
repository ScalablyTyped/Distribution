package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesAnalyze[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var index: js.UndefOr[String] = js.native
}
object IndicesAnalyze {
  
  @scala.inline
  def apply[T](): IndicesAnalyze[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesAnalyze[T]]
  }
  
  @scala.inline
  implicit class IndicesAnalyzeMutableBuilder[Self <: IndicesAnalyze[_], T] (val x: Self with IndicesAnalyze[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
