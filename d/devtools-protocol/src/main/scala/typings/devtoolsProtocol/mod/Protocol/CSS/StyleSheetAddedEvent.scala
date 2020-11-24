package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSheetAddedEvent extends js.Object {
  
  /**
    * Added stylesheet metainfo.
    */
  var header: CSSStyleSheetHeader = js.native
}
object StyleSheetAddedEvent {
  
  @scala.inline
  def apply(header: CSSStyleSheetHeader): StyleSheetAddedEvent = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheetAddedEvent]
  }
  
  @scala.inline
  implicit class StyleSheetAddedEventOps[Self <: StyleSheetAddedEvent] (val x: Self) extends AnyVal {
    
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
    def setHeader(value: CSSStyleSheetHeader): Self = this.set("header", value.asInstanceOf[js.Any])
  }
}
