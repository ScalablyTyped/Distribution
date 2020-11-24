package typings.gliderJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slide extends js.Object {
  
  var slide: Double = js.native
}
object Slide {
  
  @scala.inline
  def apply(slide: Double): Slide = {
    val __obj = js.Dynamic.literal(slide = slide.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slide]
  }
  
  @scala.inline
  implicit class SlideOps[Self <: Slide] (val x: Self) extends AnyVal {
    
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
    def setSlide(value: Double): Self = this.set("slide", value.asInstanceOf[js.Any])
  }
}
