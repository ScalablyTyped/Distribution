package typings.eyes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait All extends js.Object {
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

object All {
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
  ): All = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (bool != null) __obj.updateDynamic("bool")(bool.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    if (special != null) __obj.updateDynamic("special")(special.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
}

