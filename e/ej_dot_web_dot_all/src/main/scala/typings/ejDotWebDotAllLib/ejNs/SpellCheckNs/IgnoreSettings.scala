package typings
package ejDotWebDotAllLib.ejNs.SpellCheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgnoreSettings extends js.Object {
  /** When set to true, ignoring the alphanumeric words from the error word consideration.
               * @Default {true}
               */
  var ignoreAlphaNumericWords: js.UndefOr[java.lang.String] = js.undefined
  /** When set to true, ignoring the Email address from the error word consideration.
               * @Default {true}
               */
  var ignoreEmailAddress: js.UndefOr[scala.Boolean] = js.undefined
  /** When set to true, ignoring the file address path from the error word consideration.
               * @Default {true}
               */
  var ignoreFileNames: js.UndefOr[scala.Boolean] = js.undefined
  /** When set to true, ignoring the MixedCase words from the error word consideration.
               * @Default {true}
               */
  var ignoreMixedCaseWords: js.UndefOr[scala.Boolean] = js.undefined
  /** When set to true, ignoring the UpperCase words from the error word consideration.
               * @Default {true}
               */
  var ignoreUpperCase: js.UndefOr[scala.Boolean] = js.undefined
  /** When set to true, ignoring the Url from the error word consideration.
               * @Default {true}
               */
  var ignoreUrl: js.UndefOr[scala.Boolean] = js.undefined
}

