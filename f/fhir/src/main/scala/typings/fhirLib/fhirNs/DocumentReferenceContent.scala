package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Document referenced
  */
trait DocumentReferenceContent extends BackboneElement {
  /**
    * Where to access the document
    */
  var attachment: Attachment
  /**
    * Format/content rules for the document
    */
  var format: js.UndefOr[Coding] = js.undefined
}

