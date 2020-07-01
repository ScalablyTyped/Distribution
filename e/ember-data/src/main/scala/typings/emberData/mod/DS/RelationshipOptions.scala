package typings.emberData.mod.DS

import typings.emberData.mod.RelationshipsFor
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
  def apply[/* <: typings.emberData.mod.DS.Model */ M](
    async: js.UndefOr[Boolean] = js.undefined,
    inverse: js.UndefOr[Null | RelationshipsFor[M]] = js.undefined,
    polymorphic: js.UndefOr[Boolean] = js.undefined
  ): RelationshipOptions[M] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (!js.isUndefined(polymorphic)) __obj.updateDynamic("polymorphic")(polymorphic.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipOptions[M]]
  }
}

