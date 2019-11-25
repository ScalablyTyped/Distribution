package typings.dockerDashFileDashParser.dockerDashFileDashParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandEntry extends js.Object {
  var args: String | js.Array[String] | StringDictionary[String]
  var error: js.UndefOr[String] = js.undefined
  var lineno: Double
  var name: String
  var raw: String
}

object CommandEntry {
  @scala.inline
  def apply(
    args: String | js.Array[String] | StringDictionary[String],
    lineno: Double,
    name: String,
    raw: String,
    error: String = null
  ): CommandEntry = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandEntry]
  }
}

