package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scroll[T]
  extends StObject
     with Generic {
  
  var body: js.UndefOr[T] = js.undefined
  
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.undefined
  
  var scroll: js.UndefOr[String] = js.undefined
  
  var scroll_id: js.UndefOr[String] = js.undefined
}
object Scroll {
  
  @scala.inline
  def apply[T](): Scroll[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scroll[T]]
  }
  
  @scala.inline
  implicit class ScrollMutableBuilder[Self <: Scroll[?], T] (val x: Self & Scroll[T]) extends AnyVal {
    
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
