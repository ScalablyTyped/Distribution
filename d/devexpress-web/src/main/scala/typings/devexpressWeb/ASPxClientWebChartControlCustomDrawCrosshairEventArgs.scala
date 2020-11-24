package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for a chart control's ASPxClientWebChartControl.CustomDrawCrosshair event.
  */
@js.native
trait ASPxClientWebChartControlCustomDrawCrosshairEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Provides access to the settings of crosshair elements and crosshair group header elements to customize their appearance.
    */
  var crosshairElementGroups: js.Array[ASPxClientCrosshairElementGroup] = js.native
  
  /** @deprecated This property is now obsolete. Use the crosshairElementGroup.CrosshairElements property instead. */
  /**
    * Returns crosshair elements settings to custom draw a crosshair cursor.
    */
  var crosshairElements: js.Array[ASPxClientCrosshairElement] = js.native
  
  /** @deprecated This property is now obsolete. Use the crosshairElementGroup.HeaderElement property instead. */
  /**
    * Returns the crosshair group header elements to customize their appearance.
    */
  var crosshairGroupHeaderElements: js.Array[ASPxClientCrosshairGroupHeaderElement] = js.native
  
  /**
    * Returns the array of indicator elements that the Crosshair Cursor displays in a legend.
    */
  var crosshairIndicatorLegendElements: js.Array[ASPxClientCrosshairIndicatorLegendElement] = js.native
  
  /**
    * Returns the crosshair legend elements to custom draw the Crosshair.
    */
  var crosshairLegendElements: js.Array[ASPxClientCrosshairLegendElement] = js.native
  
  /**
    * Returns the crosshair axis label elements to customize their appearance.
    */
  var cursorCrosshairAxisLabelElements: js.Array[ASPxClientCrosshairAxisLabelElement] = js.native
  
  /**
    * Gets crosshair line element settings that are used to custom draw a crosshair cursor.
    */
  var cursorCrosshairLineElement: ASPxClientCrosshairLineElement = js.native
}
object ASPxClientWebChartControlCustomDrawCrosshairEventArgs {
  
  @scala.inline
  def apply(
    crosshairElementGroups: js.Array[ASPxClientCrosshairElementGroup],
    crosshairElements: js.Array[ASPxClientCrosshairElement],
    crosshairGroupHeaderElements: js.Array[ASPxClientCrosshairGroupHeaderElement],
    crosshairIndicatorLegendElements: js.Array[ASPxClientCrosshairIndicatorLegendElement],
    crosshairLegendElements: js.Array[ASPxClientCrosshairLegendElement],
    cursorCrosshairAxisLabelElements: js.Array[ASPxClientCrosshairAxisLabelElement],
    cursorCrosshairLineElement: ASPxClientCrosshairLineElement,
    processOnServer: Boolean
  ): ASPxClientWebChartControlCustomDrawCrosshairEventArgs = {
    val __obj = js.Dynamic.literal(crosshairElementGroups = crosshairElementGroups.asInstanceOf[js.Any], crosshairElements = crosshairElements.asInstanceOf[js.Any], crosshairGroupHeaderElements = crosshairGroupHeaderElements.asInstanceOf[js.Any], crosshairIndicatorLegendElements = crosshairIndicatorLegendElements.asInstanceOf[js.Any], crosshairLegendElements = crosshairLegendElements.asInstanceOf[js.Any], cursorCrosshairAxisLabelElements = cursorCrosshairAxisLabelElements.asInstanceOf[js.Any], cursorCrosshairLineElement = cursorCrosshairLineElement.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChartControlCustomDrawCrosshairEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientWebChartControlCustomDrawCrosshairEventArgsOps[Self <: ASPxClientWebChartControlCustomDrawCrosshairEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCrosshairElementGroupsVarargs(value: ASPxClientCrosshairElementGroup*): Self = this.set("crosshairElementGroups", js.Array(value :_*))
    
    @scala.inline
    def setCrosshairElementGroups(value: js.Array[ASPxClientCrosshairElementGroup]): Self = this.set("crosshairElementGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairElementsVarargs(value: ASPxClientCrosshairElement*): Self = this.set("crosshairElements", js.Array(value :_*))
    
    @scala.inline
    def setCrosshairElements(value: js.Array[ASPxClientCrosshairElement]): Self = this.set("crosshairElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairGroupHeaderElementsVarargs(value: ASPxClientCrosshairGroupHeaderElement*): Self = this.set("crosshairGroupHeaderElements", js.Array(value :_*))
    
    @scala.inline
    def setCrosshairGroupHeaderElements(value: js.Array[ASPxClientCrosshairGroupHeaderElement]): Self = this.set("crosshairGroupHeaderElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairIndicatorLegendElementsVarargs(value: ASPxClientCrosshairIndicatorLegendElement*): Self = this.set("crosshairIndicatorLegendElements", js.Array(value :_*))
    
    @scala.inline
    def setCrosshairIndicatorLegendElements(value: js.Array[ASPxClientCrosshairIndicatorLegendElement]): Self = this.set("crosshairIndicatorLegendElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairLegendElementsVarargs(value: ASPxClientCrosshairLegendElement*): Self = this.set("crosshairLegendElements", js.Array(value :_*))
    
    @scala.inline
    def setCrosshairLegendElements(value: js.Array[ASPxClientCrosshairLegendElement]): Self = this.set("crosshairLegendElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorCrosshairAxisLabelElementsVarargs(value: ASPxClientCrosshairAxisLabelElement*): Self = this.set("cursorCrosshairAxisLabelElements", js.Array(value :_*))
    
    @scala.inline
    def setCursorCrosshairAxisLabelElements(value: js.Array[ASPxClientCrosshairAxisLabelElement]): Self = this.set("cursorCrosshairAxisLabelElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorCrosshairLineElement(value: ASPxClientCrosshairLineElement): Self = this.set("cursorCrosshairLineElement", value.asInstanceOf[js.Any])
  }
}
