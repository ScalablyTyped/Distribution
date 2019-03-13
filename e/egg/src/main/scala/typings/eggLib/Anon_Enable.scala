package typings
package eggLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enable extends js.Object {
  var enable: scala.Boolean
  var enableTypes: js.Array[java.lang.String]
  var encoding: java.lang.String
  var extendTypes: Anon_Form
  var formLimit: java.lang.String
  var ignore: eggLib.eggMod.IgnoreOrMatch
  var jsonLimit: java.lang.String
  var `match`: eggLib.eggMod.IgnoreOrMatch
  var queryString: Anon_ArrayLimit
  var strict: scala.Boolean
}

object Anon_Enable {
  @scala.inline
  def apply(
    enable: scala.Boolean,
    enableTypes: js.Array[java.lang.String],
    encoding: java.lang.String,
    extendTypes: Anon_Form,
    formLimit: java.lang.String,
    ignore: eggLib.eggMod.IgnoreOrMatch,
    jsonLimit: java.lang.String,
    `match`: eggLib.eggMod.IgnoreOrMatch,
    queryString: Anon_ArrayLimit,
    strict: scala.Boolean
  ): Anon_Enable = {
    val __obj = js.Dynamic.literal(enable = enable, enableTypes = enableTypes, encoding = encoding, extendTypes = extendTypes, formLimit = formLimit, ignore = ignore.asInstanceOf[js.Any], jsonLimit = jsonLimit, queryString = queryString, strict = strict)
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Enable]
  }
}

