package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearScroll[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var scroll_id: js.UndefOr[String | js.Array[String]] = js.native
}
object ClearScroll {
  
  @scala.inline
  def apply[T](): ClearScroll[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearScroll[T]]
  }
  
  @scala.inline
  implicit class ClearScrollMutableBuilder[Self <: ClearScroll[_], T] (val x: Self with ClearScroll[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setScroll_id(value: String | js.Array[String]): Self = StObject.set(x, "scroll_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll_idUndefined: Self = StObject.set(x, "scroll_id", js.undefined)
    
    @scala.inline
    def setScroll_idVarargs(value: String*): Self = StObject.set(x, "scroll_id", js.Array(value :_*))
  }
}
