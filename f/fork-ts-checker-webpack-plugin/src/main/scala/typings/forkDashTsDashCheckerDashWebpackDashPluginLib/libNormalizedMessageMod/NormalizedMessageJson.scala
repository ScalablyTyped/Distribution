package typings
package forkDashTsDashCheckerDashWebpackDashPluginLib.libNormalizedMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedMessageJson extends js.Object {
  var character: js.UndefOr[scala.Double] = js.undefined
  var code: java.lang.String | scala.Double
  var content: java.lang.String
  var file: js.UndefOr[java.lang.String] = js.undefined
  var line: js.UndefOr[scala.Double] = js.undefined
  var severity: Severity
  var `type`: ErrorType
}

object NormalizedMessageJson {
  @scala.inline
  def apply(
    code: java.lang.String | scala.Double,
    content: java.lang.String,
    severity: Severity,
    `type`: ErrorType,
    character: scala.Int | scala.Double = null,
    file: java.lang.String = null,
    line: scala.Int | scala.Double = null
  ): NormalizedMessageJson = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("severity")(severity)
    if (character != null) __obj.updateDynamic("character")(character.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file)
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedMessageJson]
  }
}

