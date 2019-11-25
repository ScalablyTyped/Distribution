package typings.fsDashExtra.fsDashExtraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
  var fs: js.UndefOr[js.Object] = js.undefined
  var reviver: js.UndefOr[js.Any] = js.undefined
  var throws: js.UndefOr[Boolean] = js.undefined
}

object ReadOptions {
  @scala.inline
  def apply(
    encoding: String = null,
    flag: String = null,
    fs: js.Object = null,
    reviver: js.Any = null,
    throws: js.UndefOr[Boolean] = js.undefined
  ): ReadOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (reviver != null) __obj.updateDynamic("reviver")(reviver.asInstanceOf[js.Any])
    if (!js.isUndefined(throws)) __obj.updateDynamic("throws")(throws.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions]
  }
}

