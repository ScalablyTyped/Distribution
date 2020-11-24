package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OcrRequest extends js.Object {
  
  var ocrLanguage: js.UndefOr[String] = js.native
  
  var pageSelection: js.UndefOr[String] = js.native
  
  var setPageOrientation: js.UndefOr[String] = js.native
  
  var showFrames: js.UndefOr[String] = js.native
  
  var showText: js.UndefOr[String] = js.native
  
  var skipPagesHavingExistingExtractableText: js.UndefOr[String] = js.native
}
object OcrRequest {
  
  @scala.inline
  def apply(): OcrRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OcrRequest]
  }
  
  @scala.inline
  implicit class OcrRequestOps[Self <: OcrRequest] (val x: Self) extends AnyVal {
    
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
    def setOcrLanguage(value: String): Self = this.set("ocrLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOcrLanguage: Self = this.set("ocrLanguage", js.undefined)
    
    @scala.inline
    def setPageSelection(value: String): Self = this.set("pageSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSelection: Self = this.set("pageSelection", js.undefined)
    
    @scala.inline
    def setSetPageOrientation(value: String): Self = this.set("setPageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetPageOrientation: Self = this.set("setPageOrientation", js.undefined)
    
    @scala.inline
    def setShowFrames(value: String): Self = this.set("showFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFrames: Self = this.set("showFrames", js.undefined)
    
    @scala.inline
    def setShowText(value: String): Self = this.set("showText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowText: Self = this.set("showText", js.undefined)
    
    @scala.inline
    def setSkipPagesHavingExistingExtractableText(value: String): Self = this.set("skipPagesHavingExistingExtractableText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipPagesHavingExistingExtractableText: Self = this.set("skipPagesHavingExistingExtractableText", js.undefined)
  }
}
