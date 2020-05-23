package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of the content of the value set (CLD)
  */
trait ValueSetCompose extends BackboneElement {
  /**
    * Contains extended information for property 'inactive'.
    */
  var _inactive: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'lockedDate'.
    */
  var _lockedDate: js.UndefOr[Element] = js.undefined
  /**
    * Explicitly exclude codes from a code system or other value sets
    */
  var exclude: js.UndefOr[js.Array[ValueSetComposeInclude]] = js.undefined
  /**
    * Whether inactive codes are in the value set
    */
  var inactive: js.UndefOr[Boolean] = js.undefined
  /**
    * Include one or more codes from a code system or other value set(s)
    */
  var include: js.Array[ValueSetComposeInclude]
  /**
    * Fixed date for version-less references (transitive)
    */
  var lockedDate: js.UndefOr[date] = js.undefined
}

object ValueSetCompose {
  @scala.inline
  def apply(
    include: js.Array[ValueSetComposeInclude],
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _inactive: Element = null,
    _lockedDate: Element = null,
    exclude: js.Array[ValueSetComposeInclude] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    inactive: js.UndefOr[Boolean] = js.undefined,
    lockedDate: date = null,
    modifierExtension: js.Array[Extension] = null
  ): ValueSetCompose = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_inactive != null) __obj.updateDynamic("_inactive")(_inactive.asInstanceOf[js.Any])
    if (_lockedDate != null) __obj.updateDynamic("_lockedDate")(_lockedDate.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive.get.asInstanceOf[js.Any])
    if (lockedDate != null) __obj.updateDynamic("lockedDate")(lockedDate.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetCompose]
  }
}

