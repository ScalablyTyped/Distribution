package typings.forkTsCheckerWebpackPlugin.normalizedMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedMessageJson extends js.Object {
  var character: js.UndefOr[Double] = js.undefined
  var code: String | Double
  var content: String
  var file: js.UndefOr[String] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
  var severity: Severity
  var stack: js.UndefOr[String] = js.undefined
  var `type`: ErrorType
}

object NormalizedMessageJson {
  @scala.inline
  def apply(
    code: String | Double,
    content: String,
    severity: Severity,
    `type`: ErrorType,
    character: Int | Double = null,
    file: String = null,
    line: Int | Double = null,
    stack: String = null
  ): NormalizedMessageJson = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (character != null) __obj.updateDynamic("character")(character.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedMessageJson]
  }
}

