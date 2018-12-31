package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If this is a reply to prior message
  */
trait MessageHeaderResponse extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'identifier'.
    */
  var _identifier: js.UndefOr[Element] = js.undefined
  /**
    * ok | transient-error | fatal-error
    */
  var code: code
  /**
    * Specific list of hints/warnings/errors
    */
  var details: js.UndefOr[Reference] = js.undefined
  /**
    * Id of original message
    */
  var identifier: id
}

