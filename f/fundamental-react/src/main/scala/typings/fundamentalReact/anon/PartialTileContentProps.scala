package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tile/Tile.TileContentProps> */
@js.native
trait PartialTileContentProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var twoColumns: js.UndefOr[Boolean] = js.native
}
object PartialTileContentProps {
  
  @scala.inline
  def apply(): PartialTileContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTileContentProps]
  }
  
  @scala.inline
  implicit class PartialTileContentPropsOps[Self <: PartialTileContentProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setTwoColumns(value: Boolean): Self = this.set("twoColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwoColumns: Self = this.set("twoColumns", js.undefined)
  }
}
