package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Software that is covered by this capability statement
  */
trait CapabilityStatementSoftware extends BackboneElement {
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'releaseDate'.
    */
  var _releaseDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * A name the software is known by
    */
  var name: String
  /**
    * Date this version released
    */
  var releaseDate: js.UndefOr[dateTime] = js.undefined
  /**
    * Version covered by this statement
    */
  var version: js.UndefOr[String] = js.undefined
}

object CapabilityStatementSoftware {
  @scala.inline
  def apply(
    name: String,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    _releaseDate: Element = null,
    _version: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    releaseDate: dateTime = null,
    version: String = null
  ): CapabilityStatementSoftware = {
    val __obj = js.Dynamic.literal(name = name)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_releaseDate != null) __obj.updateDynamic("_releaseDate")(_releaseDate)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (releaseDate != null) __obj.updateDynamic("releaseDate")(releaseDate)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[CapabilityStatementSoftware]
  }
}

