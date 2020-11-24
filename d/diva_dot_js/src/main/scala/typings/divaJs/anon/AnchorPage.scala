package typings.divaJs.anon

import typings.divaJs.interfacesMod.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorPage extends js.Object {
  
  var anchorPage: Double = js.native
  
  var offset: Offset = js.native
}
object AnchorPage {
  
  @scala.inline
  def apply(anchorPage: Double, offset: Offset): AnchorPage = {
    val __obj = js.Dynamic.literal(anchorPage = anchorPage.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorPage]
  }
  
  @scala.inline
  implicit class AnchorPageOps[Self <: AnchorPage] (val x: Self) extends AnyVal {
    
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
    def setAnchorPage(value: Double): Self = this.set("anchorPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Offset): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
}
