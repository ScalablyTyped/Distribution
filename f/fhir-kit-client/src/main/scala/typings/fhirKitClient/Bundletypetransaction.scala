package typings.fhirKitClient

import typings.fhir.fhir.BundleEntry
import typings.fhir.fhir.BundleLink
import typings.fhir.fhir.Element
import typings.fhir.fhir.Identifier
import typings.fhir.fhir.Meta
import typings.fhir.fhir.Signature
import typings.fhir.fhir.code
import typings.fhir.fhir.id
import typings.fhir.fhir.unsignedInt
import typings.fhir.fhir.uri
import typings.fhirKitClient.fhirKitClientStrings.transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined fhir.fhir.Bundle & {  type  :'transaction'} */
trait Bundletypetransaction extends js.Object {
  /**
    * Contains extended information for property 'id'.
    */
  var _id: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'implicitRules'.
    */
  var _implicitRules: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'resourceType'.
    */
  var _resourceType: js.UndefOr[Element] = js.undefined
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
    * Logical id of this artifact
    */
  var id: js.UndefOr[typings.fhir.fhir.id] = js.undefined
  /**
    * Persistent identifier for the bundle
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * A set of rules under which this content was created
    */
  var implicitRules: js.UndefOr[uri] = js.undefined
  /**
    * Language of the resource content
    */
  var language: js.UndefOr[code] = js.undefined
  /**
    * Links related to this Bundle
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.undefined
  /**
    * Metadata about the resource
    */
  var meta: js.UndefOr[Meta] = js.undefined
  /**
    * The type of the resource.
    */
  var resourceType: js.UndefOr[code] = js.undefined
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
  var `type`: code with transaction
}

object Bundletypetransaction {
  @scala.inline
  def apply(
    `type`: code with transaction,
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
    total: Int | Double = null
  ): Bundletypetransaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_total != null) __obj.updateDynamic("_total")(_total.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundletypetransaction]
  }
}

