package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait basePointObject extends js.Object {
  
  /**
    * [descr:basePointObject.clearHover()]
    */
  def clearHover(): Unit = js.native
  
  /**
    * [descr:basePointObject.clearSelection()]
    */
  def clearSelection(): Unit = js.native
  
  /**
    * [descr:basePointObject.data]
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:basePointObject.fullState]
    */
  var fullState: js.UndefOr[Double] = js.native
  
  /**
    * [descr:basePointObject.getColor()]
    */
  def getColor(): String = js.native
  
  /**
    * [descr:basePointObject.getLabel()]
    */
  def getLabel(): baseLabelObject with js.Array[baseLabelObject] = js.native
  
  /**
    * [descr:basePointObject.hideTooltip()]
    */
  def hideTooltip(): Unit = js.native
  
  /**
    * [descr:basePointObject.hover()]
    */
  def hover(): Unit = js.native
  
  /**
    * [descr:basePointObject.isHovered()]
    */
  def isHovered(): Boolean = js.native
  
  /**
    * [descr:basePointObject.isSelected()]
    */
  def isSelected(): Boolean = js.native
  
  /**
    * [descr:basePointObject.originalArgument]
    */
  var originalArgument: js.UndefOr[String | Double | Date] = js.native
  
  /**
    * [descr:basePointObject.originalValue]
    */
  var originalValue: js.UndefOr[String | Double | Date] = js.native
  
  /**
    * [descr:basePointObject.select()]
    */
  def select(): Unit = js.native
  
  /**
    * [descr:basePointObject.series]
    */
  var series: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:basePointObject.showTooltip()]
    */
  def showTooltip(): Unit = js.native
  
  /**
    * [descr:basePointObject.tag]
    */
  var tag: js.UndefOr[js.Any] = js.native
}
object basePointObject {
  
  @scala.inline
  def apply(
    clearHover: () => Unit,
    clearSelection: () => Unit,
    getColor: () => String,
    getLabel: () => baseLabelObject with js.Array[baseLabelObject],
    hideTooltip: () => Unit,
    hover: () => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    select: () => Unit,
    showTooltip: () => Unit
  ): basePointObject = {
    val __obj = js.Dynamic.literal(clearHover = js.Any.fromFunction0(clearHover), clearSelection = js.Any.fromFunction0(clearSelection), getColor = js.Any.fromFunction0(getColor), getLabel = js.Any.fromFunction0(getLabel), hideTooltip = js.Any.fromFunction0(hideTooltip), hover = js.Any.fromFunction0(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), select = js.Any.fromFunction0(select), showTooltip = js.Any.fromFunction0(showTooltip))
    __obj.asInstanceOf[basePointObject]
  }
  
  @scala.inline
  implicit class basePointObjectOps[Self <: basePointObject] (val x: Self) extends AnyVal {
    
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
    def setClearHover(value: () => Unit): Self = this.set("clearHover", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearSelection(value: () => Unit): Self = this.set("clearSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColor(value: () => String): Self = this.set("getColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabel(value: () => baseLabelObject with js.Array[baseLabelObject]): Self = this.set("getLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideTooltip(value: () => Unit): Self = this.set("hideTooltip", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHover(value: () => Unit): Self = this.set("hover", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHovered(value: () => Boolean): Self = this.set("isHovered", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSelected(value: () => Boolean): Self = this.set("isSelected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowTooltip(value: () => Unit): Self = this.set("showTooltip", js.Any.fromFunction0(value))
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFullState(value: Double): Self = this.set("fullState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullState: Self = this.set("fullState", js.undefined)
    
    @scala.inline
    def setOriginalArgument(value: String | Double | Date): Self = this.set("originalArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalArgument: Self = this.set("originalArgument", js.undefined)
    
    @scala.inline
    def setOriginalValue(value: String | Double | Date): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalValue: Self = this.set("originalValue", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Any): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setTag(value: js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
