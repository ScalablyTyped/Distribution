package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contributor information
  */
trait Contributor extends Element {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contact details of the contributor
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  /**
    * Who contributed the content
    */
  var name: String
  /**
    * author | editor | reviewer | endorser
    */
  var `type`: code
}

object Contributor {
  @scala.inline
  def apply(
    name: String,
    `type`: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    _type: Element = null,
    contact: js.Array[ContactDetail] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null
  ): Contributor = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Contributor]
  }
}

