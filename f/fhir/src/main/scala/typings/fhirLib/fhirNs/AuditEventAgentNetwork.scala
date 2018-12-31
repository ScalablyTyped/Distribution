package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Logical network location for application activity
  */
trait AuditEventAgentNetwork extends BackboneElement {
  /**
    * Contains extended information for property 'address'.
    */
  var _address: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Identifier for the network access point of the user device
    */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of network access point
    */
  var `type`: js.UndefOr[code] = js.undefined
}

