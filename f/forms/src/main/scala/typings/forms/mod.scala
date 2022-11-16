package typings.forms

import org.scalablytyped.runtime.StringDictionary
import typings.forms.anon.Empty
import typings.forms.anon.ValidatePastFirstError
import typings.forms.anon.WidgetParametersrowsnumbe
import typings.node.httpMod.IncomingMessage
import typings.std.Array
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("forms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create[Fields /* <: FormFields */](fields: Fields): Form[Fields] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(fields.asInstanceOf[js.Any]).asInstanceOf[Form[Fields]]
  inline def create[Fields /* <: FormFields */](fields: Fields, options: ValidatePastFirstError): Form[Fields] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Form[Fields]]
  
  object fields {
    
    @JSImport("forms", "fields")
    @js.native
    val ^ : js.Any = js.native
    
    inline def array(): Field[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")().asInstanceOf[Field[js.Array[Any]]]
    inline def array(params: FieldParameters): Field[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(params.asInstanceOf[js.Any]).asInstanceOf[Field[js.Array[Any]]]
    
    inline def boolean(): Field[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")().asInstanceOf[Field[Boolean]]
    inline def boolean(params: FieldParameters): Field[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(params.asInstanceOf[js.Any]).asInstanceOf[Field[Boolean]]
    
    inline def date(): Field[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[Field[String]]
    inline def date(params: FieldParameters): Field[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(params.asInstanceOf[js.Any]).asInstanceOf[Field[String]]
    
    inline def email(): Field[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("email")().asInstanceOf[Field[String]]
    inline def email(params: FieldParameters): Field[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("email")(params.asInstanceOf[js.Any]).asInstanceOf[Field[String]]
    
    inline def number(): Field[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[Field[Double]]
    inline def number(params: FieldParameters): Field[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(params.asInstanceOf[js.Any]).asInstanceOf[Field[Double]]
    
    inline def password(): Field[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("password")().asInstanceOf[Field[String]]
    inline def password(params: FieldParameters): Field[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("password")(params.asInstanceOf[js.Any]).asInstanceOf[Field[String]]
    
    inline def string(): Field[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[Field[String]]
    inline def string(params: FieldParameters): Field[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(params.asInstanceOf[js.Any]).asInstanceOf[Field[String]]
    
    inline def tel(): Field[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("tel")().asInstanceOf[Field[String]]
    inline def tel(params: FieldParameters): Field[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("tel")(params.asInstanceOf[js.Any]).asInstanceOf[Field[String]]
    
    inline def url(): Field[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[Field[String]]
    inline def url(params: FieldParameters): Field[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(params.asInstanceOf[js.Any]).asInstanceOf[Field[String]]
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
    
    inline def alphanumeric(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("alphanumeric")().asInstanceOf[ValidatorFunction]
    inline def alphanumeric(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("alphanumeric")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    
    inline def color(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("color")().asInstanceOf[ValidatorFunction]
    inline def color(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    
    inline def date(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[ValidatorFunction]
    inline def date(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    
    inline def digits(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("digits")().asInstanceOf[ValidatorFunction]
    inline def digits(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("digits")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    
    inline def email(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("email")().asInstanceOf[ValidatorFunction]
    inline def email(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("email")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    
    inline def integer(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")().asInstanceOf[ValidatorFunction]
    inline def integer(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    
    inline def matchField(matchedField: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("matchField")(matchedField.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    inline def matchField(matchedField: String, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("matchField")(matchedField.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    inline def matchValue(valueGetter: js.Function0[Any]): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("matchValue")(valueGetter.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    inline def matchValue(valueGetter: js.Function0[Any], errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("matchValue")(valueGetter.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    inline def max(value: Double): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(value.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    inline def max(value: Double, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(value.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    inline def maxlength(value: Double): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("maxlength")(value.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    inline def maxlength(value: Double, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("maxlength")(value.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    inline def min(value: Double): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(value.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    inline def min(value: Double, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(value.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    inline def minlength(value: Double): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("minlength")(value.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    inline def minlength(value: Double, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("minlength")(value.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    inline def range(min: Double, max: Double): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    inline def range(min: Double, max: Double, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    inline def rangelength(min: Double, max: Double): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("rangelength")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    inline def rangelength(min: Double, max: Double, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("rangelength")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    inline def regexp(regexp: js.RegExp): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("regexp")(regexp.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    inline def regexp(regexp: js.RegExp, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("regexp")(regexp.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    inline def required(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("required")().asInstanceOf[ValidatorFunction]
    inline def required(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("required")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    
    inline def requiresFieldIfEmpty(alternateField: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("requiresFieldIfEmpty")(alternateField.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
    inline def requiresFieldIfEmpty(alternateField: String, errorMessage: String): ValidatorFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("requiresFieldIfEmpty")(alternateField.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[ValidatorFunction]
    
    inline def url(): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[ValidatorFunction]
    inline def url(errorMessage: String): ValidatorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(errorMessage.asInstanceOf[js.Any]).asInstanceOf[ValidatorFunction]
  }
  
  object widgets {
    
    @JSImport("forms", "widgets")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkbox(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("checkbox")().asInstanceOf[Widget]
    inline def checkbox(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("checkbox")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    inline def color(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("color")().asInstanceOf[Widget]
    inline def color(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    inline def date(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[Widget]
    inline def date(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    inline def email(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("email")().asInstanceOf[Widget]
    inline def email(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("email")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    inline def hidden(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("hidden")().asInstanceOf[Widget]
    inline def hidden(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("hidden")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    inline def label(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("label")().asInstanceOf[Widget]
    inline def label(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("label")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    inline def multipleCheckbox(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleCheckbox")().asInstanceOf[Widget]
    inline def multipleCheckbox(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleCheckbox")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    inline def multipleRadio(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleRadio")().asInstanceOf[Widget]
    inline def multipleRadio(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleRadio")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    inline def multipleSelect(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleSelect")().asInstanceOf[Widget]
    inline def multipleSelect(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleSelect")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    inline def number(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[Widget]
    inline def number(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    inline def password(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("password")().asInstanceOf[Widget]
    inline def password(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("password")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    inline def select(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[Widget]
    inline def select(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    inline def tel(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("tel")().asInstanceOf[Widget]
    inline def tel(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("tel")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    inline def text(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("text")().asInstanceOf[Widget]
    inline def text(params: WidgetParameters): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    inline def textarea(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("textarea")().asInstanceOf[Widget]
    inline def textarea(params: WidgetParametersrowsnumbe): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("textarea")(params.asInstanceOf[js.Any]).asInstanceOf[Widget]
  }
  
  @js.native
  trait Field[Data]
    extends StObject
       with FieldParameters {
    
    /** Returns a new bound field object. Calls parse on the data and stores in the bound field's data attribute, stores the raw value in the value attribute. */
    def bind[RawData](rawData: RawData): FieldBound[Data, RawData] = js.native
    
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
    def parse(rawData: Any): Data = js.native
    
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
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type FieldArrayChoice = std.Array<[string, string | forms.forms.FieldArrayChoice]>
  }}}
  to avoid circular code involving: 
  - forms.forms.FieldArrayChoice
  */
  @js.native
  trait FieldArrayChoice
    extends StObject
       with Array[js.Tuple2[String, String | FieldArrayChoice]]
  
  /* Inlined forms.forms.Field<Data> & {  value :RawData,   data :Data,   error :string, validate (form : forms.forms.Form<forms.forms.FormFields>, callback : (err : string, field : forms.forms.Field<unknown>): void): void} */
  @js.native
  trait FieldBound[Data, RawData] extends StObject {
    
    /** Returns a new bound field object. Calls parse on the data and stores in the bound field's data attribute, stores the raw value in the value attribute. */
    def bind[RawData](rawData: RawData): FieldBound[Data, RawData] = js.native
    
    /** A list of options, used for multiple choice fields. */
    var choices: js.UndefOr[FieldObjectChoice | FieldArrayChoice] = js.native
    
    /** Returns an array of default CSS classes considering the field's attributes, e.g. ['field', 'required', 'error'] for a required field with an error message. */
    def classes(): js.Array[String] = js.native
    
    /** A list of CSS classes for label and field wrapper. */
    var cssClasses: js.UndefOr[typings.forms.anon.Field] = js.native
    
    /** The request data coerced to the correct format for this field. */
    var data: Data = js.native
    
    /** An error message if the field fails validation. */
    var error: String = js.native
    
    /** If true, the error message will be displayed after the field, rather than before. */
    var errorAfterField: js.UndefOr[Boolean] = js.native
    
    /** Returns a string containing a HTML element containing the fields error message, or an empty string if there is no error associated with the field. */
    def errorHTML(): String = js.native
    
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
    
    /** Returns a string containing a label element with the correct 'for' attribute containing the text from field.labelText(name). */
    def labelHTML(name: String): String = js.native
    def labelHTML(name: String, id: String): String = js.native
    def labelHTML(name: String, id: Boolean): String = js.native
    
    /** Returns a string containing the label text from field.label, or defaults to using the field name with underscores replaced with spaces and the first letter capitalised. */
    def labelText(): String = js.native
    def labelText(name: String): String = js.native
    
    /** For widgets with a fieldset (multipleRadio and multipleCheckbox), set classes for the fieldset's legend. */
    var legendClasses: js.UndefOr[js.Array[String]] = js.native
    
    /** Coerces the raw data from the request into the correct format for the field, returning the result, e.g. '123' becomes 123 for the number field. */
    def parse(rawData: Any): Data = js.native
    
    /** Boolean describing whether the field is mandatory. */
    var required: js.UndefOr[Boolean | ValidatorFunction] = js.native
    
    /**
      * Calls the iterator with the name and field object as arguments. Defaults to using forms.render.div as the iterator,
      * which returns a HTML representation of the field label, error message and widget wrapped in a div.
      */
    def toHTML(): String = js.native
    def toHTML(name: String): String = js.native
    def toHTML(name: String, iterator: FieldIterator): String = js.native
    def toHTML(name: Unit, iterator: FieldIterator): String = js.native
    
    /**
      * Checks if the field is required and whether it is empty. Then runs the validator functions in order until one fails or they all pass.
      * If a validator fails, the resulting message is stored in the field's error attribute.
      */
    def validate(form: Form[FormFields], callback: js.Function2[/* err */ String, /* field */ Field[Any], Unit]): Unit = js.native
    
    /** An array of functions which validate the field data. */
    var validators: js.UndefOr[js.Array[ValidatorFunction]] = js.native
    
    /** The raw value from the request data. */
    var value: RawData = js.native
    
    /** A widget object to use when rendering the field. */
    var widget: Widget = js.native
  }
  
  type FieldIterator = js.Function2[/* name */ String, /* field */ FieldBound[Any, Any], String]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type FieldObjectChoice = {[key: string] : string | forms.forms.FieldObjectChoice}
  }}}
  to avoid circular code involving: 
  - forms.forms.FieldObjectChoice
  */
  trait FieldObjectChoice
    extends StObject
       with /* key */ StringDictionary[String | FieldObjectChoice]
  object FieldObjectChoice {
    
    inline def apply(): FieldObjectChoice = {
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
    
    inline def apply(): FieldParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldParameters]
    }
    
    extension [Self <: FieldParameters](x: Self) {
      
      inline def setChoices(value: FieldObjectChoice | FieldArrayChoice): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      inline def setCssClasses(value: typings.forms.anon.Field): Self = StObject.set(x, "cssClasses", value.asInstanceOf[js.Any])
      
      inline def setCssClassesUndefined: Self = StObject.set(x, "cssClasses", js.undefined)
      
      inline def setErrorAfterField(value: Boolean): Self = StObject.set(x, "errorAfterField", value.asInstanceOf[js.Any])
      
      inline def setErrorAfterFieldUndefined: Self = StObject.set(x, "errorAfterField", js.undefined)
      
      inline def setFieldsetClasses(value: js.Array[String]): Self = StObject.set(x, "fieldsetClasses", value.asInstanceOf[js.Any])
      
      inline def setFieldsetClassesUndefined: Self = StObject.set(x, "fieldsetClasses", js.undefined)
      
      inline def setFieldsetClassesVarargs(value: String*): Self = StObject.set(x, "fieldsetClasses", js.Array(value*))
      
      inline def setHideError(value: Boolean): Self = StObject.set(x, "hideError", value.asInstanceOf[js.Any])
      
      inline def setHideErrorUndefined: Self = StObject.set(x, "hideError", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelAfterField(value: Boolean): Self = StObject.set(x, "labelAfterField", value.asInstanceOf[js.Any])
      
      inline def setLabelAfterFieldUndefined: Self = StObject.set(x, "labelAfterField", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegendClasses(value: js.Array[String]): Self = StObject.set(x, "legendClasses", value.asInstanceOf[js.Any])
      
      inline def setLegendClassesUndefined: Self = StObject.set(x, "legendClasses", js.undefined)
      
      inline def setLegendClassesVarargs(value: String*): Self = StObject.set(x, "legendClasses", js.Array(value*))
      
      inline def setRequired(value: Boolean | ValidatorFunction): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredFunction3(
        value: (/* form */ FormBound[Any, FormData[Any]], /* field */ FieldBound[Any, Any], /* callback */ js.Function1[/* err */ js.UndefOr[String], Unit]) => Unit
      ): Self = StObject.set(x, "required", js.Any.fromFunction3(value))
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setValidators(value: js.Array[ValidatorFunction]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
      
      inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
      
      inline def setValidatorsVarargs(value: ValidatorFunction*): Self = StObject.set(x, "validators", js.Array(value*))
      
      inline def setWidget(value: Widget): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
      
      inline def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
    }
  }
  
  @js.native
  trait Form[Fields /* <: FormFields */] extends StObject {
    
    /** Binds data to correct fields, returning a new bound form object. */
    def bind[Data /* <: Partial[FormData[Fields]] */](): FormBound[Fields, Data] = js.native
    def bind[Data /* <: Partial[FormData[Fields]] */](data: Data & StringDictionary[Any]): FormBound[Fields, Data] = js.native
    
    /** Field objects this form was created with */
    var fields: Fields = js.native
    
    /** Inspects a request or object literal and binds any data to the correct fields. */
    def handle[Data /* <: IncomingMessage | (Partial[FormData[Fields]] & StringDictionary[Any]) */](req: Data, callbacks: Empty[Fields, Data]): Unit = js.native
    def handle[Data /* <: IncomingMessage | (Partial[FormData[Fields]] & StringDictionary[Any]) */](req: Unit, callbacks: Empty[Fields, Data]): Unit = js.native
    
    /**
      * Runs toHTML on each field returning the result.
      * If an iterator is specified, it is called for each field with the field name and object as it's arguments,
      * the iterator's results are concatenated to create the HTML output, allowing for highly customised markup.
      */
    def toHTML(): String = js.native
    def toHTML(iterator: FieldIterator): String = js.native
  }
  
  trait FormBound[Fields /* <: FormFields */, Data /* <: Partial[FormData[Fields]] */] extends StObject {
    
    /** Object containing all the parsed data keyed by field name. */
    var data: FormData[Fields] & Data
    
    /** Checks all fields for an error attribute. Returns false if any exist, otherwise returns true. */
    def isValid(): Boolean
    
    /** Calls validate on each field in the bound form and returns the resulting form object to the callback. */
    def validate(callback: js.Function2[/* err */ String, /* form */ FormBound[Fields, Data], Unit]): Unit
  }
  object FormBound {
    
    inline def apply[Fields /* <: FormFields */, Data /* <: Partial[FormData[Fields]] */](
      data: FormData[Fields] & Data,
      isValid: () => Boolean,
      validate: js.Function2[/* err */ String, /* form */ FormBound[Fields, Data], Unit] => Unit
    ): FormBound[Fields, Data] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isValid = js.Any.fromFunction0(isValid), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[FormBound[Fields, Data]]
    }
    
    extension [Self <: FormBound[?, ?], Fields /* <: FormFields */, Data /* <: Partial[FormData[Fields]] */](x: Self & (FormBound[Fields, Data])) {
      
      inline def setData(value: FormData[Fields] & Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
      
      inline def setValidate(value: js.Function2[/* err */ String, /* form */ FormBound[Fields, Data], Unit] => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Key in keyof Fields ]: Fields[Key] extends forms.forms.Field<unknown>? std.ReturnType<Fields[Key]['parse']> : never}
    }}}
    */
  @js.native
  trait FormData[Fields /* <: FormFields */] extends StObject
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type FormFields = {[key: string] : forms.forms.Field<unknown> | forms.forms.FormFields}
  }}}
  to avoid circular code involving: 
  - forms.forms.FormFields
  */
  trait FormFields
    extends StObject
       with /* key */ StringDictionary[Field[Any] | FormFields]
  object FormFields {
    
    inline def apply(): FormFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFields]
    }
  }
  
  type FormHandleCallback[Fields /* <: FormFields */, Data /* <: IncomingMessage | (Partial[FormData[Fields]] & StringDictionary[Any]) */] = js.Function1[
    /* form */ FormBound[
      Fields, 
      /* import warning: importer.ImportType#apply Failed type conversion: Data extends node.http.IncomingMessage ? forms.forms.FormData<Fields> : Data */ js.Any
    ], 
    Unit
  ]
  
  type RenderFunction = js.Function2[/* name */ String, /* field */ Field[Any], String]
  
  type ValidatorFunction = js.Function3[
    /* form */ FormBound[Any, FormData[Any]], 
    /* field */ FieldBound[Any, Any], 
    /* callback */ js.Function1[/* err */ js.UndefOr[String], Unit], 
    Unit
  ]
  
  @js.native
  trait Widget
    extends StObject
       with WidgetParameters {
    
    def formatValue(value: Any): Any = js.native
    
    /** Returns a string containing a HTML representation of the widget for the given field. */
    def toHTML(name: String): String = js.native
    def toHTML(name: String, field: Field[Any]): String = js.native
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
    
    inline def apply(): WidgetParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetParameters]
    }
    
    extension [Self <: WidgetParameters](x: Self) {
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setLabelClasses(value: js.Array[String]): Self = StObject.set(x, "labelClasses", value.asInstanceOf[js.Any])
      
      inline def setLabelClassesUndefined: Self = StObject.set(x, "labelClasses", js.undefined)
      
      inline def setLabelClassesVarargs(value: String*): Self = StObject.set(x, "labelClasses", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
