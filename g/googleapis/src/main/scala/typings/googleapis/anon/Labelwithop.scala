package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Labelwithop extends js.Object {
  
  var displayName: js.UndefOr[String] = js.native
  
  var label_with_op: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object Labelwithop {
  
  @scala.inline
  def apply(): Labelwithop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Labelwithop]
  }
  
  @scala.inline
  implicit class LabelwithopOps[Self <: Labelwithop] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLabel_with_op(value: String): Self = this.set("label_with_op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel_with_op: Self = this.set("label_with_op", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
