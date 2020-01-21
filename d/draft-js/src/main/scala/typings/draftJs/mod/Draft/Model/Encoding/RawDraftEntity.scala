package typings.draftJs.mod.Draft.Model.Encoding

import typings.draftJs.mod.Draft.Model.Constants.DraftEntityMutability
import typings.draftJs.mod.Draft.Model.Constants.DraftEntityType
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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mutability = mutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawDraftEntity[T]]
  }
}

