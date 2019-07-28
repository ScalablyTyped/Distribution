package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data type and Profile for this element
  */
trait ElementDefinitionType extends Element {
  /**
    * Contains extended information for property 'aggregation'.
    */
  var _aggregation: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'targetProfile'.
    */
  var _targetProfile: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'versioning'.
    */
  var _versioning: js.UndefOr[Element] = js.undefined
  /**
    * contained | referenced | bundled - how aggregated
    */
  var aggregation: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * Data type or Resource (reference to definition)
    */
  var code: uri
  /**
    * Profile (StructureDefinition) to apply (or IG)
    */
  var profile: js.UndefOr[uri] = js.undefined
  /**
    * Profile (StructureDefinition) to apply to reference target (or IG)
    */
  var targetProfile: js.UndefOr[uri] = js.undefined
  /**
    * either | independent | specific
    */
  var versioning: js.UndefOr[code] = js.undefined
}

object ElementDefinitionType {
  @scala.inline
  def apply(
    code: uri,
    _aggregation: js.Array[Element] = null,
    _code: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _profile: Element = null,
    _targetProfile: Element = null,
    _versioning: Element = null,
    aggregation: js.Array[code] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    profile: uri = null,
    targetProfile: uri = null,
    versioning: code = null
  ): ElementDefinitionType = {
    val __obj = js.Dynamic.literal(code = code)
    if (_aggregation != null) __obj.updateDynamic("_aggregation")(_aggregation)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_profile != null) __obj.updateDynamic("_profile")(_profile)
    if (_targetProfile != null) __obj.updateDynamic("_targetProfile")(_targetProfile)
    if (_versioning != null) __obj.updateDynamic("_versioning")(_versioning)
    if (aggregation != null) __obj.updateDynamic("aggregation")(aggregation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (targetProfile != null) __obj.updateDynamic("targetProfile")(targetProfile)
    if (versioning != null) __obj.updateDynamic("versioning")(versioning)
    __obj.asInstanceOf[ElementDefinitionType]
  }
}

