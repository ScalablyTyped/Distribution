package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata about a resource
  */
trait Meta extends Element {
  /**
    * Contains extended information for property 'lastUpdated'.
    */
  var _lastUpdated: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'profile'.
    */
  var _profile: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'versionId'.
    */
  var _versionId: js.UndefOr[Element] = js.undefined
  /**
    * When the resource version last changed
    */
  var lastUpdated: js.UndefOr[instant] = js.undefined
  /**
    * Profiles this resource claims to conform to
    */
  var profile: js.UndefOr[js.Array[uri]] = js.undefined
  /**
    * Security Labels applied to this resource
    */
  var security: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Tags applied to this resource
    */
  var tag: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Version specific identifier
    */
  var versionId: js.UndefOr[id] = js.undefined
}

object Meta {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _lastUpdated: Element = null,
    _profile: js.Array[Element] = null,
    _versionId: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    lastUpdated: instant = null,
    profile: js.Array[uri] = null,
    security: js.Array[Coding] = null,
    tag: js.Array[Coding] = null,
    versionId: id = null
  ): Meta = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_lastUpdated != null) __obj.updateDynamic("_lastUpdated")(_lastUpdated)
    if (_profile != null) __obj.updateDynamic("_profile")(_profile)
    if (_versionId != null) __obj.updateDynamic("_versionId")(_versionId)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastUpdated != null) __obj.updateDynamic("lastUpdated")(lastUpdated)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (security != null) __obj.updateDynamic("security")(security)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[Meta]
  }
}

