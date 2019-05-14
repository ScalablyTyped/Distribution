package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A plain object representation of an EntityInstance.
  */
trait RawDraftEntity[T] extends js.Object {
  var data: T
  var mutability: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityMutability
  var `type`: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityType
}

object RawDraftEntity {
  @scala.inline
  def apply[T](
    data: T,
    mutability: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityMutability,
    `type`: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityType
  ): RawDraftEntity[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mutability = mutability)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawDraftEntity[T]]
  }
}

