package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollParams extends GenericParams {
  
  var scroll: TimeSpan = js.native
  
  var scrollId: String = js.native
}
object ScrollParams {
  
  @scala.inline
  def apply(scroll: TimeSpan, scrollId: String): ScrollParams = {
    val __obj = js.Dynamic.literal(scroll = scroll.asInstanceOf[js.Any], scrollId = scrollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollParams]
  }
  
  @scala.inline
  implicit class ScrollParamsOps[Self <: ScrollParams] (val x: Self) extends AnyVal {
    
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
    def setScroll(value: TimeSpan): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollId(value: String): Self = this.set("scrollId", value.asInstanceOf[js.Any])
  }
}
