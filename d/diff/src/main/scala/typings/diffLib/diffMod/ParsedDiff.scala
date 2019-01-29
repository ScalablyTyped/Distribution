package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedDiff extends js.Object {
  var hunks: js.Array[Hunk]
  var index: js.UndefOr[java.lang.String] = js.undefined
  var newFileName: js.UndefOr[java.lang.String] = js.undefined
  var newHeader: js.UndefOr[java.lang.String] = js.undefined
  var oldFileName: js.UndefOr[java.lang.String] = js.undefined
  var oldHeader: js.UndefOr[java.lang.String] = js.undefined
}

