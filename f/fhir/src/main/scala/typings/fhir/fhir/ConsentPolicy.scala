package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Policies covered by this consent
  */
trait ConsentPolicy extends BackboneElement {
  /**
    * Contains extended information for property 'authority'.
    */
  var _authority: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.undefined
  /**
    * Enforcement source for policy
    */
  var authority: js.UndefOr[uri] = js.undefined
  /**
    * Specific policy covered by this consent
    */
  var uri: js.UndefOr[typings.fhir.fhir.uri] = js.undefined
}

object ConsentPolicy {
  @scala.inline
  def apply(
    _authority: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _uri: Element = null,
    authority: uri = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    uri: uri = null
  ): ConsentPolicy = {
    val __obj = js.Dynamic.literal()
    if (_authority != null) __obj.updateDynamic("_authority")(_authority)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_uri != null) __obj.updateDynamic("_uri")(_uri)
    if (authority != null) __obj.updateDynamic("authority")(authority)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[ConsentPolicy]
  }
}

