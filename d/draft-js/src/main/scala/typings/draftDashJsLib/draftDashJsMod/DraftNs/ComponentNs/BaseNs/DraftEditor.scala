package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ComponentNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `DraftEditor` is the root editor component. It composes a `contentEditable`
  * div, and provides a wide variety of useful function props for managing the
  * state of the editor. See `DraftEditorProps` for details.
  */
@js.native
trait DraftEditor
  extends reactLib.reactMod.Component[DraftEditorProps, js.Object, js.Any] {
  // Remove focus from the editor node.
  def blur(): scala.Unit = js.native
  // Force focus back onto the editor node.
  def focus(): scala.Unit = js.native
}

