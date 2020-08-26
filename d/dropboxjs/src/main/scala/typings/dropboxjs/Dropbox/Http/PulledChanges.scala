package typings.dropboxjs.Dropbox.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PulledChanges extends js.Object {
  var blankSlate: Boolean = js.native
  var cursorTag: String = js.native
  var shouldBackOff: Boolean = js.native
  var shouldPullAgain: Boolean = js.native
  def cursor(): String = js.native
}

object PulledChanges {
  @scala.inline
  def apply(
    blankSlate: Boolean,
    cursor: () => String,
    cursorTag: String,
    shouldBackOff: Boolean,
    shouldPullAgain: Boolean
  ): PulledChanges = {
    val __obj = js.Dynamic.literal(blankSlate = blankSlate.asInstanceOf[js.Any], cursor = js.Any.fromFunction0(cursor), cursorTag = cursorTag.asInstanceOf[js.Any], shouldBackOff = shouldBackOff.asInstanceOf[js.Any], shouldPullAgain = shouldPullAgain.asInstanceOf[js.Any])
    __obj.asInstanceOf[PulledChanges]
  }
  @scala.inline
  implicit class PulledChangesOps[Self <: PulledChanges] (val x: Self) extends AnyVal {
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
    def setBlankSlate(value: Boolean): Self = this.set("blankSlate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursor(value: () => String): Self = this.set("cursor", js.Any.fromFunction0(value))
    @scala.inline
    def setCursorTag(value: String): Self = this.set("cursorTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldBackOff(value: Boolean): Self = this.set("shouldBackOff", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldPullAgain(value: Boolean): Self = this.set("shouldPullAgain", value.asInstanceOf[js.Any])
  }
  
}

