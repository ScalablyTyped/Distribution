package typings.firebase.anon

import typings.firebase.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  /**
    * The raw arguments passed to the log call.
    */
  var args: js.Array[_]
  /**
    * Level of event logged.
    */
  var level: LogLevel
  /**
    * Any text from logged arguments joined into one string.
    */
  var message: String
  /**
    * A string indicating the name of the package that made the log call,
    * such as `@firebase/firestore`.
    */
  var `type`: String
}

object Args {
  @scala.inline
  def apply(args: js.Array[_], level: LogLevel, message: String, `type`: String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

