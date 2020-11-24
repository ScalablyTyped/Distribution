package typings.eyes.mod

import typings.eyes.anon.All
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EyesOptions extends js.Object {
  
  /** Don't output functions at all */
  var hideFunctions: js.UndefOr[Boolean] = js.native
  
  /** Truncate output if longer */
  var maxLength: js.UndefOr[Double] = js.native
  
  /** Indent object literals */
  var pretty: js.UndefOr[Boolean] = js.native
  
  /** Stream to write to, or null */
  var stream: js.UndefOr[WritableStream] = js.native
  
  /** Styles applied to stdout */
  var styles: js.UndefOr[All] = js.native
}
object EyesOptions {
  
  @scala.inline
  def apply(): EyesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EyesOptions]
  }
  
  @scala.inline
  implicit class EyesOptionsOps[Self <: EyesOptions] (val x: Self) extends AnyVal {
    
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
    def setHideFunctions(value: Boolean): Self = this.set("hideFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideFunctions: Self = this.set("hideFunctions", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    
    @scala.inline
    def setStream(value: WritableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    
    @scala.inline
    def setStyles(value: All): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
