package typings.electron.Electron

import typings.electron.electronStrings.exists
import typings.electron.electronStrings.existsAndRunning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveToApplicationsFolderOptions extends js.Object {
  /**
    * A handler for potential conflict in move failure.
    */
  var conflictHandler: js.UndefOr[js.Function1[/* conflictType */ exists | existsAndRunning, Boolean]] = js.native
}

object MoveToApplicationsFolderOptions {
  @scala.inline
  def apply(): MoveToApplicationsFolderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveToApplicationsFolderOptions]
  }
  @scala.inline
  implicit class MoveToApplicationsFolderOptionsOps[Self <: MoveToApplicationsFolderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConflictHandler(value: /* conflictType */ exists | existsAndRunning => Boolean): Self = this.set("conflictHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteConflictHandler: Self = this.set("conflictHandler", js.undefined)
  }
  
}

