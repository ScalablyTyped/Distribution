package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entity extends js.Object {
  var entity: js.UndefOr[String] = js.native
  var entityId: js.UndefOr[String] = js.native
}

object Entity {
  @scala.inline
  def apply(entity: String = null, entityId: String = null): Entity = {
    val __obj = js.Dynamic.literal()
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
}

