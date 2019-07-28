package typings.draftDashConvert

import typings.draftDashConvert.draftDashConvertMod.EntityKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entity extends js.Object {
  var entity: EntityKey
  var length: Double
  var offset: Double
  var result: js.UndefOr[String] = js.undefined
}

object Anon_Entity {
  @scala.inline
  def apply(entity: EntityKey, length: Double, offset: Double, result: String = null): Anon_Entity = {
    val __obj = js.Dynamic.literal(entity = entity, length = length, offset = offset)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_Entity]
  }
}

