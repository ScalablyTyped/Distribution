package typings.forms

import org.scalablytyped.runtime.StringDictionary
import typings.forms.anon.Body
import typings.forms.anon.Empty
import typings.forms.anon.ValidatePastFirstError
import typings.forms.anon.WidgetParametersrowsnumbe
import typings.std.Array
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("forms", "create")
  @js.native
  def create(fields: FormFields): Form = js.native
  @JSImport("forms", "create")
  @js.native
  def create(fields: FormFields, options: ValidatePastFirstError): Form = js.native
  
  object fields {
    
    @JSImport("forms", "fields.array")
    @js.native
    def array(): Field = js.native
    @JSImport("forms", "fields.array")
    @js.native
    def array(params: FieldParameters): Field = js.native
    
    @JSImport("forms", "fields.boolean")
    @js.native
    def boolean(): Field = js.native
    @JSImport("forms", "fields.boolean")
    @js.native
    def boolean(params: FieldParameters): Field = js.native
    
    @JSImport("forms", "fields.date")
    @js.native
    def date(): Field = js.native
    @JSImport("forms", "fields.date")
    @js.native
    def date(params: FieldParameters): Field = js.native
    
    @JSImport("forms", "fields.email")
    @js.native
    def email(): Field = js.native
    @JSImport("forms", "fields.email")
    @js.native
    def email(params: FieldParameters): Field = js.native
    
    @JSImport("forms", "fields.number")
    @js.native
    def number(): Field = js.native
    @JSImport("forms", "fields.number")
    @js.native
    def number(params: FieldParameters): Field = js.native
    
    @JSImport("forms", "fields.password")
    @js.native
    def password(): Field = js.native
    @JSImport("forms", "fields.password")
    @js.native
    def password(params: FieldParameters): Field = js.native
    
    @JSImport("forms", "fields.string")
    @js.native
    def string(): Field = js.native
    @JSImport("forms", "fields.string")
    @js.native
    def string(params: FieldParameters): Field = js.native
    
    @JSImport("forms", "fields.tel")
    @js.native
    def tel(): Field = js.native
    @JSImport("forms", "fields.tel")
    @js.native
    def tel(params: FieldParameters): Field = js.native
    
    @JSImport("forms", "fields.url")
    @js.native
    def url(): Field = js.native
    @JSImport("forms", "fields.url")
    @js.native
    def url(params: FieldParameters): Field = js.native
  }
  
  object render {
    
    @JSImport("forms", "render.div")
    @js.native
    val div: RenderFunction = js.native
    
    @JSImport("forms", "render.li")
    @js.native
    val li: RenderFunction = js.native
    
    @JSImport("forms", "render.p")
    @js.native
    val p: RenderFunction = js.native
    
    @JSImport("forms", "render.table")
    @js.native
    val table: RenderFunction = js.native
  }
  
  object validators {
    
    @JSImport("forms", "validators.alphanumeric")
    @js.native
    def alphanumeric(): ValidatorFunction = js.native
    @JSImport("forms", "validators.alphanumeric")
    @js.native
    def alphanumeric(errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.color")
    @js.native
    def color(): ValidatorFunction = js.native
    @JSImport("forms", "validators.color")
    @js.native
    def color(errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.date")
    @js.native
    def date(): ValidatorFunction = js.native
    @JSImport("forms", "validators.date")
    @js.native
    def date(errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.digits")
    @js.native
    def digits(): ValidatorFunction = js.native
    @JSImport("forms", "validators.digits")
    @js.native
    def digits(errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.email")
    @js.native
    def email(): ValidatorFunction = js.native
    @JSImport("forms", "validators.email")
    @js.native
    def email(errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.integer")
    @js.native
    def integer(): ValidatorFunction = js.native
    @JSImport("forms", "validators.integer")
    @js.native
    def integer(errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.matchField")
    @js.native
    def matchField(matchedField: String): ValidatorFunction = js.native
    @JSImport("forms", "validators.matchField")
    @js.native
    def matchField(matchedField: String, errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.matchValue")
    @js.native
    def matchValue(valueGetter: js.Function0[_]): ValidatorFunction = js.native
    @JSImport("forms", "validators.matchValue")
    @js.native
    def matchValue(valueGetter: js.Function0[_], errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.max")
    @js.native
    def max(value: Double): ValidatorFunction = js.native
    @JSImport("forms", "validators.max")
    @js.native
    def max(value: Double, errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.maxlength")
    @js.native
    def maxlength(value: Double): ValidatorFunction = js.native
    @JSImport("forms", "validators.maxlength")
    @js.native
    def maxlength(value: Double, errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.min")
    @js.native
    def min(value: Double): ValidatorFunction = js.native
    @JSImport("forms", "validators.min")
    @js.native
    def min(value: Double, errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.minlength")
    @js.native
    def minlength(value: Double): ValidatorFunction = js.native
    @JSImport("forms", "validators.minlength")
    @js.native
    def minlength(value: Double, errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.range")
    @js.native
    def range(min: Double, max: Double): ValidatorFunction = js.native
    @JSImport("forms", "validators.range")
    @js.native
    def range(min: Double, max: Double, errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.rangelength")
    @js.native
    def rangelength(min: Double, max: Double): ValidatorFunction = js.native
    @JSImport("forms", "validators.rangelength")
    @js.native
    def rangelength(min: Double, max: Double, errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.regexp")
    @js.native
    def regexp(regexp: RegExp): ValidatorFunction = js.native
    @JSImport("forms", "validators.regexp")
    @js.native
    def regexp(regexp: RegExp, errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.required")
    @js.native
    def required(): ValidatorFunction = js.native
    @JSImport("forms", "validators.required")
    @js.native
    def required(errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.requiresFieldIfEmpty")
    @js.native
    def requiresFieldIfEmpty(alternateField: String): ValidatorFunction = js.native
    @JSImport("forms", "validators.requiresFieldIfEmpty")
    @js.native
    def requiresFieldIfEmpty(alternateField: String, errorMessage: String): ValidatorFunction = js.native
    
    @JSImport("forms", "validators.url")
    @js.native
    def url(): ValidatorFunction = js.native
    @JSImport("forms", "validators.url")
    @js.native
    def url(errorMessage: String): ValidatorFunction = js.native
  }
  
  object widgets {
    
    @JSImport("forms", "widgets.checkbox")
    @js.native
    def checkbox(): Widget = js.native
    @JSImport("forms", "widgets.checkbox")
    @js.native
    def checkbox(params: WidgetParameters): Widget = js.native
    
    @JSImport("forms", "widgets.color")
    @js.native
    def color(): Widget = js.native
    @JSImport("forms", "widgets.color")
    @js.native
    def color(params: WidgetParameters): Widget = js.native
    
    @JSImport("forms", "widgets.date")
    @js.native
    def date(): Widget = js.native
    @JSImport("forms", "widgets.date")
    @js.native
    def date(params: WidgetParameters): Widget = js.native
    
    @JSImport("forms", "widgets.email")
    @js.native
    def email(): Widget = js.native
    @JSImport("forms", "widgets.email")
    @js.native
    def email(params: WidgetParameters): Widget = js.native
    
    @JSImport("forms", "widgets.hidden")
    @js.native
    def hidden(): Widget = js.native
    @JSImport("forms", "widgets.hidden")
    @js.native
    def hidden(params: WidgetParameters): Widget = js.native
    
    @JSImport("forms", "widgets.label")
    @js.native
    def label(): Widget = js.native
    @JSImport("forms", "widgets.label")
    @js.native
    def label(params: WidgetParameters): Widget = js.native
    
    @JSImport("forms", "widgets.multipleCheckbox")
    @js.native
    def multipleCheckbox(): Widget = js.native
    @JSImport("forms", "widgets.multipleCheckbox")
    @js.native
    def multipleCheckbox(params: WidgetParameters): Widget = js.native
    
    @JSImport("forms", "widgets.multipleRadio")
    @js.native
    def multipleRadio(): Widget = js.native
    @JSImport("forms", "widgets.multipleRadio")
    @js.native
    def multipleRadio(params: WidgetParameters): Widget = js.native
    
    @JSImport("forms", "widgets.multipleSelect")
    @js.native
    def multipleSelect(): Widget = js.native
    @JSImport("forms", "widgets.multipleSelect")
    @js.native
    def multipleSelect(params: WidgetParameters): Widget = js.native
    
    @JSImport("forms", "widgets.number")
    @js.native
    def number(): Widget = js.native
    @JSImport("forms", "widgets.number")
    @js.native
    def number(params: WidgetParameters): Widget = js.native
    
    @JSImport("forms", "widgets.password")
    @js.native
    def password(): Widget = js.native
    @JSImport("forms", "widgets.password")
    @js.native
    def password(params: WidgetParameters): Widget = js.native
    
    @JSImport("forms", "widgets.select")
    @js.native
    def select(): Widget = js.native
    @JSImport("forms", "widgets.select")
    @js.native
    def select(params: WidgetParameters): Widget = js.native
    
    @JSImport("forms", "widgets.tel")
    @js.native
    def tel(): Widget = js.native
    @JSImport("forms", "widgets.tel")
    @js.native
    def tel(params: WidgetParameters): Widget = js.native
    
    @JSImport("forms", "widgets.text")
    @js.native
    def text(): Widget = js.native
    @JSImport("forms", "widgets.text")
    @js.native
    def text(params: WidgetParameters): Widget = js.native
    
    @JSImport("forms", "widgets.textarea")
    @js.native
    def textarea(): Widget = js.native
    @JSImport("forms", "widgets.textarea")
    @js.native
    def textarea(params: WidgetParametersrowsnumbe): Widget = js.native
  }
  
  @js.native
  trait Field extends FieldParameters {
    
    /** Returns a new bound field object. Calls parse on the data and stores in the bound field's data attribute, stores the raw value in the value attribute. */
    def bind(rawData: js.Any): FieldBound = js.native
    
    /** Returns an array of default CSS classes considering the field's attributes, e.g. ['field', 'required', 'error'] for a required field with an error message. */
    def classes(): js.Array[String] = js.native
    
    /** Returns a string containing a HTML element containing the fields error message, or an empty string if there is no error associated with the field. */
    def errorHTML(): String = js.native
    
    /** Returns a string containing a label element with the correct 'for' attribute containing the text from field.labelText(name). */
    def labelHTML(name: String): String = js.native
    def labelHTML(name: String, id: String): String = js.native
    def labelHTML(name: String, id: Boolean): String = js.native
    
    /** Returns a string containing the label text from field.label, or defaults to using the field name with underscores replaced with spaces and the first letter capitalised. */
    def labelText(): String = js.native
    def labelText(name: String): String = js.native
    
    /** Coerces the raw data from the request into the correct format for the field, returning the result, e.g. '123' becomes 123 for the number field. */
    def parse(rawData: js.Any): js.Any = js.native
    
    /**
      * Calls the iterator with the name and field object as arguments. Defaults to using forms.render.div as the iterator,
      * which returns a HTML representation of the field label, error message and widget wrapped in a div.
      */
    def toHTML(): String = js.native
    def toHTML(name: js.UndefOr[scala.Nothing], iterator: FieldIterator): String = js.native
    def toHTML(name: String): String = js.native
    def toHTML(name: String, iterator: FieldIterator): String = js.native
    
    /** A widget object to use when rendering the field. */
    @JSName("widget")
    var widget_Field: Widget = js.native
  }
  
  @js.native
  trait FieldArrayChoice
    extends Array[js.Tuple2[String, String | FieldArrayChoice]]
  
  @js.native
  trait FieldBound extends Field {
    
    /** The request data coerced to the correct format for this field. */
    var data: js.Any = js.native
    
    /** An error message if the field fails validation. */
    var error: String = js.native
    
    /**
      * Checks if the field is required and whether it is empty. Then runs the validator functions in order until one fails or they all pass.
      * If a validator fails, the resulting message is stored in the field's error attribute.
      */
    def validate(form: Form, callback: js.Function2[/* err */ String, /* field */ Field, Unit]): Unit = js.native
    
    /** The raw value from the request data. */
    var value: js.Any = js.native
  }
  
  type FieldIterator = js.Function2[/* name */ String, /* field */ FieldBound, String]
  
  @js.native
  trait FieldObjectChoice extends /* key */ StringDictionary[String | FieldObjectChoice]
  object FieldObjectChoice {
    
    @scala.inline
    def apply(): FieldObjectChoice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldObjectChoice]
    }
  }
  
  @js.native
  trait FieldParameters extends StObject {
    
    /** A list of options, used for multiple choice fields. */
    var choices: js.UndefOr[FieldObjectChoice | FieldArrayChoice] = js.native
    
    /** A list of CSS classes for label and field wrapper. */
    var cssClasses: js.UndefOr[typings.forms.anon.Field] = js.native
    
    /** If true, the error message will be displayed after the field, rather than before. */
    var errorAfterField: js.UndefOr[Boolean] = js.native
    
    /** For widgets with a fieldset (multipleRadio and multipleCheckbox), set classes for the fieldset. */
    var fieldsetClasses: js.UndefOr[js.Array[String]] = js.native
    
    /** If true, errors won't be rendered automatically. */
    var hideError: js.UndefOr[Boolean] = js.native
    
    /** An optional id to override the default. */
    var id: js.UndefOr[String] = js.native
    
    /** Optional label text which overrides the default. */
    var label: js.UndefOr[String] = js.native
    
    /** If true, the label text will be displayed after the field, rather than before. */
    var labelAfterField: js.UndefOr[Boolean] = js.native
    
    /** For widgets with a fieldset (multipleRadio and multipleCheckbox), set classes for the fieldset's legend. */
    var legendClasses: js.UndefOr[js.Array[String]] = js.native
    
    /** Boolean describing whether the field is mandatory. */
    var required: js.UndefOr[Boolean | ValidatorFunction] = js.native
    
    /** An array of functions which validate the field data. */
    var validators: js.UndefOr[js.Array[ValidatorFunction]] = js.native
    
    /** A widget object to use when rendering the field. */
    var widget: js.UndefOr[Widget] = js.native
  }
  object FieldParameters {
    
    @scala.inline
    def apply(): FieldParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldParameters]
    }
    
    @scala.inline
    implicit class FieldParametersMutableBuilder[Self <: FieldParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChoices(value: FieldObjectChoice | FieldArrayChoice): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      @scala.inline
      def setCssClasses(value: typings.forms.anon.Field): Self = StObject.set(x, "cssClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassesUndefined: Self = StObject.set(x, "cssClasses", js.undefined)
      
      @scala.inline
      def setErrorAfterField(value: Boolean): Self = StObject.set(x, "errorAfterField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorAfterFieldUndefined: Self = StObject.set(x, "errorAfterField", js.undefined)
      
      @scala.inline
      def setFieldsetClasses(value: js.Array[String]): Self = StObject.set(x, "fieldsetClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsetClassesUndefined: Self = StObject.set(x, "fieldsetClasses", js.undefined)
      
      @scala.inline
      def setFieldsetClassesVarargs(value: String*): Self = StObject.set(x, "fieldsetClasses", js.Array(value :_*))
      
      @scala.inline
      def setHideError(value: Boolean): Self = StObject.set(x, "hideError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideErrorUndefined: Self = StObject.set(x, "hideError", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAfterField(value: Boolean): Self = StObject.set(x, "labelAfterField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAfterFieldUndefined: Self = StObject.set(x, "labelAfterField", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLegendClasses(value: js.Array[String]): Self = StObject.set(x, "legendClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendClassesUndefined: Self = StObject.set(x, "legendClasses", js.undefined)
      
      @scala.inline
      def setLegendClassesVarargs(value: String*): Self = StObject.set(x, "legendClasses", js.Array(value :_*))
      
      @scala.inline
      def setRequired(value: Boolean | ValidatorFunction): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredFunction3(
        value: (/* form */ FormBound, /* field */ FieldBound, /* callback */ js.Function1[/* err */ js.UndefOr[String], Unit]) => Unit
      ): Self = StObject.set(x, "required", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setValidators(value: js.Array[ValidatorFunction]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
      
      @scala.inline
      def setValidatorsVarargs(value: ValidatorFunction*): Self = StObject.set(x, "validators", js.Array(value :_*))
      
      @scala.inline
      def setWidget(value: Widget): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
    }
  }
  
  @js.native
  trait Form extends StObject {
    
    /** Binds data to correct fields, returning a new bound form object. */
    def bind(data: js.Any): FormBound = js.native
    
    /** Field objects this form was created with */
    var fields: FormFields = js.native
    
    /** Inspects a request or object literal and binds any data to the correct fields. */
    def handle(req: Body, callbacks: Empty): Unit = js.native
    
    /**
      * Runs toHTML on each field returning the result.
      * If an iterator is specified, it is called for each field with the field name and object as it's arguments,
      * the iterator's results are concatenated to create the HTML output, allowing for highly customised markup.
      */
    def toHTML(): String = js.native
    def toHTML(iterator: FieldIterator): String = js.native
  }
  
  @js.native
  trait FormBound extends Form {
    
    /** Object containing all the parsed data keyed by field name. */
    var data: js.Any = js.native
    
    /** Checks all fields for an error attribute. Returns false if any exist, otherwise returns true. */
    def isValid(): Boolean = js.native
    
    /** Calls validate on each field in the bound form and returns the resulting form object to the callback. */
    def validate(callback: js.Function2[/* err */ String, /* form */ this.type, Unit]): Unit = js.native
  }
  
  @js.native
  trait FormFields extends /* key */ StringDictionary[Field | FormFields]
  object FormFields {
    
    @scala.inline
    def apply(): FormFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFields]
    }
  }
  
  type FormHandleCallback = js.Function1[/* form */ Form, Unit]
  
  type RenderFunction = js.Function2[/* name */ String, /* field */ Field, String]
  
  type ValidatorFunction = js.Function3[
    /* form */ FormBound, 
    /* field */ FieldBound, 
    /* callback */ js.Function1[/* err */ js.UndefOr[String], Unit], 
    Unit
  ]
  
  @js.native
  trait Widget extends WidgetParameters {
    
    def formatValue(value: js.Any): js.Any = js.native
    
    /** Returns a string containing a HTML representation of the widget for the given field. */
    def toHTML(name: String): String = js.native
    def toHTML(name: String, field: Field): String = js.native
  }
  
  @js.native
  trait WidgetParameters extends StObject {
    
    /** Custom classes to add to the rendered widget. */
    var classes: js.UndefOr[js.Array[String]] = js.native
    
    /** Custom classes to add to the choices label when applicable (multipleRadio and multipleCheckbox) */
    var labelClasses: js.UndefOr[js.Array[String]] = js.native
    
    /** A string representing the widget type, e.g. 'text' or 'checkbox' */
    var `type`: js.UndefOr[String] = js.native
  }
  object WidgetParameters {
    
    @scala.inline
    def apply(): WidgetParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetParameters]
    }
    
    @scala.inline
    implicit class WidgetParametersMutableBuilder[Self <: WidgetParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
      
      @scala.inline
      def setLabelClasses(value: js.Array[String]): Self = StObject.set(x, "labelClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelClassesUndefined: Self = StObject.set(x, "labelClasses", js.undefined)
      
      @scala.inline
      def setLabelClassesVarargs(value: String*): Self = StObject.set(x, "labelClasses", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
