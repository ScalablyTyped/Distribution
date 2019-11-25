package typings.getDashValue.getDashValueMod

import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The default value to return when get-value cannot result a value from the given object.
    *
    * default: `undefined`
    */
  var default: js.UndefOr[js.Any] = js.undefined
  /**
    * If defined, this function is called on each resolved value.
    * Useful if you want to do `.hasOwnProperty` or `Object.prototype.propertyIsEnumerable`.
    */
  var isValid: js.UndefOr[js.Function2[/* key */ String, /* object */ Record[String, _], Boolean]] = js.undefined
  /**
    * Customize how the object path is created when iterating over path segments.
    *
    * default: `Array.join`
    */
  var join: js.UndefOr[js.Function1[/* segs */ js.Array[String], String]] = js.undefined
  /**
    * The character to use when re-joining the string to check for keys
    * with dots in them (this is probably not needed when `options.join` is used).
    * This can be a different value than the separator, since the separator can be a string or regex.
    *
    * default: `"."`
    */
  var joinChar: js.UndefOr[String] = js.undefined
  /**
    * The separator to use for spliting the string.
    * (this is probably not needed when `options.split` is used).
    *
    *  default: `"."`
    */
  var separator: js.UndefOr[String | RegExp] = js.undefined
  /**
    * Custom function to use for splitting the string into object path segments.
    *
    * default: `String.split`
    */
  var split: js.UndefOr[js.Function1[/* s */ String, js.Array[String]]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    default: js.Any = null,
    isValid: (/* key */ String, /* object */ Record[String, _]) => Boolean = null,
    join: /* segs */ js.Array[String] => String = null,
    joinChar: String = null,
    separator: String | RegExp = null,
    split: /* s */ String => js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction2(isValid))
    if (join != null) __obj.updateDynamic("join")(js.Any.fromFunction1(join))
    if (joinChar != null) __obj.updateDynamic("joinChar")(joinChar.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(js.Any.fromFunction1(split))
    __obj.asInstanceOf[Options]
  }
}

