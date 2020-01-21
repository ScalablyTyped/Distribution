package typings.expressUnless.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var custom: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary], Boolean]] = js.undefined
  var ext: js.UndefOr[String | js.Array[String]] = js.undefined
  var method: js.UndefOr[String | js.Array[String]] = js.undefined
  var path: js.UndefOr[pathFilter | js.Array[pathFilter]] = js.undefined
  var useOriginalUrl: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    custom: /* req */ Request_[ParamsDictionary] => Boolean = null,
    ext: String | js.Array[String] = null,
    method: String | js.Array[String] = null,
    path: pathFilter | js.Array[pathFilter] = null,
    useOriginalUrl: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(js.Any.fromFunction1(custom))
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(useOriginalUrl)) __obj.updateDynamic("useOriginalUrl")(useOriginalUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

