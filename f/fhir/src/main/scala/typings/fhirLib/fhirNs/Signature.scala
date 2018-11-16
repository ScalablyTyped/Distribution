package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A digital Signature - XML DigSig, JWT, Graphical image of signature, etc.
     */

trait Signature extends Element {
  /**
           * Contains extended information for property 'blob'.
           */
  var _blob: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'contentType'.
           */
  var _contentType: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'onBehalfOfUri'.
           */
  var _onBehalfOfUri: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'when'.
           */
  var _when: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'whoUri'.
           */
  var _whoUri: js.UndefOr[Element] = js.undefined
  /**
           * The actual signature content (XML DigSig. JWT, picture, etc.)
           */
  var blob: js.UndefOr[base64Binary] = js.undefined
  /**
           * The technical format of the signature
           */
  var contentType: js.UndefOr[code] = js.undefined
  /**
           * The party represented
           */
  var onBehalfOfReference: js.UndefOr[Reference] = js.undefined
  /**
           * The party represented
           */
  var onBehalfOfUri: js.UndefOr[uri] = js.undefined
  /**
           * Indication of the reason the entity signed the object(s)
           */
  var `type`: js.Array[Coding]
  /**
           * When the signature was created
           */
  var when: instant
  /**
           * Who signed
           */
  var whoReference: js.UndefOr[Reference] = js.undefined
  /**
           * Who signed
           */
  var whoUri: js.UndefOr[uri] = js.undefined
}

