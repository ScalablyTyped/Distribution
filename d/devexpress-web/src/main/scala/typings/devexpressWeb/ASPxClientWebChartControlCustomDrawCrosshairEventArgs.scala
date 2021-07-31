package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for a chart control's ASPxClientWebChartControl.CustomDrawCrosshair event.
  */
trait ASPxClientWebChartControlCustomDrawCrosshairEventArgs
  extends StObject
     with ASPxClientProcessingModeEventArgs {
  
  /**
    * Provides access to the settings of crosshair elements and crosshair group header elements to customize their appearance.
    */
  var crosshairElementGroups: js.Array[ASPxClientCrosshairElementGroup]
  
  /** @deprecated This property is now obsolete. Use the crosshairElementGroup.CrosshairElements property instead. */
  /**
    * Returns crosshair elements settings to custom draw a crosshair cursor.
    */
  var crosshairElements: js.Array[ASPxClientCrosshairElement]
  
  /** @deprecated This property is now obsolete. Use the crosshairElementGroup.HeaderElement property instead. */
  /**
    * Returns the crosshair group header elements to customize their appearance.
    */
  var crosshairGroupHeaderElements: js.Array[ASPxClientCrosshairGroupHeaderElement]
  
  /**
    * Returns the array of indicator elements that the Crosshair Cursor displays in a legend.
    */
  var crosshairIndicatorLegendElements: js.Array[ASPxClientCrosshairIndicatorLegendElement]
  
  /**
    * Returns the crosshair legend elements to custom draw the Crosshair.
    */
  var crosshairLegendElements: js.Array[ASPxClientCrosshairLegendElement]
  
  /**
    * Returns the crosshair axis label elements to customize their appearance.
    */
  var cursorCrosshairAxisLabelElements: js.Array[ASPxClientCrosshairAxisLabelElement]
  
  /**
    * Gets crosshair line element settings that are used to custom draw a crosshair cursor.
    */
  var cursorCrosshairLineElement: ASPxClientCrosshairLineElement
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
  implicit class ASPxClientWebChartControlCustomDrawCrosshairEventArgsMutableBuilder[Self <: ASPxClientWebChartControlCustomDrawCrosshairEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrosshairElementGroups(value: js.Array[ASPxClientCrosshairElementGroup]): Self = StObject.set(x, "crosshairElementGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairElementGroupsVarargs(value: ASPxClientCrosshairElementGroup*): Self = StObject.set(x, "crosshairElementGroups", js.Array(value :_*))
    
    @scala.inline
    def setCrosshairElements(value: js.Array[ASPxClientCrosshairElement]): Self = StObject.set(x, "crosshairElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairElementsVarargs(value: ASPxClientCrosshairElement*): Self = StObject.set(x, "crosshairElements", js.Array(value :_*))
    
    @scala.inline
    def setCrosshairGroupHeaderElements(value: js.Array[ASPxClientCrosshairGroupHeaderElement]): Self = StObject.set(x, "crosshairGroupHeaderElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairGroupHeaderElementsVarargs(value: ASPxClientCrosshairGroupHeaderElement*): Self = StObject.set(x, "crosshairGroupHeaderElements", js.Array(value :_*))
    
    @scala.inline
    def setCrosshairIndicatorLegendElements(value: js.Array[ASPxClientCrosshairIndicatorLegendElement]): Self = StObject.set(x, "crosshairIndicatorLegendElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairIndicatorLegendElementsVarargs(value: ASPxClientCrosshairIndicatorLegendElement*): Self = StObject.set(x, "crosshairIndicatorLegendElements", js.Array(value :_*))
    
    @scala.inline
    def setCrosshairLegendElements(value: js.Array[ASPxClientCrosshairLegendElement]): Self = StObject.set(x, "crosshairLegendElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairLegendElementsVarargs(value: ASPxClientCrosshairLegendElement*): Self = StObject.set(x, "crosshairLegendElements", js.Array(value :_*))
    
    @scala.inline
    def setCursorCrosshairAxisLabelElements(value: js.Array[ASPxClientCrosshairAxisLabelElement]): Self = StObject.set(x, "cursorCrosshairAxisLabelElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorCrosshairAxisLabelElementsVarargs(value: ASPxClientCrosshairAxisLabelElement*): Self = StObject.set(x, "cursorCrosshairAxisLabelElements", js.Array(value :_*))
    
    @scala.inline
    def setCursorCrosshairLineElement(value: ASPxClientCrosshairLineElement): Self = StObject.set(x, "cursorCrosshairLineElement", value.asInstanceOf[js.Any])
  }
}
