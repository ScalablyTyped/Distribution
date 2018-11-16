package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Contains a collection of resources
     */

trait Bundle extends ResourceBase {
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

