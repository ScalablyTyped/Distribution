package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Pure binary content defined by a format other than FHIR
     */

trait Binary extends ResourceBase {
  /**
           * Contains extended information for property 'content'.
           */
  var _content: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'contentType'.
           */
  var _contentType: js.UndefOr[Element] = js.undefined
  /**
           * The actual content
           */
  var content: base64Binary
  /**
           * MimeType of the binary content
           */
  var contentType: code
  /**
           * Access Control Management
           */
  var securityContext: js.UndefOr[Reference] = js.undefined
}

