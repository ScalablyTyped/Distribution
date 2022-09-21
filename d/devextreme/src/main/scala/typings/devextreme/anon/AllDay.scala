package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllDay extends StObject {
  
  /**
    * Specifies whether the appointment lasts all day.
    */
  var allDay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a detail description of the appointment.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the appointment responds to user interaction.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the ending of the appointment.
    */
  var endDate: js.UndefOr[js.Date | String] = js.undefined
  
  /**
    * Specifies the time zone for an appointment&apos;s endDate. Accepts values from the IANA time zone database.
    */
  var endDateTimeZone: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the HTML markup to be inserted into the appointment element.
    */
  var html: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the start date and time of one or more appointments to exclude from a series. This property requires that you also set recurrenceRule.
    */
  var recurrenceException: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a recurrence rule based on which the Scheduler generates an appointment series.
    */
  var recurrenceRule: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the start of the appointment.
    */
  var startDate: js.UndefOr[js.Date | String] = js.undefined
  
  /**
    * Specifies the time zone for an appointment&apos;s startDate. Accepts values from the IANA time zone database.
    */
  var startDateTimeZone: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a template that should be used to render this appointment only.
    */
  var template: js.UndefOr[typings.devextreme.mod.DevExpress.core.template] = js.undefined
  
  /**
    * Specifies the subject of the appointment.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not an appointment must be displayed.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object AllDay {
  
  inline def apply(): AllDay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllDay]
  }
  
  extension [Self <: AllDay](x: Self) {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEndDate(value: js.Date | String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeZone(value: String): Self = StObject.set(x, "endDateTimeZone", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeZoneUndefined: Self = StObject.set(x, "endDateTimeZone", js.undefined)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setRecurrenceException(value: String): Self = StObject.set(x, "recurrenceException", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceExceptionUndefined: Self = StObject.set(x, "recurrenceException", js.undefined)
    
    inline def setRecurrenceRule(value: String): Self = StObject.set(x, "recurrenceRule", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceRuleUndefined: Self = StObject.set(x, "recurrenceRule", js.undefined)
    
    inline def setStartDate(value: js.Date | String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeZone(value: String): Self = StObject.set(x, "startDateTimeZone", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeZoneUndefined: Self = StObject.set(x, "startDateTimeZone", js.undefined)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setTemplate(value: template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
