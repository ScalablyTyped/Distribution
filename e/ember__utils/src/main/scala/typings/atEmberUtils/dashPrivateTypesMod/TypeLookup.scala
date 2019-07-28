package typings.atEmberUtils.dashPrivateTypesMod

import typings.std.Date
import typings.std.Error
import typings.std.FileList
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeLookup extends js.Object {
  var array: js.Array[_]
  var boolean: Boolean
  var date: Date
  var error: Error
  var filelist: FileList
  var `null`: Null
  var number: Double
  var regexp: RegExp
  var string: String
  var undefined: js.UndefOr[scala.Nothing] = js.undefined
  def function(args: js.Any*): js.Any
}

object TypeLookup {
  @scala.inline
  def apply(
    array: js.Array[_],
    boolean: Boolean,
    date: Date,
    error: Error,
    filelist: FileList,
    function: /* repeated */ js.Any => js.Any,
    `null`: Null,
    number: Double,
    regexp: RegExp,
    string: String,
    undefined: js.UndefOr[scala.Nothing] = js.undefined
  ): TypeLookup = {
    val __obj = js.Dynamic.literal(array = array, boolean = boolean, date = date, error = error, filelist = filelist, function = js.Any.fromFunction1(function), number = number, regexp = regexp, string = string)
    __obj.updateDynamic("null")(`null`)
    if (!js.isUndefined(undefined)) __obj.updateDynamic("undefined")(undefined)
    __obj.asInstanceOf[TypeLookup]
  }
}

