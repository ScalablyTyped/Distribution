package typings.eyes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  /** Overall base style applied to everything */
  var all: js.UndefOr[String] = js.undefined
  /** Style when printing booleans */
  var bool: js.UndefOr[String] = js.undefined
  /** Style when printing the keys in object literals, like 'a' in `{a: 1}` */
  var key: js.UndefOr[String] = js.undefined
  /** Style when printing inspection labels, like 'array' in `array: [1, 2, 3]` */
  var label: js.UndefOr[String] = js.undefined
  /** Style when printing numbers */
  var number: js.UndefOr[String] = js.undefined
  /** Style when printing objects which don't have a literal representation, such as functions */
  var other: js.UndefOr[String] = js.undefined
  /** Style when printing RegExps */
  var regexp: js.UndefOr[String] = js.undefined
  /** Style when printing `null`, `undefined`, etc. */
  var special: js.UndefOr[String] = js.undefined
  /** Style when printing strings */
  var string: js.UndefOr[String] = js.undefined
}

object Anon_All {
  @scala.inline
  def apply(
    all: String = null,
    bool: String = null,
    key: String = null,
    label: String = null,
    number: String = null,
    other: String = null,
    regexp: String = null,
    special: String = null,
    string: String = null
  ): Anon_All = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all)
    if (bool != null) __obj.updateDynamic("bool")(bool)
    if (key != null) __obj.updateDynamic("key")(key)
    if (label != null) __obj.updateDynamic("label")(label)
    if (number != null) __obj.updateDynamic("number")(number)
    if (other != null) __obj.updateDynamic("other")(other)
    if (regexp != null) __obj.updateDynamic("regexp")(regexp)
    if (special != null) __obj.updateDynamic("special")(special)
    if (string != null) __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[Anon_All]
  }
}

