package typings
package atEmberUtilsLib.dashPrivateTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeLookup extends js.Object {
  var array: js.Array[_]
  var boolean: scala.Boolean
  var date: stdLib.Date
  var error: stdLib.Error
  var filelist: stdLib.FileList
  var `null`: scala.Null
  var number: scala.Double
  var regexp: stdLib.RegExp
  var string: java.lang.String
  var undefined: js.UndefOr[scala.Nothing]
  def function(args: js.Any*): js.Any
}

object TypeLookup {
  @scala.inline
  def apply(
    array: js.Array[_],
    boolean: scala.Boolean,
    date: stdLib.Date,
    error: stdLib.Error,
    filelist: stdLib.FileList,
    function: js.Function1[/* repeated */ js.Any, js.Any],
    `null`: scala.Null,
    number: scala.Double,
    regexp: stdLib.RegExp,
    string: java.lang.String,
    undefined: js.UndefOr[scala.Nothing] = js.undefined
  ): TypeLookup = {
    val __obj = js.Dynamic.literal(`null` = `null`)
    __obj.updateDynamic("array")(array)
    __obj.updateDynamic("boolean")(boolean)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("filelist")(filelist)
    __obj.updateDynamic("function")(function)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("regexp")(regexp)
    __obj.updateDynamic("string")(string)
    if (!js.isUndefined(undefined)) __obj.updateDynamic("undefined")(undefined)
    __obj.asInstanceOf[TypeLookup]
  }
}

