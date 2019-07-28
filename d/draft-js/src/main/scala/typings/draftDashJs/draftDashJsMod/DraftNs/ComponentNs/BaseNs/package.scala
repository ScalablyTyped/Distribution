package typings.draftDashJs.draftDashJsMod.DraftNs.ComponentNs

import org.scalablytyped.runtime.StringDictionary
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftBlockType
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEditorCommand
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.DraftBlockRenderConfig
import typings.immutable.immutableMod.Map
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BaseNs {
  type DraftBlockRenderMap = Map[DraftBlockType, DraftBlockRenderConfig]
  type DraftStyleMap = StringDictionary[CSSProperties]
  type EditorCommand = DraftEditorCommand | String
}
