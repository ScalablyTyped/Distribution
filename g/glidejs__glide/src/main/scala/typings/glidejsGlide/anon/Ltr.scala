package typings.glidejsGlide.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ltr extends js.Object {
  
  /**
    * @default 'glide--ltr'
    */
  var ltr: js.UndefOr[String] = js.native
  
  /**
    * @default 'glide--rtl'
    */
  var rtl: js.UndefOr[String] = js.native
}
object Ltr {
  
  @scala.inline
  def apply(): Ltr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ltr]
  }
  
  @scala.inline
  implicit class LtrOps[Self <: Ltr] (val x: Self) extends AnyVal {
    
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
    def setLtr(value: String): Self = this.set("ltr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLtr: Self = this.set("ltr", js.undefined)
    
    @scala.inline
    def setRtl(value: String): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
  }
}
