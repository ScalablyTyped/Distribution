package typings.gapiClientStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntity extends js.Object {
  /** The entity, in the form user-userId. */
  var entity: js.UndefOr[String] = js.undefined
  /** The ID for the entity. */
  var entityId: js.UndefOr[String] = js.undefined
}

object AnonEntity {
  @scala.inline
  def apply(entity: String = null, entityId: String = null): AnonEntity = {
    val __obj = js.Dynamic.literal()
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntity]
  }
}

