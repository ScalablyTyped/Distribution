package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Message payload
     */

trait CommunicationRequestPayload extends BackboneElement {
  /**
           * Contains extended information for property 'contentString'.
           */
  var _contentString: js.UndefOr[Element] = js.undefined
  /**
           * Message part content
           */
  var contentAttachment: js.UndefOr[Attachment] = js.undefined
  /**
           * Message part content
           */
  var contentReference: js.UndefOr[Reference] = js.undefined
  /**
           * Message part content
           */
  var contentString: js.UndefOr[java.lang.String] = js.undefined
}

