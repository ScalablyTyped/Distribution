package typings.electron.Electron

import typings.electron.electronStrings.exists
import typings.electron.electronStrings.existsAndRunning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveToApplicationsFolderOptions extends js.Object {
  /**
    * A handler for potential conflict in move failure.
    */
  var conflictHandler: js.UndefOr[js.Function1[/* conflictType */ exists | existsAndRunning, Boolean]] = js.undefined
}

object MoveToApplicationsFolderOptions {
  @scala.inline
  def apply(conflictHandler: /* conflictType */ exists | existsAndRunning => Boolean = null): MoveToApplicationsFolderOptions = {
    val __obj = js.Dynamic.literal()
    if (conflictHandler != null) __obj.updateDynamic("conflictHandler")(js.Any.fromFunction1(conflictHandler))
    __obj.asInstanceOf[MoveToApplicationsFolderOptions]
  }
}

