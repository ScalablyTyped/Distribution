package typings
package fsDashExtraLib.fsDashExtraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var flag: js.UndefOr[java.lang.String] = js.undefined
  var fs: js.UndefOr[js.Object] = js.undefined
  var reviver: js.UndefOr[js.Any] = js.undefined
  var throws: js.UndefOr[scala.Boolean] = js.undefined
}

object ReadOptions {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    flag: java.lang.String = null,
    fs: js.Object = null,
    reviver: js.Any = null,
    throws: js.UndefOr[scala.Boolean] = js.undefined
  ): ReadOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (reviver != null) __obj.updateDynamic("reviver")(reviver)
    if (!js.isUndefined(throws)) __obj.updateDynamic("throws")(throws)
    __obj.asInstanceOf[ReadOptions]
  }
}

