package typings.getopts.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
  var boolean: js.UndefOr[js.Array[String]] = js.undefined
  var default: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var stopEarly: js.UndefOr[Boolean] = js.undefined
  var string: js.UndefOr[js.Array[String]] = js.undefined
  var unknown: js.UndefOr[js.Function1[/* optionName */ String, Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alias: StringDictionary[String | js.Array[String]] = null,
    boolean: js.Array[String] = null,
    default: StringDictionary[js.Any] = null,
    stopEarly: js.UndefOr[Boolean] = js.undefined,
    string: js.Array[String] = null,
    unknown: /* optionName */ String => Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(stopEarly)) __obj.updateDynamic("stopEarly")(stopEarly.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(js.Any.fromFunction1(unknown))
    __obj.asInstanceOf[Options]
  }
}

