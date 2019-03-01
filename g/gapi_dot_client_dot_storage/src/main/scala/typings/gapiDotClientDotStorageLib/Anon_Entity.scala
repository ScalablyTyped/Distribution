package typings
package gapiDotClientDotStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entity extends js.Object {
  /** The entity, in the form user-userId. */
  var entity: js.UndefOr[java.lang.String] = js.undefined
  /** The ID for the entity. */
  var entityId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Entity {
  @scala.inline
  def apply(entity: java.lang.String = null, entityId: java.lang.String = null): Anon_Entity = {
    val __obj = js.Dynamic.literal()
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (entityId != null) __obj.updateDynamic("entityId")(entityId)
    __obj.asInstanceOf[Anon_Entity]
  }
}

