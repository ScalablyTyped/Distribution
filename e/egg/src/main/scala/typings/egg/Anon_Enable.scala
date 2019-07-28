package typings.egg

import typings.egg.eggMod.IgnoreOrMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enable extends js.Object {
  var enable: Boolean
  var enableTypes: js.Array[String]
  var encoding: String
  var extendTypes: Anon_Form
  var formLimit: String
  var ignore: IgnoreOrMatch
  var jsonLimit: String
  var `match`: IgnoreOrMatch
  var queryString: Anon_ArrayLimit
  var strict: Boolean
}

object Anon_Enable {
  @scala.inline
  def apply(
    enable: Boolean,
    enableTypes: js.Array[String],
    encoding: String,
    extendTypes: Anon_Form,
    formLimit: String,
    ignore: IgnoreOrMatch,
    jsonLimit: String,
    `match`: IgnoreOrMatch,
    queryString: Anon_ArrayLimit,
    strict: Boolean
  ): Anon_Enable = {
    val __obj = js.Dynamic.literal(enable = enable, enableTypes = enableTypes, encoding = encoding, extendTypes = extendTypes, formLimit = formLimit, ignore = ignore.asInstanceOf[js.Any], jsonLimit = jsonLimit, queryString = queryString, strict = strict)
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Enable]
  }
}

