package typings
package globuleLib.globuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingOptions extends FindOptions {
  var destBase: js.UndefOr[java.lang.String] = js.undefined
  var ext: js.UndefOr[java.lang.String] = js.undefined
  var extDot: js.UndefOr[globuleLib.globuleLibStrings.first | globuleLib.globuleLibStrings.last] = js.undefined
  var flatten: js.UndefOr[scala.Boolean] = js.undefined
  var rename: js.UndefOr[js.Function1[/* p */ java.lang.String, java.lang.String]] = js.undefined
}

