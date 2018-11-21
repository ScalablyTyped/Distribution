package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ComponentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BaseNs {
  type DraftBlockRenderMap = immutableLib.immutableMod.Map[
    draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftBlockType, 
    draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.DraftBlockRenderConfig
  ]
  type DraftTextAlignment = draftDashJsLib.draftDashJsLibStrings.left | draftDashJsLib.draftDashJsLibStrings.center | draftDashJsLib.draftDashJsLibStrings.right
  type EditorCommand = draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEditorCommand | java.lang.String
}
