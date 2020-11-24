package typings.gestalt.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnProps extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var lgSpan: js.UndefOr[UnsignedUpTo12] = js.native
  
  var mdSpan: js.UndefOr[UnsignedUpTo12] = js.native
  
  var smSpan: js.UndefOr[UnsignedUpTo12] = js.native
  
  var span: UnsignedUpTo12 = js.native
}
object ColumnProps {
  
  @scala.inline
  def apply(span: UnsignedUpTo12): ColumnProps = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
  
  @scala.inline
  implicit class ColumnPropsOps[Self <: ColumnProps] (val x: Self) extends AnyVal {
    
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
    def setSpan(value: UnsignedUpTo12): Self = this.set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setLgSpan(value: UnsignedUpTo12): Self = this.set("lgSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLgSpan: Self = this.set("lgSpan", js.undefined)
    
    @scala.inline
    def setMdSpan(value: UnsignedUpTo12): Self = this.set("mdSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMdSpan: Self = this.set("mdSpan", js.undefined)
    
    @scala.inline
    def setSmSpan(value: UnsignedUpTo12): Self = this.set("smSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmSpan: Self = this.set("smSpan", js.undefined)
  }
}
