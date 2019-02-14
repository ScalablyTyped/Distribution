package typings
package expressDashUnlessLib.expressDashUnlessMod.unlessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var custom: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Boolean]] = js.undefined
  var ext: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var method: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var path: js.UndefOr[pathFilter | js.Array[pathFilter]] = js.undefined
  var useOriginalUrl: js.UndefOr[scala.Boolean] = js.undefined
}

