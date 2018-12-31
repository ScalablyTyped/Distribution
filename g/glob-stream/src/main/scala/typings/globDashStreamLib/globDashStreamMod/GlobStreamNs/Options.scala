package typings
package globDashStreamLib.globDashStreamMod.GlobStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends globLib.globMod.GNs.IOptions {
  /**
    * Whether or not to error upon an empty singular glob.
    */
  var allowEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The absolute segment of the glob path that isn't a glob. This value is attached
    * to each globobject and is useful for relative pathing.
    */
  var base: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not the `cwd` and `base` should be the same.
    */
  var cwdbase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Filters stream to remove duplicates based on the string property name or the result of function.
    * When using a function, the function receives the streamed
    * data (objects containing `cwd`, `base`, `path` properties) to compare against.
    */
  var uniqueBy: js.UndefOr[UniqueByStringPredicate | UniqueByFunctionPredicate] = js.undefined
}

