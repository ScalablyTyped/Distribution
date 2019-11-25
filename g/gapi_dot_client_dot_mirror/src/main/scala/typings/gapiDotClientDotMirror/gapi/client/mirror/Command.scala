package typings.gapiDotClientDotMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  /**
    * The type of operation this command corresponds to. Allowed values are:
    * - TAKE_A_NOTE - Shares a timeline item with the transcription of user speech from the "Take a note" voice menu command.
    * - POST_AN_UPDATE - Shares a timeline item with the transcription of user speech from the "Post an update" voice menu command.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Command {
  @scala.inline
  def apply(`type`: String = null): Command = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

