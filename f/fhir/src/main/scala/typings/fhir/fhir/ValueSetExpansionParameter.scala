package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameter that controlled the expansion process
  */
trait ValueSetExpansionParameter extends BackboneElement {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueBoolean'.
    */
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDecimal'.
    */
  var _valueDecimal: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueInteger'.
    */
  var _valueInteger: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueString'.
    */
  var _valueString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueUri'.
    */
  var _valueUri: js.UndefOr[Element] = js.undefined
  /**
    * Name as assigned by the server
    */
  var name: String
  /**
    * Value of the named parameter
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  /**
    * Value of the named parameter
    */
  var valueCode: js.UndefOr[code] = js.undefined
  /**
    * Value of the named parameter
    */
  var valueDecimal: js.UndefOr[decimal] = js.undefined
  /**
    * Value of the named parameter
    */
  var valueInteger: js.UndefOr[integer] = js.undefined
  /**
    * Value of the named parameter
    */
  var valueString: js.UndefOr[String] = js.undefined
  /**
    * Value of the named parameter
    */
  var valueUri: js.UndefOr[uri] = js.undefined
}

object ValueSetExpansionParameter {
  @scala.inline
  def apply(
    name: String,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    _valueBoolean: Element = null,
    _valueCode: Element = null,
    _valueDecimal: Element = null,
    _valueInteger: Element = null,
    _valueString: Element = null,
    _valueUri: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    valueBoolean: js.UndefOr[Boolean] = js.undefined,
    valueCode: code = null,
    valueDecimal: js.UndefOr[decimal] = js.undefined,
    valueInteger: js.UndefOr[integer] = js.undefined,
    valueString: String = null,
    valueUri: uri = null
  ): ValueSetExpansionParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_valueBoolean != null) __obj.updateDynamic("_valueBoolean")(_valueBoolean.asInstanceOf[js.Any])
    if (_valueCode != null) __obj.updateDynamic("_valueCode")(_valueCode.asInstanceOf[js.Any])
    if (_valueDecimal != null) __obj.updateDynamic("_valueDecimal")(_valueDecimal.asInstanceOf[js.Any])
    if (_valueInteger != null) __obj.updateDynamic("_valueInteger")(_valueInteger.asInstanceOf[js.Any])
    if (_valueString != null) __obj.updateDynamic("_valueString")(_valueString.asInstanceOf[js.Any])
    if (_valueUri != null) __obj.updateDynamic("_valueUri")(_valueUri.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(valueBoolean)) __obj.updateDynamic("valueBoolean")(valueBoolean.get.asInstanceOf[js.Any])
    if (valueCode != null) __obj.updateDynamic("valueCode")(valueCode.asInstanceOf[js.Any])
    if (!js.isUndefined(valueDecimal)) __obj.updateDynamic("valueDecimal")(valueDecimal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueInteger)) __obj.updateDynamic("valueInteger")(valueInteger.get.asInstanceOf[js.Any])
    if (valueString != null) __obj.updateDynamic("valueString")(valueString.asInstanceOf[js.Any])
    if (valueUri != null) __obj.updateDynamic("valueUri")(valueUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetExpansionParameter]
  }
}

