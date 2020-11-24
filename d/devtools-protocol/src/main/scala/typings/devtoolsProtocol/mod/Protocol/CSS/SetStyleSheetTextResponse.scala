package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetStyleSheetTextResponse extends js.Object {
  
  /**
    * URL of source map associated with script (if any).
    */
  var sourceMapURL: js.UndefOr[String] = js.native
}
object SetStyleSheetTextResponse {
  
  @scala.inline
  def apply(): SetStyleSheetTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetStyleSheetTextResponse]
  }
  
  @scala.inline
  implicit class SetStyleSheetTextResponseOps[Self <: SetStyleSheetTextResponse] (val x: Self) extends AnyVal {
    
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
    def setSourceMapURL(value: String): Self = this.set("sourceMapURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMapURL: Self = this.set("sourceMapURL", js.undefined)
  }
}
