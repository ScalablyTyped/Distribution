package typings
package eyesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  /** Overall base style applied to everything */
  var all: js.UndefOr[java.lang.String] = js.undefined
  /** Style when printing booleans */
  var bool: js.UndefOr[java.lang.String] = js.undefined
  /** Style when printing the keys in object literals, like 'a' in `{a: 1}` */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Style when printing inspection labels, like 'array' in `array: [1, 2, 3]` */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** Style when printing numbers */
  var number: js.UndefOr[java.lang.String] = js.undefined
  /** Style when printing objects which don't have a literal representation, such as functions */
  var other: js.UndefOr[java.lang.String] = js.undefined
  /** Style when printing RegExps */
  var regexp: js.UndefOr[java.lang.String] = js.undefined
  /** Style when printing `null`, `undefined`, etc. */
  var special: js.UndefOr[java.lang.String] = js.undefined
  /** Style when printing strings */
  var string: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_All {
  @scala.inline
  def apply(
    all: java.lang.String = null,
    bool: java.lang.String = null,
    key: java.lang.String = null,
    label: java.lang.String = null,
    number: java.lang.String = null,
    other: java.lang.String = null,
    regexp: java.lang.String = null,
    special: java.lang.String = null,
    string: java.lang.String = null
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

