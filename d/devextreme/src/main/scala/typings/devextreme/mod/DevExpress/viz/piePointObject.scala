package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait piePointObject extends basePointObject {
  
  /**
    * [descr:piePointObject.hide()]
    */
  def hide(): Unit = js.native
  
  /**
    * [descr:piePointObject.isVisible()]
    */
  def isVisible(): Boolean = js.native
  
  /**
    * [descr:piePointObject.percent]
    */
  var percent: js.UndefOr[String | Double | Date] = js.native
  
  /**
    * [descr:piePointObject.show()]
    */
  def show(): Unit = js.native
}
object piePointObject {
  
  @scala.inline
  def apply(
    clearHover: () => Unit,
    clearSelection: () => Unit,
    getColor: () => String,
    getLabel: () => baseLabelObject with js.Array[baseLabelObject],
    hide: () => Unit,
    hideTooltip: () => Unit,
    hover: () => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    isVisible: () => Boolean,
    select: () => Unit,
    show: () => Unit,
    showTooltip: () => Unit
  ): piePointObject = {
    val __obj = js.Dynamic.literal(clearHover = js.Any.fromFunction0(clearHover), clearSelection = js.Any.fromFunction0(clearSelection), getColor = js.Any.fromFunction0(getColor), getLabel = js.Any.fromFunction0(getLabel), hide = js.Any.fromFunction0(hide), hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction0(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), isVisible = js.Any.fromFunction0(isVisible), select = js.Any.fromFunction0(select), show = js.Any.fromFunction0(show), showTooltip = js.Any.fromFunction0(showTooltip))
    __obj.asInstanceOf[piePointObject]
  }
  
  @scala.inline
  implicit class piePointObjectOps[Self <: piePointObject] (val x: Self) extends AnyVal {
    
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
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPercent(value: String | Double | Date): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
  }
}
