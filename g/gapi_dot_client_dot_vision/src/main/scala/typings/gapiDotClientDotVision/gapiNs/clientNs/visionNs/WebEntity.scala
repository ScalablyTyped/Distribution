package typings.gapiDotClientDotVision.gapiNs.clientNs.visionNs

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
  def apply(description: String = null, entityId: String = null, score: Int | Double = null): WebEntity = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (entityId != null) __obj.updateDynamic("entityId")(entityId)
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebEntity]
  }
}

