package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrozenHeaderSettings extends js.Object {
  
  /** Allows you to freeze the column headers alone when scrolling the vertical scroll bar.
    * @Default {false}
    */
  var enableFrozenColumnHeaders: js.UndefOr[Boolean] = js.native
  
  /** Allows you to freeze both row headers and column headers while scrolling.
    * @Default {false}
    */
  var enableFrozenHeaders: js.UndefOr[Boolean] = js.native
  
  /** Allows you to freeze the row headers alone when scrolling the horizontal scroll bar.
    * @Default {false}
    */
  var enableFrozenRowHeaders: js.UndefOr[Boolean] = js.native
  
  /** Allows you to set the size of the scrollbar (horizontal and vertical) that is visible in the PivotGrid.
    * @Default {18}
    */
  var scrollerSize: js.UndefOr[Double] = js.native
}
object FrozenHeaderSettings {
  
  @scala.inline
  def apply(): FrozenHeaderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrozenHeaderSettings]
  }
  
  @scala.inline
  implicit class FrozenHeaderSettingsOps[Self <: FrozenHeaderSettings] (val x: Self) extends AnyVal {
    
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
    def setEnableFrozenColumnHeaders(value: Boolean): Self = this.set("enableFrozenColumnHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFrozenColumnHeaders: Self = this.set("enableFrozenColumnHeaders", js.undefined)
    
    @scala.inline
    def setEnableFrozenHeaders(value: Boolean): Self = this.set("enableFrozenHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFrozenHeaders: Self = this.set("enableFrozenHeaders", js.undefined)
    
    @scala.inline
    def setEnableFrozenRowHeaders(value: Boolean): Self = this.set("enableFrozenRowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFrozenRowHeaders: Self = this.set("enableFrozenRowHeaders", js.undefined)
    
    @scala.inline
    def setScrollerSize(value: Double): Self = this.set("scrollerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollerSize: Self = this.set("scrollerSize", js.undefined)
  }
}
