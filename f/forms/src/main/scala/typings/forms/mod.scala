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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("forms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(fields: FormFields): Form = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(fields.asInstanceOf[js.Any]).asInstanceOf[Form]
  @scala.inline
  def create(fields: FormFields, options: ValidatePastFirstError): Form = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Form]
  
  object fields {
    
    @JSImport("forms", "fields")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def array(): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("array")().asInstanceOf[Field]
    @scala.inline
    def array(params: FieldParameters): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(params.asInstanceOf[js.Any]).asInstanceOf[Field]
    
    @scala.inline
    def boolean(): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")().asInstanceOf[Field]
    @scala.inline
    def boolean(params: FieldParameters): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(params.asInstanceOf[js.Any]).asInstanceOf[Field]
    
    @scala.inline
    def date(): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[Field]
    @scala.inline
    def date(params: FieldParameters): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(params.asInstanceOf[js.Any]).asInstanceOf[Field]
    
    @scala.inline
    def email(): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("email")().asInstanceOf[Field]
    @scala.inline
    def email(params: FieldParameters): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("email")(params.asInstanceOf[js.Any]).asInstanceOf[Field]
    
    @scala.inline
    def number(): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[Field]
    @scala.inline
    def number(params: FieldParameters): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(params.asInstanceOf[js.Any]).asInstanceOf[Field]
    
    @scala.inline
    def password(): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("password")().asInstanceOf[Field]
    @scala.inline
    def password(params: FieldParameters): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("password")(params.asInstanceOf[js.Any]).asInstanceOf[Field]
    
    @scala.inline
    def string(): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[Field]
    @scala.inline
    def string(params: FieldParameters): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(params.asInstanceOf[js.Any]).asInstanceOf[Field]
    
    @scala.inline
    def tel(): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("tel")().asInstanceOf[Field]
    @scala.inline
    def tel(params: FieldParameters): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("tel")(params.asInstanceOf[js.Any]).asInstanceOf[Field]
    
    @scala.inline
    def url(): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[Field]
    @scala.inline
    def url(params: FieldParameters): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(params.asInstanceOf[js.Any]).asInstanceOf[Field]
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
    
    @JSImport("forms", "validators")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def alphanumeric(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("alphanumeric")().asInstanceOf[ValidatorFunction]
    @scala.inline
    def alphanumeric(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("alphanumeric")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def color(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("color")().asInstanceOf[ValidatorFunction]
    @scala.inline
    def color(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def date(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[ValidatorFunction]
    @scala.inline
    def date(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def digits(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("digits")().asInstanceOf[ValidatorFunction]
    @scala.inline
    def digits(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("digits")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def email(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("email")().asInstanceOf[ValidatorFunction]
    @scala.inline
    def email(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("email")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def integer(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")().asInstanceOf[ValidatorFunction]
    @scala.inline
    def integer(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def matchField(matchedField: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("matchField")(matchedField.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    @scala.inline
    def matchField(matchedField: String, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("matchField")(matchedField.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def matchValue(valueGetter: js.Function0[js.Any]): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("matchValue")(valueGetter.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    @scala.inline
    def matchValue(valueGetter: js.Function0[js.Any], errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("matchValue")(valueGetter.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def max(value: Double): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(value.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    @scala.inline
    def max(value: Double, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(value.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def maxlength(value: Double): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("maxlength")(value.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    @scala.inline
    def maxlength(value: Double, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("maxlength")(value.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def min(value: Double): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(value.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    @scala.inline
    def min(value: Double, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(value.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def minlength(value: Double): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("minlength")(value.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    @scala.inline
    def minlength(value: Double, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("minlength")(value.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def range(min: Double, max: Double): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    @scala.inline
    def range(min: Double, max: Double, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def rangelength(min: Double, max: Double): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("rangelength")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    @scala.inline
    def rangelength(min: Double, max: Double, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("rangelength")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def regexp(regexp: RegExp): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("regexp")(regexp.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    @scala.inline
    def regexp(regexp: RegExp, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("regexp")(regexp.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def required(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("required")().asInstanceOf[ValidatorFunction]
    @scala.inline
    def required(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("required")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def requiresFieldIfEmpty(alternateField: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("requiresFieldIfEmpty")(alternateField.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    @scala.inline
    def requiresFieldIfEmpty(alternateField: String, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("requiresFieldIfEmpty")(alternateField.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    @scala.inline
    def url(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[ValidatorFunction]
    @scala.inline
    def url(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
  }
  
  object widgets {
    
    @JSImport("forms", "widgets")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def checkbox(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("checkbox")().asInstanceOf[Widget]
    @scala.inline
    def checkbox(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("checkbox")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @scala.inline
    def color(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("color")().asInstanceOf[Widget]
    @scala.inline
    def color(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @scala.inline
    def date(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[Widget]
    @scala.inline
    def date(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @scala.inline
    def email(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("email")().asInstanceOf[Widget]
    @scala.inline
    def email(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("email")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @scala.inline
    def hidden(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("hidden")().asInstanceOf[Widget]
    @scala.inline
    def hidden(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("hidden")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @scala.inline
    def label(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("label")().asInstanceOf[Widget]
    @scala.inline
    def label(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("label")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @scala.inline
    def multipleCheckbox(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleCheckbox")().asInstanceOf[Widget]
    @scala.inline
    def multipleCheckbox(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleCheckbox")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @scala.inline
    def multipleRadio(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleRadio")().asInstanceOf[Widget]
    @scala.inline
    def multipleRadio(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleRadio")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @scala.inline
    def multipleSelect(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleSelect")().asInstanceOf[Widget]
    @scala.inline
    def multipleSelect(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleSelect")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @scala.inline
    def number(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[Widget]
    @scala.inline
    def number(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @scala.inline
    def password(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("password")().asInstanceOf[Widget]
    @scala.inline
    def password(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("password")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @scala.inline
    def select(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[Widget]
    @scala.inline
    def select(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @scala.inline
    def tel(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("tel")().asInstanceOf[Widget]
    @scala.inline
    def tel(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("tel")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @scala.inline
    def text(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("text")().asInstanceOf[Widget]
    @scala.inline
    def text(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    @scala.inline
    def textarea(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("textarea")().asInstanceOf[Widget]
    @scala.inline
    def textarea(params: WidgetParametersrowsnumbe): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("textarea")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
  }
  
  @js.native
  trait Field
    extends StObject
       with FieldParameters {
    
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
    def toHTML(name: String): String = js.native
    def toHTML(name: String, iterator: FieldIterator): String = js.native
    def toHTML(name: Unit, iterator: FieldIterator): String = js.native
    
    /** A widget object to use when rendering the field. */
    @JSName("widget")
    var widget_Field: Widget = js.native
  }
  
  @js.native
  trait FieldArrayChoice
    extends StObject
       with Array[js.Tuple2[String, String | FieldArrayChoice]]
  
  @js.native
  trait FieldBound
    extends StObject
       with Field {
    
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
  
  trait FieldObjectChoice
    extends StObject
       with /* key */ StringDictionary[String | FieldObjectChoice]
  object FieldObjectChoice {
    
    @scala.inline
    def apply(): FieldObjectChoice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldObjectChoice]
    }
  }
  
  trait FieldParameters extends StObject {
    
    /** A list of options, used for multiple choice fields. */
    var choices: js.UndefOr[FieldObjectChoice | FieldArrayChoice] = js.undefined
    
    /** A list of CSS classes for label and field wrapper. */
    var cssClasses: js.UndefOr[typings.forms.anon.Field] = js.undefined
    
    /** If true, the error message will be displayed after the field, rather than before. */
    var errorAfterField: js.UndefOr[Boolean] = js.undefined
    
    /** For widgets with a fieldset (multipleRadio and multipleCheckbox), set classes for the fieldset. */
    var fieldsetClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    /** If true, errors won't be rendered automatically. */
    var hideError: js.UndefOr[Boolean] = js.undefined
    
    /** An optional id to override the default. */
    var id: js.UndefOr[String] = js.undefined
    
    /** Optional label text which overrides the default. */
    var label: js.UndefOr[String] = js.undefined
    
    /** If true, the label text will be displayed after the field, rather than before. */
    var labelAfterField: js.UndefOr[Boolean] = js.undefined
    
    /** For widgets with a fieldset (multipleRadio and multipleCheckbox), set classes for the fieldset's legend. */
    var legendClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Boolean describing whether the field is mandatory. */
    var required: js.UndefOr[Boolean | ValidatorFunction] = js.undefined
    
    /** An array of functions which validate the field data. */
    var validators: js.UndefOr[js.Array[ValidatorFunction]] = js.undefined
    
    /** A widget object to use when rendering the field. */
    var widget: js.UndefOr[Widget] = js.undefined
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
  trait FormBound
    extends StObject
       with Form {
    
    /** Object containing all the parsed data keyed by field name. */
    var data: js.Any = js.native
    
    /** Checks all fields for an error attribute. Returns false if any exist, otherwise returns true. */
    def isValid(): Boolean = js.native
    
    /** Calls validate on each field in the bound form and returns the resulting form object to the callback. */
    def validate(callback: js.Function2[/* err */ String, /* form */ this.type, Unit]): Unit = js.native
  }
  
  trait FormFields
    extends StObject
       with /* key */ StringDictionary[Field | FormFields]
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
  trait Widget
    extends StObject
       with WidgetParameters {
    
    def formatValue(value: js.Any): js.Any = js.native
    
    /** Returns a string containing a HTML representation of the widget for the given field. */
    def toHTML(name: String): String = js.native
    def toHTML(name: String, field: Field): String = js.native
  }
  
  trait WidgetParameters extends StObject {
    
    /** Custom classes to add to the rendered widget. */
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Custom classes to add to the choices label when applicable (multipleRadio and multipleCheckbox) */
    var labelClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    /** A string representing the widget type, e.g. 'text' or 'checkbox' */
    var `type`: js.UndefOr[String] = js.undefined
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
