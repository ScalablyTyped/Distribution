package typings
package fhirLib.fhirNs

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

