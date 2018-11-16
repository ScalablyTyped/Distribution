package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The operation to perform
     */

trait TestReportSetupActionOperation extends BackboneElement {
  /**
           * Contains extended information for property 'detail'.
           */
  var _detail: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'message'.
           */
  var _message: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'result'.
           */
  var _result: js.UndefOr[Element] = js.undefined
  /**
           * A link to further details on the result
           */
  var detail: js.UndefOr[uri] = js.undefined
  /**
           * A message associated with the result
           */
  var message: js.UndefOr[markdown] = js.undefined
  /**
           * pass | skip | fail | warning | error
           */
  var result: code
}

