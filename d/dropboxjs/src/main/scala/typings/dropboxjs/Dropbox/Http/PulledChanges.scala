package typings.dropboxjs.Dropbox.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PulledChanges extends js.Object {
  var blankSlate: Boolean
  var cursorTag: String
  var shouldBackOff: Boolean
  var shouldPullAgain: Boolean
  def cursor(): String
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
}

