package typings.firefoxWebextBrowser.browser.extensionTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of the script or CSS to inject. Either the code or the file property must be set, but both may not be set at the same time.
  */
@js.native
trait InjectDetails extends js.Object {
  
  /**
    * If allFrames is `true`, implies that the JavaScript or CSS should be injected into all frames of current page. By default, it's `false` and is only injected into the top frame.
    */
  var allFrames: js.UndefOr[Boolean] = js.native
  
  /**
    * JavaScript or CSS code to inject.
    *
    * **Warning:**
    * Be careful using the `code` parameter. Incorrect use of it may open your extension to [cross site scripting](https://en.wikipedia.org/wiki/Cross-site_scripting) attacks.
    */
  var code: js.UndefOr[String] = js.native
  
  /** The css origin of the stylesheet to inject. Defaults to "author". */
  var cssOrigin: js.UndefOr[CSSOrigin] = js.native
  
  /** JavaScript or CSS file to inject. */
  var file: js.UndefOr[String] = js.native
  
  /** The ID of the frame to inject the script into. This may not be used in combination with `allFrames`. */
  var frameId: js.UndefOr[Double] = js.native
  
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is `false`.
    */
  var matchAboutBlank: js.UndefOr[Boolean] = js.native
  
  /** The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle". */
  var runAt: js.UndefOr[RunAt] = js.native
}
object InjectDetails {
  
  @scala.inline
  def apply(): InjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectDetails]
  }
  
  @scala.inline
  implicit class InjectDetailsOps[Self <: InjectDetails] (val x: Self) extends AnyVal {
    
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
    def setAllFrames(value: Boolean): Self = this.set("allFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllFrames: Self = this.set("allFrames", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setCssOrigin(value: CSSOrigin): Self = this.set("cssOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssOrigin: Self = this.set("cssOrigin", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setFrameId(value: Double): Self = this.set("frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameId: Self = this.set("frameId", js.undefined)
    
    @scala.inline
    def setMatchAboutBlank(value: Boolean): Self = this.set("matchAboutBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchAboutBlank: Self = this.set("matchAboutBlank", js.undefined)
    
    @scala.inline
    def setRunAt(value: RunAt): Self = this.set("runAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunAt: Self = this.set("runAt", js.undefined)
  }
}
