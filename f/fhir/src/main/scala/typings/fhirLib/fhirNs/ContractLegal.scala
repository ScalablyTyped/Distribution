package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract Legal Language
  */
trait ContractLegal extends BackboneElement {
  /**
    * Contract Legal Text
    */
  var contentAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Contract Legal Text
    */
  var contentReference: js.UndefOr[Reference] = js.undefined
}

