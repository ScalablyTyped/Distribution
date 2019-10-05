package typings.draftDashJs.draftDashJsMod.Draft.Model.Encoding

import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftEntityMutability
import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftEntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A plain object representation of an EntityInstance.
  */
trait RawDraftEntity[T] extends js.Object {
  var data: T
  var mutability: DraftEntityMutability
  var `type`: DraftEntityType
}

object RawDraftEntity {
  @scala.inline
  def apply[T](data: T, mutability: DraftEntityMutability, `type`: DraftEntityType): RawDraftEntity[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mutability = mutability)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawDraftEntity[T]]
  }
}

