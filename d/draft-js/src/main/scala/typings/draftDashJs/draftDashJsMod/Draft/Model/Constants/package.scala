package typings.draftDashJs.draftDashJsMod.Draft.Model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Constants {
  type CustomBlockType = String
  type DraftBlockType = CoreDraftBlockType | CustomBlockType
  /**
    * Possible entity types.
    */
  type DraftEntityType = String | ComposedEntityType
}
