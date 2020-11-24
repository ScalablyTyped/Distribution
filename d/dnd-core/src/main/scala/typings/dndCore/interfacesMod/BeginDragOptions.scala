package typings.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginDragOptions extends js.Object {
  
  var clientOffset: js.UndefOr[XYCoord] = js.native
  
  var getSourceClientOffset: js.UndefOr[js.Function1[/* sourceId */ Identifier, XYCoord]] = js.native
  
  var publishSource: js.UndefOr[Boolean] = js.native
}
object BeginDragOptions {
  
  @scala.inline
  def apply(): BeginDragOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginDragOptions]
  }
  
  @scala.inline
  implicit class BeginDragOptionsOps[Self <: BeginDragOptions] (val x: Self) extends AnyVal {
    
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
    def setClientOffset(value: XYCoord): Self = this.set("clientOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientOffset: Self = this.set("clientOffset", js.undefined)
    
    @scala.inline
    def setGetSourceClientOffset(value: /* sourceId */ Identifier => XYCoord): Self = this.set("getSourceClientOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetSourceClientOffset: Self = this.set("getSourceClientOffset", js.undefined)
    
    @scala.inline
    def setPublishSource(value: Boolean): Self = this.set("publishSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishSource: Self = this.set("publishSource", js.undefined)
  }
}
