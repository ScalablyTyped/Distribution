package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebEntity extends js.Object {
  /** Canonical description of the entity, in English. */
  var description: js.UndefOr[String] = js.undefined
  /** Opaque entity ID. */
  var entityId: js.UndefOr[String] = js.undefined
  /**
    * Overall relevancy score for the entity.
    * Not normalized and not comparable across different image queries.
    */
  var score: js.UndefOr[Double] = js.undefined
}

object WebEntity {
  @scala.inline
  def apply(description: String = null, entityId: String = null, score: js.UndefOr[Double] = js.undefined): WebEntity = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebEntity]
  }
}

