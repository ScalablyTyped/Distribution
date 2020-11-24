package typings.gifwrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GifCodecOptions extends js.Object {
  
  var transparentRGB: js.UndefOr[Double] = js.native
}
object GifCodecOptions {
  
  @scala.inline
  def apply(): GifCodecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GifCodecOptions]
  }
  
  @scala.inline
  implicit class GifCodecOptionsOps[Self <: GifCodecOptions] (val x: Self) extends AnyVal {
    
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
    def setTransparentRGB(value: Double): Self = this.set("transparentRGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparentRGB: Self = this.set("transparentRGB", js.undefined)
  }
}
