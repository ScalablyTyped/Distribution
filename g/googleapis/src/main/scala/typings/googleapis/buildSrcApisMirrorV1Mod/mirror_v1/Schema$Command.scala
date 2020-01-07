package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single menu command that is part of a Contact.
  */
@js.native
trait Schema$Command extends js.Object {
  /**
    * The type of operation this command corresponds to. Allowed values are: -
    * TAKE_A_NOTE - Shares a timeline item with the transcription of user
    * speech from the &quot;Take a note&quot; voice menu command.   -
    * POST_AN_UPDATE - Shares a timeline item with the transcription of user
    * speech from the &quot;Post an update&quot; voice menu command.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Command {
  @scala.inline
  def apply(`type`: String = null): Schema$Command = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Command]
  }
}

