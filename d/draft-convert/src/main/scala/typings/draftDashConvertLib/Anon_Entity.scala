package typings
package draftDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entity extends js.Object {
  var entity: draftDashConvertLib.draftDashConvertMod.EntityKey
  var length: scala.Double
  var offset: scala.Double
  var result: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Entity {
  @scala.inline
  def apply(
    entity: draftDashConvertLib.draftDashConvertMod.EntityKey,
    length: scala.Double,
    offset: scala.Double,
    result: java.lang.String = null
  ): Anon_Entity = {
    val __obj = js.Dynamic.literal(entity = entity, length = length, offset = offset)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_Entity]
  }
}

