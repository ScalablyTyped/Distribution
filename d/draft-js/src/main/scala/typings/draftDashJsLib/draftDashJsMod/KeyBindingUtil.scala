package typings
package draftDashJsLib.draftDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "KeyBindingUtil")
@js.native
class KeyBindingUtil ()
  extends draftDashJsLib.draftDashJsMod.DraftNs.ComponentNs.UtilsNs.KeyBindingUtil

/* static members */
@JSImport("draft-js", "KeyBindingUtil")
@js.native
object KeyBindingUtil extends js.Object {
  def hasCommandModifier(e: draftDashJsLib.SyntheticKeyboardEvent): scala.Boolean = js.native
  /**
    * Check whether the ctrlKey modifier is *not* being used in conjunction with
    * the altKey modifier. If they are combined, the result is an `altGraph`
    * key modifier, which should not be handled by this set of key bindings.
    */
  def isCtrlKeyCommand(e: draftDashJsLib.SyntheticKeyboardEvent): scala.Boolean = js.native
  def isOptionKeyCommand(e: draftDashJsLib.SyntheticKeyboardEvent): scala.Boolean = js.native
  def isSoftNewlineEvent(e: draftDashJsLib.SyntheticKeyboardEvent): scala.Boolean = js.native
}

