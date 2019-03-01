package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EntityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of a document entity, consisting of a `type` and relevant
  * `data`, metadata about the entity.
  *
  * For instance, a "link" entity might provide a URI, and a "mention"
  * entity might provide the mentioned user's ID. These pieces of data
  * may be used when rendering the entity as part of a ContentBlock DOM
  * representation. For a link, the data would be used as an href for
  * the rendered anchor. For a mention, the ID could be used to retrieve
  * a hovercard.
  */
trait DraftEntityInstance extends js.Object {
  def getData(): js.Any
  def getMutability(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityMutability
  def getType(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityType
}

object DraftEntityInstance {
  @scala.inline
  def apply(
    getData: js.Function0[js.Any],
    getMutability: js.Function0[draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityMutability],
    getType: js.Function0[draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityType]
  ): DraftEntityInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("getMutability")(getMutability)
    __obj.updateDynamic("getType")(getType)
    __obj.asInstanceOf[DraftEntityInstance]
  }
}

