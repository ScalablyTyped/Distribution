package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A plain object representation of an EntityInstance.
  */
trait RawDraftEntity extends js.Object {
  var data: org.scalablytyped.runtime.StringDictionary[js.Any]
  var mutability: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityMutability
  var `type`: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityType
}

object RawDraftEntity {
  @scala.inline
  def apply(
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    mutability: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityMutability,
    `type`: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityType
  ): RawDraftEntity = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("mutability")(mutability)
    __obj.asInstanceOf[RawDraftEntity]
  }
}

