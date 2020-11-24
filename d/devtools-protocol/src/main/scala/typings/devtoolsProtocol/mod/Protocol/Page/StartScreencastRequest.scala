package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg
import typings.devtoolsProtocol.devtoolsProtocolStrings.png
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartScreencastRequest extends js.Object {
  
  /**
    * Send every n-th frame.
    */
  var everyNthFrame: js.UndefOr[integer] = js.native
  
  /**
    * Image compression format. (StartScreencastRequestFormat enum)
    */
  var format: js.UndefOr[jpeg | png] = js.native
  
  /**
    * Maximum screenshot height.
    */
  var maxHeight: js.UndefOr[integer] = js.native
  
  /**
    * Maximum screenshot width.
    */
  var maxWidth: js.UndefOr[integer] = js.native
  
  /**
    * Compression quality from range [0..100].
    */
  var quality: js.UndefOr[integer] = js.native
}
object StartScreencastRequest {
  
  @scala.inline
  def apply(): StartScreencastRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartScreencastRequest]
  }
  
  @scala.inline
  implicit class StartScreencastRequestOps[Self <: StartScreencastRequest] (val x: Self) extends AnyVal {
    
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
    def setEveryNthFrame(value: integer): Self = this.set("everyNthFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEveryNthFrame: Self = this.set("everyNthFrame", js.undefined)
    
    @scala.inline
    def setFormat(value: jpeg | png): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: integer): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: integer): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setQuality(value: integer): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
}
