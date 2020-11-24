package typings.fundamentalReact.tileMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileContentProps
  extends /* x */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.native
  
  var twoColumns: js.UndefOr[Boolean] = js.native
}
object TileContentProps {
  
  @scala.inline
  def apply(): TileContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileContentProps]
  }
  
  @scala.inline
  implicit class TileContentPropsOps[Self <: TileContentProps] (val x: Self) extends AnyVal {
    
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
