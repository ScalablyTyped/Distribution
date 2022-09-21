package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.FirstDayOfWeek
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxScheduler.AllDayPanelMode
import typings.devextreme.mod.DevExpress.ui.dxScheduler.AppointmentCollectorTemplateData
import typings.devextreme.mod.DevExpress.ui.dxScheduler.AppointmentTemplateData
import typings.devextreme.mod.DevExpress.ui.dxScheduler.AppointmentTooltipTemplateData
import typings.devextreme.mod.DevExpress.ui.dxScheduler.CellAppointmentsLimit
import typings.devextreme.mod.DevExpress.ui.dxScheduler.ViewType
import typings.devextreme.mod.DevExpress.ui.dxSchedulerScrolling
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgendaDuration extends StObject {
  
  /**
    * Specifies the number of dates that can be shown at a time in the agenda view.
    */
  var agendaDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * 
    */
  var allDayPanelMode: js.UndefOr[AllDayPanelMode] = js.undefined
  
  /**
    * Specifies a custom template for cell overflow indicators in this view.
    */
  var appointmentCollectorTemplate: js.UndefOr[
    template | (js.Function2[
      /* data */ AppointmentCollectorTemplateData, 
      /* collectorElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[typings.std.Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies a custom template for appointments.
    */
  var appointmentTemplate: js.UndefOr[
    template | (js.Function3[
      /* model */ AppointmentTemplateData, 
      /* itemIndex */ Double, 
      /* contentElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[typings.std.Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies a custom template for tooltips displayed when users click an appointment or cell overflow indicator in this view.
    */
  var appointmentTooltipTemplate: js.UndefOr[
    template | (js.Function3[
      /* model */ AppointmentTooltipTemplateData, 
      /* itemIndex */ Double, 
      /* contentElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[typings.std.Element]
    ])
  ] = js.undefined
  
  /**
    * The cell duration in minutes.
    */
  var cellDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a custom template for table cells.
    */
  var dataCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[typings.std.Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies a custom template for date scale items.
    */
  var dateCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[typings.std.Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies a custom template for tooltips displayed when users click a cell overflow indicator in this view.
    * @deprecated Use the views.appointmentTooltipTemplate option instead.
    */
  var dropDownAppointmentTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* contentElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[typings.std.Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies the last hour on the view&apos;s time scale. Accepts integer values from 0 to 24.
    */
  var endDayHour: js.UndefOr[Double] = js.undefined
  
  /**
    * The first day of a week. Does not apply to the agenda view.
    */
  var firstDayOfWeek: js.UndefOr[FirstDayOfWeek] = js.undefined
  
  /**
    * If true, appointments are grouped by date first and then by resource; opposite if false. Applies only if appointments are grouped and groupOrientation is &apos;horizontal&apos;.
    */
  var groupByDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Arranges resource headers vertically (in a column) or horizontally (in a row).
    */
  var groupOrientation: js.UndefOr[typings.devextreme.mod.DevExpress.common.Orientation] = js.undefined
  
  /**
    * The resource kinds by which appointments are grouped.
    */
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Multiplies the default view interval. Applies to all view types except &apos;agenda&apos;.
    */
  var intervalCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the limit of full-sized appointments displayed per cell. Applies to all views except &apos;agenda&apos;.
    */
  var maxAppointmentsPerCell: js.UndefOr[Double | CellAppointmentsLimit] = js.undefined
  
  /**
    * A custom view name displayed in the view switcher.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a custom template for resource headers.
    */
  var resourceCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[typings.std.Element]
    ])
  ] = js.undefined
  
  /**
    * Configures scrolling for a view.
    */
  var scrolling: js.UndefOr[dxSchedulerScrolling] = js.undefined
  
  /**
    * Specifies the date from which to start counting the view interval. Applies to all view types except &apos;agenda&apos;.
    */
  var startDate: js.UndefOr[js.Date | Double | String] = js.undefined
  
  /**
    * Specifies the first hour on the view&apos;s time scale. Accepts integer values from 0 to 24.
    */
  var startDayHour: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a custom template for time scale items.
    */
  var timeCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[typings.std.Element]
    ])
  ] = js.undefined
  
  /**
    * The type of the view.
    */
  var `type`: js.UndefOr[ViewType] = js.undefined
}
object AgendaDuration {
  
  inline def apply(): AgendaDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaDuration]
  }
  
  extension [Self <: AgendaDuration](x: Self) {
    
    inline def setAgendaDuration(value: Double): Self = StObject.set(x, "agendaDuration", value.asInstanceOf[js.Any])
    
    inline def setAgendaDurationUndefined: Self = StObject.set(x, "agendaDuration", js.undefined)
    
    inline def setAllDayPanelMode(value: AllDayPanelMode): Self = StObject.set(x, "allDayPanelMode", value.asInstanceOf[js.Any])
    
    inline def setAllDayPanelModeUndefined: Self = StObject.set(x, "allDayPanelMode", js.undefined)
    
    inline def setAppointmentCollectorTemplate(
      value: template | (js.Function2[
          /* data */ AppointmentCollectorTemplateData, 
          /* collectorElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[typings.std.Element]
        ])
    ): Self = StObject.set(x, "appointmentCollectorTemplate", value.asInstanceOf[js.Any])
    
    inline def setAppointmentCollectorTemplateFunction2(
      value: (/* data */ AppointmentCollectorTemplateData, /* collectorElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[typings.std.Element]
    ): Self = StObject.set(x, "appointmentCollectorTemplate", js.Any.fromFunction2(value))
    
    inline def setAppointmentCollectorTemplateUndefined: Self = StObject.set(x, "appointmentCollectorTemplate", js.undefined)
    
    inline def setAppointmentTemplate(
      value: template | (js.Function3[
          /* model */ AppointmentTemplateData, 
          /* itemIndex */ Double, 
          /* contentElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[typings.std.Element]
        ])
    ): Self = StObject.set(x, "appointmentTemplate", value.asInstanceOf[js.Any])
    
    inline def setAppointmentTemplateFunction3(
      value: (/* model */ AppointmentTemplateData, /* itemIndex */ Double, /* contentElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[typings.std.Element]
    ): Self = StObject.set(x, "appointmentTemplate", js.Any.fromFunction3(value))
    
    inline def setAppointmentTemplateUndefined: Self = StObject.set(x, "appointmentTemplate", js.undefined)
    
    inline def setAppointmentTooltipTemplate(
      value: template | (js.Function3[
          /* model */ AppointmentTooltipTemplateData, 
          /* itemIndex */ Double, 
          /* contentElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[typings.std.Element]
        ])
    ): Self = StObject.set(x, "appointmentTooltipTemplate", value.asInstanceOf[js.Any])
    
    inline def setAppointmentTooltipTemplateFunction3(
      value: (/* model */ AppointmentTooltipTemplateData, /* itemIndex */ Double, /* contentElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[typings.std.Element]
    ): Self = StObject.set(x, "appointmentTooltipTemplate", js.Any.fromFunction3(value))
    
    inline def setAppointmentTooltipTemplateUndefined: Self = StObject.set(x, "appointmentTooltipTemplate", js.undefined)
    
    inline def setCellDuration(value: Double): Self = StObject.set(x, "cellDuration", value.asInstanceOf[js.Any])
    
    inline def setCellDurationUndefined: Self = StObject.set(x, "cellDuration", js.undefined)
    
    inline def setDataCellTemplate(
      value: template | (js.Function3[
          /* itemData */ Any, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[typings.std.Element]
        ])
    ): Self = StObject.set(x, "dataCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setDataCellTemplateFunction3(
      value: (/* itemData */ Any, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[typings.std.Element]
    ): Self = StObject.set(x, "dataCellTemplate", js.Any.fromFunction3(value))
    
    inline def setDataCellTemplateUndefined: Self = StObject.set(x, "dataCellTemplate", js.undefined)
    
    inline def setDateCellTemplate(
      value: template | (js.Function3[
          /* itemData */ Any, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[typings.std.Element]
        ])
    ): Self = StObject.set(x, "dateCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setDateCellTemplateFunction3(
      value: (/* itemData */ Any, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[typings.std.Element]
    ): Self = StObject.set(x, "dateCellTemplate", js.Any.fromFunction3(value))
    
    inline def setDateCellTemplateUndefined: Self = StObject.set(x, "dateCellTemplate", js.undefined)
    
    inline def setDropDownAppointmentTemplate(
      value: template | (js.Function3[
          /* itemData */ Any, 
          /* itemIndex */ Double, 
          /* contentElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[typings.std.Element]
        ])
    ): Self = StObject.set(x, "dropDownAppointmentTemplate", value.asInstanceOf[js.Any])
    
    inline def setDropDownAppointmentTemplateFunction3(
      value: (/* itemData */ Any, /* itemIndex */ Double, /* contentElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[typings.std.Element]
    ): Self = StObject.set(x, "dropDownAppointmentTemplate", js.Any.fromFunction3(value))
    
    inline def setDropDownAppointmentTemplateUndefined: Self = StObject.set(x, "dropDownAppointmentTemplate", js.undefined)
    
    inline def setEndDayHour(value: Double): Self = StObject.set(x, "endDayHour", value.asInstanceOf[js.Any])
    
    inline def setEndDayHourUndefined: Self = StObject.set(x, "endDayHour", js.undefined)
    
    inline def setFirstDayOfWeek(value: FirstDayOfWeek): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    inline def setGroupByDate(value: Boolean): Self = StObject.set(x, "groupByDate", value.asInstanceOf[js.Any])
    
    inline def setGroupByDateUndefined: Self = StObject.set(x, "groupByDate", js.undefined)
    
    inline def setGroupOrientation(value: typings.devextreme.mod.DevExpress.common.Orientation): Self = StObject.set(x, "groupOrientation", value.asInstanceOf[js.Any])
    
    inline def setGroupOrientationUndefined: Self = StObject.set(x, "groupOrientation", js.undefined)
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setIntervalCount(value: Double): Self = StObject.set(x, "intervalCount", value.asInstanceOf[js.Any])
    
    inline def setIntervalCountUndefined: Self = StObject.set(x, "intervalCount", js.undefined)
    
    inline def setMaxAppointmentsPerCell(value: Double | CellAppointmentsLimit): Self = StObject.set(x, "maxAppointmentsPerCell", value.asInstanceOf[js.Any])
    
    inline def setMaxAppointmentsPerCellUndefined: Self = StObject.set(x, "maxAppointmentsPerCell", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceCellTemplate(
      value: template | (js.Function3[
          /* itemData */ Any, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[typings.std.Element]
        ])
    ): Self = StObject.set(x, "resourceCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setResourceCellTemplateFunction3(
      value: (/* itemData */ Any, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[typings.std.Element]
    ): Self = StObject.set(x, "resourceCellTemplate", js.Any.fromFunction3(value))
    
    inline def setResourceCellTemplateUndefined: Self = StObject.set(x, "resourceCellTemplate", js.undefined)
    
    inline def setScrolling(value: dxSchedulerScrolling): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    inline def setStartDate(value: js.Date | Double | String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setStartDayHour(value: Double): Self = StObject.set(x, "startDayHour", value.asInstanceOf[js.Any])
    
    inline def setStartDayHourUndefined: Self = StObject.set(x, "startDayHour", js.undefined)
    
    inline def setTimeCellTemplate(
      value: template | (js.Function3[
          /* itemData */ Any, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[typings.std.Element]
        ])
    ): Self = StObject.set(x, "timeCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setTimeCellTemplateFunction3(
      value: (/* itemData */ Any, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[typings.std.Element]
    ): Self = StObject.set(x, "timeCellTemplate", js.Any.fromFunction3(value))
    
    inline def setTimeCellTemplateUndefined: Self = StObject.set(x, "timeCellTemplate", js.undefined)
    
    inline def setType(value: ViewType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
