package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Related things
     */

trait DocumentManifestRelated extends BackboneElement {
  /**
           * Identifiers of things that are related
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Related Resource
           */
  var ref: js.UndefOr[Reference] = js.undefined
}

