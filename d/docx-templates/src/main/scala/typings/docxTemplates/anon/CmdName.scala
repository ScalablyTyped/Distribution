package typings.docxTemplates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CmdName extends js.Object {
  var cmdName: js.UndefOr[String] = js.undefined
  var cmdRest: String
}

object CmdName {
  @scala.inline
  def apply(cmdRest: String, cmdName: String = null): CmdName = {
    val __obj = js.Dynamic.literal(cmdRest = cmdRest.asInstanceOf[js.Any])
    if (cmdName != null) __obj.updateDynamic("cmdName")(cmdName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmdName]
  }
}

