package typings.draftConvert.anon

import typings.draftConvert.mod.EntityKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity extends js.Object {
  var entity: EntityKey
  var length: Double
  var offset: Double
  var result: js.UndefOr[String] = js.undefined
}

object Entity {
  @scala.inline
  def apply(entity: EntityKey, length: Double, offset: Double, result: String = null): Entity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
}

