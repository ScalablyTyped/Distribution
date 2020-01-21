package typings.draftJs.mod.Draft.Model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Constants {
  type CustomBlockType = java.lang.String
  type DraftBlockType = typings.draftJs.mod.Draft.Model.Constants.CoreDraftBlockType | typings.draftJs.mod.Draft.Model.Constants.CustomBlockType
  /**
    * Possible entity types.
    */
  type DraftEntityType = java.lang.String | typings.draftJs.mod.Draft.Model.Constants.ComposedEntityType
}
