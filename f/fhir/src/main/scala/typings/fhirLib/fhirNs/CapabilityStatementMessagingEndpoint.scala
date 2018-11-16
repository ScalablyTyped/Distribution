package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Where messages should be sent
     */

trait CapabilityStatementMessagingEndpoint extends BackboneElement {
  /**
           * Contains extended information for property 'address'.
           */
  var _address: js.UndefOr[Element] = js.undefined
  /**
           * Network address or identifier of the end-point
           */
  var address: uri
  /**
           * http | ftp | mllp +
           */
  var protocol: Coding
}

