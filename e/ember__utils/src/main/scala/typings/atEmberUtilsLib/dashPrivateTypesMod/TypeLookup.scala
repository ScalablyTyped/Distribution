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
  var undefined: js.UndefOr[scala.Nothing] = js.undefined
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
    function: /* repeated */ js.Any => js.Any,
    `null`: scala.Null,
    number: scala.Double,
    regexp: stdLib.RegExp,
    string: java.lang.String,
    undefined: js.UndefOr[scala.Nothing] = js.undefined
  ): TypeLookup = {
    val __obj = js.Dynamic.literal(array = array, boolean = boolean, date = date, error = error, filelist = filelist, function = js.Any.fromFunction1(function), number = number, regexp = regexp, string = string)
    __obj.updateDynamic("null")(`null`)
    if (!js.isUndefined(undefined)) __obj.updateDynamic("undefined")(undefined)
    __obj.asInstanceOf[TypeLookup]
  }
}

