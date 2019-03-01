package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVersion extends js.Object {
  /** [Method] Returns whether this version equals to the supplied argument
  		* @param target String/Number The version to compare with
  		* @returns Boolean True if this version equals to the target, false otherwise
  		*/
  @JSName("equals")
  var equals_FIVersion: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns the build component value
  		* @returns Number build
  		*/
  var getBuild: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the major component value
  		* @returns Number major
  		*/
  var getMajor: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the minor component value
  		* @returns Number minor
  		*/
  var getMinor: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the patch component value
  		* @returns Number patch
  		*/
  var getPatch: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the release component value
  		* @returns Number release
  		*/
  var getRelease: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns shortVersion version without dots and release
  		* @returns String
  		*/
  var getShortVersion: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Convenient alias to isGreaterThan
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var gt: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Convenient alias to isGreaterThanOrEqual
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var gtEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns whether this version if greater than the supplied argument
  		* @param target String/Number The version to compare with
  		* @returns Boolean True if this version if greater than the target, false otherwise
  		*/
  var isGreaterThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns whether this version if greater than or equal to the supplied argument
  		* @param target String/Number The version to compare with
  		* @returns Boolean True if this version if greater than or equal to the target, false otherwise
  		*/
  var isGreaterThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns whether this version if smaller than the supplied argument
  		* @param target String/Number The version to compare with
  		* @returns Boolean True if this version if smaller than the target, false otherwise
  		*/
  var isLessThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns whether this version if less than or equal to the supplied argument
  		* @param target String/Number The version to compare with
  		* @returns Boolean True if this version if less than or equal to the target, false otherwise
  		*/
  var isLessThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Convenient alias to isLessThan
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var lt: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Convenient alias to isLessThanOrEqual
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var ltEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns whether this version matches the supplied argument
  		* @param target String/Number The version to compare with
  		* @returns Boolean True if this version matches the target, false otherwise
  		*/
  var `match`: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns this format  major minor patch build release
  		* @returns Number[]
  		*/
  var toArray: js.UndefOr[js.Function0[Array]] = js.undefined
}

object IVersion {
  @scala.inline
  def apply(
    equals: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    getBuild: js.Function0[scala.Double] = null,
    getMajor: js.Function0[scala.Double] = null,
    getMinor: js.Function0[scala.Double] = null,
    getPatch: js.Function0[scala.Double] = null,
    getRelease: js.Function0[scala.Double] = null,
    getShortVersion: js.Function0[java.lang.String] = null,
    gt: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    gtEq: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    isGreaterThan: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    isGreaterThanOrEqual: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    isLessThan: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    isLessThanOrEqual: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    lt: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    ltEq: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    `match`: js.Function1[/* target */ js.UndefOr[js.Any], scala.Boolean] = null,
    toArray: js.Function0[Array] = null
  ): IVersion = {
    val __obj = js.Dynamic.literal()
    if (equals != null) __obj.updateDynamic("equals")(equals)
    if (getBuild != null) __obj.updateDynamic("getBuild")(getBuild)
    if (getMajor != null) __obj.updateDynamic("getMajor")(getMajor)
    if (getMinor != null) __obj.updateDynamic("getMinor")(getMinor)
    if (getPatch != null) __obj.updateDynamic("getPatch")(getPatch)
    if (getRelease != null) __obj.updateDynamic("getRelease")(getRelease)
    if (getShortVersion != null) __obj.updateDynamic("getShortVersion")(getShortVersion)
    if (gt != null) __obj.updateDynamic("gt")(gt)
    if (gtEq != null) __obj.updateDynamic("gtEq")(gtEq)
    if (isGreaterThan != null) __obj.updateDynamic("isGreaterThan")(isGreaterThan)
    if (isGreaterThanOrEqual != null) __obj.updateDynamic("isGreaterThanOrEqual")(isGreaterThanOrEqual)
    if (isLessThan != null) __obj.updateDynamic("isLessThan")(isLessThan)
    if (isLessThanOrEqual != null) __obj.updateDynamic("isLessThanOrEqual")(isLessThanOrEqual)
    if (lt != null) __obj.updateDynamic("lt")(lt)
    if (ltEq != null) __obj.updateDynamic("ltEq")(ltEq)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (toArray != null) __obj.updateDynamic("toArray")(toArray)
    __obj.asInstanceOf[IVersion]
  }
}

