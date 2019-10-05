package typings.draftDashJs.draftDashJsMod.Draft.Component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Base {
  import org.scalablytyped.runtime.StringDictionary
  import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftBlockType
  import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftEditorCommand
  import typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.DraftBlockRenderConfig
  import typings.immutable.immutableMod.Map
  import typings.react.reactMod.CSSProperties

  type DraftBlockRenderMap = Map[DraftBlockType, DraftBlockRenderConfig]
  type DraftStyleMap = StringDictionary[CSSProperties]
  type EditorCommand = DraftEditorCommand | String
}
