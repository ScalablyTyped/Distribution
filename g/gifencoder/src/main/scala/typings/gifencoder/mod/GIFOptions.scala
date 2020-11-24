package typings.gifencoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GIFOptions extends js.Object {
  
  /** frame delay in ms */
  var delay: Double = js.native
  
  /** image quality. 10 is default */
  var quality: Double = js.native
  
  /** 0 for repeat, -1 for no-repeat */
  var repeat: Double = js.native
}
object GIFOptions {
  
  @scala.inline
  def apply(delay: Double, quality: Double, repeat: Double): GIFOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GIFOptions]
  }
  
  @scala.inline
  implicit class GIFOptionsOps[Self <: GIFOptions] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeat(value: Double): Self = this.set("repeat", value.asInstanceOf[js.Any])
  }
}
