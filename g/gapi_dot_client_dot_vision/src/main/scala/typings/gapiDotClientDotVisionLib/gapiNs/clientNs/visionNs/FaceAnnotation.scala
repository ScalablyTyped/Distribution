package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceAnnotation extends js.Object {
  /** Anger likelihood. */
  var angerLikelihood: js.UndefOr[java.lang.String] = js.undefined
  /** Blurred likelihood. */
  var blurredLikelihood: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The bounding polygon around the face. The coordinates of the bounding box
    * are in the original image's scale, as returned in `ImageParams`.
    * The bounding box is computed to "frame" the face in accordance with human
    * expectations. It is based on the landmarker results.
    * Note that one or more x and/or y coordinates may not be generated in the
    * `BoundingPoly` (the polygon will be unbounded) if only a partial face
    * appears in the image to be annotated.
    */
  var boundingPoly: js.UndefOr[BoundingPoly] = js.undefined
  /** Detection confidence. Range [0, 1]. */
  var detectionConfidence: js.UndefOr[scala.Double] = js.undefined
  /**
    * The `fd_bounding_poly` bounding polygon is tighter than the
    * `boundingPoly`, and encloses only the skin part of the face. Typically, it
    * is used to eliminate the face from any image analysis that detects the
    * "amount of skin" visible in an image. It is not based on the
    * landmarker results, only on the initial face detection, hence
    * the <code>fd</code> (face detection) prefix.
    */
  var fdBoundingPoly: js.UndefOr[BoundingPoly] = js.undefined
  /** Headwear likelihood. */
  var headwearLikelihood: js.UndefOr[java.lang.String] = js.undefined
  /** Joy likelihood. */
  var joyLikelihood: js.UndefOr[java.lang.String] = js.undefined
  /** Face landmarking confidence. Range [0, 1]. */
  var landmarkingConfidence: js.UndefOr[scala.Double] = js.undefined
  /** Detected face landmarks. */
  var landmarks: js.UndefOr[js.Array[Landmark]] = js.undefined
  /**
    * Yaw angle, which indicates the leftward/rightward angle that the face is
    * pointing relative to the vertical plane perpendicular to the image. Range
    * [-180,180].
    */
  var panAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Roll angle, which indicates the amount of clockwise/anti-clockwise rotation
    * of the face relative to the image vertical about the axis perpendicular to
    * the face. Range [-180,180].
    */
  var rollAngle: js.UndefOr[scala.Double] = js.undefined
  /** Sorrow likelihood. */
  var sorrowLikelihood: js.UndefOr[java.lang.String] = js.undefined
  /** Surprise likelihood. */
  var surpriseLikelihood: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Pitch angle, which indicates the upwards/downwards angle that the face is
    * pointing relative to the image's horizontal plane. Range [-180,180].
    */
  var tiltAngle: js.UndefOr[scala.Double] = js.undefined
  /** Under-exposed likelihood. */
  var underExposedLikelihood: js.UndefOr[java.lang.String] = js.undefined
}

