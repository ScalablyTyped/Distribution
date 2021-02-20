package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scroll[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.native
  
  var scroll: js.UndefOr[String] = js.native
  
  var scroll_id: js.UndefOr[String] = js.native
}
object Scroll {
  
  @scala.inline
  def apply[T](): Scroll[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scroll[T]]
  }
  
  @scala.inline
  implicit class ScrollMutableBuilder[Self <: Scroll[_], T] (val x: Self with Scroll[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setRest_total_hits_as_int(value: Boolean): Self = StObject.set(x, "rest_total_hits_as_int", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRest_total_hits_as_intUndefined: Self = StObject.set(x, "rest_total_hits_as_int", js.undefined)
    
    @scala.inline
    def setScroll(value: String): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    @scala.inline
    def setScroll_id(value: String): Self = StObject.set(x, "scroll_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll_idUndefined: Self = StObject.set(x, "scroll_id", js.undefined)
  }
}
