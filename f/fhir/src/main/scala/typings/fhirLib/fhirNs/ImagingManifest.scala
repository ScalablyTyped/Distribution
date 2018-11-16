package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Key Object Selection
     */

trait ImagingManifest extends DomainResource {
  /**
           * Contains extended information for property 'authoringTime'.
           */
  var _authoringTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Author (human or machine)
           */
  var author: js.UndefOr[Reference] = js.undefined
  /**
           * Time when the selection of instances was made
           */
  var authoringTime: js.UndefOr[dateTime] = js.undefined
  /**
           * Description text
           */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
           * SOP Instance UID
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Patient of the selected objects
           */
  var patient: Reference
  /**
           * Study identity of the selected instances
           */
  var study: js.Array[ImagingManifestStudy]
}

