package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Transaction Related Information
     */

trait BundleEntryResponse extends BackboneElement {
  /**
           * Contains extended information for property 'etag'.
           */
  var _etag: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'lastModified'.
           */
  var _lastModified: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'location'.
           */
  var _location: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * The etag for the resource (if relevant)
           */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Server's date time modified
           */
  var lastModified: js.UndefOr[instant] = js.undefined
  /**
           * The location, if the operation returns a location
           */
  var location: js.UndefOr[uri] = js.undefined
  /**
           * OperationOutcome with hints and warnings (for batch/transaction)
           */
  var outcome: js.UndefOr[Resource] = js.undefined
  /**
           * Status response code (text optional)
           */
  var status: java.lang.String
}

