package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entry in the bundle - will have a resource, or information
  */
trait BundleEntry extends BackboneElement {
  /**
    * Contains extended information for property 'fullUrl'.
    */
  var _fullUrl: js.UndefOr[Element] = js.undefined
  /**
    * Absolute URL for resource (server address, or UUID/OID)
    */
  var fullUrl: js.UndefOr[uri] = js.undefined
  /**
    * Links related to this entry
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.undefined
  /**
    * Transaction Related Information
    */
  var request: js.UndefOr[BundleEntryRequest] = js.undefined
  /**
    * A resource in the bundle
    */
  var resource: js.UndefOr[Resource] = js.undefined
  /**
    * Transaction Related Information
    */
  var response: js.UndefOr[BundleEntryResponse] = js.undefined
  /**
    * Search related information
    */
  var search: js.UndefOr[BundleEntrySearch] = js.undefined
}

object BundleEntry {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _fullUrl: Element = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    fullUrl: uri = null,
    id: String = null,
    link: js.Array[BundleLink] = null,
    modifierExtension: js.Array[Extension] = null,
    request: BundleEntryRequest = null,
    resource: Resource = null,
    response: BundleEntryResponse = null,
    search: BundleEntrySearch = null
  ): BundleEntry = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_fullUrl != null) __obj.updateDynamic("_fullUrl")(_fullUrl)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (fullUrl != null) __obj.updateDynamic("fullUrl")(fullUrl)
    if (id != null) __obj.updateDynamic("id")(id)
    if (link != null) __obj.updateDynamic("link")(link)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (request != null) __obj.updateDynamic("request")(request)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (response != null) __obj.updateDynamic("response")(response)
    if (search != null) __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[BundleEntry]
  }
}

