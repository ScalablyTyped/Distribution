package typings
package dockerDashFileDashParserLib.dockerDashFileDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandEntry extends js.Object {
  var args: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var error: js.UndefOr[java.lang.String] = js.undefined
  var lineno: scala.Double
  var name: java.lang.String
  var raw: java.lang.String
}

object CommandEntry {
  @scala.inline
  def apply(
    args: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String],
    lineno: scala.Double,
    name: java.lang.String,
    raw: java.lang.String,
    error: java.lang.String = null
  ): CommandEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("raw")(raw)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[CommandEntry]
  }
}

