package typings.egg.anon

import typings.egg.mod.IgnoreOrMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enable extends js.Object {
  var enable: Boolean
  var enableTypes: js.Array[String]
  var encoding: String
  var extendTypes: Form
  var formLimit: String
  var ignore: IgnoreOrMatch
  var jsonLimit: String
  var `match`: IgnoreOrMatch
  var queryString: ArrayLimit
  var strict: Boolean
  var textLimit: String
}

object Enable {
  @scala.inline
  def apply(
    enable: Boolean,
    enableTypes: js.Array[String],
    encoding: String,
    extendTypes: Form,
    formLimit: String,
    ignore: IgnoreOrMatch,
    jsonLimit: String,
    `match`: IgnoreOrMatch,
    queryString: ArrayLimit,
    strict: Boolean,
    textLimit: String
  ): Enable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], enableTypes = enableTypes.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], extendTypes = extendTypes.asInstanceOf[js.Any], formLimit = formLimit.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], jsonLimit = jsonLimit.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], textLimit = textLimit.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enable]
  }
}

