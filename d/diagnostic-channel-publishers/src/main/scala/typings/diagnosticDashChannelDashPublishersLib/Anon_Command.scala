package typings
package diagnosticDashChannelDashPublishersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Command extends js.Object {
  var command: js.UndefOr[js.Any] = js.undefined
  var databaseName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Command {
  @scala.inline
  def apply(command: js.Any = null, databaseName: java.lang.String = null): Anon_Command = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command)
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName)
    __obj.asInstanceOf[Anon_Command]
  }
}

