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

