package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contact information
  */
trait ContactDetail extends Element {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Name of an individual to contact
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Contact details for individual or organization
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

object ContactDetail {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    name: String = null,
    telecom: js.Array[ContactPoint] = null
  ): ContactDetail = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (telecom != null) __obj.updateDynamic("telecom")(telecom)
    __obj.asInstanceOf[ContactDetail]
  }
}

