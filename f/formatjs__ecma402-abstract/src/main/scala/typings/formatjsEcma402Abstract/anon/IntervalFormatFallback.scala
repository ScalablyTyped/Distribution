package typings.formatjsEcma402Abstract.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntervalFormatFallback extends js.Object {
  
  var intervalFormatFallback: String = js.native
}
object IntervalFormatFallback {
  
  @scala.inline
  def apply(intervalFormatFallback: String): IntervalFormatFallback = {
    val __obj = js.Dynamic.literal(intervalFormatFallback = intervalFormatFallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalFormatFallback]
  }
  
  @scala.inline
  implicit class IntervalFormatFallbackOps[Self <: IntervalFormatFallback] (val x: Self) extends AnyVal {
    
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
    def setIntervalFormatFallback(value: String): Self = this.set("intervalFormatFallback", value.asInstanceOf[js.Any])
  }
}
