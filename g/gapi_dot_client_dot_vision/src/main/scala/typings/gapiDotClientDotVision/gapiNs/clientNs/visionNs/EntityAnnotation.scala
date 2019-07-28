package typings.gapiDotClientDotVision.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityAnnotation extends js.Object {
  /**
    * Image region to which this entity belongs. Not produced
    * for `LABEL_DETECTION` features.
    */
  var boundingPoly: js.UndefOr[BoundingPoly] = js.undefined
  /**
    * The accuracy of the entity detection in an image.
    * For example, for an image in which the "Eiffel Tower" entity is detected,
    * this field represents the confidence that there is a tower in the query
    * image. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.undefined
  /** Entity textual description, expressed in its `locale` language. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The language code for the locale in which the entity textual
    * `description` is expressed.
    */
  var locale: js.UndefOr[String] = js.undefined
  /**
    * The location information for the detected entity. Multiple
    * `LocationInfo` elements can be present because one location may
    * indicate the location of the scene in the image, and another location
    * may indicate the location of the place where the image was taken.
    * Location information is usually present for landmarks.
    */
  var locations: js.UndefOr[js.Array[LocationInfo]] = js.undefined
  /**
    * Opaque entity ID. Some IDs may be available in
    * [Google Knowledge Graph Search API](https://developers.google.com/knowledge-graph/).
    */
  var mid: js.UndefOr[String] = js.undefined
  /**
    * Some entities may have optional user-supplied `Property` (name/value)
    * fields, such a score or string that qualifies the entity.
    */
  var properties: js.UndefOr[js.Array[Property]] = js.undefined
  /** Overall score of the result. Range [0, 1]. */
  var score: js.UndefOr[Double] = js.undefined
  /**
    * The relevancy of the ICA (Image Content Annotation) label to the
    * image. For example, the relevancy of "tower" is likely higher to an image
    * containing the detected "Eiffel Tower" than to an image containing a
    * detected distant towering building, even though the confidence that
    * there is a tower in each image may be the same. Range [0, 1].
    */
  var topicality: js.UndefOr[Double] = js.undefined
}

object EntityAnnotation {
  @scala.inline
  def apply(
    boundingPoly: BoundingPoly = null,
    confidence: Int | Double = null,
    description: String = null,
    locale: String = null,
    locations: js.Array[LocationInfo] = null,
    mid: String = null,
    properties: js.Array[Property] = null,
    score: Int | Double = null,
    topicality: Int | Double = null
  ): EntityAnnotation = {
    val __obj = js.Dynamic.literal()
    if (boundingPoly != null) __obj.updateDynamic("boundingPoly")(boundingPoly)
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (mid != null) __obj.updateDynamic("mid")(mid)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (topicality != null) __obj.updateDynamic("topicality")(topicality.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityAnnotation]
  }
}

