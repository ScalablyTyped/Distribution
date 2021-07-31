package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecurrenceEditor
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Generates the recurrence rule with the options selected within the Recurrence Editor.
    * @returns {string}
    */
  def getRecurrenceRule(): String = js.native
  
  @JSName("model")
  var model_RecurrenceEditor: Model = js.native
  
  /** Generates the collection of date, that lies within the selected recurrence start and end date for which the recurrence pattern applies.
    * @param {string} It refers the recurrence rule.
    * @param {any} It refers the start date of the recurrence.
    * @returns {any}
    */
  def recurrenceDateGenerator(recurrenceString: String, startDate: js.Any): js.Any = js.native
  
  /** It splits and returns the recurrence rule string into object collection.
    * @param {string} It refers the recurrence rule string.
    * @param {any} It refers the appointment dates (ExDate) to be excluded
    * @returns {any}
    */
  def recurrenceRuleSplit(recurrenceRule: String, exDate: js.Any): js.Any = js.native
}
object RecurrenceEditor {
  
  trait ChangeEventArgs extends StObject {
    
    /** When set to true, event gets canceled.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Recurrence Editor model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the recurrence rule value.
      */
    var recurrenceRule: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ChangeEventArgs {
    
    @scala.inline
    def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit class ChangeEventArgsMutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRecurrenceRule(value: String): Self = StObject.set(x, "recurrenceRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecurrenceRuleUndefined: Self = StObject.set(x, "recurrenceRule", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggers whenever any of the Recurrence Editor's value is changed.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Accepts the custom CSS class name, that defines user-defined styles and themes to be applied on partial or complete elements of the Recurrence Editor.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Sets the date format for the datepickers available within the Recurrence Editor.
      */
    var dateFormat: js.UndefOr[String] = js.undefined
    
    /** When set to true, renders the Recurrence Editor options from Right-to-Left direction.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, enables the spin button of numeric textboxes within the Recurrence Editor.
      * @Default {true}
      */
    var enableSpinners: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the starting day of the week.
      * @Default {null}
      */
    var firstDayOfWeek: js.UndefOr[String] = js.undefined
    
    /** Defines the collection of recurrence frequencies within Recurrence Editor such as Never, Daily, Weekly, Monthly, Yearly and Every Weekday.
      * @Default {[never, daily, weekly, monthly, yearly, everyweekday]}
      */
    var frequencies: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Sets the specific culture to the Recurrence Editor.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Sets the maximum date limit to display on the datepickers used within the Recurrence Editor. Setting maxDate with specific date value disallows the datepickers within the
      * Recurrence Editor to navigate beyond that date.
      * @Default {new Date(2099, 12, 31)}
      */
    var maxDate: js.UndefOr[js.Any] = js.undefined
    
    /** Sets the minimum date limit to display on the datepickers defined within the Recurrence Editor. Setting minDate with specific date value disallows the datepickers within
      * Recurrence Editor to navigate beyond that date.
      * @Default {new Date(1900, 01, 01)}
      */
    var minDate: js.UndefOr[js.Any] = js.undefined
    
    /** Sets the active/current repeat type(frequency) on Recurrence Editor based on the index value provided. For example, setting the value 1 will initially set the repeat type as Daily
      * and display its related options.
      * @Default {0}
      */
    var selectedRecurrenceType: js.UndefOr[Double] = js.undefined
    
    /** Sets the start date of the recurrence. The Recurrence Editor initially displays the current date as its start date.
      * @Default {new Date()}
      */
    var startDate: js.UndefOr[js.Any] = js.undefined
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.RecurrenceEditor.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.RecurrenceEditor.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.RecurrenceEditor.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableSpinners(value: Boolean): Self = StObject.set(x, "enableSpinners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSpinnersUndefined: Self = StObject.set(x, "enableSpinners", js.undefined)
      
      @scala.inline
      def setFirstDayOfWeek(value: String): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      @scala.inline
      def setFrequencies(value: js.Array[js.Any]): Self = StObject.set(x, "frequencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequenciesUndefined: Self = StObject.set(x, "frequencies", js.undefined)
      
      @scala.inline
      def setFrequenciesVarargs(value: js.Any*): Self = StObject.set(x, "frequencies", js.Array(value :_*))
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxDate(value: js.Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: js.Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setSelectedRecurrenceType(value: Double): Self = StObject.set(x, "selectedRecurrenceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedRecurrenceTypeUndefined: Self = StObject.set(x, "selectedRecurrenceType", js.undefined)
      
      @scala.inline
      def setStartDate(value: js.Any): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
}
