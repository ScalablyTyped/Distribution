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

object Options {
  @scala.inline
  def apply(
    custom: /* req */ expressLib.expressMod.eNs.Request => scala.Boolean = null,
    ext: java.lang.String | js.Array[java.lang.String] = null,
    method: java.lang.String | js.Array[java.lang.String] = null,
    path: pathFilter | js.Array[pathFilter] = null,
    useOriginalUrl: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(js.Any.fromFunction1(custom))
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(useOriginalUrl)) __obj.updateDynamic("useOriginalUrl")(useOriginalUrl)
    __obj.asInstanceOf[Options]
  }
}

