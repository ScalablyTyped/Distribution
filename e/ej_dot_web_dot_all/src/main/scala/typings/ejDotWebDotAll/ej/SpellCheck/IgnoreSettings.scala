package typings.ejDotWebDotAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreSettings extends js.Object {
  /** When set to true, ignoring the alphanumeric words from the error word consideration.
    * @Default {true}
    */
  var ignoreAlphaNumericWords: js.UndefOr[String] = js.undefined
  /** When set to true, ignoring the Email address from the error word consideration.
    * @Default {true}
    */
  var ignoreEmailAddress: js.UndefOr[Boolean] = js.undefined
  /** When set to true, ignoring the file address path from the error word consideration.
    * @Default {true}
    */
  var ignoreFileNames: js.UndefOr[Boolean] = js.undefined
  /** When set to true, ignoring the MixedCase words from the error word consideration.
    * @Default {true}
    */
  var ignoreMixedCaseWords: js.UndefOr[Boolean] = js.undefined
  /** When set to true, ignoring the UpperCase words from the error word consideration.
    * @Default {true}
    */
  var ignoreUpperCase: js.UndefOr[Boolean] = js.undefined
  /** When set to true, ignoring the Url from the error word consideration.
    * @Default {true}
    */
  var ignoreUrl: js.UndefOr[Boolean] = js.undefined
}

object IgnoreSettings {
  @scala.inline
  def apply(
    ignoreAlphaNumericWords: String = null,
    ignoreEmailAddress: js.UndefOr[Boolean] = js.undefined,
    ignoreFileNames: js.UndefOr[Boolean] = js.undefined,
    ignoreMixedCaseWords: js.UndefOr[Boolean] = js.undefined,
    ignoreUpperCase: js.UndefOr[Boolean] = js.undefined,
    ignoreUrl: js.UndefOr[Boolean] = js.undefined
  ): IgnoreSettings = {
    val __obj = js.Dynamic.literal()
    if (ignoreAlphaNumericWords != null) __obj.updateDynamic("ignoreAlphaNumericWords")(ignoreAlphaNumericWords)
    if (!js.isUndefined(ignoreEmailAddress)) __obj.updateDynamic("ignoreEmailAddress")(ignoreEmailAddress)
    if (!js.isUndefined(ignoreFileNames)) __obj.updateDynamic("ignoreFileNames")(ignoreFileNames)
    if (!js.isUndefined(ignoreMixedCaseWords)) __obj.updateDynamic("ignoreMixedCaseWords")(ignoreMixedCaseWords)
    if (!js.isUndefined(ignoreUpperCase)) __obj.updateDynamic("ignoreUpperCase")(ignoreUpperCase)
    if (!js.isUndefined(ignoreUrl)) __obj.updateDynamic("ignoreUrl")(ignoreUrl)
    __obj.asInstanceOf[IgnoreSettings]
  }
}

