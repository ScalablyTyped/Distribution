package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entity deduced from similar images on the Internet.
  */
@js.native
trait Schema$GoogleCloudVisionV1p4beta1WebDetectionWebEntity extends js.Object {
  /**
    * Canonical description of the entity, in English.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Opaque entity ID.
    */
  var entityId: js.UndefOr[String] = js.native
  /**
    * Overall relevancy score for the entity. Not normalized and not comparable
    * across different image queries.
    */
  var score: js.UndefOr[Double] = js.native
}

object Schema$GoogleCloudVisionV1p4beta1WebDetectionWebEntity {
  @scala.inline
  def apply(description: String = null, entityId: String = null, score: Int | Double = null): Schema$GoogleCloudVisionV1p4beta1WebDetectionWebEntity = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p4beta1WebDetectionWebEntity]
  }
}

