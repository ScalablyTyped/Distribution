package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardEvent extends Event {
  // Docs: http://electronjs.org/docs/api/structures/keyboard-event
  /**
    * whether an Alt key was used in an accelerator to trigger the Event
    */
  var altKey: js.UndefOr[Boolean] = js.native
  /**
    * whether the Control key was used in an accelerator to trigger the Event
    */
  var ctrlKey: js.UndefOr[Boolean] = js.native
  /**
    * whether a meta key was used in an accelerator to trigger the Event
    */
  var metaKey: js.UndefOr[Boolean] = js.native
  /**
    * whether a Shift key was used in an accelerator to trigger the Event
    */
  var shiftKey: js.UndefOr[Boolean] = js.native
  /**
    * whether an accelerator was used to trigger the event as opposed to another user
    * gesture like mouse click
    */
  var triggeredByAccelerator: js.UndefOr[Boolean] = js.native
}

