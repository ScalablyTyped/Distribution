package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Declare support for this event
  */
trait CapabilityStatementMessagingEvent extends BackboneElement {
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'focus'.
    */
  var _focus: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Consequence | Currency | Notification
    */
  var category: js.UndefOr[code] = js.undefined
  /**
    * Event type
    */
  var code: Coding
  /**
    * Endpoint-specific event documentation
    */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Resource that's focus of message
    */
  var focus: code
  /**
    * sender | receiver
    */
  var mode: code
  /**
    * Profile that describes the request
    */
  var request: Reference
  /**
    * Profile that describes the response
    */
  var response: Reference
}

