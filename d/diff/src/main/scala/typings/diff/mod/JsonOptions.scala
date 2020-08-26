package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonOptions extends LinesOptions {
  /**
    * Replacer used to stringify the properties of the passed objects.
    */
  var stringifyReplacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  /**
    * The value to use when `undefined` values in the passed objects are encountered during stringification.
    * Will only be used if `stringifyReplacer` option wasn't specified.
    * @default undefined
    */
  var undefinedReplacement: js.UndefOr[js.Any] = js.native
}

object JsonOptions {
  @scala.inline
  def apply(): JsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonOptions]
  }
  @scala.inline
  implicit class JsonOptionsOps[Self <: JsonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStringifyReplacer(value: (/* key */ String, /* value */ js.Any) => _): Self = this.set("stringifyReplacer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStringifyReplacer: Self = this.set("stringifyReplacer", js.undefined)
    @scala.inline
    def setUndefinedReplacement(value: js.Any): Self = this.set("undefinedReplacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndefinedReplacement: Self = this.set("undefinedReplacement", js.undefined)
  }
  
}

