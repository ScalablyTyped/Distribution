package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Key images associated with this report
  */
trait DiagnosticReportImage extends BackboneElement {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
    * Comment about the image (e.g. explanation)
    */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Reference to the image source
    */
  var link: Reference
}

