package typings.electron.Electron

import typings.electron.electronStrings.alt
import typings.electron.electronStrings.capsLock
import typings.electron.electronStrings.cmd
import typings.electron.electronStrings.command
import typings.electron.electronStrings.control
import typings.electron.electronStrings.ctrl
import typings.electron.electronStrings.isAutoRepeat
import typings.electron.electronStrings.isKeypad
import typings.electron.electronStrings.left
import typings.electron.electronStrings.leftButtonDown
import typings.electron.electronStrings.meta
import typings.electron.electronStrings.middleButtonDown
import typings.electron.electronStrings.numLock
import typings.electron.electronStrings.right
import typings.electron.electronStrings.rightButtonDown
import typings.electron.electronStrings.shift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputEvent extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/input-event
  /**
    * An array of modifiers of the event, can be `shift`, `control`, `ctrl`, `alt`,
    * `meta`, `command`, `cmd`, `isKeypad`, `isAutoRepeat`, `leftButtonDown`,
    * `middleButtonDown`, `rightButtonDown`, `capsLock`, `numLock`, `left`, `right`.
    */
  var modifiers: js.UndefOr[
    js.Array[
      shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right
    ]
  ] = js.undefined
}

object InputEvent {
  @scala.inline
  def apply(
    modifiers: js.Array[
      shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right
    ] = null
  ): InputEvent = {
    val __obj = js.Dynamic.literal()
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputEvent]
  }
}

