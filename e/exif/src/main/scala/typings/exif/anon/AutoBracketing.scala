package typings.exif.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoBracketing extends js.Object {
  
  var AutoBracketing: js.UndefOr[Double] = js.native
  
  var BlurWarning: js.UndefOr[Double] = js.native
  
  var ExposureWarning: js.UndefOr[Double] = js.native
  
  var FlashExposureComp: js.UndefOr[Double] = js.native
  
  var FocusMode: js.UndefOr[Double] = js.native
  
  var FocusWarning: js.UndefOr[Double] = js.native
  
  var FujiFlashMode: js.UndefOr[Double] = js.native
  
  var Macro: js.UndefOr[Double] = js.native
  
  var Quality: js.UndefOr[String] = js.native
  
  var Sharpness: js.UndefOr[Double] = js.native
  
  var SlowSync: js.UndefOr[Double] = js.native
  
  var Version: js.UndefOr[Buffer] = js.native
  
  var WhiteBalance: js.UndefOr[Double] = js.native
  
  var error: js.UndefOr[String] = js.native
}
object AutoBracketing {
  
  @scala.inline
  def apply(): AutoBracketing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoBracketing]
  }
  
  @scala.inline
  implicit class AutoBracketingOps[Self <: AutoBracketing] (val x: Self) extends AnyVal {
    
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
    def setAutoBracketing(value: Double): Self = this.set("AutoBracketing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBracketing: Self = this.set("AutoBracketing", js.undefined)
    
    @scala.inline
    def setBlurWarning(value: Double): Self = this.set("BlurWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurWarning: Self = this.set("BlurWarning", js.undefined)
    
    @scala.inline
    def setExposureWarning(value: Double): Self = this.set("ExposureWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposureWarning: Self = this.set("ExposureWarning", js.undefined)
    
    @scala.inline
    def setFlashExposureComp(value: Double): Self = this.set("FlashExposureComp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlashExposureComp: Self = this.set("FlashExposureComp", js.undefined)
    
    @scala.inline
    def setFocusMode(value: Double): Self = this.set("FocusMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusMode: Self = this.set("FocusMode", js.undefined)
    
    @scala.inline
    def setFocusWarning(value: Double): Self = this.set("FocusWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusWarning: Self = this.set("FocusWarning", js.undefined)
    
    @scala.inline
    def setFujiFlashMode(value: Double): Self = this.set("FujiFlashMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFujiFlashMode: Self = this.set("FujiFlashMode", js.undefined)
    
    @scala.inline
    def setMacro(value: Double): Self = this.set("Macro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacro: Self = this.set("Macro", js.undefined)
    
    @scala.inline
    def setQuality(value: String): Self = this.set("Quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("Quality", js.undefined)
    
    @scala.inline
    def setSharpness(value: Double): Self = this.set("Sharpness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharpness: Self = this.set("Sharpness", js.undefined)
    
    @scala.inline
    def setSlowSync(value: Double): Self = this.set("SlowSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlowSync: Self = this.set("SlowSync", js.undefined)
    
    @scala.inline
    def setVersion(value: Buffer): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
    
    @scala.inline
    def setWhiteBalance(value: Double): Self = this.set("WhiteBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhiteBalance: Self = this.set("WhiteBalance", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
