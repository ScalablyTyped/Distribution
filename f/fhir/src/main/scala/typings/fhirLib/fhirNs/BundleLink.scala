package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Links related to this Bundle
  */
trait BundleLink extends BackboneElement {
  /**
    * Contains extended information for property 'relation'.
    */
  var _relation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * See http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1
    */
  var relation: java.lang.String
  /**
    * Reference details for the link
    */
  var url: uri
}

object BundleLink {
  @scala.inline
  def apply(
    relation: java.lang.String,
    url: uri,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _relation: Element = null,
    _url: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): BundleLink = {
    val __obj = js.Dynamic.literal(relation = relation, url = url)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_relation != null) __obj.updateDynamic("_relation")(_relation)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[BundleLink]
  }
}

