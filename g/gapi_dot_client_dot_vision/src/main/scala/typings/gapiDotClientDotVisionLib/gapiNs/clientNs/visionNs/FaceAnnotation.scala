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

object FaceAnnotation {
  @scala.inline
  def apply(
    angerLikelihood: java.lang.String = null,
    blurredLikelihood: java.lang.String = null,
    boundingPoly: BoundingPoly = null,
    detectionConfidence: scala.Int | scala.Double = null,
    fdBoundingPoly: BoundingPoly = null,
    headwearLikelihood: java.lang.String = null,
    joyLikelihood: java.lang.String = null,
    landmarkingConfidence: scala.Int | scala.Double = null,
    landmarks: js.Array[Landmark] = null,
    panAngle: scala.Int | scala.Double = null,
    rollAngle: scala.Int | scala.Double = null,
    sorrowLikelihood: java.lang.String = null,
    surpriseLikelihood: java.lang.String = null,
    tiltAngle: scala.Int | scala.Double = null,
    underExposedLikelihood: java.lang.String = null
  ): FaceAnnotation = {
    val __obj = js.Dynamic.literal()
    if (angerLikelihood != null) __obj.updateDynamic("angerLikelihood")(angerLikelihood)
    if (blurredLikelihood != null) __obj.updateDynamic("blurredLikelihood")(blurredLikelihood)
    if (boundingPoly != null) __obj.updateDynamic("boundingPoly")(boundingPoly)
    if (detectionConfidence != null) __obj.updateDynamic("detectionConfidence")(detectionConfidence.asInstanceOf[js.Any])
    if (fdBoundingPoly != null) __obj.updateDynamic("fdBoundingPoly")(fdBoundingPoly)
    if (headwearLikelihood != null) __obj.updateDynamic("headwearLikelihood")(headwearLikelihood)
    if (joyLikelihood != null) __obj.updateDynamic("joyLikelihood")(joyLikelihood)
    if (landmarkingConfidence != null) __obj.updateDynamic("landmarkingConfidence")(landmarkingConfidence.asInstanceOf[js.Any])
    if (landmarks != null) __obj.updateDynamic("landmarks")(landmarks)
    if (panAngle != null) __obj.updateDynamic("panAngle")(panAngle.asInstanceOf[js.Any])
    if (rollAngle != null) __obj.updateDynamic("rollAngle")(rollAngle.asInstanceOf[js.Any])
    if (sorrowLikelihood != null) __obj.updateDynamic("sorrowLikelihood")(sorrowLikelihood)
    if (surpriseLikelihood != null) __obj.updateDynamic("surpriseLikelihood")(surpriseLikelihood)
    if (tiltAngle != null) __obj.updateDynamic("tiltAngle")(tiltAngle.asInstanceOf[js.Any])
    if (underExposedLikelihood != null) __obj.updateDynamic("underExposedLikelihood")(underExposedLikelihood)
    __obj.asInstanceOf[FaceAnnotation]
  }
}

