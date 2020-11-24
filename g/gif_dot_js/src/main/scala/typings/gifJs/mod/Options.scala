package typings.gifJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var background: js.UndefOr[String] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var dither: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double | Null] = js.native
  
  var quality: js.UndefOr[Double] = js.native
  
  var repeat: js.UndefOr[Double] = js.native
  
  var transparent: js.UndefOr[String | Null] = js.native
  
  var width: js.UndefOr[Double | Null] = js.native
  
  var workerScript: js.UndefOr[String] = js.native
  
  var workers: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDither(value: Boolean): Self = this.set("dither", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDither: Self = this.set("dither", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHeightNull: Self = this.set("height", null)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setRepeat(value: Double): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    
    @scala.inline
    def setTransparent(value: String): Self = this.set("transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
    
    @scala.inline
    def setTransparentNull: Self = this.set("transparent", null)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWidthNull: Self = this.set("width", null)
    
    @scala.inline
    def setWorkerScript(value: String): Self = this.set("workerScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerScript: Self = this.set("workerScript", js.undefined)
    
    @scala.inline
    def setWorkers(value: Double): Self = this.set("workers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkers: Self = this.set("workers", js.undefined)
  }
}
