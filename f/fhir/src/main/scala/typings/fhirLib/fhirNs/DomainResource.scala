package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A resource with narrative, extensions, and contained resources
     */

trait DomainResource extends ResourceBase {
  /**
           * Contained, inline Resources
           */
  var contained: js.UndefOr[js.Array[Resource]] = js.undefined
  /**
           * Additional Content defined by implementations
           */
  var extension: js.UndefOr[js.Array[Extension]] = js.undefined
  /**
           * Extensions that cannot be ignored
           */
  var modifierExtension: js.UndefOr[js.Array[Extension]] = js.undefined
  /**
           * Text summary of the resource, for human interpretation
           */
  var text: js.UndefOr[Narrative] = js.undefined
}

