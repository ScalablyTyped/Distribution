package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolyLine extends js.Object {
  
  var x1: js.UndefOr[String] = js.native
  
  var x2: js.UndefOr[String] = js.native
  
  var y1: js.UndefOr[String] = js.native
  
  var y2: js.UndefOr[String] = js.native
}
object PolyLine {
  
  @scala.inline
  def apply(): PolyLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolyLine]
  }
  
  @scala.inline
  implicit class PolyLineOps[Self <: PolyLine] (val x: Self) extends AnyVal {
    
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
    def setX1(value: String): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX1: Self = this.set("x1", js.undefined)
    
    @scala.inline
    def setX2(value: String): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    
    @scala.inline
    def setY1(value: String): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
    
    @scala.inline
    def setY2(value: String): Self = this.set("y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
  }
}
