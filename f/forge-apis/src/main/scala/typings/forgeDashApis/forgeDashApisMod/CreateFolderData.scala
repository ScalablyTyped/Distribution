package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFolderData extends js.Object {
  var attributes: js.UndefOr[CreateFolderDataAttributes] = js.undefined
  var relationships: js.UndefOr[CreateFolderDataRelationships] = js.undefined
  var `type`: String
}

object CreateFolderData {
  @scala.inline
  def apply(
    `type`: String,
    attributes: CreateFolderDataAttributes = null,
    relationships: CreateFolderDataRelationships = null
  ): CreateFolderData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (relationships != null) __obj.updateDynamic("relationships")(relationships)
    __obj.asInstanceOf[CreateFolderData]
  }
}

