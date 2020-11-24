package typings.elasticElasticsearch.requestParamsMod

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
  implicit class ScrollOps[Self <: Scroll[_], T] (val x: Self with Scroll[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setRest_total_hits_as_int(value: Boolean): Self = this.set("rest_total_hits_as_int", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRest_total_hits_as_int: Self = this.set("rest_total_hits_as_int", js.undefined)
    
    @scala.inline
    def setScroll(value: String): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setScroll_id(value: String): Self = this.set("scroll_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll_id: Self = this.set("scroll_id", js.undefined)
  }
}
