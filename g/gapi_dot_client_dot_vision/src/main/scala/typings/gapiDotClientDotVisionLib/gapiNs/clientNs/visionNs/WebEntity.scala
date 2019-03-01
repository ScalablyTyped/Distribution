package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebEntity extends js.Object {
  /** Canonical description of the entity, in English. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Opaque entity ID. */
  var entityId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Overall relevancy score for the entity.
    * Not normalized and not comparable across different image queries.
    */
  var score: js.UndefOr[scala.Double] = js.undefined
}

object WebEntity {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    entityId: java.lang.String = null,
    score: scala.Int | scala.Double = null
  ): WebEntity = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (entityId != null) __obj.updateDynamic("entityId")(entityId)
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebEntity]
  }
}

