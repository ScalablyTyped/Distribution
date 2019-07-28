package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a collection of resources
  */
trait Bundle
  extends ResourceBase
     with Resource {
  /**
    * Contains extended information for property 'total'.
    */
  var _total: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Entry in the bundle - will have a resource, or information
    */
  var entry: js.UndefOr[js.Array[BundleEntry]] = js.undefined
  /**
    * Persistent identifier for the bundle
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Links related to this Bundle
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.undefined
  /**
    * Digital Signature
    */
  var signature: js.UndefOr[Signature] = js.undefined
  /**
    * If search, the total number of matches
    */
  var total: js.UndefOr[unsignedInt] = js.undefined
  /**
    * document | message | transaction | transaction-response | batch | batch-response | history | searchset | collection
    */
  var `type`: code
}

object Bundle {
  @scala.inline
  def apply(
    `type`: code,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _total: Element = null,
    _type: Element = null,
    entry: js.Array[BundleEntry] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    link: js.Array[BundleLink] = null,
    meta: Meta = null,
    resourceType: code = null,
    signature: Signature = null,
    total: js.UndefOr[unsignedInt] = js.undefined
  ): Bundle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_total != null) __obj.updateDynamic("_total")(_total)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (entry != null) __obj.updateDynamic("entry")(entry)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (link != null) __obj.updateDynamic("link")(link)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[Bundle]
  }
}

