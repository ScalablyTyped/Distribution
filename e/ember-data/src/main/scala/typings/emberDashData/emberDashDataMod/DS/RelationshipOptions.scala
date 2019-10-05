package typings.emberDashData.emberDashDataMod.DS

import typings.emberDashData.emberDashDataMod.RelationshipsFor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipOptions[M /* <: Model */] extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var inverse: js.UndefOr[RelationshipsFor[M] | Null] = js.undefined
  var polymorphic: js.UndefOr[Boolean] = js.undefined
}

object RelationshipOptions {
  @scala.inline
  def apply[M /* <: Model */](
    async: js.UndefOr[Boolean] = js.undefined,
    inverse: RelationshipsFor[M] = null,
    polymorphic: js.UndefOr[Boolean] = js.undefined
  ): RelationshipOptions[M] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (inverse != null) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (!js.isUndefined(polymorphic)) __obj.updateDynamic("polymorphic")(polymorphic)
    __obj.asInstanceOf[RelationshipOptions[M]]
  }
}

