package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference
     */

trait Media extends DomainResource {
  /**
           * Contains extended information for property 'duration'.
           */
  var _duration: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'frames'.
           */
  var _frames: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'height'.
           */
  var _height: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'occurrenceDateTime'.
           */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'width'.
           */
  var _width: js.UndefOr[Element] = js.undefined
  /**
           * Procedure that caused this media to be created
           */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Body part in media
           */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Actual Media - reference or data
           */
  var content: Attachment
  /**
           * Encounter / Episode associated with media
           */
  var context: js.UndefOr[Reference] = js.undefined
  /**
           * Observing Device
           */
  var device: js.UndefOr[Reference] = js.undefined
  /**
           * Length in seconds (audio / video)
           */
  var duration: js.UndefOr[unsignedInt] = js.undefined
  /**
           * Number of frames if > 1 (photo)
           */
  var frames: js.UndefOr[positiveInt] = js.undefined
  /**
           * Height of the image in pixels (photo/video)
           */
  var height: js.UndefOr[positiveInt] = js.undefined
  /**
           * Identifier(s) for the image
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Comments made about the media
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * When Media was collected
           */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
           * When Media was collected
           */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  /**
           * The person who generated the image
           */
  var operator: js.UndefOr[Reference] = js.undefined
  /**
           * Why was event performed?
           */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Who/What this Media is a record of
           */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
           * The type of acquisition equipment/process
           */
  var subtype: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * photo | video | audio
           */
  var `type`: code
  /**
           * Imaging view, e.g. Lateral or Antero-posterior
           */
  var view: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Width of the image in pixels (photo/video)
           */
  var width: js.UndefOr[positiveInt] = js.undefined
}

