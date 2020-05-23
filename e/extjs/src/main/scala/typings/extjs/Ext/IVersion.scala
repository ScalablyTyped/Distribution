package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVersion extends js.Object {
  /** [Method] Returns whether this version equals to the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version equals to the target, false otherwise
    */
  @JSName("equals")
  var equals_FIVersion: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns the build component value
    * @returns Number build
    */
  var getBuild: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the major component value
    * @returns Number major
    */
  var getMajor: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the minor component value
    * @returns Number minor
    */
  var getMinor: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the patch component value
    * @returns Number patch
    */
  var getPatch: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the release component value
    * @returns Number release
    */
  var getRelease: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns shortVersion version without dots and release
    * @returns String
    */
  var getShortVersion: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Convenient alias to isGreaterThan
    * @param target String/Number
    * @returns Boolean
    */
  var gt: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Convenient alias to isGreaterThanOrEqual
    * @param target String/Number
    * @returns Boolean
    */
  var gtEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns whether this version if greater than the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version if greater than the target, false otherwise
    */
  var isGreaterThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns whether this version if greater than or equal to the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version if greater than or equal to the target, false otherwise
    */
  var isGreaterThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns whether this version if smaller than the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version if smaller than the target, false otherwise
    */
  var isLessThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns whether this version if less than or equal to the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version if less than or equal to the target, false otherwise
    */
  var isLessThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Convenient alias to isLessThan
    * @param target String/Number
    * @returns Boolean
    */
  var lt: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Convenient alias to isLessThanOrEqual
    * @param target String/Number
    * @returns Boolean
    */
  var ltEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns whether this version matches the supplied argument
    * @param target String/Number The version to compare with
    * @returns Boolean True if this version matches the target, false otherwise
    */
  var `match`: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns this format  major minor patch build release
    * @returns Number[]
    */
  var toArray: js.UndefOr[js.Function0[Array]] = js.undefined
}

object IVersion {
  @scala.inline
  def apply(
    equals: /* target */ js.UndefOr[js.Any] => Boolean = null,
    getBuild: () => Double = null,
    getMajor: () => Double = null,
    getMinor: () => Double = null,
    getPatch: () => Double = null,
    getRelease: () => Double = null,
    getShortVersion: () => java.lang.String = null,
    gt: /* target */ js.UndefOr[js.Any] => Boolean = null,
    gtEq: /* target */ js.UndefOr[js.Any] => Boolean = null,
    isGreaterThan: /* target */ js.UndefOr[js.Any] => Boolean = null,
    isGreaterThanOrEqual: /* target */ js.UndefOr[js.Any] => Boolean = null,
    isLessThan: /* target */ js.UndefOr[js.Any] => Boolean = null,
    isLessThanOrEqual: /* target */ js.UndefOr[js.Any] => Boolean = null,
    lt: /* target */ js.UndefOr[js.Any] => Boolean = null,
    ltEq: /* target */ js.UndefOr[js.Any] => Boolean = null,
    `match`: /* target */ js.UndefOr[js.Any] => Boolean = null,
    toArray: () => Array = null
  ): IVersion = {
    val __obj = js.Dynamic.literal()
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction1(equals))
    if (getBuild != null) __obj.updateDynamic("getBuild")(js.Any.fromFunction0(getBuild))
    if (getMajor != null) __obj.updateDynamic("getMajor")(js.Any.fromFunction0(getMajor))
    if (getMinor != null) __obj.updateDynamic("getMinor")(js.Any.fromFunction0(getMinor))
    if (getPatch != null) __obj.updateDynamic("getPatch")(js.Any.fromFunction0(getPatch))
    if (getRelease != null) __obj.updateDynamic("getRelease")(js.Any.fromFunction0(getRelease))
    if (getShortVersion != null) __obj.updateDynamic("getShortVersion")(js.Any.fromFunction0(getShortVersion))
    if (gt != null) __obj.updateDynamic("gt")(js.Any.fromFunction1(gt))
    if (gtEq != null) __obj.updateDynamic("gtEq")(js.Any.fromFunction1(gtEq))
    if (isGreaterThan != null) __obj.updateDynamic("isGreaterThan")(js.Any.fromFunction1(isGreaterThan))
    if (isGreaterThanOrEqual != null) __obj.updateDynamic("isGreaterThanOrEqual")(js.Any.fromFunction1(isGreaterThanOrEqual))
    if (isLessThan != null) __obj.updateDynamic("isLessThan")(js.Any.fromFunction1(isLessThan))
    if (isLessThanOrEqual != null) __obj.updateDynamic("isLessThanOrEqual")(js.Any.fromFunction1(isLessThanOrEqual))
    if (lt != null) __obj.updateDynamic("lt")(js.Any.fromFunction1(lt))
    if (ltEq != null) __obj.updateDynamic("ltEq")(js.Any.fromFunction1(ltEq))
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    if (toArray != null) __obj.updateDynamic("toArray")(js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[IVersion]
  }
}

