package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.FirstDayOfWeek
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxCalendar.CalendarZoomLevel
import typings.devextreme.mod.DevExpress.ui.dxCalendar.CellTemplateData
import typings.devextreme.mod.DevExpress.ui.dxCalendar.DisabledDate
import typings.devextreme.mod.DevExpress.ui.dxCalendar.WeekNumberRule
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxCalendarOptions
  extends StObject
     with EditorOptions[dxCalendar] {
  
  /**
    * Specifies a custom template for calendar cells.
    */
  var cellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ CellTemplateData, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies the date-time value serialization format. Use it only if you do not specify the value at design time.
    */
  var dateSerializationFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies dates that users cannot select.
    */
  var disabledDates: js.UndefOr[js.Array[js.Date] | (js.Function1[/* data */ DisabledDate, Boolean])] = js.undefined
  
  /**
    * Specifies the first day of a week.
    */
  var firstDayOfWeek: js.UndefOr[FirstDayOfWeek] = js.undefined
  
  /**
    * The latest date the UI component allows to select.
    */
  var max: js.UndefOr[js.Date | Double | String] = js.undefined
  
  /**
    * Specifies the maximum zoom level of the calendar.
    */
  var maxZoomLevel: js.UndefOr[CalendarZoomLevel] = js.undefined
  
  /**
    * The earliest date the UI component allows to select.
    */
  var min: js.UndefOr[js.Date | Double | String] = js.undefined
  
  /**
    * Specifies the minimum zoom level of the calendar.
    */
  var minZoomLevel: js.UndefOr[CalendarZoomLevel] = js.undefined
  
  /**
    * The value to be assigned to the `name` attribute of the underlying HTML element.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not the UI component displays a button that selects the current date.
    */
  var showTodayButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object or a value specifying the date and time currently selected in the calendar.
    */
  @JSName("value")
  var value_dxCalendarOptions: js.UndefOr[js.Date | Double | String] = js.undefined
  
  /**
    * 
    */
  var weekNumberRule: js.UndefOr[WeekNumberRule] = js.undefined
  
  /**
    * Specifies the current calendar zoom level.
    */
  var zoomLevel: js.UndefOr[CalendarZoomLevel] = js.undefined
}
object dxCalendarOptions {
  
  inline def apply(): dxCalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCalendarOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxCalendarOptions] (val x: Self) extends AnyVal {
    
    inline def setCellTemplate(
      value: template | (js.Function3[
          /* itemData */ CellTemplateData, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "cellTemplate", value.asInstanceOf[js.Any])
    
    inline def setCellTemplateFunction3(
      value: (/* itemData */ CellTemplateData, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "cellTemplate", js.Any.fromFunction3(value))
    
    inline def setCellTemplateUndefined: Self = StObject.set(x, "cellTemplate", js.undefined)
    
    inline def setDateSerializationFormat(value: String): Self = StObject.set(x, "dateSerializationFormat", value.asInstanceOf[js.Any])
    
    inline def setDateSerializationFormatUndefined: Self = StObject.set(x, "dateSerializationFormat", js.undefined)
    
    inline def setDisabledDates(value: js.Array[js.Date] | (js.Function1[/* data */ DisabledDate, Boolean])): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
    
    inline def setDisabledDatesFunction1(value: /* data */ DisabledDate => Boolean): Self = StObject.set(x, "disabledDates", js.Any.fromFunction1(value))
    
    inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
    
    inline def setDisabledDatesVarargs(value: js.Date*): Self = StObject.set(x, "disabledDates", js.Array(value*))
    
    inline def setFirstDayOfWeek(value: FirstDayOfWeek): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    inline def setMax(value: js.Date | Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxZoomLevel(value: CalendarZoomLevel): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomLevelUndefined: Self = StObject.set(x, "maxZoomLevel", js.undefined)
    
    inline def setMin(value: js.Date | Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinZoomLevel(value: CalendarZoomLevel): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMinZoomLevelUndefined: Self = StObject.set(x, "minZoomLevel", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShowTodayButton(value: Boolean): Self = StObject.set(x, "showTodayButton", value.asInstanceOf[js.Any])
    
    inline def setShowTodayButtonUndefined: Self = StObject.set(x, "showTodayButton", js.undefined)
    
    inline def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
    
    inline def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
    
    inline def setValue(value: js.Date | Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWeekNumberRule(value: WeekNumberRule): Self = StObject.set(x, "weekNumberRule", value.asInstanceOf[js.Any])
    
    inline def setWeekNumberRuleUndefined: Self = StObject.set(x, "weekNumberRule", js.undefined)
    
    inline def setZoomLevel(value: CalendarZoomLevel): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
    
    inline def setZoomLevelUndefined: Self = StObject.set(x, "zoomLevel", js.undefined)
  }
}
