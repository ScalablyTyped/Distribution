package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bing extends js.Object {
  
  var bing: js.UndefOr[String] = js.native
  
  var google: js.UndefOr[String] = js.native
  
  var googleStatic: js.UndefOr[String] = js.native
}
object Bing {
  
  @scala.inline
  def apply(): Bing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bing]
  }
  
  @scala.inline
  implicit class BingOps[Self <: Bing] (val x: Self) extends AnyVal {
    
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
    def setBing(value: String): Self = this.set("bing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBing: Self = this.set("bing", js.undefined)
    
    @scala.inline
    def setGoogle(value: String): Self = this.set("google", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogle: Self = this.set("google", js.undefined)
    
    @scala.inline
    def setGoogleStatic(value: String): Self = this.set("googleStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleStatic: Self = this.set("googleStatic", js.undefined)
  }
}
