package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A participant in the test execution, either the execution engine, a client, or a server
     */

trait TestReportParticipant extends BackboneElement {
  /**
           * Contains extended information for property 'display'.
           */
  var _display: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'uri'.
           */
  var _uri: js.UndefOr[Element] = js.undefined
  /**
           * The display name of the participant
           */
  var display: js.UndefOr[java.lang.String] = js.undefined
  /**
           * test-engine | client | server
           */
  var `type`: code
  /**
           * The uri of the participant. An absolute URL is preferred
           */
  var uri: uri
}

